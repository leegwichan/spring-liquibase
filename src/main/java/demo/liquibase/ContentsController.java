package demo.liquibase;

import demo.liquibase.dto.CategoriesResponse;
import demo.liquibase.dto.ContentResponse;
import demo.liquibase.dto.ContentSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContentsController {

    private final ContentsService contentsService;

    @GetMapping("/api/contents/categories")
    public CategoriesResponse getCategories() {
        return contentsService.getCategories();
    }

    @GetMapping("/api/contents/{id}")
    public ContentResponse getContent(@PathVariable Long id) {
        return contentsService.getContent(id);
    }

    @PostMapping("/api/contents")
    public ContentResponse saveContent(ContentSaveRequest request) {
        return contentsService.saveContent(request);
    }
}
