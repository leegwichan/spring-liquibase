package demo.liquibase.v2;

import demo.liquibase.ContentsService;
import demo.liquibase.dto.CategoriesResponse;
import demo.liquibase.dto.ContentResponse;
import demo.liquibase.dto.ContentSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("after")
@Service
@RequiredArgsConstructor
public class AfterContentsService implements ContentsService {

    private final AfterCategoryRepository categoryRepository;
    private final AfterContentRepository contentRepository;

    @Override
    public CategoriesResponse getCategories() {
        return CategoriesResponse.from(categoryRepository.findAll());
    }

    @Override
    public ContentResponse getContent(Long id) {
        AfterContent content = contentRepository.findById(id)
                .orElseThrow();
        return ContentResponse.from(content);
    }

    @Override
    public ContentResponse saveContent(ContentSaveRequest request) {
        AfterCategory category = categoryRepository.findByLabel(request.categoryLabel())
                .orElseThrow();
        AfterContent content = contentRepository.save(new AfterContent(category, request.name()));
        return ContentResponse.from(content);
    }
}
