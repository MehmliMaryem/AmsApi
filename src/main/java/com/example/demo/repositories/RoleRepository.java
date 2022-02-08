package com.example.demo.repositories;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Role;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
Role findByRole(String role);
//List<Role> findByRole(Set<Role> roles); 
}
/*package com.example.demo.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Role;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, 
Integer> {
Role findByRole(String role);
Optional<Role> findByName(String name);

}*/