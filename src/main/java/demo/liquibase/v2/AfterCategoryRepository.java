package demo.liquibase.v2;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("after")
public interface AfterCategoryRepository extends JpaRepository<AfterCategory, Long> {

}
