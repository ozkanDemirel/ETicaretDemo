package ETicaretDemo.Core;

import java.util.Scanner;


import ETicaretDemo.Entities.Concrete.User;

public class EmailValidation  {

	
	
	public static String verifyMail() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Doðrulama için Y tuþuna Basýn:" );
		String message = scanner.nextLine();
		return message;
		
	}
	
	public static boolean sendEmail(User user) {
		
		if(UserValidator.isUserVerified(user)) {
			System.out.println(user.getEmail()+"  Adresine Doðrulama Baðlantýsý Gönderildi");
			
			if(verifyMail().equalsIgnoreCase("y")) {
				return true;
			}
			
		}
			System.out.println("Lütfen Bilgilerinizi Kontrol Edin");
		return false;
	
	}

}
