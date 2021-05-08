package ETicaretDemo.ConsoleUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ETicaretDemo.Business.Abstract.UserService;
import ETicaretDemo.Business.Concrete.UserManager;
import ETicaretDemo.Core.EmailValidation;
import ETicaretDemo.Core.Adapters.GmailService;
import ETicaretDemo.Core.Adapters.JGmailManagerAdapter;
import ETicaretDemo.DataAccess.Concrete.HibernateUserDao;
import ETicaretDemo.DataAccess.Concrete.InMemoryDao;
import ETicaretDemo.Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		User user2 = new User("özkan", "demirel", "ozkan-1@gmail.com", "123456");
		User user1 = new User("özkan-2", "demirel-2", "ozkan@gmail.com", "Oz123456");
		users.add(user1);
		users.add(user2);
		UserService manager = new UserManager(new InMemoryDao());
		manager.saveGmail(user2);
		manager.save(user1);
		
		users = manager.getAll();
		
		for (User user : users) {
			System.out.println(user.getEmail());
		}
		

	}

}
