package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionEx {

    public static void main(String[] args) {

        List<String> list1 = list.stream().map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .toList(); // toList는 변경 불가

        // list1.add("123"); -> UnsupportedOperationException 발생

        List<String> collect = list.stream().map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        collect.add("123");

        for (String s : collect) {
            System.out.println(s);
        }


    }


    private static List<String> list = List.of(
            "Java",
            "Python",
            "JavaScript",
            "C",
            "C++",
            "C#",
            "Ruby",
            "Go",
            "Swift",
            "Kotlin",
            "Rust",
            "Scala",
            "Groovy",
            "TypeScript",
            "Dart",
            "Perl",
            "Lua",
            "R",
            "Julia",
            "Haskell",
            "Erlang",
            "Clojure",
            "F#",
            "Scheme",
            "Smalltalk",
            "Lisp",
            "Prolog",
            "Ada",
            "Pascal",
            "Fortran",
            "COBOL",
            "BASIC",
            "Assembly",
            "Objective-C",
            "Visual Basic",
            "Delphi",
            "Logo",
            "PL/SQL",
            "Transact-SQL",
            "PowerShell",
            "Bash",
            "AWK",
            "sed",
            "VimL",
            "Emacs Lisp",
            "Perl 6",
            "Racket",
            "D",
            "Elixir",
            "Objective-C",
            "Visual Basic",
            "Delphi",
            "Logo",
            "PL/SQL",
            "Transact-SQL",
            "PowerShell",
            "Bash",
            "AWK",
            "sed",
            "VimL",
            "Emacs Lisp",
            "Pe"
    );
}
