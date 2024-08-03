package thread.bounded;

// 버퍼
public interface BoundedQueue {
    void put(String data); // 생산자 스레드가 데이터를 생산

    String take(); // 소비자 스레드가 데이터를 소비
}
