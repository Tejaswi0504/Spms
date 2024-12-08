package com.student;

import org.springframework.web.bind.annotation.GetMapping;

public class Homecontroller {
	@GetMapping("/home") // Maps the URL "/home"
    public String home() {
        return "home"; // Looks for "home.html" in /templates/
    }

}
