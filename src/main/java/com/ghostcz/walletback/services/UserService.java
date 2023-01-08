package com.ghostcz.walletback.services;

import com.ghostcz.walletback.dto.UserDTO;
import com.ghostcz.walletback.model.UserModel;
import com.ghostcz.walletback.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private IUserRepository userRepository;

	public UserModel saveUser ( UserDTO userDTO )  {

		UserModel newUser = new UserModel(
				userDTO.getUsrName(),
				userDTO.getUsrUserLogin(),
				userDTO.getUsrPassword(),
				userDTO.getUsrImage()
		);
		newUser = this.userRepository.save(newUser);
		return newUser;
	}
}
