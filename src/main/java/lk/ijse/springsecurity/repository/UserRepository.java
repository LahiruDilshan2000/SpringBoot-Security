package lk.ijse.springsecurity.repository;

import lk.ijse.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Lahiru Dilshan
 * @created Thu 12:43 PM on 10/5/2023
 * @project springsecurity
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail (String email);
}
