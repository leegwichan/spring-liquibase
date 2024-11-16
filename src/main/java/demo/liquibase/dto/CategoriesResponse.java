package demo.liquibase.dto;

import demo.liquibase.v1.BeforeCategory;
import demo.liquibase.v2.AfterCategory;
import java.util.List;

public record CategoriesResponse(List<CategoryResponse> categories) {

    public static CategoriesResponse fromBeforeCategory(List<BeforeCategory> categories) {
        List<CategoryResponse> categoryResponses = categories.stream()
                .map(CategoryResponse::fromBeforeCategory)
                .toList();
        return new CategoriesResponse(categoryResponses);
    }

    public static CategoriesResponse from(List<AfterCategory> categories) {
        List<CategoryResponse> categoryResponses = categories.stream()
                .map(CategoryResponse::from)
                .toList();
        return new CategoriesResponse(categoryResponses);
    }
}
