package passwordCreator;

import java.util.Scanner;

public class PasswordCreator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Creator!");
		Scanner usern = new Scanner(System.in);
		System.out.println("Pick a username!");
		String username = usern.next();
		System.out.println("Nice username!");
		
		Scanner pass = new Scanner(System.in);
		System.out.println("Now, enter a new password!");
		String password = pass.next();
		
		Scanner confirmPass = new Scanner(System.in);
		System.out.println("Finally, confirm your password!");
		String confPass = confirmPass.next();
		
		if(confPass.equals(password)) {
			System.out.println("Password successfully created!");
			System.out.println("Account successfully created!");
		} else {
			System.out.println("Aww, we received a Confirmation Error! Please start process again!");
		}
		
		

	}

}
