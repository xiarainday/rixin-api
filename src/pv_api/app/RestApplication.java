package pv_api.app;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;  
import org.glassfish.jersey.filter.LoggingFilter;  
import org.glassfish.jersey.server.ResourceConfig;  

public class RestApplication extends ResourceConfig {
    
	public RestApplication() {   
    	//服务类所在的包路径  
        packages("pv_api.resources");  
        //注册JSON转换器  
        register(JacksonJsonProvider.class);   
       } 

}
