package live.b.api.festival.adapter.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/festivals")
public class FestivalController {

    @GetMapping
    public ResponseEntity<List<FestivalResponse>> festivals() {
        return ResponseEntity.ok(List.of());
    }
}
