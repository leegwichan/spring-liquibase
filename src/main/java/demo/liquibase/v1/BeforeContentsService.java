package demo.liquibase.v1;

import demo.liquibase.ContentsService;
import demo.liquibase.dto.CategoriesResponse;
import demo.liquibase.dto.ContentResponse;
import demo.liquibase.dto.ContentSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("before")
@Service
@RequiredArgsConstructor
public class BeforeContentsService implements ContentsService {

    @Override
    public CategoriesResponse getCategories() {
        return null;
    }

    @Override
    public ContentResponse getContent(Long id) {
        return null;
    }

    @Override
    public ContentResponse saveContent(ContentSaveRequest request) {
        return null;
    }
}
