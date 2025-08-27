package live.b.api.event.adapter.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    @GetMapping
    public ResponseEntity<List<EventResponse>> events() {
        return ResponseEntity.ok(List.of());
    }
}
