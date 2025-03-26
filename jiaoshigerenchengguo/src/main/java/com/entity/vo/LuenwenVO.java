package com.entity.vo;

import com.entity.LuenwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 论文信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("luenwen")
public class LuenwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
