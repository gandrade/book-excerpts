package io.gihub.com.gandrade.bookexcerpts.repository.search;

import io.gihub.com.gandrade.bookexcerpts.domain.Author;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the Author entity.
 */
public interface AuthorSearchRepository extends ElasticsearchRepository<Author, Long> {
}
