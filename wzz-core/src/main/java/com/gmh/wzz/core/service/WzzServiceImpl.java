package com.gmh.wzz.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmh.wzz.api.WzzService;
import com.gmh.wzz.api.constants.WzzConstant;
import com.gmh.wzz.api.model.PageList;
import com.gmh.wzz.api.model.TbWzzInfo;
import com.gmh.wzz.api.model.TbWzzInfoExample;
import com.gmh.wzz.api.model.TbWzzInfoType;
import com.gmh.wzz.api.model.TbWzzWifi;
import com.gmh.wzz.api.model.TbWzzWifiPsw;
import com.gmh.wzz.core.dao.TbWzzInfoDao;
import com.gmh.wzz.core.dao.TbWzzInfoTypeDao;
import com.gmh.wzz.core.dao.TbWzzUserDao;
import com.gmh.wzz.core.dao.TbWzzUserStoreDao;
import com.gmh.wzz.core.dao.TbWzzWifiDao;
import com.gmh.wzz.core.dao.TbWzzWifiPswDao;

@Service
public class WzzServiceImpl implements WzzService {
	@Autowired
	private TbWzzInfoDao wzzInfoDao;
	@Autowired
	private TbWzzInfoTypeDao wzzInfoTypeDao;
	@Autowired
	private TbWzzUserDao wzzUserDao;
	@Autowired
	private TbWzzUserStoreDao wzzUserStoreDao;
	@Autowired
	private TbWzzWifiDao wzzWifiDao;
	@Autowired
	private TbWzzWifiPswDao wzzWifiPswDao;

	@Override
	public String publishInfo(TbWzzInfo info) {
		try{
			if(info == null){
				return WzzConstant.RETURN_FAIL;
			}
			if(info.getId() == null){
				info.setId(WzzConstant.getNextPK());
			}
			wzzInfoDao.insert(info);
		}catch(Exception e){
			e.printStackTrace();
			return WzzConstant.RETURN_FAIL;
		}
		return WzzConstant.RETURN_SUCCESS;
	}

	@Override
	public PageList<TbWzzInfo> findTbWzzInfo(TbWzzInfo condition,
			long pageIndex, long pageSize) {
		// TODO Auto-generated method stub
		TbWzzInfoExample example = new TbWzzInfoExample();
		example.setDistinct(true);
		example.or().andIdEqualTo(condition.getId());
		wzzInfoDao.countByExample(example);
		wzzInfoDao.selectByExample(example);
		return null;
	}

	@Override
	public List<TbWzzInfoType> findTbWzzInfoType(TbWzzInfoType condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shareWifi(TbWzzWifi wifiInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TbWzzWifiPsw getWifiKey(String wifiId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageList<TbWzzInfoType> findTbWzzInfoType(TbWzzInfoType condition,
			long pageIndex, long pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
