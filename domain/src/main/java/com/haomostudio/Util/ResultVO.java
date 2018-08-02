package com.haomostudio.Util;

import java.io.Serializable;

/**
 * 自定义响应结构
 */
public class ResultVO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 响应业务状态
	private Integer status;

	// 响应消息
	private String msg;

	// 响应中的数据
	private Object data;

	public static ResultVO build(Integer status, String msg, Object data) {
		return new ResultVO(status, msg, data);
	}

	public static ResultVO ok(Object data) {
		return new ResultVO(data);
	}

	public static ResultVO ok() {
		return new ResultVO(null);
	}

	public ResultVO() {

	}

	public static ResultVO build(Integer status, String msg) {
		return new ResultVO(status, msg, null);
	}

	public ResultVO(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	//构造方法
	public ResultVO(Object data) {
		this.status = 200;
		this.msg = "添加成功";
		this.data = data;
	}

	
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultVO [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}

}
