package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.food;
@Repository
public interface interFace extends CrudRepository<food, Integer>,PagingAndSortingRepository<food, Integer>
{

	
}
