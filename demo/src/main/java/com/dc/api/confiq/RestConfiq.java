package com.dc.api.confiq;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.dc.api.resources.StudentResource;
@Component
public class RestConfiq extends ResourceConfig{



	public RestConfiq(Class<?>... classes) {
		register(StudentResource.class);
		
	}

	
	

	
	
}
