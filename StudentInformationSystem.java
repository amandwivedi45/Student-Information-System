import java.util.Scanner;

public class StudentInformationSystem {

    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==== STUDENT INFORMATION SYSTEM ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> addStudent();
                case 2 -> manager.viewStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> System.exit(0);

                default -> System.out.println("Invalid option!");
            }
        }
    }

    static void addStudent() {

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        if (!ValidationUtils.isValidAge(age)) {
            System.out.println("Invalid Age!");
            return;
        }

        System.out.print("Grade: ");
        double grade = sc.nextDouble();
        sc.nextLine();

        if (!ValidationUtils.isValidGrade(grade)) {
            System.out.println("Invalid Grade!");
            return;
        }

        System.out.print("Contact: ");
        String contact = sc.nextLine();

        manager.addStudent(new Student(id, name, age, grade, contact));

        System.out.println("Student Added Successfully!");
    }

    static void searchStudent() {

        System.out.print("Enter ID/Name: ");
        String key = sc.nextLine();

        Student s = manager.search(key);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("\nID: " + s.getStudentId());
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Grade: " + s.getGrade());
        System.out.println("Contact: " + s.getContact());
    }

    static void deleteStudent() {

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        if (manager.delete(id))
            System.out.println("Deleted Successfully!");
        else
            System.out.println("Student not found!");
    }
}
