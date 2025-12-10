package com.Abhishek.student_manager;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Choose: ");


            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue;
            }
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Roll: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Roll must be a number!");
                        sc.next();
                        break;
                    }
                    int roll = sc.nextInt();

                    service.addStudent(name, roll);
                    System.out.println("Added!");
                    break;


                case 2:
                    System.out.println(service.getAllStudents());
                    break;


                case 3:
                    System.out.print("Roll: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Roll must be a number!");
                        sc.next();
                        break;
                    }

                    Student s = service.searchStudent(sc.nextInt());
                    System.out.println(s != null ? s : "Not found");
                    break;


                case 4:
                    System.out.print("Roll: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Roll must be a number!");
                        sc.next();
                        break;
                    }

                    service.removeStudent(sc.nextInt());
                    System.out.println("Removed!");
                    break;


                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
