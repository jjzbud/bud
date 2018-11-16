package com.bud.test.userorg.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SYS_USER", schema = "dbo")
public class User implements Serializable{

    public static final String ID               = "id";
    public static final String USERNAME         = "username";
    public static final String EMAIL            = "email";
    public static final String MOBILE           = "mobile";
    public static final String PASSWORD         = "password";
    public static final String SALT             = "salt";
    public static final String CREATE_DATE      = "createDate";
    public static final String ORG_ID           = "orgId";
    public static final String PARENT_ORG_IDS   = "parentOrgIds";
    public static final String ORDERBY          = "orderby";
    public static final String AVAILABLE        = "available";
    public static final String CREATE_BY        = "createBy";
    public static final String UPDATE_DATE      = "updateDate";
    public static final String UPDATE_BY        = "updateBy";
    public static final String VERSION          = "version";
    public static final String IS_DELETED       = "isDeleted";
    public static final String REAL_NAME        = "realName";
    public static final String EMPLOYEE_CODE    = "employeeCode";
    public static final String EMPLOYEE_TYPE    = "employeeType";
    public static final String SEX              = "sex";
    public static final String GOV_ORG          = "govOrg";
    public static final String GOV_JOB          = "govJob";
    public static final String MARK             = "mark";
    public static final String WXID             = "wxid";
    public static final String AVATAR           = "avatar";

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    /** USERNAME - 用户名称，用户登陆名  */
    @Column(name = "USERNAME", unique = true, nullable = true, insertable = true, updatable = true, length = 100)
    private String   username;

    /** EMPLOYEE_CODE - HR/OA工号：针对正式员工和临时员工，HR/OA编号为必填  */
    @Column(name = "EMPLOYEE_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String   employeeCode;

    /** EMPLOYEE_TYPE - 用户类别：正式员工、临时员工、外部员工  */
    @Column(name = "EMPLOYEE_TYPE", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String   employeeType;

    /** REAL_NAME - 真实姓名  */
    @Column(name = "REAL_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 128)
    private String   realName;

    /** SEX - 性别  */
    @Column(name = "SEX", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String   sex;

    /** EMAIL - 邮箱  */
    @Column(name = "EMAIL", unique = true, nullable = true, insertable = true, updatable = true, length = 100)
    private String   email;

    /** MOBILE - 手机号  */
    @Column(name = "MOBILE", unique = true, nullable = true, insertable = true, updatable = true, length = 20)
    private String   mobile;

    /** PASSWORD - 密码  */
    @Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
    private String   password;

    /** SALT - 加密密码时使用的种子  */
    @Column(name = "SALT", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String   salt;

    /** ORG_ID - 用户归属部门  */
    @Column(name = "ORG_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String   orgId;

    /** PARENT_ORG_IDS - 用户归属部门S  */
    @Column(name = "PARENT_ORG_IDS", unique = false, nullable = true, insertable = true, updatable = true, length = 256)
    private String   parentOrgIds;

    /** ORDERBY - 顺序  */
    @Column(name = "ORDERBY", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String   orderby;

    /** AVAILABLE - 是否可用  */
    @Column(name = "AVAILABLE", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String   available;

    /** GOV_ORG - 行政所属组织 */
    @Column(name = "GOV_ORG", unique = false, nullable = true, insertable = true, updatable = true, length = 512)
    private String   govOrg;

    /** GOV_JOB - 行政职务  */
    @Column(name = "GOV_JOB", unique = false, nullable = true, insertable = true, updatable = true, length = 128)
    private String   govJob;

    /** MARK - 备注  */
    @Column(name = "MARK", unique = false, nullable = true, insertable = true, updatable = true, length = 512)
    private String   mark;

    /** WXID - 微信ID */
    @Column(name = "wxid", unique = false, nullable = true, insertable = true, updatable = true, length = 512)
    private String   wxid;

    /** AVATAR 照片 */
    @Column(name = "avatar", unique = false, nullable = true, insertable = true, updatable = true, length = 512)
    private String   avatar;

    public User() {
    }

    public User(String username, String employeeCode, String employeeType, String realName, String sex, String email, String mobile, String password, String salt, String orgId, String parentOrgIds, String orderby, String available, String govOrg, String govJob, String mark, String wxid, String avatar) {
        this.username = username;
        this.employeeCode = employeeCode;
        this.employeeType = employeeType;
        this.realName = realName;
        this.sex = sex;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.salt = salt;
        this.orgId = orgId;
        this.parentOrgIds = parentOrgIds;
        this.orderby = orderby;
        this.available = available;
        this.govOrg = govOrg;
        this.govJob = govJob;
        this.mark = mark;
        this.wxid = wxid;
        this.avatar = avatar;
    }

    public static String getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getParentOrgIds() {
        return parentOrgIds;
    }

    public void setParentOrgIds(String parentOrgIds) {
        this.parentOrgIds = parentOrgIds;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getGovOrg() {
        return govOrg;
    }

    public void setGovOrg(String govOrg) {
        this.govOrg = govOrg;
    }

    public String getGovJob() {
        return govJob;
    }

    public void setGovJob(String govJob) {
        this.govJob = govJob;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}