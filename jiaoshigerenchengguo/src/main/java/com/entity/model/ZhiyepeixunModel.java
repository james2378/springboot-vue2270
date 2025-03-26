package com.entity.model;

import com.entity.ZhiyepeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 荣誉信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhiyepeixunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String zhiyepeixunName;


    /**
     * 荣誉类型
     */
    private Integer zhiyepeixunTypes;


    /**
     * 荣誉图片
     */
    private String zhiyepeixunPhoto;


    /**
     * 教师
     */
    private Integer yonghuId;


    /**
     * 获奖时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhiyepeixunTime;


    /**
     * 荣誉详情
     */
    private String zhiyepeixunContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：标题
	 */
    public String getZhiyepeixunName() {
        return zhiyepeixunName;
    }


    /**
	 * 设置：标题
	 */
    public void setZhiyepeixunName(String zhiyepeixunName) {
        this.zhiyepeixunName = zhiyepeixunName;
    }
    /**
	 * 获取：荣誉类型
	 */
    public Integer getZhiyepeixunTypes() {
        return zhiyepeixunTypes;
    }


    /**
	 * 设置：荣誉类型
	 */
    public void setZhiyepeixunTypes(Integer zhiyepeixunTypes) {
        this.zhiyepeixunTypes = zhiyepeixunTypes;
    }
    /**
	 * 获取：荣誉图片
	 */
    public String getZhiyepeixunPhoto() {
        return zhiyepeixunPhoto;
    }


    /**
	 * 设置：荣誉图片
	 */
    public void setZhiyepeixunPhoto(String zhiyepeixunPhoto) {
        this.zhiyepeixunPhoto = zhiyepeixunPhoto;
    }
    /**
	 * 获取：教师
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：教师
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：获奖时间
	 */
    public Date getZhiyepeixunTime() {
        return zhiyepeixunTime;
    }


    /**
	 * 设置：获奖时间
	 */
    public void setZhiyepeixunTime(Date zhiyepeixunTime) {
        this.zhiyepeixunTime = zhiyepeixunTime;
    }
    /**
	 * 获取：荣誉详情
	 */
    public String getZhiyepeixunContent() {
        return zhiyepeixunContent;
    }


    /**
	 * 设置：荣誉详情
	 */
    public void setZhiyepeixunContent(String zhiyepeixunContent) {
        this.zhiyepeixunContent = zhiyepeixunContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
