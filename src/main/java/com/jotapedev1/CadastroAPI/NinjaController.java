package com.jotapedev1.CadastroAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to your ninja system";
    }


}
