package ETicaretDemo.Core;

import java.util.Scanner;


import ETicaretDemo.Entities.Concrete.User;

public class EmailValidation  {

	
	
	public static String verifyMail() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Do�rulama i�in Y tu�una Bas�n:" );
		String message = scanner.nextLine();
		return message;
		
	}
	
	public static boolean sendEmail(User user) {
		
		if(UserValidator.isUserVerified(user)) {
			System.out.println(user.getEmail()+"  Adresine Do�rulama Ba�lant�s� G�nderildi");
			
			if(verifyMail().equalsIgnoreCase("y")) {
				return true;
			}
			
		}
			System.out.println("L�tfen Bilgilerinizi Kontrol Edin");
		return false;
	
	}

}
