package demo.liquibase;

import demo.liquibase.dto.CategoriesResponse;
import demo.liquibase.dto.ContentResponse;
import demo.liquibase.dto.ContentSaveRequest;

public interface ContentsService {

    CategoriesResponse getCategories();

    ContentResponse getContent(Long id);

    ContentResponse saveContent(ContentSaveRequest request);
}
