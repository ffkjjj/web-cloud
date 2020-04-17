package cf.zhul.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String serverPort;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "zhul")String name) {
        return "hi " + name + ", I'm from port " + serverPort;
    }
}
