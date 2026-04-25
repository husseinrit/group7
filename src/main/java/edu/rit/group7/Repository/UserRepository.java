// Hussein Al Salami - 746006849
package edu.rit.group7.Repository;

import edu.rit.group7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // find one by id
    @Query("SELECT u FROM User u WHERE u.id = :id")
    User findOneById(@Param("id") Long id);

    // find by email
    User findByEmail(String email);

    // custom query - get all users from a city
    @Query("SELECT u FROM User u WHERE u.city = :city")
    List<User> findByCity(@Param("city") String city);

    // update city by id
    @Modifying
    @Query("UPDATE User u SET u.city = :city WHERE u.id = :id")
    void updateCityById(@Param("id") Long id, @Param("city") String city);
}
