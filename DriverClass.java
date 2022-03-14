package com.greatlearning.EmailApplication.model;

import java.util.Scanner;

import com.greatlearning.EmailApplication.service.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		Employee employee=null;
		
		do {
			
		System.out.println("Please enter the department from the following \n" +"1. Technical \n" +"2. Admin \n" +"3. Human Resource \n" +"4. Legal \n ");
			
			
			System.out.println();
			
			choice=sc.nextInt();
			
			switch (choice) {
			
			case 1:
				employee=new Employee("LakshmiKanthanBharathi","KS","tech");
				break;
					
			case 2:
				employee=new Employee("LakshmiKanthanBharathi","KS","admin");
				break;	
					
					
			case 3:
				employee=new Employee("LakshmiKanthanBharathi","KS","hr");
				break;		
					
			case 4:
				employee=new Employee("LakshmiKanthanBharathi","KS","legal");
				break;		
					
			default:
				System.out.println("Invalid Choice; Enter between 1 to 4 \n");
					
			}
			
			CredentialService service = new CredentialService();
			String emailid = service.generateEmailAddress(employee);
			String password = service.generatePassword();
			service.showCredentials(employee, password, emailid);
			
			
			} while(choice !=0);
		
		System.out.println("Exited Successfully");
		sc.close();
				
				
	}

}
