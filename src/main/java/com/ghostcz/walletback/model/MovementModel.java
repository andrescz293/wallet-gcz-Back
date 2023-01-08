package com.ghostcz.walletback.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mvmnt_movement")
public class MovementModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mvmnt_id")
	private Long MvmntId;

	@ManyToOne
	@JoinColumn(name = "accnt_id" , referencedColumnName = "accnt_id")
	private AccountModel AcctId;

	@ManyToOne
	@JoinColumn(name = "unt_id_category" , referencedColumnName = "unt_id")
	private UnitModel UntCategory;

	@ManyToOne
	@JoinColumn(name = "unt_id_type" , referencedColumnName = "unt_id")
	private UnitModel UntType;

	@Column(name = "mvmnt_description" , nullable = false)
	private String MvmntDescription;

	@Column(name = "mvmnt_date" , nullable = false)
	private Date MvmntDate;

	@ManyToOne
	@JoinColumn(name = "unt_id_state" , referencedColumnName = "unt_id")
	private UnitModel UntState;

	public Long getMvmntId() {
		return MvmntId;
	}

	public void setMvmntId(Long mvmntId) {
		MvmntId = mvmntId;
	}

	public AccountModel getAcctId() {
		return AcctId;
	}

	public void setAcctId(AccountModel acctId) {
		AcctId = acctId;
	}

	public UnitModel getUntCategory() {
		return UntCategory;
	}

	public void setUntCategory(UnitModel untCategory) {
		UntCategory = untCategory;
	}

	public UnitModel getUntType() {
		return UntType;
	}

	public void setUntType(UnitModel untType) {
		UntType = untType;
	}

	public String getMvmntDescription() {
		return MvmntDescription;
	}

	public void setMvmntDescription(String mvmntDescription) {
		MvmntDescription = mvmntDescription;
	}

	public Date getMvmntDate() {
		return MvmntDate;
	}

	public void setMvmntDate(Date mvmntDate) {
		MvmntDate = mvmntDate;
	}

	public UnitModel getUntState() {
		return UntState;
	}

	public void setUntState(UnitModel untState) {
		UntState = untState;
	}
}
