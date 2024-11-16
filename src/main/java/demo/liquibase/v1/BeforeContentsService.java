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

    private final BeforeContentRepository contentRepository;

    @Override
    public CategoriesResponse getCategories() {
        return CategoriesResponse.fromBeforeCategory(BeforeCategory.getCategories());
    }

    @Override
    public ContentResponse getContent(Long id) {
        BeforeContent content = contentRepository.findById(id)
                .orElseThrow();
        return ContentResponse.fromBeforeContent(content);
    }

    @Override
    public ContentResponse saveContent(ContentSaveRequest request) {
        BeforeContent content = new BeforeContent(BeforeCategory.valueOf(request.categoryLabel()), request.name());
        BeforeContent savedContent = contentRepository.save(content);
        return ContentResponse.fromBeforeContent(savedContent);
    }
}
