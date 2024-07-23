package test;

import test.login.SignIn;
import test.registry.SignUp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SignUp signUp = new SignUp();
        SignIn signIn = new SignIn();
        int select;

        while (true) {
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 아이디/비밀번호 찾기");
            System.out.println("4. 전체 유저");
            // 1 id = test
            // 2 id = test2

            select = sc.nextInt();

            if(select == 1) {
                System.out.println("아이디를 입력해 주세요");
                String id = sc.next();
                System.out.println("비밀번호를 입력해 주세요");
                String password = sc.next();
                signUp.createUser(id, password);

            }else if(select == 2) {
                System.out.println("아이디 : ");
                String id = sc.next();
                System.out.println("비밀번호 : ");
                String password = sc.next();
                signIn.login(id, password);


            }else if(select == 3) {

            }else if(select == 4) {
                signUp.showUser();
            }
        }
    }
}
