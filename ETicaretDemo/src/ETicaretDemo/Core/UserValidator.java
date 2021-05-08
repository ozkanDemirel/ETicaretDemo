package ETicaretDemo.Core;

import ETicaretDemo.Entities.Concrete.User;

public class UserValidator {
	
	public static boolean isUserVerified(User user) {
				
		boolean verification = RegisterControl.isCheckFirstName(user) && RegisterControl.isCheckLastName(user)&& RegisterControl.isCheckEmail(user)
				&& RegisterControl.isCheckPassword(user) ? true : false;
		
		return verification;
		
	}

	
	
}
