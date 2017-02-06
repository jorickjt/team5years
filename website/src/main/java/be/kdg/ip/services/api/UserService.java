package be.kdg.ip.services.api;


import be.kdg.ip.domain.User;
import be.kdg.ip.services.exceptions.UserServiceException;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by wouter on 21.12.16.
 */
public interface UserService extends UserDetailsService {

    User addUser(User user);

    User findUserByUsername(String username) throws UserServiceException;

    User findUserByEmail(String email) throws UserServiceException;

}
