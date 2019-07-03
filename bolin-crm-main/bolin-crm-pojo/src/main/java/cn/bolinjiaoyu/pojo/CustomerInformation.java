package cn.bolinjiaoyu.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The persistent class for the tb_customerinformation database table.
 * 
 */
@Entity
@Table(name = "tb_customerinformation")
//@NamedQuery(name = "CustomerInformation.findAll", query = "SELECT c FROM CustomerInformation c")
public class CustomerInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;

	private int age;

	@Column(name = "age_groups")
	private String ageGroups;

	@Column(name = "customer_local")
	private String customerLocal;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_phone")
	private String customerPhone;

	@Lob
	private String description;

	@Column(name = "education_now")
	private String educationNow;

	@Column(name = "from_platform")
	private String fromPlatform;

	@Column(name = "leaving_school_time")
	private String leavingSchoolTime;

	@Column(name = "lifting_mode")
	private String liftingMode;

	@Column(name = "like_major")
	private String likeMajor;

	private String objective;

	@Column(name = "recept_time")
	private String receptTime;

	private String sex;

	@Column(name = "source_link")
	private String sourceLink;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time")
	private Date updateTime;

	public CustomerInformation() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAgeGroups() {
		return this.ageGroups;
	}

	public void setAgeGroups(String ageGroups) {
		this.ageGroups = ageGroups;
	}

	public String getCustomerLocal() {
		return this.customerLocal;
	}

	public void setCustomerLocal(String customerLocal) {
		this.customerLocal = customerLocal;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEducationNow() {
		return this.educationNow;
	}

	public void setEducationNow(String educationNow) {
		this.educationNow = educationNow;
	}

	public String getFromPlatform() {
		return this.fromPlatform;
	}

	public void setFromPlatform(String fromPlatform) {
		this.fromPlatform = fromPlatform;
	}

	public String getLeavingSchoolTime() {
		return this.leavingSchoolTime;
	}

	public void setLeavingSchoolTime(String leavingSchoolTime) {
		this.leavingSchoolTime = leavingSchoolTime;
	}

	public String getLiftingMode() {
		return this.liftingMode;
	}

	public void setLiftingMode(String liftingMode) {
		this.liftingMode = liftingMode;
	}

	public String getLikeMajor() {
		return this.likeMajor;
	}

	public void setLikeMajor(String likeMajor) {
		this.likeMajor = likeMajor;
	}

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getReceptTime() {
		return this.receptTime;
	}

	public void setReceptTime(String receptTime) {
		this.receptTime = receptTime;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSourceLink() {
		return this.sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getUpdateTime() {
		
		return this.updateTime;
		
		
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}