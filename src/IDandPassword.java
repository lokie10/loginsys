import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassword(){
        loginInfo.put("admin", "strongpassword");
        loginInfo.put("employee", "emppass123");
    }

    protected HashMap<String, String>    getLoginInfo(){
        return loginInfo;
    } 
}