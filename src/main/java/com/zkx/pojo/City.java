package com.zkx.pojo;

import java.io.Serializable;

public class City implements Serializable {
	private int cid;
	private int pid;
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "City{" +
				"cid=" + cid +
				", pid=" + pid +
				", cname='" + cname + '\'' +
				'}';
	}
}
