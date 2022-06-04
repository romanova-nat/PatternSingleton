import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> source = new ArrayList<>();

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Введите входные данные для списка");
        System.out.println("Введите размер списка:");
        int number = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int border = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        System.out.print("Вот случайный список: ");
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            source.add(random.nextInt(border));
        }
        System.out.println(source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int treshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);

        List<Integer> resultAfterFilter = filter.filterOut(source);
        logger.log("Прошло фильтр " + resultAfterFilter.size() + " элементов из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + resultAfterFilter);

        logger.log("Завершаем программу");
    }
}
