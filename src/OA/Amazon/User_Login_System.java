package OA.Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 16:58
 */

class Result{
    /**
     * <username, [password, loginStatus]>
     */
    private HashMap<String,String[]> map = new HashMap<>();

    public List<String> implementAPI(List<String> logs){
        LinkedList<String> output = new LinkedList<>();
        for (String log: logs){
            String[] info = log.split(" ");
            if(info[0].equals("register")){
                output.add(register(info[1], info[2]));
            }
            else if(info[0].equals("login")){
                output.add(login(info[1], info[2]));
            }
            else if(info[0].equals("logout")){
                output.add(logout(info[1]));
            }
            else{
                throw new IllegalArgumentException("illegal input: " + log);
            }
        }
        return output;
    }


    /**
     *
     * @param username
     * @param password
     * @return
     */
    private String register(String username, String password){
        if(map.containsKey(username)){
            return "Username already exists";
        }
        map.put(username, new String[]{password, "online"});
        return "registered successfully";

    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    private String login(String username, String password){
        String[] status = map.getOrDefault(username,new String[]{"nan", "offline"});
        if(status[1].equals("offline") || !status[0].equals(password)){
            return "Login unsuccessfully";
        }
        status[1] = "online";

        map.put(username, status);
        return "Logged in successfully";
    }

    private String logout(String username){
        String[] status = map.getOrDefault(username,new String[]{"nan", "online"});
        if(status[1].equals("online") || !status[0].equals(username)){
            return "Logout unsuccessfully";
        }
        status[1] = "offline";

        map.put(username, status);
        return "Logged out successfully";
    }
}

public class User_Login_System {
    public static void main(String[] args) {

    }

}
