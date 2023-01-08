package com.ghostcz.walletback.dto;

import jakarta.persistence.Column;

public class UserDTO {

	private Long IdUser;

	private String usrName;

	private String usrUserLogin;

	private String usrPassword;

	private String usrImage;

	public Long getIdUser() {
		return IdUser;
	}

	public void setIdUser(Long idUser) {
		IdUser = idUser;
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getUsrUserLogin() {
		return usrUserLogin;
	}

	public void setUsrUserLogin(String usrUserLogin) {
		this.usrUserLogin = usrUserLogin;
	}

	public String getUsrPassword() {
		return usrPassword;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}

	public String getUsrImage() {
		return usrImage;
	}

	public void setUsrImage(String usrImage) {
		this.usrImage = usrImage;
	}
}
