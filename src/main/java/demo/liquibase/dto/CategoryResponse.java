package demo.liquibase.dto;

import demo.liquibase.v1.BeforeCategory;
import demo.liquibase.v2.AfterCategory;

public record CategoryResponse(String code, String name) {

    public static CategoryResponse fromBeforeCategory(BeforeCategory beforeCategory) {
        return new CategoryResponse(beforeCategory.getDisplayName(), beforeCategory.name());
    }

    public static CategoryResponse from(AfterCategory category) {
        return new CategoryResponse(category.getDisplayName(), category.getLabel());
    }
}
