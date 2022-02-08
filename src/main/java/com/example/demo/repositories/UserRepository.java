package com.example.demo.repositories;
/*package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, 
Integer> {
 User findByEmail(String email);
 Optional<User> findByUsername(String username);

 Boolean existsByUsername(String username);

 Boolean existsByEmail(String email);

}
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}