package com.entity.model;

import com.entity.KetixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课题信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KetixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String ketixinxiName;


    /**
     * 课题类型
     */
    private Integer ketixinxiTypes;


    /**
     * 教师
     */
    private Integer yonghuId;


    /**
     * 课题文件
     */
    private String renyuanFile;


    /**
     * 详情
     */
    private String ketixinxiContent;


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
    public String getKetixinxiName() {
        return ketixinxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setKetixinxiName(String ketixinxiName) {
        this.ketixinxiName = ketixinxiName;
    }
    /**
	 * 获取：课题类型
	 */
    public Integer getKetixinxiTypes() {
        return ketixinxiTypes;
    }


    /**
	 * 设置：课题类型
	 */
    public void setKetixinxiTypes(Integer ketixinxiTypes) {
        this.ketixinxiTypes = ketixinxiTypes;
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
	 * 获取：课题文件
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }


    /**
	 * 设置：课题文件
	 */
    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 获取：详情
	 */
    public String getKetixinxiContent() {
        return ketixinxiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setKetixinxiContent(String ketixinxiContent) {
        this.ketixinxiContent = ketixinxiContent;
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
