package cn.bolinjiaoyu.manage.pojo;

import java.util.Date;

public class CustomerInformation {
    private Integer customerId;

    private String customerName;

    private String customerPhone;

    private String ageGroups;

    private Integer age;

    private String customerLocal;

    private String educationNow;

    private String objective;

    private String liftingMode;

    private String leavingSchoolTime;

    private String likeMajor;

    private String fromPlatform;

    private String sourceLink;

    private Date updateTime;

    private Integer status;

    private String description;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(String ageGroups) {
        this.ageGroups = ageGroups == null ? null : ageGroups.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCustomerLocal() {
        return customerLocal;
    }

    public void setCustomerLocal(String customerLocal) {
        this.customerLocal = customerLocal == null ? null : customerLocal.trim();
    }

    public String getEducationNow() {
        return educationNow;
    }

    public void setEducationNow(String educationNow) {
        this.educationNow = educationNow == null ? null : educationNow.trim();
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective == null ? null : objective.trim();
    }

    public String getLiftingMode() {
        return liftingMode;
    }

    public void setLiftingMode(String liftingMode) {
        this.liftingMode = liftingMode == null ? null : liftingMode.trim();
    }

    public String getLeavingSchoolTime() {
        return leavingSchoolTime;
    }

    public void setLeavingSchoolTime(String leavingSchoolTime) {
        this.leavingSchoolTime = leavingSchoolTime == null ? null : leavingSchoolTime.trim();
    }

    public String getLikeMajor() {
        return likeMajor;
    }

    public void setLikeMajor(String likeMajor) {
        this.likeMajor = likeMajor == null ? null : likeMajor.trim();
    }

    public String getFromPlatform() {
        return fromPlatform;
    }

    public void setFromPlatform(String fromPlatform) {
        this.fromPlatform = fromPlatform == null ? null : fromPlatform.trim();
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink == null ? null : sourceLink.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}