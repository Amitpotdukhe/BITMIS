package mis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User {
	
	@Id
	private int user_id;
	private String user_type;
	private String user_name;
	private String password;
	private String dob;
	private String gender;
	private String address;
	private String email_id;
	private String aadhar_card_no;
	private String pan_card_no;
	private String mobile_no;
	private String department_id;
	private String doj;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAadhar_card_no() {
		return aadhar_card_no;
	}

	public void setAadhar_card_no(String aadhar_card_no) {
		this.aadhar_card_no = aadhar_card_no;
	}

	public String getPan_card_no() {
		return pan_card_no;
	}

	public void setPan_card_no(String pan_card_no) {
		this.pan_card_no = pan_card_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_type=" + user_type + ", user_name=" + user_name + ", password="
				+ password + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", email_id=" + email_id
				+ ", aadhar_card_no=" + aadhar_card_no + ", pan_card_no=" + pan_card_no + ", mobile_no=" + mobile_no
				+ ", department_id=" + department_id + ", doj=" + doj + "]";
	}

	
	
}
