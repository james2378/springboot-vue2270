package com.entity.vo;

import com.entity.JiaocaizhuanzhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教材信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaocaizhuanzhu")
public class JiaocaizhuanzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
