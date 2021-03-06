package com.org.coop.society.data.customer.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Where;


/**
 * The persistent class for the branch_address database table.
 * 
 */
@Entity
@Table(name="branch_address")
@NamedQuery(name="BranchAddress.findAll", query="SELECT b FROM BranchAddress b")
@Where(clause="end_date is null")
public class BranchAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_addr_id")
	private int companyAddrId;

	@Column(name="create_date", updatable=false)
	private Timestamp createDate;

	@Column(name="create_user")
	private String createUser;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="update_date", insertable=false, updatable=false)
	private Timestamp updateDate;

	@Column(name="update_user")
	private String updateUser;

	//bi-directional many-to-one association to Address
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	//bi-directional many-to-one association to BranchMaster
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="branch_id")
	private BranchMaster branchMaster;

	public BranchAddress() {
	}

	public int getCompanyAddrId() {
		return this.companyAddrId;
	}

	public void setCompanyAddrId(int companyAddrId) {
		this.companyAddrId = companyAddrId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BranchMaster getBranchMaster() {
		return this.branchMaster;
	}

	public void setBranchMaster(BranchMaster branchMaster) {
		this.branchMaster = branchMaster;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			BranchAddress ba = (BranchAddress) object;
			if (this.getAddress().getAddressId() == ba.getAddress().getAddressId()) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.getAddress().getAddressId();
		return hash;
	}
	
	public void addBranchMastersIntoBranchAddress(BranchMaster branchMaster) {
		if(branchMaster != null) {
			List<BranchAddress> branchAddresses = branchMaster.getBranchAddresses();
			if(branchAddresses != null && branchAddresses.size() > 0) {
				for(BranchAddress branchAddres : branchAddresses) {
					branchAddres.setBranchMaster(branchMaster);
				}
			}
		}
	}
}