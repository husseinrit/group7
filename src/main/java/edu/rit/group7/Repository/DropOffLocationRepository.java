// Hussein Al Salami - 746006849
package edu.rit.group7.Repository;

import edu.rit.group7.model.DropOffLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DropOffLocationRepository extends JpaRepository<DropOffLocation, Long> {

    // find one by id
    @Query("SELECT l FROM DropOffLocation l WHERE l.id = :id")
    DropOffLocation findOneById(@Param("id") Long id);

    // find by name
    List<DropOffLocation> findByName(String name);

    // custom query - search by keyword in address
    @Query("SELECT l FROM DropOffLocation l WHERE l.address LIKE %:keyword%")
    List<DropOffLocation> findByAddressContaining(@Param("keyword") String keyword);

    // update name by id
    @Modifying
    @Query("UPDATE DropOffLocation l SET l.name = :name WHERE l.id = :id")
    void updateNameById(@Param("id") Long id, @Param("name") String name);
}