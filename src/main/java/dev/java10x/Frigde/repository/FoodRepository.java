package dev.java10x.Frigde.repository;


import dev.java10x.Frigde.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

}
