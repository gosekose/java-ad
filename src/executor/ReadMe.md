# Executor 프레임워크
- 멀티스레딩 및 병렬 처리를 쉽게 사용할 수 있도록 돕는 기능
- 작업 실행의 관리 및 스레드 풀의 관리를 효율적으로 처리해서 개발자가 직접 스레드를 생성하는 복잡성을 줄여줌
- ThreadPoolExecutor는 두 가지 요소로 구성
  - 스레드 풀: 스레드를 관리
  - BlockingQueue: 작업을 보관
  - 생산자 소비자 문제를 해결하기 위한 단순한 큐가 아님
- 생산자가 es.excute(new RunnableTask("taskA))를 호출하면 RunnableTask 인스턴스가 BlockingQueue에 보관
  - main 스레드가 생산자가 된다.
  - 소비자
    - 스레드 풀에 있는 스레드가 소비자
    - 소비자 중 하나가 BlockingQueue에 들어있는 작업을 받아서 처리
- ThreadPoolExecutor 생성자
  - ThreadPoolExecutor의 생성자는 다음 속성을 사용
  - corePoolSize: 스레드 풀에서 관리되는 기본 스레드의 수
  - maximumPoolSize: 스레드 풀에서 관리되는 최대 스레드 수
  - keepAliveTime: 기본 스레드 수를 초과해서 만들어진 스레드가 생존할 수 있는 대기 시간, 이 시간동안 처리할 작업이 없다면 초과 스레드는 제거
  - BlockingQueue workQueue: 작업을 보관할 블록킹 큐
- Runnable의 불편함
  - Runnable 인터페이스의 불편함
    - 반환값이 없음:
      - run 메서드는 반환 값을 가지지 않음
      - 실행 결과를 얻기 위해서는 별도의 매커니즘을 사용
      - 스레드의 실행 결과를 직접 받을 수 없음
      - sumTask
        - 실행한 결과를 멤버 변수에 넣어두고 join()을 사용해서 스레드가 종료되길 기다린 다음에 멤버 변수를 통해 내부 값을 받음
      - 예외 처리
        - run 메서드는 체크 예외를 던질 ㅅ ㅜ없음 체크 예외 처리는 메서드 내부에서 처리해야 함

- 작업 스레드는 간단히 값을 return을 통해 반환하고, 요청 스레드는 그 반환 값을 바로 받을 수 있다면 코드가 훨씬 간결해짐
- Executor는 Callble과 Future라는 인터페이스를 도입함

## Future

- Runnable과 Callable
- Runnable의 run()의 반환 타입은 void이다. 따라서 값을 반환할 수 없다
- 예외가 선언되어 있지 않음
- 해당 인터페이스를 구현하는 모든 메서드는 체크 예외를 던질 수 없음
- 자식은 부모의 예외 범위를 넘어설 수 없음
- 부모에 예외가 선언되어 있지 않으므로 예외를 던질 수 없음
- 런타임 예외는 제외

### Callable
- java.util.concurrent에서 제공되는 기능
- Callable의 call() 반환 타입이 제네릭 V 이다. 따라서 값을 반환할 수 있다.
- throws Execption 예외가 선언되어 있다
- 따라서 해당 인터페이스르 구현하는 모든 메서드는 체크 예외인 Exception과 그 하위 예외를 모두 던질 수 있음

### Execytor 프레임워크의 강점
- 요청 스레드가 결과를 받아야 하는 상황이라면, Callable을 사용한 방식은 Runnable을 사용하는 방식보다 훨씬 편리
- 코드만 보면 복잡한 멀티 스레드를 사용한다는 느낌보다는, 단순한 싱글스레드 방식으로 개발한다는 느낌이 듬
- 이 과정에서 내가 스레드를 생성하거나, join()으로 스레드를 제어하는 코드는 없음
- 심지어 Thread라는 코드도 없음
- 단순하게 ExecutorService에 필요한 작업을 요청하고 결과를 받아서 쓰면 됨
- 복잡한 멀티스레드를 매우 편리하게 사용할 수 있는 것이 바로 Executor 프레임워크

### Future 분석
- 미래의 결과를 받을 수 있는 객체
- Futre<Integer> future = es.submit(new MyCallable());
- submit()의 호출로 MyCallable의 인스턴스를 전달
- MyCallable은 즉시 실행되는게 아니라, 스레드 풀의 미래의 어떤 시점에 이 코드를 대신 실행해야 함
- MyCallable.call() 메서드는 호출 스레드가 실행하는 것도 아니고, 스레드 풀의 다른 스레드가 실행하기 떄문에 언제 실행이 완료되어서 결과를 반환할 지 알 수 없음
- 결과를 즉시 받는 것은 불가능, 이런 이유로 es.submit()은 MyCallable의 결과를 반환하는 대신 결과를 나중에 받을 수 있는 Future라는 객체를 대신 제공
- 생성된 Future는 즉시 반환되기 때문에 요청 스레드는 대기하지 않고, 자유롭게 다른 코드를 호출할 수 있음
  - Thread.start()를 호출한 것과 비슷함
  - get()을 했을 떄, 결과가 준비되어 있지 않다면, get()을 호출한 스레드는 블로킹되어 대기

### 실행 과정
- 큐에 들어있는 Future[taskA]를 꺼내서 스레드 풀의 스레드 1이 작업을 시작
- Future의 구현체인 FutureTask는 Runnable 인터페이스도 함께 구현
- 스레드 1은 FutureTask의 run() 메서드를 수행
- run() 메서드가 taskA의 call() 메서드를 호출하고 그 결과를 받아서 처리
  - run() 메서드가 taskA의 call() 메서드를 호출하고 그 결과를 받아서 처리
  - FutureTask.run() -> MyCallable.call()
- 스레드 1은 taskA의 작업을 아직 실행 중, 아직 작업을 완료하지 않음
- 요청 스레드는 Future 인스턴스 참조를 가지고 있음
- 언제든지 본인이 필요할 때 Future.get()을 호출해서 taskA의 작업의 결과를 미래에 받을 수 잇음
- 요청 스레드는 작업의 결과가 필요해서 future.get()을 호출
- 요청 스레드가 future.get()을 호출하면 Future가 완료 상태가 될떄까지 대기
- 요청을 받는 스레드의 상태는 Runnable -> WAITING 이 된다.
- future.get()을 호출했을 떄
  - Future가 완료 상태: Future가 완료 상태면, Future의 결과도 포함
  - 요청 스레드는 대기하지 않고 값을 즉시 반환 받을 수 있음
  - Future가 완료 상태가 아님
    - taskA가 아직 수행되지 않았거나 또는 수행 중이라는 뜻
    - 어쩔 수 없이 요청 스레드가 결과를 받을 때까지 대기
    - blocking 상태
- future.get() 호출해서 대기 중
- 요청 스레드는 waiting 상태로 future.get()을 호출하고 대기 중
- 스레드 1
  - taskA의 작업을 완료
  - Future에 taskA의 반환 결과를 담음
  - Future의 상태를 완료로 변경
  - 요청 스레드를 깨움, 요청 스레드는 WAITING -> RUNNABLE로 변경

- 주요 메서드
  - boolean cancel
    - 아직 완료되지 않은 작업을 취소한다
    - 매개변수
      - cancel(true): Future를 취소 상태로 변경한다.
      - 이때 작업이 실행중이라면 Thread.interrupt()를 호출해서 작업을 중단
      - cancel(false): Future를 취소 상태로 변경, 이미 실행 중인 작업을 중단하지 않음
    - 반환값
      - 작업이 성공적으로 취소된 경우 true, 이미 완료되었거나 취소할 수 없는 경우 false
    - 설명
      - 작업이 실행 중이 아니거나, 아직 시작되지 않았으면 취소, 실행 중인 작업의 경우 mayInterruptIfRunning이 true이면 중단을 시도
  - State state()
    - Future의 상태를 반환
  - get()
    - 작업이 완료될 떄까지 대기, 완료되면 결과를 반환
    - 반환값: 작업의 결과
    - 예외
      - InterruptedException: 대기 중에 현재 스레드가 인터럽트된 경우 발생
      - ExecutionException: 작업 계산 중에 예외가 발생한 경우 발생
      - 설명:
        - 작업이 완료될 떄까지 get()을 호출한 현재 스레드를 대기함
        - 작업이 완료되면 결과를 반환
  - get(long timeout, TimeUnit unit)
    - get()과 같은데, 시간 초과되면 예외 발생
    - 매개변수
      - timeout: 대기할 최대 시간
      - unit: timeout 매개변수의 시간 단위 지정
    - 반환값
      - 작업의 결과
    - 예외
      - InterruptedException: 대기 중에 현재 스레드가 인터럽트된 경우 발생
      - ExecutionException: 작업 계산 중에 예외가 발생한 경우 발생
      - TimeoutException: 시간 초과된 경우 발생