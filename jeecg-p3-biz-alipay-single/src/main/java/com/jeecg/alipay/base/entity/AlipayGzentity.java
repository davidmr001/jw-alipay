package com.jeecg.alipay.base.entity;

import java.io.Serializable;
import java.util.Date;

import com.jeecg.alipay.util.SystemUtil;

/**
 * 描述：</b>QywxGzentity:关注回复; InnoDB free: 130048 kB<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月25日 12时04分15秒 星期五 
 * @version:1.0
 */
public class AlipayGzentity implements Serializable{
	private static final long serialVersionUID = 1L;
	
		return SystemUtil.getOnlieAlipayAccountId();
	@Override
	public String toString() {
		return "QywxGzentity [id=" + id + ", templateName=" + templateName
				+ ", templateId=" + templateId + ", templateType="
				+ templateType + ", isWork=" + isWork + ", accountid="
				+ accountid + ", createName=" + createName + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateName="
				+ updateName + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + "]";
	}
}
