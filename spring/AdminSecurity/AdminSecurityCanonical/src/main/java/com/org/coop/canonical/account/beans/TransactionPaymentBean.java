package com.org.coop.canonical.account.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TransactionPaymentBean implements Serializable {
	protected static final long serialVersionUID = 1L;
	protected int paymentId;
	protected int branchId;
	protected int branchName;
	protected Date actionDate;
	protected BigDecimal amount;
	protected Date createDate;
	protected String createUser;
	protected String deleteInd;
	protected String deleteReason;
	protected String passingAuthInd;
	protected String passingAuthRemark;
	protected String paymentType;
	protected Date updateDate;
	protected String updateUser;
	
	protected List<CardRegisterBean> cardRegisters = new ArrayList<CardRegisterBean>();
	protected List<ChequeRegisterBean> chequeRegisters = new ArrayList<ChequeRegisterBean>();
	protected List<CreditPaymentBean> creditRegisters = new ArrayList<CreditPaymentBean>();
	protected List<AdvanceRegisterBean> advanceRegisters = new ArrayList<AdvanceRegisterBean>();
	protected List<CashRegisterBean> cashRegisters = new ArrayList<CashRegisterBean>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + paymentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionPaymentBean other = (TransactionPaymentBean) obj;
		if (paymentId != other.paymentId)
			return false;
		return true;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getBranchName() {
		return branchName;
	}
	public void setBranchName(int branchName) {
		this.branchName = branchName;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getDeleteInd() {
		return deleteInd;
	}
	public void setDeleteInd(String deleteInd) {
		this.deleteInd = deleteInd;
	}
	public String getDeleteReason() {
		return deleteReason;
	}
	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}
	public String getPassingAuthInd() {
		return passingAuthInd;
	}
	public void setPassingAuthInd(String passingAuthInd) {
		this.passingAuthInd = passingAuthInd;
	}
	public String getPassingAuthRemark() {
		return passingAuthRemark;
	}
	public void setPassingAuthRemark(String passingAuthRemark) {
		this.passingAuthRemark = passingAuthRemark;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<CardRegisterBean> getCardRegisters() {
		return cardRegisters;
	}
	public void setCardRegisters(List<CardRegisterBean> cardRegisters) {
		this.cardRegisters = cardRegisters;
	}
	public List<ChequeRegisterBean> getChequeRegisters() {
		return chequeRegisters;
	}
	public void setChequeRegisters(List<ChequeRegisterBean> chequeRegisters) {
		this.chequeRegisters = chequeRegisters;
	}
	public List<CreditPaymentBean> getCreditRegisters() {
		return creditRegisters;
	}
	public void setCreditRegisters(List<CreditPaymentBean> creditRegisters) {
		this.creditRegisters = creditRegisters;
	}
	public List<AdvanceRegisterBean> getAdvanceRegisters() {
		return advanceRegisters;
	}
	public void setAdvanceRegisters(List<AdvanceRegisterBean> advanceRegisters) {
		this.advanceRegisters = advanceRegisters;
	}
	public List<CashRegisterBean> getCashRegisters() {
		return cashRegisters;
	}
	public void setCashRegisters(List<CashRegisterBean> cashRegisters) {
		this.cashRegisters = cashRegisters;
	}
	
}