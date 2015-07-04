package com.gmh.wzz.api;

import com.gmh.wzz.api.model.PageList;
import com.gmh.wzz.api.model.TbWzzInfo;
import com.gmh.wzz.api.model.TbWzzInfoType;
import com.gmh.wzz.api.model.TbWzzWifi;
import com.gmh.wzz.api.model.TbWzzWifiPsw;

public interface WzzService {
	public PageList<TbWzzInfoType> findTbWzzInfoType(TbWzzInfoType condition,
			long pageIndex, long pageSize);

	/**
	 * 发布信息
	 * 
	 * @param info
	 * @return
	 */
	public String publishInfo(TbWzzInfo info);

	public PageList<TbWzzInfo> findTbWzzInfo(TbWzzInfo condition,
			int pageIndex, int pageSize);

	/**
	 * 查询分类
	 * 
	 * @param condition
	 * @return
	 */
	public PageList<TbWzzInfoType> findTbWzzInfoType(TbWzzInfoType condition, int pageBegin, int pageSize);

	/**
	 * 分享wifi
	 * 
	 * @param wifiInfo
	 * @return
	 */
	public String shareWifi(TbWzzWifi wifiInfo);

	public TbWzzWifiPsw getWifiKey(String wifiId);
}
