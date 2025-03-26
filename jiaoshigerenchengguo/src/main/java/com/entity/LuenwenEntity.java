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
 * 论文信息
 *
 * @author 
 * @email
 */
@TableName("luenwen")
public class LuenwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LuenwenEntity() {

	}

	public LuenwenEntity(T t) {
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
    @TableField(value = "luenwen_name")

    private String luenwenName;


    /**
     * 论文类型
     */
    @TableField(value = "luenwen_types")

    private Integer luenwenTypes;


    /**
     * 教师
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 证明材料
     */
    @TableField(value = "renyuan_file")

    private String renyuanFile;


    /**
     * 详情
     */
    @TableField(value = "luenwen_content")

    private String luenwenContent;


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
    public String getLuenwenName() {
        return luenwenName;
    }
    /**
	 * 获取：标题
	 */

    public void setLuenwenName(String luenwenName) {
        this.luenwenName = luenwenName;
    }
    /**
	 * 设置：论文类型
	 */
    public Integer getLuenwenTypes() {
        return luenwenTypes;
    }
    /**
	 * 获取：论文类型
	 */

    public void setLuenwenTypes(Integer luenwenTypes) {
        this.luenwenTypes = luenwenTypes;
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
	 * 设置：证明材料
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }
    /**
	 * 获取：证明材料
	 */

    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 设置：详情
	 */
    public String getLuenwenContent() {
        return luenwenContent;
    }
    /**
	 * 获取：详情
	 */

    public void setLuenwenContent(String luenwenContent) {
        this.luenwenContent = luenwenContent;
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
        return "Luenwen{" +
            "id=" + id +
            ", luenwenName=" + luenwenName +
            ", luenwenTypes=" + luenwenTypes +
            ", yonghuId=" + yonghuId +
            ", renyuanFile=" + renyuanFile +
            ", luenwenContent=" + luenwenContent +
            ", createTime=" + createTime +
        "}";
    }
}
