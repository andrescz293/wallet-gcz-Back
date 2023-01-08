package com.ghostcz.walletback.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "unt_Units")
public class UnitModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unt_id")
	private Long UntId;

	@ManyToOne
	@JoinColumn(name = "str_id" ,referencedColumnName = "str_id")
	private StructureModel StrId ;

	@Column(name = "unt_code" , unique = true)
	private String UntCode;

	@Column(name = "unt_name")
	private String UntName;

	@Column(name = "unt_order")
	private String UntOrder;

	@Column(name = "unt_level")
	private String UntLevel;

	@Column(name = "unt_property")
	private String UntProperty;

	public Long getUntId() {
		return UntId;
	}

	public void setUntId(Long untId) {
		UntId = untId;
	}

	public StructureModel getStrId() {
		return StrId;
	}

	public void setStrId(StructureModel strId) {
		StrId = strId;
	}

	public String getUntCode() {
		return UntCode;
	}

	public void setUntCode(String untCode) {
		UntCode = untCode;
	}

	public String getUntName() {
		return UntName;
	}

	public void setUntName(String untName) {
		UntName = untName;
	}

	public String getUntOrder() {
		return UntOrder;
	}

	public void setUntOrder(String untOrder) {
		UntOrder = untOrder;
	}

	public String getUntLevel() {
		return UntLevel;
	}

	public void setUntLevel(String untLevel) {
		UntLevel = untLevel;
	}

	public String getUntProperty() {
		return UntProperty;
	}

	public void setUntProperty(String untProperty) {
		UntProperty = untProperty;
	}
}
