/*package com.example.demo.service;

 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Role;
import com.example.demo.repositories.RoleRepository;

//spring stereotype annotation
@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepo;

    //get total roles count
    public long getRolesCount() {
        return roleRepo.count();
    }

    //save new role
    public void save(final Role role) {
        if(exist(role.getRole()) == false){
            roleRepo.save(role);
        }
        else{
            System.out.println("Role already exist");
        }
    }

    //get all roles
    public List<Role> getRoles() {
        final Iterable<Role> allRoles = roleRepo.findAll();
        return StreamSupport.stream(allRoles.spliterator(), false).collect(Collectors.toList());
    }

  
    //update role by id
    public void update(final Role role) {
        roleRepo.save(role);
    }

  
    //verify role existence
    public boolean exist(final String name){
        for(Role role : getRoles()){
            if(role.getRole().equals(name))
                return true;
        }
        return false;
    }
}*/

