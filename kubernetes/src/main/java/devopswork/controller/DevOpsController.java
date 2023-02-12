package devopswork.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DevOpsController {

    private final DevOpsService devOpsService;

    @GetMapping("hello")
    public String getHelloMessage() {
        return devOpsService.setUpMongoDbDummyData();
    }

    @GetMapping("hello1")
    public String getHelloMessage1() {
        return "hello1";
    }
}
