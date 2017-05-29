/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.repo;

import gt.umg.viaje.entities.HotelDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author steven.vargas
 */

@Repository()
public interface HotelDetailRepo extends JpaRepository<HotelDetail, Integer> {
    
    @Query("from HotelDetail as hd "
            + " where hd.hotel.location.id = :locationId "
            + " and hd.childrens = :childrens "
            + " and hd.adults = :adults "
            + " and hd.bedrooms = :bedrooms "
            + " order by hd.price asc ")
    List<HotelDetail> getDisponibles(@Param("locationId") Integer locationId, @Param("childrens") Integer childrens, @Param("adults") Integer adults, @Param("bedrooms") Integer bedrooms);
    
}
