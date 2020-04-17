package cf.zhul.serviceribbon.controller;

import cf.zhul.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hello(name);
    }
}
