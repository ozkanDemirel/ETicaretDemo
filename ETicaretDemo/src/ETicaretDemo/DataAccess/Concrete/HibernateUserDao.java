package ETicaretDemo.DataAccess.Concrete;

import java.util.List;

import ETicaretDemo.DataAccess.Abstract.UserDao;
import ETicaretDemo.Entities.Concrete.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getFirstName());
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGmail(User user) {
		// TODO Auto-generated method stub
		
	}

}
