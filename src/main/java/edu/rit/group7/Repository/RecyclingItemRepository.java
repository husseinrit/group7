// Saif Alshamali - 410002147
package edu.rit.group7.Repository;

import edu.rit.group7.model.RecyclingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecyclingItemRepository extends JpaRepository<RecyclingItem, Long> {

    // find one by id
    @Query("SELECT r FROM RecyclingItem r WHERE r.id = :id")
    RecyclingItem findOneById(@Param("id") Long id);

    // find by item name
    List<RecyclingItem> findByItemName(String itemName);

    // custom query - get items by category
    @Query("SELECT r FROM RecyclingItem r WHERE r.category = :category")
    List<RecyclingItem> findByCategory(@Param("category") String category);

    // update category by id
    @Modifying
    @Query("UPDATE RecyclingItem r SET r.category = :category WHERE r.id = :id")
    void updateCategoryById(@Param("id") Long id, @Param("category") String category);
}
