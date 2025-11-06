import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StundentDAO dao = new StundentDAO();
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Grade: ");
                String grade = sc.next();

                Student s = new Student(name, age, grade);
                dao.addstudent(s);
                System.out.println("✅ Student Added Successfully!");
            } else if (ch == 2) {
                dao.viewStudents();
            } else if (ch == 3) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();
                dao.deleteStudent(id);
                System.out.println("✅ Student Deleted!");
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
