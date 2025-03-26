package com.entity.vo;

import com.entity.JiaoxuegongzuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教学工作
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoxuegongzuo")
public class JiaoxuegongzuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jiaoxuegongzuo_name")
    private String jiaoxuegongzuoName;


    /**
     * 教师
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 工作类型
     */

    @TableField(value = "jiaoxuegongzuo_types")
    private Integer jiaoxuegongzuoTypes;


    /**
     * 学期
     */

    @TableField(value = "jiaoxuegongzuo_xueqi")
    private String jiaoxuegongzuoXueqi;


    /**
     * 课程
     */

    @TableField(value = "jiaoxuegongzuo_kecheng")
    private String jiaoxuegongzuoKecheng;


    /**
     * 班级
     */

    @TableField(value = "jiaoxuegongzuo_banji")
    private String jiaoxuegongzuoBanji;


    /**
     * 详情
     */

    @TableField(value = "jiaoxuegongzuo_content")
    private String jiaoxuegongzuoContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getJiaoxuegongzuoName() {
        return jiaoxuegongzuoName;
    }


    /**
	 * 获取：标题
	 */

    public void setJiaoxuegongzuoName(String jiaoxuegongzuoName) {
        this.jiaoxuegongzuoName = jiaoxuegongzuoName;
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
	 * 设置：工作类型
	 */
    public Integer getJiaoxuegongzuoTypes() {
        return jiaoxuegongzuoTypes;
    }


    /**
	 * 获取：工作类型
	 */

    public void setJiaoxuegongzuoTypes(Integer jiaoxuegongzuoTypes) {
        this.jiaoxuegongzuoTypes = jiaoxuegongzuoTypes;
    }
    /**
	 * 设置：学期
	 */
    public String getJiaoxuegongzuoXueqi() {
        return jiaoxuegongzuoXueqi;
    }


    /**
	 * 获取：学期
	 */

    public void setJiaoxuegongzuoXueqi(String jiaoxuegongzuoXueqi) {
        this.jiaoxuegongzuoXueqi = jiaoxuegongzuoXueqi;
    }
    /**
	 * 设置：课程
	 */
    public String getJiaoxuegongzuoKecheng() {
        return jiaoxuegongzuoKecheng;
    }


    /**
	 * 获取：课程
	 */

    public void setJiaoxuegongzuoKecheng(String jiaoxuegongzuoKecheng) {
        this.jiaoxuegongzuoKecheng = jiaoxuegongzuoKecheng;
    }
    /**
	 * 设置：班级
	 */
    public String getJiaoxuegongzuoBanji() {
        return jiaoxuegongzuoBanji;
    }


    /**
	 * 获取：班级
	 */

    public void setJiaoxuegongzuoBanji(String jiaoxuegongzuoBanji) {
        this.jiaoxuegongzuoBanji = jiaoxuegongzuoBanji;
    }
    /**
	 * 设置：详情
	 */
    public String getJiaoxuegongzuoContent() {
        return jiaoxuegongzuoContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiaoxuegongzuoContent(String jiaoxuegongzuoContent) {
        this.jiaoxuegongzuoContent = jiaoxuegongzuoContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
