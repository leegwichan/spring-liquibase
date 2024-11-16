package demo.liquibase.dto;

import demo.liquibase.v1.BeforeContent;
import demo.liquibase.v2.AfterContent;

public record ContentResponse(Long id, String name, CategoryResponse category) {

    public static ContentResponse fromBeforeContent(BeforeContent content) {
        return new ContentResponse(content.getId(), content.getName(),
                CategoryResponse.fromBeforeCategory(content.getCategory()));
    }

    public static ContentResponse from(AfterContent content) {
        return new ContentResponse(content.getId(), content.getName(), CategoryResponse.from(content.getCategory()));
    }
}
