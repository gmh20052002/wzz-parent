package com.gmh.wzz.api.model;

import java.io.Serializable;
import java.util.List;

public class PageList<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<T> datas;
	
	private long totalSize = 0;

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}
}
