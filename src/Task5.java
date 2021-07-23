import java.util.HashSet;
import java.util.Set;

public class Task5 {

    public Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(60);
        set.add(34);
        set.add(9);
        set.add(1);
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(21);
        set.add(22);
        set.add(4);
        return set;
    }

    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> result = new HashSet<>();
        for (Integer element : set) {
            if (element <= 10) {
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Task5 task = new Task5();

        for (Integer element : task.removeAllNumbersGreaterThan10(task.createSet())) {
            System.out.println(element);
        }
    }
}