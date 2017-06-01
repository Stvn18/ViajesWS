/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.repo;

import gt.umg.viaje.entities.Flight;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wilver
 */
@Repository()
public interface FlightRepo extends JpaRepository<Flight, Integer> {

    @Query(" from Flight as f "
            + " where f.flyingFrom.id = :flyingFromId "
            + " and f.flyingTo.id = :flyingToId "
            + " and f.preferredClass.id = :preferredClassId "
            + " and f.airline.id = :airlineId ")
    List<Flight> getVuelosDisponibles(@Param("flyingFromId") Integer flyingFromId, @Param("flyingToId") Integer flyingToId, @Param("preferredClassId") Integer preferredClassId, @Param("airlineId") Integer airlineId);
    
}
