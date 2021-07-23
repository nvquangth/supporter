import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public int getMinimum(List<Integer> array) {
        if (array == null || array.size() == 0) {
            return Integer.MAX_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(array);

        Collections.sort(sortedlist);

        return sortedlist.get(0);
    }

    public List<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        return numbers;
    }

    public static void main(String[] args) {

        Task4 task = new Task4();
        System.out.println(task.getMinimum(task.getIntegerList()));
    }

}