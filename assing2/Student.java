package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
	 private int rollno;
	private Object name;
	private double marks;

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Student> list = new ArrayList<>();
	        int choice;
	        
	        do {
	        	 System.out.println("\n===== Student Menu =====");
	             System.out.println("1. Add Student");
	             System.out.println("2. Display All Students");
	             System.out.println("3. Search Student by Roll No");
	             System.out.println("4. Sort Students by Roll No");
	             System.out.println("5. Sort Students by Name");
	             System.out.println("6. Sort Students by Marks");
	             System.out.println("7. Exit");
	             System.out.print("Enter your choice: ");
	             choice = sc.nextInt();
	             
	             
	             switch (choice) {
	                case 1:
	                    System.out.print("Enter Roll No: ");
	                    int r = sc.nextInt();
	                    sc.nextLine();
	                    
	                    System.out.print("Enter Name: ");
	                    String n = sc.nextLine();

	                    System.out.print("Enter Marks: ");
	                    double m = sc.nextDouble();

	                    list.add(new Student());
	                    System.out.println("Student Added Successfully!");
	                    break;
	                    
	                case 2:
	                    System.out.println("\n--- Student List ---");
	                    for (Student s : list) {
	                        System.out.println(s);
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Roll No to Search: ");
	                    int sr = sc.nextInt();
	                    boolean found = false;

	                    for (Student s : list) {
	                        if (s.rollno == sr) {
	                            System.out.println("Student Found: " + s);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student Not Found!");
	                    break;
	                    
	                case 4:
	                    Collections.sort(list, (a, b) -> a.rollno - b.rollno);
	                    System.out.println("Sorted by Roll No!");
	                    break;

	                case 5:
	                    Collections.sort(list, (a, b) -> ((String) a.name).compareToIgnoreCase((String) b.name));
	                    System.out.println("Sorted by Name!");
	                    break;

	                case 6:
	                    Collections.sort(list, (a, b) -> Double.compare(a.marks, b.marks));
	                    System.out.println("Sorted by Marks!");
	                    break;

	                case 7:
	                    System.out.println("Exiting Program...");
	                    break;

	                default:
	                    System.out.println("Invalid Choice!");
	            }

	        } while (choice != 7);
	    }
	
	        
}

