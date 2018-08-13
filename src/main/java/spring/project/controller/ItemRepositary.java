package spring.project.controller;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositary extends CrudRepository<Item, Integer>{

}
