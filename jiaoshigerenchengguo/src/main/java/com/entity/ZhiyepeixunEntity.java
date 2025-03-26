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
 * 荣誉信息
 *
 * @author 
 * @email
 */
@TableName("zhiyepeixun")
public class ZhiyepeixunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhiyepeixunEntity() {

	}

	public ZhiyepeixunEntity(T t) {
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
    @TableField(value = "zhiyepeixun_name")

    private String zhiyepeixunName;


    /**
     * 荣誉类型
     */
    @TableField(value = "zhiyepeixun_types")

    private Integer zhiyepeixunTypes;


    /**
     * 荣誉图片
     */
    @TableField(value = "zhiyepeixun_photo")

    private String zhiyepeixunPhoto;


    /**
     * 教师
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 获奖时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhiyepeixun_time")

    private Date zhiyepeixunTime;


    /**
     * 荣誉详情
     */
    @TableField(value = "zhiyepeixun_content")

    private String zhiyepeixunContent;


    /**
     * 记录时间
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
    public String getZhiyepeixunName() {
        return zhiyepeixunName;
    }
    /**
	 * 获取：标题
	 */

    public void setZhiyepeixunName(String zhiyepeixunName) {
        this.zhiyepeixunName = zhiyepeixunName;
    }
    /**
	 * 设置：荣誉类型
	 */
    public Integer getZhiyepeixunTypes() {
        return zhiyepeixunTypes;
    }
    /**
	 * 获取：荣誉类型
	 */

    public void setZhiyepeixunTypes(Integer zhiyepeixunTypes) {
        this.zhiyepeixunTypes = zhiyepeixunTypes;
    }
    /**
	 * 设置：荣誉图片
	 */
    public String getZhiyepeixunPhoto() {
        return zhiyepeixunPhoto;
    }
    /**
	 * 获取：荣誉图片
	 */

    public void setZhiyepeixunPhoto(String zhiyepeixunPhoto) {
        this.zhiyepeixunPhoto = zhiyepeixunPhoto;
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
	 * 设置：获奖时间
	 */
    public Date getZhiyepeixunTime() {
        return zhiyepeixunTime;
    }
    /**
	 * 获取：获奖时间
	 */

    public void setZhiyepeixunTime(Date zhiyepeixunTime) {
        this.zhiyepeixunTime = zhiyepeixunTime;
    }
    /**
	 * 设置：荣誉详情
	 */
    public String getZhiyepeixunContent() {
        return zhiyepeixunContent;
    }
    /**
	 * 获取：荣誉详情
	 */

    public void setZhiyepeixunContent(String zhiyepeixunContent) {
        this.zhiyepeixunContent = zhiyepeixunContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：记录时间
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
        return "Zhiyepeixun{" +
            "id=" + id +
            ", zhiyepeixunName=" + zhiyepeixunName +
            ", zhiyepeixunTypes=" + zhiyepeixunTypes +
            ", zhiyepeixunPhoto=" + zhiyepeixunPhoto +
            ", yonghuId=" + yonghuId +
            ", zhiyepeixunTime=" + zhiyepeixunTime +
            ", zhiyepeixunContent=" + zhiyepeixunContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
