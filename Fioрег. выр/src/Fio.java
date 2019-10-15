import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fio {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите ФИО полностью (например, “Иванов Сергей Петрович”): ");
        String fio = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        Pattern pattern = Pattern.compile("\\s*+(?<surname>[А-ЯЁ][а-яё]++)\\s*+(?<name>[А-ЯЁ][а-яё]++)\\s*+(?<name2>[А-ЯЁ][а-яё]++)\\s*+");
        Matcher matcher = pattern.matcher(fio);
        Boolean result = matcher.matches();
        if (!result){
            System.out.println("Вы неверно ввели данные.");
        } else {
            System.out.printf("Фамилия: %s\n", matcher.group("surname"));
            System.out.printf("Имя: %s\n", matcher.group("name"));
            System.out.printf("Отчество: %s\n", matcher.group("name2"));
        }
    }
}
