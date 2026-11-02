
package com.tour.serverlichtrinh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message",
                "Hệ thống đăng ký tour phân tán - Server Lịch trình");

        return "index";
    }
}
