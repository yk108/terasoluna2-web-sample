package jp.terasoluna.thin.tutorial.web.usermanager.form;

import java.util.List;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

public class UserManagerForm extends ValidatorActionFormEx{

	/**
	 * シリアルバージョンID.
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
	
	/*一覧画面で使用する*/

    /**
     * 表示行数。
     */
    private String row = "10";
    
    /**
     * 開始インデックス。
     */
    private String startIndex ="0";
    
    /**
     * 全件数。
     */
    private String totalCount = null;
    
    /**
     * 表示用ユーザリスト。
     */
    private List<SelectUserOutput> users = null;


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

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(String startIndex) {
		this.startIndex = startIndex;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<SelectUserOutput> getUsers() {
		return users;
	}

	public void setUsers(List<SelectUserOutput> users) {
		this.users = users;
	}
	
	
	
	
}
