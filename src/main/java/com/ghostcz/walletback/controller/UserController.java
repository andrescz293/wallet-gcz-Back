package com.ghostcz.walletback.controller;

import com.ghostcz.walletback.dto.GeneralResponse;
import com.ghostcz.walletback.dto.UserDTO;
import com.ghostcz.walletback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/{id_user}")
	public ResponseEntity<GeneralResponse> getInfoUser(@PathVariable("id_user")Integer id_user ) {
		System.out.println("entra funcion");
		return new ResponseEntity<>(new GeneralResponse("" , "" , 200), HttpStatus.OK);
	}

	@PostMapping( "/create")
	public ResponseEntity<GeneralResponse> createUser ( @RequestBody UserDTO user){
		System.out.println(user.toString());
		return new ResponseEntity<>(new GeneralResponse( userService.saveUser(user)  , "" , 200), HttpStatus.OK);
	}

}
