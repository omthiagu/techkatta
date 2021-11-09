package com.ohiohealth.techkatta.service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ohiohealth.techkatta.dto.User;

public class UserService {

	private static Logger logger = Logger.getLogger(UserService.class.getName());
	
	/**
	 * This method would fetch user data from a file.
	 * 
	 * @return User 
	 */
	public User fetchStoredUserData() {
		logger.log(Level.INFO, "fetchUserData Begin");

		User userObj = null;
		Path path = Paths.get("user.json");
		try {
			String userStringObj = Files.readAllLines(path).get(0);

			ObjectMapper objMapper = new ObjectMapper();
			JsonNode jsonNode = objMapper.readTree(userStringObj);

			userObj = new User();
			userObj.setFirstName(jsonNode.get("firstName").asText());
			userObj.setCityName(jsonNode.get("cityName").asText());

			Date dateObj = new Date(jsonNode.get("dateOfJoining").asLong());
			userObj.setDateOfJoining(dateObj);
		} catch (IOException ioexception) {
			logger.log(Level.SEVERE, "Exception occurred while reading user data from the file=" + path.getFileName(),
					ioexception);
		}
		logger.log(Level.INFO, "fetchUserData End");

		return userObj;
	}
	
	
	/**
	 * This method would store user data into a file.
	 * 
	 * @param userObj User
	 * @return Boolean
	 */
	public Boolean storeUserData(User userObj) {
		logger.log(Level.INFO, "storeUserData Begin");

		Path path = Paths.get("user.json");
		try {
			ObjectMapper objMapper = new ObjectMapper();
			byte[] strToBytes = objMapper.writeValueAsBytes(userObj);
			Files.write(path, strToBytes);
		} catch (IOException ioexception) {
			logger.log(Level.SEVERE, "Exception occurred while writting user data to the file=" + path.getFileName(),
					ioexception);
		}
		logger.log(Level.INFO, "storeUserData End");
		return Boolean.TRUE;
	}

}
