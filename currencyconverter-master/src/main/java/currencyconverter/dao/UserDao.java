package currencyconverter.dao;

import java.util.List;

import currencyconverter.entities.User;


public interface UserDao {
	public List<User> list(User user);

	public boolean saveOrUpdate(User user);
}
