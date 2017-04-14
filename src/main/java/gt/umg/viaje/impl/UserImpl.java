/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.impl;

import gt.umg.viaje.entities.Role;
import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserRole;
import gt.umg.viaje.entities.builder.UserBuilder;
import gt.umg.viaje.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import gt.umg.viaje.inte.UserInt;
import gt.umg.viaje.repo.RoleRepo;
import gt.umg.viaje.security.Md5Encrypt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven
 */
@Component()
public class UserImpl implements UserInt {

    @Autowired()
    UserRepo userRepo;
    
    @Autowired()
    RoleRepo roleRepo;

    @Override
    public ResponseEntity<User> signUp(User user) throws Exception {

        if (user.getEmail() != null && !"".equals(user.getEmail())) {
            User userEntity = userRepo.findByEmail(user.getEmail());
            
            if(userEntity != null){
                return new ResponseEntity(HttpStatus.FOUND);
            }
        }
        
        /**
         * Le asigna el rol por default
         */
        
        Role role = roleRepo.findByRoleName("Cliente");
        
        if(role == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        List<UserRole> roles  = new ArrayList<>();
        roles.add(new UserRole(role, true));
        
        User userEntity = new UserBuilder()
                .setName(user.getName())
                .setLastname(user.getLastname())
                .setEmail(user.getEmail())
                .setPassword(Md5Encrypt.get_md5(user.getPassword()))
                .setRoles(roles)
                .build();
        
        return new ResponseEntity(userRepo.save(userEntity), HttpStatus.CREATED);
    }

}
