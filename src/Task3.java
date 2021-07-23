import java.util.Scanner;

public class Task3 {
    public String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String upperCaseString(String s) {
        String[] arr = s.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder builder = new StringBuilder();
        for (String element : arr) {
            String cap = element.substring(0, 1).toUpperCase() + element.substring(1);
            builder.append(cap);
            builder.append(" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Task3 task = new Task3();

        System.out.println(task.upperCaseString(task.readString()));
    }

}