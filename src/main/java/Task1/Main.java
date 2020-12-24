package Task1;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "Fwdwcscdv, ffdvdv dscsc fffs hyhyhytr zzzz, ik8oukjuyhyt";

        //    Детерминированная функция
        Function<String, String[]> function = s -> s.split(" ");

//        Монады
        Stream.of(function.apply(input))
                .map(s -> s + " - неизвестное слово")
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====================================");

//        Допустим, что мы узнали, как аборигены пишут обращение к кому-то с большой буквы,
//        обособляя обращение запятыми

        Stream.of(function.apply(input))
                .map(Main::search)
                .sorted()
                .forEach(System.out::println);
    }

//    Детерминированная функция
    public static String search(String input) {
        if (input.matches("[A-Z][a-z]+,")) {
            return input + " - кажется, это имя";
        } else {
            return input + " - неизвестное слово";
        }
    }
}
