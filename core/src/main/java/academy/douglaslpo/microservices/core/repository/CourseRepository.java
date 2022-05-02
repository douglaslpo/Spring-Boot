package academy.douglaslpo.microservices.core.repository;

import academy.douglaslpo.microservices.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository <Course, Long> {
}
