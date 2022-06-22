package com.github.jekattack.ringedingdong;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RingedingdongController {

    @GetMapping("/{name}")
    public String greetingName(@PathVariable String name){
        return "Ringedingdong, " + name + "!";
    }

    @GetMapping()
    public String greeting(){
        return "Regedingdong!";
    }
}
