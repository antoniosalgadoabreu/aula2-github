package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Conta acc;
		
		System.out.print("Enter account number: ");
		int number = ler.nextInt();
		System.out.print("Enter account holder: ");
		ler.nextLine();
		String holder = ler.nextLine();
		System.out.print("Is there na inital deposit (y/n)? ");
		char op = ler.next().charAt(0);
		
		if (op == 'y') {
			System.out.print("\nEnter initial deposit value: ");
			ler.nextLine();
			double value = ler.nextDouble();
			acc = new Conta(number, holder, value);
		}else {
			acc = new Conta(number, holder);
		}
		System.out.println(acc);;
		
		System.out.print("\nEnter a deposit value: ");
		ler.nextLine();
		double amount = ler.nextDouble();
		acc.deposit(amount);
		System.out.println(acc);
		System.out.print("\nEnter a withdraw value: ");
		ler.nextLine();
		amount = ler.nextDouble();
		acc.withdraw(amount);
		System.out.println(acc);
		
		ler.close();
	}

}
