import java.util.HashMap;

public class IdAndPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();


    IdAndPasswords() {
        loginInfo.put("John", "John123");
        loginInfo.put("Petar", "Petar123");
        loginInfo.put("TryThat", "Tried");
        loginInfo.put("123","123");

    }
    public HashMap getLoginInfo() {
        return loginInfo;
    }

}
