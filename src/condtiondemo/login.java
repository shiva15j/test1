package condtiondemo;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");

		String username = sc.next();

		System.out.println("Password=:");

		int password = sc.nextInt();

		if (username.equals("Shivam") && password == 1234) {
			System.out.println("Welcome to Home page");
		} else if (username.equals("Priyanka") && password == 3456) {
			System.out.println("Welcome to Home page");
		} else {
			System.err.println("Invalid credentials");
		}

	}

}
