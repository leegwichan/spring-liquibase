package demo.liquibase;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("after")
@EntityScan(basePackages = "demo.liquibase.v2")
public class AfterApplicationConfig {
}
