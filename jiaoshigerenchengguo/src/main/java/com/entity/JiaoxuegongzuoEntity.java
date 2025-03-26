package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教学工作
 *
 * @author 
 * @email
 */
@TableName("jiaoxuegongzuo")
public class JiaoxuegongzuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoxuegongzuoEntity() {

	}

	public JiaoxuegongzuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "jiaoxuegongzuo_name")

    private String jiaoxuegongzuoName;


    /**
     * 教师
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 工作类型
     */
    @TableField(value = "jiaoxuegongzuo_types")

    private Integer jiaoxuegongzuoTypes;


    /**
     * 学期
     */
    @TableField(value = "jiaoxuegongzuo_xueqi")

    private String jiaoxuegongzuoXueqi;


    /**
     * 课程
     */
    @TableField(value = "jiaoxuegongzuo_kecheng")

    private String jiaoxuegongzuoKecheng;


    /**
     * 班级
     */
    @TableField(value = "jiaoxuegongzuo_banji")

    private String jiaoxuegongzuoBanji;


    /**
     * 详情
     */
    @TableField(value = "jiaoxuegongzuo_content")

    private String jiaoxuegongzuoContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getJiaoxuegongzuoName() {
        return jiaoxuegongzuoName;
    }
    /**
	 * 获取：标题
	 */

    public void setJiaoxuegongzuoName(String jiaoxuegongzuoName) {
        this.jiaoxuegongzuoName = jiaoxuegongzuoName;
    }
    /**
	 * 设置：教师
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：教师
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：工作类型
	 */
    public Integer getJiaoxuegongzuoTypes() {
        return jiaoxuegongzuoTypes;
    }
    /**
	 * 获取：工作类型
	 */

    public void setJiaoxuegongzuoTypes(Integer jiaoxuegongzuoTypes) {
        this.jiaoxuegongzuoTypes = jiaoxuegongzuoTypes;
    }
    /**
	 * 设置：学期
	 */
    public String getJiaoxuegongzuoXueqi() {
        return jiaoxuegongzuoXueqi;
    }
    /**
	 * 获取：学期
	 */

    public void setJiaoxuegongzuoXueqi(String jiaoxuegongzuoXueqi) {
        this.jiaoxuegongzuoXueqi = jiaoxuegongzuoXueqi;
    }
    /**
	 * 设置：课程
	 */
    public String getJiaoxuegongzuoKecheng() {
        return jiaoxuegongzuoKecheng;
    }
    /**
	 * 获取：课程
	 */

    public void setJiaoxuegongzuoKecheng(String jiaoxuegongzuoKecheng) {
        this.jiaoxuegongzuoKecheng = jiaoxuegongzuoKecheng;
    }
    /**
	 * 设置：班级
	 */
    public String getJiaoxuegongzuoBanji() {
        return jiaoxuegongzuoBanji;
    }
    /**
	 * 获取：班级
	 */

    public void setJiaoxuegongzuoBanji(String jiaoxuegongzuoBanji) {
        this.jiaoxuegongzuoBanji = jiaoxuegongzuoBanji;
    }
    /**
	 * 设置：详情
	 */
    public String getJiaoxuegongzuoContent() {
        return jiaoxuegongzuoContent;
    }
    /**
	 * 获取：详情
	 */

    public void setJiaoxuegongzuoContent(String jiaoxuegongzuoContent) {
        this.jiaoxuegongzuoContent = jiaoxuegongzuoContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaoxuegongzuo{" +
            "id=" + id +
            ", jiaoxuegongzuoName=" + jiaoxuegongzuoName +
            ", yonghuId=" + yonghuId +
            ", jiaoxuegongzuoTypes=" + jiaoxuegongzuoTypes +
            ", jiaoxuegongzuoXueqi=" + jiaoxuegongzuoXueqi +
            ", jiaoxuegongzuoKecheng=" + jiaoxuegongzuoKecheng +
            ", jiaoxuegongzuoBanji=" + jiaoxuegongzuoBanji +
            ", jiaoxuegongzuoContent=" + jiaoxuegongzuoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
