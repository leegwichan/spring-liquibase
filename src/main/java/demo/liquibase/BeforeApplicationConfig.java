package demo.liquibase;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("before")
@EntityScan(basePackages = "demo.liquibase.v1")
public class BeforeApplicationConfig {
}
