package live.b.api.course.adapter.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseApi {

    @GetMapping("/popular")
    public ResponseEntity<List<CourseResponse>> popular() {
        return ResponseEntity.ok(List.of());
    }
}
