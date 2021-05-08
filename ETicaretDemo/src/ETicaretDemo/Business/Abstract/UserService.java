package ETicaretDemo.Business.Abstract;

import java.util.List;

import ETicaretDemo.Entities.Concrete.User;

public interface UserService {
	
	void save(User user);
	void saveGmail(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User get(int id);

}
