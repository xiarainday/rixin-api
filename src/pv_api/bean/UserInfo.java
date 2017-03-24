package pv_api.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserInfo {
    private String userName;  
    private String Pwd; 
    
    public UserInfo(String userName, String Pwd) {  
        this.userName = userName;  
        this.Pwd = Pwd;  
    }
    
    public String getUserName() {  
        return userName;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
    public String getPwd() {  
        return Pwd;  
    }  
    public void setPwd(String Pwd) {  
        this.Pwd = Pwd;  
    } 
}