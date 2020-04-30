package br.com.gustavoar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.gustavoar.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
