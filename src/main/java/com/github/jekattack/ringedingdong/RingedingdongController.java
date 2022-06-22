package com.github.jekattack.ringedingdong;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devQuiz")
@RequiredArgsConstructor
public class RingedingdongController {

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name){
        return "Ringedingdong, " + name;
    }

}
