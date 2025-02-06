package com.scaler.feb_module;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello Sa Ven";


    }
    @RequestMapping(value= "/fullname/{day}",method = RequestMethod.GET)
        public String sayfullName(@PathVariable("day") int day)
        {
            return "Sai Venkatesh(Sa Ven) will work on "+ day;
        }




}
