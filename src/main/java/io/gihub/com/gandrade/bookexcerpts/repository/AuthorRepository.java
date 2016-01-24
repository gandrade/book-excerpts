package io.gihub.com.gandrade.bookexcerpts.repository;

import io.gihub.com.gandrade.bookexcerpts.domain.Author;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Author entity.
 */
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
