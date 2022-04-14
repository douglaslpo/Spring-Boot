package academy.douglaslpo.microservices.endpoint.repository;

import academy.douglaslpo.microservices.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository <Course, Long> {
}
