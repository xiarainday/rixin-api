package pv_api.app;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;  
import org.glassfish.jersey.filter.LoggingFilter;  
import org.glassfish.jersey.server.ResourceConfig;  

public class RestApplication extends ResourceConfig {
    
	public RestApplication() {   
    	//���������ڵİ�·��  
        packages("pv_api.resources");  
        //ע��JSONת����  
        register(JacksonJsonProvider.class);   
       } 

}