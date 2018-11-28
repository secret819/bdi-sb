package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.collection.Books;

public interface BooksRepository extends MongoRepository<Books, String>{

	@Query("{name:?0}")
	public Books findByName(String name);
	
	@Query("{name:?0,{price:?1}")
	public int updateByName(String name,String price);
}
