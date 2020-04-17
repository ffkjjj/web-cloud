package cf.zhul.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class IHelloErrorService implements IHelloService {

    @Override
    public String sayHelloFromServiceHi(String name) {
        return "not good, " + name;
    }
}
