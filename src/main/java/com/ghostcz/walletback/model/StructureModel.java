package com.ghostcz.walletback.model;

import jakarta.persistence.*;

@Entity
@Table(name = "str_structure")
public class StructureModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "str_id")
	private Long StrId;

	@Column(name = "str_name")
	private String StrName;

	public Long getStrId() {
		return StrId;
	}

	public void setStrId(Long strId) {
		StrId = strId;
	}

	public String getStrName() {
		return StrName;
	}

	public void setStrName(String strName) {
		StrName = strName;
	}

}
