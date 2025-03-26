package com.entity.model;

import com.entity.ZhuanlixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 专利信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuanlixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String zhuanlixinxiName;


    /**
     * 专利类型
     */
    private Integer zhuanlixinxiTypes;


    /**
     * 教师
     */
    private Integer yonghuId;


    /**
     * 专利文件
     */
    private String renyuanFile;


    /**
     * 详情
     */
    private String zhuanlixinxiContent;


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
    public String getZhuanlixinxiName() {
        return zhuanlixinxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setZhuanlixinxiName(String zhuanlixinxiName) {
        this.zhuanlixinxiName = zhuanlixinxiName;
    }
    /**
	 * 获取：专利类型
	 */
    public Integer getZhuanlixinxiTypes() {
        return zhuanlixinxiTypes;
    }


    /**
	 * 设置：专利类型
	 */
    public void setZhuanlixinxiTypes(Integer zhuanlixinxiTypes) {
        this.zhuanlixinxiTypes = zhuanlixinxiTypes;
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
	 * 获取：专利文件
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }


    /**
	 * 设置：专利文件
	 */
    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 获取：详情
	 */
    public String getZhuanlixinxiContent() {
        return zhuanlixinxiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setZhuanlixinxiContent(String zhuanlixinxiContent) {
        this.zhuanlixinxiContent = zhuanlixinxiContent;
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
