package com.entity.vo;

import com.entity.ZhiyepeixunEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 荣誉信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiyepeixun")
public class ZhiyepeixunVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


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

}
