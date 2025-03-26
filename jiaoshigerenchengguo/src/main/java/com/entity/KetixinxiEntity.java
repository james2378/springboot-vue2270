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
 * 课题信息
 *
 * @author 
 * @email
 */
@TableName("ketixinxi")
public class KetixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KetixinxiEntity() {

	}

	public KetixinxiEntity(T t) {
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
    @TableField(value = "ketixinxi_name")

    private String ketixinxiName;


    /**
     * 课题类型
     */
    @TableField(value = "ketixinxi_types")

    private Integer ketixinxiTypes;


    /**
     * 教师
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 课题文件
     */
    @TableField(value = "renyuan_file")

    private String renyuanFile;


    /**
     * 详情
     */
    @TableField(value = "ketixinxi_content")

    private String ketixinxiContent;


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
    public String getKetixinxiName() {
        return ketixinxiName;
    }
    /**
	 * 获取：标题
	 */

    public void setKetixinxiName(String ketixinxiName) {
        this.ketixinxiName = ketixinxiName;
    }
    /**
	 * 设置：课题类型
	 */
    public Integer getKetixinxiTypes() {
        return ketixinxiTypes;
    }
    /**
	 * 获取：课题类型
	 */

    public void setKetixinxiTypes(Integer ketixinxiTypes) {
        this.ketixinxiTypes = ketixinxiTypes;
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
	 * 设置：课题文件
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }
    /**
	 * 获取：课题文件
	 */

    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 设置：详情
	 */
    public String getKetixinxiContent() {
        return ketixinxiContent;
    }
    /**
	 * 获取：详情
	 */

    public void setKetixinxiContent(String ketixinxiContent) {
        this.ketixinxiContent = ketixinxiContent;
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
        return "Ketixinxi{" +
            "id=" + id +
            ", ketixinxiName=" + ketixinxiName +
            ", ketixinxiTypes=" + ketixinxiTypes +
            ", yonghuId=" + yonghuId +
            ", renyuanFile=" + renyuanFile +
            ", ketixinxiContent=" + ketixinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
