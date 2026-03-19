import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy bread");
        tasks.add("Wash Car");
        tasks.add("Learn Java");

        System.out.println("Size of list: " + tasks.size());
        tasks.remove(1);
        tasks.set(0,"Buy another bread");

        System.out.println("Final task list");
        for (String task: tasks){
            System.out.println(task);
        }
    }
}