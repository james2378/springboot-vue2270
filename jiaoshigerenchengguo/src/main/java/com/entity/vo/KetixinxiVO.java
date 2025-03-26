package com.entity.vo;

import com.entity.KetixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课题信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ketixinxi")
public class KetixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
