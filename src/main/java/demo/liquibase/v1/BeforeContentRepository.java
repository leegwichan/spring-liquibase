package demo.liquibase.v1;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("before")
public interface BeforeContentRepository extends JpaRepository<BeforeContent, Long> {

}
