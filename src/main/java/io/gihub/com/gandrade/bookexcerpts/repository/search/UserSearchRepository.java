package io.gihub.com.gandrade.bookexcerpts.repository.search;

import io.gihub.com.gandrade.bookexcerpts.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
