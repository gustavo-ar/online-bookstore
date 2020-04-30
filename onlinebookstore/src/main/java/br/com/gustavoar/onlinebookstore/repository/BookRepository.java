package br.com.gustavoar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavoar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
}
