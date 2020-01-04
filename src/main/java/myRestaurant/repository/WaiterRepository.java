package myRestaurant.repository;

import myRestaurant.entity.WaiterEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public interface WaiterRepository extends JpaRepository<WaiterEntity, Integer> {
    WaiterEntity getById(int id);
}
