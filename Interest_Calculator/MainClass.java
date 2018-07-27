# Wipro_PRP
package com.wipro.bank.main;

import java.util.Scanner;

import com.wipro.bank.service.BankService;

public class MainClass {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int tenure=sc.nextInt();
		float principal=sc.nextFloat();
		int age=sc.nextInt();
		String gender=sc.next();
		gender=gender.toLowerCase();
		BankService b=new BankService();
		b.calculate(principal, tenure, age, gender);

	}

}
