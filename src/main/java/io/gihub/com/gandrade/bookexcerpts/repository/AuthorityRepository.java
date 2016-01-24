package io.gihub.com.gandrade.bookexcerpts.repository;

import io.gihub.com.gandrade.bookexcerpts.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
