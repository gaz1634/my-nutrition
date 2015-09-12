package com.wss.mynutrition.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wss.mynutrition.domain.Food;

@RepositoryRestResource
public interface FoodRepository extends CrudRepository<Food, Integer> {

}
