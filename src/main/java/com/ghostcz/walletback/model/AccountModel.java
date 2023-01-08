package com.ghostcz.walletback.model;

import jakarta.persistence.*;

@Entity
@Table(name = "accnt_account")
public class AccountModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accnt_id" , unique = true , nullable = false)
	private Long AccntId;

	@ManyToOne
	@JoinColumn(name = "usr_id" , referencedColumnName = "usr_id")
	private UserModel AccntUser;

	@Column(name = "accnt_name" , nullable = false)
	private String AccntName;

	@ManyToOne
	@JoinColumn(name = "unt_id_state" , referencedColumnName = "unt_id")
	private UnitModel AccntState;

	public Long getAccntId() {
		return AccntId;
	}

	public void setAccntId(Long accntId) {
		AccntId = accntId;
	}

	public UserModel getAccntUser() {
		return AccntUser;
	}

	public void setAccntUser(UserModel accntUser) {
		AccntUser = accntUser;
	}

	public String getAccntName() {
		return AccntName;
	}

	public void setAccntName(String accntName) {
		AccntName = accntName;
	}

	public UnitModel getAccntState() {
		return AccntState;
	}

	public void setAccntState(UnitModel accntState) {
		AccntState = accntState;
	}
}
