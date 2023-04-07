package mozzibook.mozzishop.controller;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class RegisterForm {

    @NotEmpty(message = "이름을 입력하세요")
    public String username;
    @NotEmpty(message = "닉네임을 입력하세요")
    public String nickname;

    @NotEmpty(message = "이메일을 입력하세요")
    public String email;
    @NotEmpty(message = "비밀번호를 입력하세요")
    public String password;




}
