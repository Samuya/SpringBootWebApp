package com.example.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.model.Author;
import com.example.model.Book;
import com.example.repository.AuthorRepo;
import com.example.repository.BookRepo;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepo authorRepo;
	private BookRepo bookRepo;
	
	public DevBootstrap(AuthorRepo authorRepo, BookRepo bookRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedevent) {
		// TODO Auto-generated method stub
		initdata();
	}

	private void initdata(){
		 
		//ERIC
		Author eric = new Author("Eric","Evans");
		Book ddd = new Book("Domain Driven Design","1234","Harper Collins");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepo.save(eric);
		bookRepo.save(ddd);
		
		//ROD
		Author rod = new Author("Rod","Johnson");
		Book noEJB = new Book("J2EE WITHOUT EJB","23444","WROX");
		rod.getBooks().add(noEJB);
		authorRepo.save(rod);
		bookRepo.save(noEJB);
	}
}
