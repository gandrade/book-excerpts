package io.gihub.com.gandrade.bookexcerpts.repository;

import io.gihub.com.gandrade.bookexcerpts.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
