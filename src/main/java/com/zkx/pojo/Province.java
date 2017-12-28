package com.zkx.pojo;

import java.io.Serializable;

public class Province implements Serializable {
	private int pid;
	private String pname;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Province{" +
				"pid=" + pid +
				", pname='" + pname + '\'' +
				'}';
	}
}
