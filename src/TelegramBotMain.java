import java.util.Locale;
import java.util.Scanner;

public class TelegramBotMain {
    public static void main(String[] args) {
        System.out.println("добрый день!");

        System.out.println("Вопрос 1. Сколько в языке программирования Java есть примитивов");
        int primitivesCount = new Scanner(System.in).nextInt();

        if(primitivesCount == 8){
            System.out.println("Верно");
        }
        else
            System.out.println("Не верно");

        System.out.println("Вопрос 2. Сколько в реляционных базах" +
                "данных существует типов связей между таблицами");
        int linksCount = new Scanner(System.in).nextInt();

        if(linksCount == 3){
            System.out.println("Верно");
        }
        else
            System.out.println("Не верно");

        System.out.println("Вопрос 3. С помощью какой команды в системе контроля версий Git можно" +
                " просмотреть авторов различных строк в одном файле");
        String blameAnswer = new Scanner(System.in).nextLine().toLowerCase();

        if(blameAnswer.contains("blame")){
            System.out.println("Верно");
        }
        else
            System.out.println("Не верно");

        System.out.println("Вопрос 4. Какие методы HTTP-запросов вы знаете?"); //GET, POST,PATCH, DELETE
        String httpAnswer = new Scanner(System.in).nextLine().toLowerCase();

        if(httpAnswer.contains("get") &&
            httpAnswer.contains("post") &&
            httpAnswer.contains("put") &&
            httpAnswer.contains("patch") &&
            httpAnswer.contains("delete")){
            System.out.println("Верно");
        }
        else
            System.out.println("Не верно");
    }
}
