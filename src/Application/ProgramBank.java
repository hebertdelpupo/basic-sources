package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.accountBank;

public class ProgramBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		accountBank account;

		System.out.println("Este programa realiza o cadastro de conta bancaria");
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new accountBank(number, holder, initialDeposit);
		} else {
			account = new accountBank(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update deposit value");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update deposit value");
		System.out.println(account);

		sc.close();

	}

}
