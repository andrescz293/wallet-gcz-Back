package com.ghostcz.walletback.interfaces;

import com.ghostcz.walletback.dto.UserDTO;
import com.ghostcz.walletback.model.UserModel;

public interface IUserService {

	public UserModel saveUser(UserDTO user);

}
