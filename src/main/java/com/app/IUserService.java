/**
 * 
 */
package com.app;


/**
 * @author Fatih Totrakanlı
 *
 */
public interface IUserService {

	   public Iterable<User> listAllUsers();

	   public User getUserById(long id);

	   public User saveUser(User user);
	    
	   public void deleteUser(long id);
	
}
