package demo.liquibase.v1;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import org.springframework.context.annotation.Profile;

@Profile("before")
@Getter
public enum BeforeCategory {

    ROMANCE("연애"),
    IF("만약에"),
    MBTI("MBTI"),
    FOOD("음식"),
    ;

    private static final List<BeforeCategory> CATEGORIES = Arrays.stream(BeforeCategory.values()).toList();
    private final String value;

    BeforeCategory(String value) {
        this.value = value;
    }

    public static List<BeforeCategory> getCategories() {
        return CATEGORIES;
    }
}
