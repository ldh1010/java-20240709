package test.registry;

import test.login.SignIn;

import java.util.HashMap;
import java.util.Map;

public class SignUp {

    private static Map<Integer, Map<String,String>> users = new HashMap<>();
    private int userCount = 0;

    public void createUser(String id, String password) {
        Map<String, String> user = new HashMap<>();
        user.put("id", id);
        user.put("password", password);

        users.put(userCount, user);
        userCount++;
    }

    public void showUser() {
        for(int i = 0; i < users.size(); i++) {
//            Map<String, String> user0 = users.get(i);
//            System.out.println(i + "번째" + user0.get("id"));
            System.out.println(i + "번째" + users.get(i).get("id"));
        }

//        for(Map<String, String> user : users.values()) {
//            System.out.println(user.get("id"));
//        }
    }

    public boolean checkUser(String id, String password) {
        boolean result = false;

        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).get("id").equals(id)) {
                if(users.get(i).get("password").equals(password)) {
                    result = true;
                }else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }
        }

        return result;
    }
}
