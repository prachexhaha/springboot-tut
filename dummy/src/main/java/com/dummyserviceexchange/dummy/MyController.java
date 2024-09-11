package com.dummyserviceexchange.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
    @RequestMapping("m")
    public static String myMethod()
    {
        return "prachex shrama";
    }

    @GetMapping("process-form")
    public static String getData(@RequestPart int num1, @RequestPart int num2)
    {
        int res= num1+num2;
        String str = String.valueOf(res);
        return (str+"\n form has been processed");
    }
    
}
