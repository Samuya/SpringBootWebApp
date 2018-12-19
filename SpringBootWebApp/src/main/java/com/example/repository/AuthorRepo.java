package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.model.Author;

public interface AuthorRepo extends CrudRepository<Author,Long>{

}
