import java.util.HashMap;
public class IDandPass {
	
HashMap<String, String> logininfo = new HashMap<String, String>();
    
    IDandPass(){
    
        logininfo.put("Admin", "Admin");
        logininfo.put("Librarian", "Library123");
    
    }
    protected HashMap getLogininfo(){
    
    return logininfo;
    }
}
