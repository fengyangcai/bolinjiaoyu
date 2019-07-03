package cn.bolinjiaoyu.manage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIsNull() {
            addCriterion("age_groups is null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIsNotNull() {
            addCriterion("age_groups is not null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsEqualTo(String value) {
            addCriterion("age_groups =", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotEqualTo(String value) {
            addCriterion("age_groups <>", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsGreaterThan(String value) {
            addCriterion("age_groups >", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("age_groups >=", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLessThan(String value) {
            addCriterion("age_groups <", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLessThanOrEqualTo(String value) {
            addCriterion("age_groups <=", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLike(String value) {
            addCriterion("age_groups like", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotLike(String value) {
            addCriterion("age_groups not like", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIn(List<String> values) {
            addCriterion("age_groups in", values, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotIn(List<String> values) {
            addCriterion("age_groups not in", values, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsBetween(String value1, String value2) {
            addCriterion("age_groups between", value1, value2, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotBetween(String value1, String value2) {
            addCriterion("age_groups not between", value1, value2, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalIsNull() {
            addCriterion("customer_local is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalIsNotNull() {
            addCriterion("customer_local is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalEqualTo(String value) {
            addCriterion("customer_local =", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalNotEqualTo(String value) {
            addCriterion("customer_local <>", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalGreaterThan(String value) {
            addCriterion("customer_local >", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalGreaterThanOrEqualTo(String value) {
            addCriterion("customer_local >=", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalLessThan(String value) {
            addCriterion("customer_local <", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalLessThanOrEqualTo(String value) {
            addCriterion("customer_local <=", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalLike(String value) {
            addCriterion("customer_local like", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalNotLike(String value) {
            addCriterion("customer_local not like", value, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalIn(List<String> values) {
            addCriterion("customer_local in", values, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalNotIn(List<String> values) {
            addCriterion("customer_local not in", values, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalBetween(String value1, String value2) {
            addCriterion("customer_local between", value1, value2, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andCustomerLocalNotBetween(String value1, String value2) {
            addCriterion("customer_local not between", value1, value2, "customerLocal");
            return (Criteria) this;
        }

        public Criteria andEducationNowIsNull() {
            addCriterion("education_now is null");
            return (Criteria) this;
        }

        public Criteria andEducationNowIsNotNull() {
            addCriterion("education_now is not null");
            return (Criteria) this;
        }

        public Criteria andEducationNowEqualTo(String value) {
            addCriterion("education_now =", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowNotEqualTo(String value) {
            addCriterion("education_now <>", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowGreaterThan(String value) {
            addCriterion("education_now >", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowGreaterThanOrEqualTo(String value) {
            addCriterion("education_now >=", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowLessThan(String value) {
            addCriterion("education_now <", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowLessThanOrEqualTo(String value) {
            addCriterion("education_now <=", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowLike(String value) {
            addCriterion("education_now like", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowNotLike(String value) {
            addCriterion("education_now not like", value, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowIn(List<String> values) {
            addCriterion("education_now in", values, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowNotIn(List<String> values) {
            addCriterion("education_now not in", values, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowBetween(String value1, String value2) {
            addCriterion("education_now between", value1, value2, "educationNow");
            return (Criteria) this;
        }

        public Criteria andEducationNowNotBetween(String value1, String value2) {
            addCriterion("education_now not between", value1, value2, "educationNow");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNull() {
            addCriterion("objective is null");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNotNull() {
            addCriterion("objective is not null");
            return (Criteria) this;
        }

        public Criteria andObjectiveEqualTo(String value) {
            addCriterion("objective =", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotEqualTo(String value) {
            addCriterion("objective <>", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThan(String value) {
            addCriterion("objective >", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("objective >=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThan(String value) {
            addCriterion("objective <", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThanOrEqualTo(String value) {
            addCriterion("objective <=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLike(String value) {
            addCriterion("objective like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotLike(String value) {
            addCriterion("objective not like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveIn(List<String> values) {
            addCriterion("objective in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotIn(List<String> values) {
            addCriterion("objective not in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveBetween(String value1, String value2) {
            addCriterion("objective between", value1, value2, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotBetween(String value1, String value2) {
            addCriterion("objective not between", value1, value2, "objective");
            return (Criteria) this;
        }

        public Criteria andLiftingModeIsNull() {
            addCriterion("lifting_mode is null");
            return (Criteria) this;
        }

        public Criteria andLiftingModeIsNotNull() {
            addCriterion("lifting_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLiftingModeEqualTo(String value) {
            addCriterion("lifting_mode =", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeNotEqualTo(String value) {
            addCriterion("lifting_mode <>", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeGreaterThan(String value) {
            addCriterion("lifting_mode >", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeGreaterThanOrEqualTo(String value) {
            addCriterion("lifting_mode >=", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeLessThan(String value) {
            addCriterion("lifting_mode <", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeLessThanOrEqualTo(String value) {
            addCriterion("lifting_mode <=", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeLike(String value) {
            addCriterion("lifting_mode like", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeNotLike(String value) {
            addCriterion("lifting_mode not like", value, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeIn(List<String> values) {
            addCriterion("lifting_mode in", values, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeNotIn(List<String> values) {
            addCriterion("lifting_mode not in", values, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeBetween(String value1, String value2) {
            addCriterion("lifting_mode between", value1, value2, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLiftingModeNotBetween(String value1, String value2) {
            addCriterion("lifting_mode not between", value1, value2, "liftingMode");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeIsNull() {
            addCriterion("leaving_school_time is null");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeIsNotNull() {
            addCriterion("leaving_school_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeEqualTo(String value) {
            addCriterion("leaving_school_time =", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeNotEqualTo(String value) {
            addCriterion("leaving_school_time <>", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeGreaterThan(String value) {
            addCriterion("leaving_school_time >", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeGreaterThanOrEqualTo(String value) {
            addCriterion("leaving_school_time >=", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeLessThan(String value) {
            addCriterion("leaving_school_time <", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeLessThanOrEqualTo(String value) {
            addCriterion("leaving_school_time <=", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeLike(String value) {
            addCriterion("leaving_school_time like", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeNotLike(String value) {
            addCriterion("leaving_school_time not like", value, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeIn(List<String> values) {
            addCriterion("leaving_school_time in", values, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeNotIn(List<String> values) {
            addCriterion("leaving_school_time not in", values, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeBetween(String value1, String value2) {
            addCriterion("leaving_school_time between", value1, value2, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLeavingSchoolTimeNotBetween(String value1, String value2) {
            addCriterion("leaving_school_time not between", value1, value2, "leavingSchoolTime");
            return (Criteria) this;
        }

        public Criteria andLikeMajorIsNull() {
            addCriterion("like_major is null");
            return (Criteria) this;
        }

        public Criteria andLikeMajorIsNotNull() {
            addCriterion("like_major is not null");
            return (Criteria) this;
        }

        public Criteria andLikeMajorEqualTo(String value) {
            addCriterion("like_major =", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorNotEqualTo(String value) {
            addCriterion("like_major <>", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorGreaterThan(String value) {
            addCriterion("like_major >", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorGreaterThanOrEqualTo(String value) {
            addCriterion("like_major >=", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorLessThan(String value) {
            addCriterion("like_major <", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorLessThanOrEqualTo(String value) {
            addCriterion("like_major <=", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorLike(String value) {
            addCriterion("like_major like", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorNotLike(String value) {
            addCriterion("like_major not like", value, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorIn(List<String> values) {
            addCriterion("like_major in", values, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorNotIn(List<String> values) {
            addCriterion("like_major not in", values, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorBetween(String value1, String value2) {
            addCriterion("like_major between", value1, value2, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andLikeMajorNotBetween(String value1, String value2) {
            addCriterion("like_major not between", value1, value2, "likeMajor");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNull() {
            addCriterion("from_platform is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNotNull() {
            addCriterion("from_platform is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformEqualTo(String value) {
            addCriterion("from_platform =", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotEqualTo(String value) {
            addCriterion("from_platform <>", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThan(String value) {
            addCriterion("from_platform >", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("from_platform >=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThan(String value) {
            addCriterion("from_platform <", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThanOrEqualTo(String value) {
            addCriterion("from_platform <=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLike(String value) {
            addCriterion("from_platform like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotLike(String value) {
            addCriterion("from_platform not like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIn(List<String> values) {
            addCriterion("from_platform in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotIn(List<String> values) {
            addCriterion("from_platform not in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformBetween(String value1, String value2) {
            addCriterion("from_platform between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotBetween(String value1, String value2) {
            addCriterion("from_platform not between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIsNull() {
            addCriterion("source_link is null");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIsNotNull() {
            addCriterion("source_link is not null");
            return (Criteria) this;
        }

        public Criteria andSourceLinkEqualTo(String value) {
            addCriterion("source_link =", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotEqualTo(String value) {
            addCriterion("source_link <>", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkGreaterThan(String value) {
            addCriterion("source_link >", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkGreaterThanOrEqualTo(String value) {
            addCriterion("source_link >=", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLessThan(String value) {
            addCriterion("source_link <", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLessThanOrEqualTo(String value) {
            addCriterion("source_link <=", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLike(String value) {
            addCriterion("source_link like", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotLike(String value) {
            addCriterion("source_link not like", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIn(List<String> values) {
            addCriterion("source_link in", values, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotIn(List<String> values) {
            addCriterion("source_link not in", values, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkBetween(String value1, String value2) {
            addCriterion("source_link between", value1, value2, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotBetween(String value1, String value2) {
            addCriterion("source_link not between", value1, value2, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}