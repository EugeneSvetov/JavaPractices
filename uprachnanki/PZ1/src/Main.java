import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Group A", 1, List.of(5, 4, 3)));
        students.add(new Student("Alice", "Group B", 1, List.of(4, 3, 2)));
        students.add(new Student("Bob", "Group A", 1, List.of(3, 2, 1)));
        printStudents(students, 1);
        removeStudentsWithLowAverage(students);

        printStudents(students, 2);
    }

    public static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse()+1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}