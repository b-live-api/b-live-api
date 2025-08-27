package live.b.api.theme.adapter.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/themes")
public class ThemeController {

    @GetMapping
    public ResponseEntity<List<ThemeResponse>> themes() {
        return ResponseEntity.ok(
                List.of(
                        new ThemeResponse("theme1", "imageUrl1", "image1"),
                        new ThemeResponse("theme2", "imageUrl2", "image2")
                ));
    }
}
