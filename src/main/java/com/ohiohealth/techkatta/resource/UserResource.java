package com.ohiohealth.techkatta.resource;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ohiohealth.techkatta.dto.User;
import com.ohiohealth.techkatta.service.UserService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

	private static Logger logger = Logger.getLogger(UserResource.class.getName());

	UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userId}")
	public User getUserData(@PathParam("userId") String userId) {
		logger.info("getUserData()");
		return userService.fetchStoredUserData(userId);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/store")
	public String storeUserData(User userObj) {
		logger.log(Level.INFO, "FirstName=" + userObj.getFirstName() + " CityName=" + userObj.getCityName()
				+ " DateOfJoining=" + userObj.getDateOfJoining());
		
		return userService.storeUserData(userObj);
	}

}
