package live.b.api.course.adapter.web;

import live.b.api.spot.adapter.web.SpotResponse;

import java.util.List;

public record CourseResponse(
        Long courseId,
        String courseName,
        String courseTitle,
        String courseDescription,
        Float durationHours,
        String courseImageUrl,
        List<SpotResponse> spots
) {
}
