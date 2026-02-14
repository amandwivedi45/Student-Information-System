import java.util.*;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.printf("%-10s %-15s %-5s %-7s %-15s\n",
                "ID", "Name", "Age", "Grade", "Contact");

        for (Student s : students) {
            System.out.printf("%-10s %-15s %-5d %-7.2f %-15s\n",
                    s.getStudentId(), s.getName(),
                    s.getAge(), s.getGrade(), s.getContact());
        }
    }

    public Student search(String key) {

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(key)
                    || s.getName().equalsIgnoreCase(key)) {
                return s;
            }
        }
        return null;
    }

    public boolean delete(String id) {

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            if (it.next().getStudentId().equals(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
