package mozzibook.mozzishop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("data", "hello!!!");
        return "index"; //hello.html (스프링부트의 thymleaf가 연결해줌)
    }



}
