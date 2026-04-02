/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	Student std1= new Student("James", (short) 20);
	Freshman std2= new Freshman("James", (short) 20, 12); // name, age, credits
	Senior std3 = new Senior("John", (short) 30, 90);

	Scanner scnr = new Scanner(System.in);

	 System.out.print("Enter GPA of James (student): ");
	 double gpa1 = scnr.nextDouble();
	 std1.setGpa(gpa1);
	 System.out.print("Enter GPA of James (freshman): "); // theres a difference between student james and freshman james
	 double gpa2 = scnr.nextDouble();
	 std2.setGpa(gpa2);
	 System.out.print("Enter GPA of John (senior): ");
	 double gpa3 = scnr.nextDouble();
	 std3.setGpa(gpa3);

	 System.out.println(std1);
	 System.out.println(std2);
	 System.out.println(std3); // the minimum gpa for a senior is 85, any value lower is impossible


	}
}

