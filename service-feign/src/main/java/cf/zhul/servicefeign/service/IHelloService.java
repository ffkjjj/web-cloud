package cf.zhul.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = IHelloErrorService.class)
public interface IHelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHelloFromServiceHi(@RequestParam(value = "name") String name);

}
