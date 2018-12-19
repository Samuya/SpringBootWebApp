package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Book;

public interface BookRepo extends CrudRepository<Book,Long>{

}
