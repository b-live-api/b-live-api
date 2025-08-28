package live.b.api.course.adapter.web;

import live.b.api.support.ApiDocumentationTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.JsonFieldType.ARRAY;
import static org.springframework.restdocs.payload.JsonFieldType.NUMBER;
import static org.springframework.restdocs.payload.JsonFieldType.STRING;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.subsectionWithPath;

class CourseApiTest extends ApiDocumentationTest {

    @Test
    void popular() {
        mockMvcTester.get().uri("/api/v1/courses/popular")
                .contentType(MediaType.APPLICATION_JSON)
                .assertThat()
                .hasStatus2xxSuccessful()
                .apply(document("courses",
                                responseFields(
                                        fieldWithPath("[].courseId").type(NUMBER).description("코스 ID"),
                                        fieldWithPath("[].courseName").type(STRING).description("코스 이름"),
                                        fieldWithPath("[].courseTitle").type(STRING).description("코스 제목"),
                                        fieldWithPath("[].courseDescription").type(STRING).description("코스 설명"),
                                        fieldWithPath("[].durationHours").type(NUMBER).description("코스 소요 시간"),
                                        fieldWithPath("[].courseImageUrl").type(STRING).description("코스 이미지 주소"),
                                        subsectionWithPath("[].spots").type(ARRAY).description("여행지 목록"),
                                        fieldWithPath("[].spots[].spotId").type(NUMBER).description("여행지 ID"),
                                        fieldWithPath("[].spots[].spotName").type(STRING).description("여행지 이름"),
                                        fieldWithPath("[].spots[].spotImageUrl").type(STRING).description("여행지 이미지 주소")
                                )
                        )
                )
                .bodyJson()
                .hasPath("$[0].courseId")
                .hasPath("$[0].courseName")
                .hasPath("$[0].courseTitle")
                .hasPath("$[0].courseDescription")
                .hasPath("$[0].durationHours")
                .hasPath("$[0].courseImageUrl")
                .hasPath("$[0].spots[0].spotId")
                .hasPath("$[0].spots[0].spotName")
                .hasPath("$[0].spots[0].spotImageUrl");
    }

}
