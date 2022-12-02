package com.nissan.lib;

import java.util.Scanner;

public class Que1 {
	//a. Write a program that collects information of employees in an organization.
	//When the user gives the input make sure that employee’s age should be between 18 and 60.
	//If otherwise, throw exception.
	public static void main(String[] args) {
		//get input from user
		Scanner input=new Scanner(System.in);
		try{
			System.out.println("Enter a name of employee: ");
			String name=input.nextLine();
			System.out.println("Enter age of Employee");
			int age=input.nextInt();
			System.out.println("Enter designation of employee: ");
			String designation=input.next();
			//check input
			if(age<18||age>60)
			{
				System.out.println("Invalid age");
			}
			else
			{
				System.out.println("Employee name: "+name);
				System.out.println("Employee age: "+age);
				System.out.println("Employee designation: "+designation);
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid details please....");
		}
		
		
	}


}
