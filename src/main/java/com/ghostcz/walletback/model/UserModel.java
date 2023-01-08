package com.ghostcz.walletback.model;
import jakarta.persistence.*;


@Entity
@Table(name = "usr_user")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usr_id" , unique = true , nullable = false)
	private Long IdUser;

	@Column(name = "usr_name" , nullable = false)
	private String usrName;

	@Column(name = "usr_userlogin" , nullable = false)
	private String usrUserLogin;

	@Column(name = "usr_password" , nullable = false)
	private String usrPassword;

	@Column(name = "usr_image"  , nullable = true)
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

	public UserModel(String usrName, String usrUserLogin, String usrPassword, String usrImage) {
		this.usrName = usrName;
		this.usrUserLogin = usrUserLogin;
		this.usrPassword = usrPassword;
		this.usrImage = usrImage;
	}
}
