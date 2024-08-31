package org.labexercise.demo.topDownApproach.repositories;

import org.labexercise.demo.topDownApproach.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrAuthorContainingOrIsbnContaining(String title, String author, String isbn);
}
