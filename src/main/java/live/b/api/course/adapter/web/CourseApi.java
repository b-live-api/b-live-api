package live.b.api.course.adapter.web;

import live.b.api.spot.adapter.web.SpotResponse;
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
        return ResponseEntity.ok(List.of(
                new CourseResponse(
                        1L,
                        "해안로 코스",
                        "부산항 바닷가를 따라서 같이 걸어보실까요?",
                        "복잡한 일상 속에서, 잠시 휴식하는 시간",
                        2.5F,
                        "https://static.hubzum.zumst.com/hubzum/2024/03/25/14/a1aacd92e67e4b46802d082c47f07706.jpg",
                        List.of(
                                new SpotResponse(1L, "여행지1", "https://static.hubzum.zumst.com/hubzum/2024/03/25/14/a1aacd92e67e4b46802d082c47f07706.jpg"),
                                new SpotResponse(2L, "여행지2", "https://static.hubzum.zumst.com/hubzum/2024/03/25/14/a1aacd92e67e4b46802d082c47f07706.jpg"),
                                new SpotResponse(3L, "여행지3", "https://static.hubzum.zumst.com/hubzum/2024/03/25/14/a1aacd92e67e4b46802d082c47f07706.jpg"),
                                new SpotResponse(4L, "여행지4", "https://static.hubzum.zumst.com/hubzum/2024/03/25/14/a1aacd92e67e4b46802d082c47f07706.jpg")
                        )
                )
        ));
    }
}
