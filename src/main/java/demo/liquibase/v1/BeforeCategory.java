package demo.liquibase.v1;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import org.springframework.context.annotation.Profile;

@Profile({"before", "rollback"})
@Getter
public enum BeforeCategory {

    ROMANCE("연애"),
    IF("만약에"),
    MBTI("MBTI"),
    FOOD("음식"),
    ;

    private static final List<BeforeCategory> CATEGORIES = Arrays.stream(BeforeCategory.values()).toList();
    private final String displayName;

    BeforeCategory(String displayName) {
        this.displayName = displayName;
    }

    public static List<BeforeCategory> getCategories() {
        return CATEGORIES;
    }
}
