package mis.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min = 2,max = 20,message = "min 2 and max 20 characters are allowed !!")
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	private String role;
	private boolean enabled;
	private String imageUrl;
	private String dob;
	private String gender;
	private String address;
	private String mobileNumber;
	private String alternateMobile;
	private String aadharNumber;
	private String panNumber;
	private String deptId;
	private String doj;
	private String nationality;
	private String religion;
	private String category;
	private String caste;
	private String blooGroup;


	
//	@JsonIgnore
//	private User user;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBlooGroup() {
		return blooGroup;
	}

	public void setBlooGroup(String blooGroup) {
		this.blooGroup = blooGroup;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + ", imageUrl=" + imageUrl + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", alternateMobile=" + alternateMobile
				+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + ", deptId=" + deptId + ", doj=" + doj
				+ ", nationality=" + nationality + ", religion=" + religion + ", category=" + category + ", caste="
				+ caste + ", blooGroup=" + blooGroup + "]";
	}

	


    
}
