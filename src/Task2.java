import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

    public Map<Integer, Cat> createMap() {
        Map<Integer, Cat> map = new HashMap<>();

        map.put(1, new Cat("Cat 1", 1));
        map.put(2, new Cat("Cat 2", 2));
        map.put(3, new Cat("Cat 3", 3));
        map.put(4, new Cat("Cat 4", 4));
        map.put(5, new Cat("Cat 5", 5));
        map.put(6, new Cat("Cat 6", 6));
        map.put(7, new Cat("Cat 7", 7));
        map.put(8, new Cat("Cat 8", 8));
        map.put(9, new Cat("Cat 9", 9));
        map.put(10, new Cat("Cat 10", 10));

        return map;
    }

    public Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<Integer, Cat> entry : map.entrySet()) {
            set.add(entry.getValue());
        }

        return set;
    }

    public void printCats(Set<Cat> cats) {
        System.out.println("List cats:");
        for (Cat cat : cats) {
            System.out.println("Name: " + cat.getName() + " - Age: " + cat.getAge());
        }
    }

    public class Cat {
        private String name;
        private Integer age;

        public Cat(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Task2 task = new Task2();
        task.printCats(task.convertMapToSet(task.createMap()));
    }
}