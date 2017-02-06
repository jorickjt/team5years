package be.kdg.ip.repositories.api;



import be.kdg.ip.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wouter on 21.12.16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
