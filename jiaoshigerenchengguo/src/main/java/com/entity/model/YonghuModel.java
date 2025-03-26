package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 教师姓名
     */
    private String yonghuName;


    /**
     * 头像
     */
    private String yonghuPhoto;


    /**
     * 手机号
     */
    private String yonghuPhone;


    /**
     * 电子邮箱
     */
    private String yonghuEmail;


    /**
     * 职称
     */
    private String yonghuZc;


    /**
     * 学历
     */
    private String yonghuZy;


    /**
     * 从事专业
     */
    private String yonghuXy;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 系部
     */
    private Integer xibuTypes;


    /**
     * 出身日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yonghuTime;


    /**
     * 假删
     */
    private Integer yonghuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：教师姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：教师姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：职称
	 */
    public String getYonghuZc() {
        return yonghuZc;
    }


    /**
	 * 设置：职称
	 */
    public void setYonghuZc(String yonghuZc) {
        this.yonghuZc = yonghuZc;
    }
    /**
	 * 获取：学历
	 */
    public String getYonghuZy() {
        return yonghuZy;
    }


    /**
	 * 设置：学历
	 */
    public void setYonghuZy(String yonghuZy) {
        this.yonghuZy = yonghuZy;
    }
    /**
	 * 获取：从事专业
	 */
    public String getYonghuXy() {
        return yonghuXy;
    }


    /**
	 * 设置：从事专业
	 */
    public void setYonghuXy(String yonghuXy) {
        this.yonghuXy = yonghuXy;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：系部
	 */
    public Integer getXibuTypes() {
        return xibuTypes;
    }


    /**
	 * 设置：系部
	 */
    public void setXibuTypes(Integer xibuTypes) {
        this.xibuTypes = xibuTypes;
    }
    /**
	 * 获取：出身日期
	 */
    public Date getYonghuTime() {
        return yonghuTime;
    }


    /**
	 * 设置：出身日期
	 */
    public void setYonghuTime(Date yonghuTime) {
        this.yonghuTime = yonghuTime;
    }
    /**
	 * 获取：假删
	 */
    public Integer getYonghuDelete() {
        return yonghuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setYonghuDelete(Integer yonghuDelete) {
        this.yonghuDelete = yonghuDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
