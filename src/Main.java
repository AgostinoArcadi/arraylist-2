import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Mario", 15);
        Student student2 = new Student("Leonardo", 16);
        Student student3 = new Student("Alessandro", 15);
        Student student4 = new Student("Sofia", 13);
        Student student5 = new Student("Aurora", 16);
        Student student6 = new Student("Lorenzo", 15);
        Student student7 = new Student("Riccardo", 15);
        Student student8 = new Student("Ginevra", 14);
        Student student9 = new Student("Beatrice", 15);
        Student student10 = new Student("Emma", 14);
        Student student11 = new Student("Andrea", 15);
        Student student12 = new Student("Mario", 13);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);

        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("LISTA ORDINATA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
