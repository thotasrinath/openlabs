package org.openlabs.ilearn.controller;

import org.openlabs.ilearn.database.entity.UserDetails;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public UserDetails getAllUsers() {
 
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("Srinath");
		userDetails.setLastName("Thota");
		
		return userDetails;
 
	}
	
	
}
