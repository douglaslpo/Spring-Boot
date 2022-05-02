package academy.douglaslpo.microservices.endpoint.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository <Course, Long> {
}
