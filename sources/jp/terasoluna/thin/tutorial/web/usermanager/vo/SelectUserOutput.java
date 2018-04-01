package jp.terasoluna.thin.tutorial.web.usermanager.vo;

import java.io.Serializable;

/**
 * ���ێ�Bean.
 * �f�[�^�x�[�X����̎擾���A��ʂ���̓��͎��Ɏg�p�����B
 *
 */
public class SelectUserOutput implements Serializable {

	/**
	 * �V���A���o�[�W����ID.
	 */
	private static final long serialVersionUID = 1L;

	
	private String customerId;

	private String customerName;

	private String zipNo;

	private String address;

	private String tel;

	private String mail;

	private String sex;

	private String jobId;

	private String note;

	private String salary;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getZipNo() {
		return zipNo;
	}

	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
