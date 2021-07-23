import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public List<Integer> readData() {

        try {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                return null;
            }

            String[] arrayInput = input.split(",");

            List<Integer> result = new ArrayList<>();

            for (String element : arrayInput) {
                result.add(Integer.parseInt(element.trim()));
            }

            return result;

        } catch (NumberFormatException e) {
            System.out.println("String contains character which cannot be converted into number");
            return null;
        }
    }

    public List<Integer> sortNumberList(List<Integer> list) {

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        Task1 task = new Task1();

        List<Integer> numbers = task.readData();
        if (numbers != null) {
            numbers = task.sortNumberList(numbers);

            for (Integer element : numbers) {
                System.out.println(element);
            }
        }
    }
}