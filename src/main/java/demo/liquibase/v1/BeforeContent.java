package demo.liquibase.v1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

@Profile({"before", "rollback"})
@Entity
@Table(name = "content")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class BeforeContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeforeCategory category;

    @Column(nullable = false)
    private String name;

    public BeforeContent(BeforeCategory category, String name) {
        this.category = category;
        this.name = name;
    }
}
