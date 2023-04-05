package mozzibook.mozzishop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MemberController {

    @GetMapping("/members_login")
    public String login(Model model){
        model.addAttribute("data", "hello!!!");
        return "members/login";
    }

}