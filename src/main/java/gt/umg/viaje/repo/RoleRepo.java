/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.repo;

import gt.umg.viaje.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wilver
 */
public interface RoleRepo extends JpaRepository<Role, Integer> {
    
    Role findByRoleName(String roleName);
    
}
