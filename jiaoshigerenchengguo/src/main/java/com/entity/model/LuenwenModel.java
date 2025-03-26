package com.entity.model;

import com.entity.LuenwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 论文信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LuenwenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String luenwenName;


    /**
     * 论文类型
     */
    private Integer luenwenTypes;


    /**
     * 教师
     */
    private Integer yonghuId;


    /**
     * 证明材料
     */
    private String renyuanFile;


    /**
     * 详情
     */
    private String luenwenContent;


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
    public String getLuenwenName() {
        return luenwenName;
    }


    /**
	 * 设置：标题
	 */
    public void setLuenwenName(String luenwenName) {
        this.luenwenName = luenwenName;
    }
    /**
	 * 获取：论文类型
	 */
    public Integer getLuenwenTypes() {
        return luenwenTypes;
    }


    /**
	 * 设置：论文类型
	 */
    public void setLuenwenTypes(Integer luenwenTypes) {
        this.luenwenTypes = luenwenTypes;
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
	 * 获取：证明材料
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }


    /**
	 * 设置：证明材料
	 */
    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 获取：详情
	 */
    public String getLuenwenContent() {
        return luenwenContent;
    }


    /**
	 * 设置：详情
	 */
    public void setLuenwenContent(String luenwenContent) {
        this.luenwenContent = luenwenContent;
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
