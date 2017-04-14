/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.repo;

import gt.umg.viaje.entities.Location;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wilver
 */
@Repository()
public interface LocationRepo extends JpaRepository<Location, Integer> {
    
    @Override()
    List<Location> findAll();
    
}
