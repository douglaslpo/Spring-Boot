package academy.douglaslpo.microservices.core.repository;

import academy.douglaslpo.microservices.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository <ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);


}
