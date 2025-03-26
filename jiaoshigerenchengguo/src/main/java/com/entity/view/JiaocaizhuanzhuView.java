package com.entity.view;

import com.entity.JiaocaizhuanzhuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教材信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaocaizhuanzhu")
public class JiaocaizhuanzhuView extends JiaocaizhuanzhuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 教材类型的值
		*/
		private String jiaocaizhuanzhuValue;



		//级联表 yonghu
			/**
			* 教师姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 职称
			*/
			private String yonghuZc;
			/**
			* 学历
			*/
			private String yonghuZy;
			/**
			* 从事专业
			*/
			private String yonghuXy;
			/**
			* 系部
			*/
			private Integer xibuTypes;
				/**
				* 系部的值
				*/
				private String xibuValue;
			/**
			* 出身日期
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
			@DateTimeFormat
			private Date yonghuTime;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiaocaizhuanzhuView() {

	}

	public JiaocaizhuanzhuView(JiaocaizhuanzhuEntity jiaocaizhuanzhuEntity) {
		try {
			BeanUtils.copyProperties(this, jiaocaizhuanzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 教材类型的值
			*/
			public String getJiaocaizhuanzhuValue() {
				return jiaocaizhuanzhuValue;
			}
			/**
			* 设置： 教材类型的值
			*/
			public void setJiaocaizhuanzhuValue(String jiaocaizhuanzhuValue) {
				this.jiaocaizhuanzhuValue = jiaocaizhuanzhuValue;
			}
















				//级联表的get和set yonghu

					/**
					* 获取： 教师姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 职称
					*/
					public String getYonghuZc() {
						return yonghuZc;
					}
					/**
					* 设置： 职称
					*/
					public void setYonghuZc(String yonghuZc) {
						this.yonghuZc = yonghuZc;
					}

					/**
					* 获取： 学历
					*/
					public String getYonghuZy() {
						return yonghuZy;
					}
					/**
					* 设置： 学历
					*/
					public void setYonghuZy(String yonghuZy) {
						this.yonghuZy = yonghuZy;
					}

					/**
					* 获取： 从事专业
					*/
					public String getYonghuXy() {
						return yonghuXy;
					}
					/**
					* 设置： 从事专业
					*/
					public void setYonghuXy(String yonghuXy) {
						this.yonghuXy = yonghuXy;
					}

					/**
					* 获取： 系部
					*/
					public Integer getXibuTypes() {
						return xibuTypes;
					}
					/**
					* 设置： 系部
					*/
					public void setXibuTypes(Integer xibuTypes) {
						this.xibuTypes = xibuTypes;
					}


						/**
						* 获取： 系部的值
						*/
						public String getXibuValue() {
							return xibuValue;
						}
						/**
						* 设置： 系部的值
						*/
						public void setXibuValue(String xibuValue) {
							this.xibuValue = xibuValue;
						}

					/**
					* 获取： 出身日期
					*/
					public Date getYonghuTime() {
						return yonghuTime;
					}
					/**
					* 设置： 出身日期
					*/
					public void setYonghuTime(Date yonghuTime) {
						this.yonghuTime = yonghuTime;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
