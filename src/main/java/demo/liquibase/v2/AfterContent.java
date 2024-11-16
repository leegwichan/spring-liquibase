package demo.liquibase.v2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

@Profile("after")
@Entity
@Table(name = "content")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AfterContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private AfterCategory category;

    @Column(nullable = false)
    private String name;

    public AfterContent(AfterCategory category, String name) {
        this.category = category;
        this.name = name;
    }
}
