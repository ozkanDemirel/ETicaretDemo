package ETicaretDemo.DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import ETicaretDemo.Core.Adapters.GmailService;
import ETicaretDemo.DataAccess.Abstract.UserDao;
import ETicaretDemo.Entities.Concrete.User;

public class InMemoryDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	GmailService gmailService;
	
	

	public InMemoryDao() {
		
	}

	public InMemoryDao(GmailService gmailService) {
		
		this.gmailService = gmailService;
	}

	@Override
	public void save(User user) {
		System.out.println("Listeye Eklendi : " + user.getFirstName()+" "+ user.getLastName());
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		List<User> u = new ArrayList<User>();
		for (User user : users) {
			
			u.addAll(users);
		}
		return u;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGmail(User user) {
		gmailService.save(user);
		
		
		
	}

}
