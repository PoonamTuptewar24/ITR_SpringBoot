
package com.sample.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomhey {

    @GetMapping("/")
    public String disp() {
        return "Hello";
    }

    public String show() {
        return "I am Lucky";
    }
}
