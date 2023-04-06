package mozzibook.mozzishop.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mozzibook.mozzishop.domain.Member;
import mozzibook.mozzishop.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members_login")
    public String login(Model model){
        log.info("singin asasascontroleler");
        model.addAttribute("loginForm", new LoginForm());
        return "members/login";
    }

    @PostMapping("/members_login")
    public String signin(@Valid LoginForm form, BindingResult result){
        log.info("singin controleler");
        //체크할거 체크하고 아이디가 없거나 비번이 틀리면 원래대로 맞으면 메인화면
        Long aLong = memberService.singIn(form.getEmail(), form.getPassword());

        return "index";
    }

}
