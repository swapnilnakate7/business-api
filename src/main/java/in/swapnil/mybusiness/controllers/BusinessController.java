package in.swapnil.mybusiness.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Value("${business.name}")
    private String name;

    @RequestMapping(method = RequestMethod.GET,path = "/")
    public String getBusinessName(){
        return name;
    }
}
