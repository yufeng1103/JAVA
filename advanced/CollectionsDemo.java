import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private final String name;
    private final int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + "(" + score + ")";
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 88));
        students.add(new Student("Bob", 92));
        students.add(new Student("Cathy", 85));

        students.sort(Comparator.comparingInt(Student::getScore).reversed());
        System.out.println("按成绩排序: " + students);

        Map<String, Integer> scoreMap = new HashMap<>();
        for (Student student : students) {
            scoreMap.put(student.getName(), student.getScore());
        }
        System.out.println("成绩映射: " + scoreMap);
    }
}
