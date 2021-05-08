package ETicaretDemo.Business.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import ETicaretDemo.Business.Abstract.UserService;
import ETicaretDemo.Core.EmailValidation;
import ETicaretDemo.Core.Adapters.GmailService;
import ETicaretDemo.DataAccess.Abstract.UserDao;
import ETicaretDemo.Entities.Concrete.User;

public class UserManager implements UserService {

	UserDao userDao;
	

	public UserManager(UserDao userDao) {

		this.userDao = userDao;
		
	}

	@Override
	public void save(User user) {
		List<User> users = userDao.getAll();
		
		for (User user2 : users) {
			
		}

		if (EmailValidation.sendEmail(user)) {
			userDao.save(user);
		} else {
			System.out.println("eMail Dha Önceden Kaydedilmiþtir.");
			
		}
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
		return userDao.getAll();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGmail(User user) {
		userDao.save(user);

	}

}
