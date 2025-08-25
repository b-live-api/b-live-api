package live.b.api.whether.integration.web;

import live.b.api.support.BaseControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;

class WhetherControllerTest extends BaseControllerTest {

    @Autowired
    MockMvcTester mockMvcTester;

    @Test
    void whether() {
        mockMvcTester.get().uri("/api/v1/whether")
                .contentType(MediaType.APPLICATION_JSON)
                .assertThat()
                .hasStatus2xxSuccessful()
                .apply(document("whether",
                        responseFields(
                                fieldWithPath("temperature").description("온도"))))
                .bodyJson()
                .extractingPath("temperature")
                .isEqualTo("23");
    }
}
