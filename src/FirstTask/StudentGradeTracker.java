package FirstTask;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<>();

            while (true) {

                System.out.println("\n===== Student Grade Tracker =====");
                System.out.println("1. Add Student");
                System.out.println("2. Add Grades");
                System.out.println("3. Show Report");
                System.out.println("4. Exit");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();
                        students.add(new Student(name));
                        System.out.println("Student Added!");
                        break;

                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("No students available!");
                            break;
                        }

                        for (int i = 0; i < students.size(); i++) {
                            System.out.println(i + ". " + students.get(i).getName());
                        }

                        System.out.print("Select Student Index: ");
                        int index = sc.nextInt();

                        System.out.print("Enter Grade: ");
                        int grade = sc.nextInt();

                        students.get(index).addGrade(grade);
                        System.out.println("Grade Added!");
                        break;

                    case 3:
                        if (students.isEmpty()) {
                            System.out.println("No students available!");
                            break;
                        }

                        System.out.println("\n===== Summary Report =====");
                        for (Student s : students) {
                            s.displayReport();
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }
