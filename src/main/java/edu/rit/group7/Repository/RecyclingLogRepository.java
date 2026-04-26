// Naren Karthik - 746009107
package edu.rit.group7.Repository;

import edu.rit.group7.model.RecyclingLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecyclingLogRepository extends JpaRepository<RecyclingLog, Long> {

    // find one by id
    @Query("SELECT l FROM RecyclingLog l WHERE l.id = :id")
    RecyclingLog findOneById(@Param("id") Long id);

    // find logs by user id
    List<RecyclingLog> findByUserId(Long userId);

    // custom query - find logs by item id
    @Query("SELECT l FROM RecyclingLog l WHERE l.itemId = :itemId")
    List<RecyclingLog> findByItemId(@Param("itemId") Long itemId);

    // update quantity by id
    @Modifying
    @Query("UPDATE RecyclingLog l SET l.quantity = :quantity WHERE l.id = :id")
    void updateQuantityById(@Param("id") Long id, @Param("quantity") int quantity);
}
