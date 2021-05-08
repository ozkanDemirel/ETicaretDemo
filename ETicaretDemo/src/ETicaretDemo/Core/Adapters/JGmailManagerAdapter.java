package ETicaretDemo.Core.Adapters;

import ETicaretDemo.Core.UserValidator;

import ETicaretDemo.Entities.Concrete.User;
import Google.JGmail;
import Google.JGmailManager;

public class JGmailManagerAdapter implements GmailService{

	@Override
	public void save(User user) {
		JGmailManager gmailManager = new JGmailManager();
		JGmail gmail = new JGmail();
		
		if(UserValidator.isUserVerified(user)) {
			gmailManager.save(gmail);
		}
		else {
			System.out.println("Hatalý Bilgi Girdiniz");
		}
		
		
	}

}
