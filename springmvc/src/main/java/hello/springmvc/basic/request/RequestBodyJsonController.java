package hello.springmvc.basic.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class RequestBodyJsonController {

    private ObjectMapper objectMapper=new ObjectMapper();

    @PostMapping("/request-body-json-v1")
    public void requestBodyJsonV1(){

    }
}
