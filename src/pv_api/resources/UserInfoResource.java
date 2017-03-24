package pv_api.resources;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  


import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.MediaType;  
import javax.ws.rs.DELETE;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;

import pv_api.bean.UserInfo;

@Path("/users")
public class UserInfoResource {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public UserInfo getUserJson() {    
    	UserInfo user  = new UserInfo("911","911");         
	    return user;    
    } 
}
