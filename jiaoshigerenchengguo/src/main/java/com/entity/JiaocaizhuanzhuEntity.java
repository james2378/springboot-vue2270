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
 * 教材信息
 *
 * @author 
 * @email
 */
@TableName("jiaocaizhuanzhu")
public class JiaocaizhuanzhuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaocaizhuanzhuEntity() {

	}

	public JiaocaizhuanzhuEntity(T t) {
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
    @TableField(value = "jiaocaizhuanzhu_name")

    private String jiaocaizhuanzhuName;


    /**
     * 教材类型
     */
    @TableField(value = "jiaocaizhuanzhu_types")

    private Integer jiaocaizhuanzhuTypes;


    /**
     * 教师
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 教材文件
     */
    @TableField(value = "renyuan_file")

    private String renyuanFile;


    /**
     * 详情
     */
    @TableField(value = "jiaocaizhuanzhu_content")

    private String jiaocaizhuanzhuContent;


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
    public String getJiaocaizhuanzhuName() {
        return jiaocaizhuanzhuName;
    }
    /**
	 * 获取：标题
	 */

    public void setJiaocaizhuanzhuName(String jiaocaizhuanzhuName) {
        this.jiaocaizhuanzhuName = jiaocaizhuanzhuName;
    }
    /**
	 * 设置：教材类型
	 */
    public Integer getJiaocaizhuanzhuTypes() {
        return jiaocaizhuanzhuTypes;
    }
    /**
	 * 获取：教材类型
	 */

    public void setJiaocaizhuanzhuTypes(Integer jiaocaizhuanzhuTypes) {
        this.jiaocaizhuanzhuTypes = jiaocaizhuanzhuTypes;
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
	 * 设置：教材文件
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }
    /**
	 * 获取：教材文件
	 */

    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 设置：详情
	 */
    public String getJiaocaizhuanzhuContent() {
        return jiaocaizhuanzhuContent;
    }
    /**
	 * 获取：详情
	 */

    public void setJiaocaizhuanzhuContent(String jiaocaizhuanzhuContent) {
        this.jiaocaizhuanzhuContent = jiaocaizhuanzhuContent;
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
        return "Jiaocaizhuanzhu{" +
            "id=" + id +
            ", jiaocaizhuanzhuName=" + jiaocaizhuanzhuName +
            ", jiaocaizhuanzhuTypes=" + jiaocaizhuanzhuTypes +
            ", yonghuId=" + yonghuId +
            ", renyuanFile=" + renyuanFile +
            ", jiaocaizhuanzhuContent=" + jiaocaizhuanzhuContent +
            ", createTime=" + createTime +
        "}";
    }
}
