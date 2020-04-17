package cf.zhul.servicefeign.controller;

import cf.zhul.servicefeign.service.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return helloService.sayHelloFromServiceHi(name);
    }

}
