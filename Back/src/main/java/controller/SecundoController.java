package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecundoController {

    @RequestMapping("/hello2")
    public String greeting() {
        return "hello2";
    }
}
