package com.ghostcz.walletback.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cnfg_userconfig")
public class ConfigModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cnfg_id")
	private Long CnfgId;

	@ManyToOne
	@JoinColumn(name = "usr_id" , referencedColumnName = "usr_id")
	private UserModel UsrId;

	public Long getCnfgId() {
		return CnfgId;
	}

	public void setCnfgId(Long cnfgId) {
		CnfgId = cnfgId;
	}

	public UserModel getUsrId() {
		return UsrId;
	}

	public void setUsrId(UserModel usrId) {
		UsrId = usrId;
	}
}
