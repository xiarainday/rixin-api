package pv_api.resources;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.MediaType;

import com.db.*;

@Path("/hello")  
public class HelloResource {  
	 private Statement sm=null;
	 private ResultSet rs=null;
	 private Connection ct=null;
	 
    @GET
    @Produces(MediaType.APPLICATION_JSON) 
    public ResultSet sayHello() {   
     try{
    	 ct = new conndb().getConn();
    	 sm = ct.createStatement();
	     rs = sm.executeQuery("SELECT * FROM test_userinfo;");
	     
	     while(rs.next()){
	    	 System.out.println(rs.getString(2));
	     }
	     
     }catch(Exception e){
		 e.printStackTrace();	
	}finally {
		//this.close();
     }
     System.out.println("data below here");
     System.out.println(rs);
     return rs;
    }  
   
      
    @GET  
    @Path("/{param}")    
    //@Produces("text/plain;charset=UTF-8") 
    @Produces(MediaType.APPLICATION_JSON) 
    public String sayHelloToUTF8(@PathParam("param") String username) {  
        return "ÄãºÃ " + username;  
    }  
      
}  