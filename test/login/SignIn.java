package test.login;

import test.registry.SignUp;

import java.util.Map;

public class SignIn {
    private SignUp signUp = new SignUp();

    public void login(String id, String password) {
        boolean result = signUp.checkUser(id, password);

        if(result) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
        
    }

}
