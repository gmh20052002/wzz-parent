package com.gmh.wzz.core.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmh.wzz.api.WzzService;
import com.gmh.wzz.api.constants.WzzConstant;
import com.gmh.wzz.api.model.Page;
import com.gmh.wzz.api.model.PageList;
import com.gmh.wzz.api.model.TbWzzInfo;
import com.gmh.wzz.api.model.TbWzzInfoExample;
import com.gmh.wzz.api.model.TbWzzInfoType;
import com.gmh.wzz.api.model.TbWzzInfoTypeExample;
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
		try {
			if (info == null) {
				return WzzConstant.RETURN_FAIL;
			}
			if (info.getId() == null) {
				info.setId(WzzConstant.getNextPK());
			}
			wzzInfoDao.insert(info);
		} catch (Exception e) {
			e.printStackTrace();
			return WzzConstant.RETURN_FAIL;
		}
		return WzzConstant.RETURN_SUCCESS;
	}

	@Override
	public PageList<TbWzzInfo> findTbWzzInfo(TbWzzInfo condition,
			int pageBegin, int pageSize) {
		PageList<TbWzzInfo> result = new PageList<TbWzzInfo>();
		TbWzzInfoExample example = new TbWzzInfoExample();
		example.setDistinct(true);
		if (condition != null) {
			TbWzzInfoExample.Criteria c = example.or();
			String id = condition.getId();
			String infoAddress = condition.getInfoAddress();
			String infoContext = condition.getInfoContext();
			String infoPhone = condition.getInfoPhone();
			String infoPic = condition.getInfoPic();
			String infoStatus = condition.getInfoStatus();
			Date infoTime = condition.getInfoTime();
			Date startTime = condition.getStartTime();
			Date endTime = condition.getEndTime();
			String infoTitle = condition.getInfoTitile();
			String typeId = condition.getTypeId();
			String userId = condition.getUserId();
			if (id != null) {
				c.andIdEqualTo(id);
			}
			if (infoAddress != null) {
				c.andInfoAddressLike("%" + infoAddress + "%");
			}
			if (infoContext != null) {
				c.andInfoAddressLike("%" + infoContext + "%");
			}
			if (infoPhone != null) {
				c.andInfoAddressLike("%" + infoPhone + "%");
			}
			if (infoPic != null) {
				c.andInfoAddressLike("%" + infoPic + "%");
			}
			if (infoStatus != null) {
				c.andInfoStatusEqualTo(infoStatus);
			}
			if (infoTime != null) {
				c.andInfoTimeEqualTo(infoTime);
			}
			if (startTime != null) {
				c.andInfoTimeGreaterThanOrEqualTo(startTime);
			}
			if (endTime != null) {
				c.andInfoTimeLessThanOrEqualTo(endTime);
			}
			if (infoTitle != null) {
				c.andInfoTitileLike("%" + infoTitle + "%");
			}
			if (typeId != null) {
				c.andTypeIdEqualTo(typeId);
			}
			if (userId != null) {
				c.andUserIdEqualTo(userId);
			}
		}
		// 分页设置
		Page page = new Page(pageBegin, pageSize);
		example.setPage(page);
		;
		int totalSize = wzzInfoDao.countByExample(example);
		List<TbWzzInfo> datas = wzzInfoDao.selectByExample(example);
		result.setDatas(datas);
		result.setTotalSize(totalSize);
		return result;
	}

	@Override
	public PageList<TbWzzInfoType> findTbWzzInfoType(TbWzzInfoType condition,
			int pageBegin, int pageSize) {
		PageList<TbWzzInfoType> result = new PageList<TbWzzInfoType>();
		TbWzzInfoTypeExample example = new TbWzzInfoTypeExample();
		example.setDistinct(true);
		if (condition != null) {
			TbWzzInfoTypeExample.Criteria c = example.or();
			String id = condition.getId();
			String parentId = condition.getParentId();
			String typeCode = condition.getTypeCode();
			String typeIcon = condition.getTypeIcon();
			String typeName = condition.getTypeName();
			String typeRemark = condition.getTypeRemark();
			if (id != null) {
				c.andIdEqualTo(id);
			}
			if (parentId != null) {
				c.andParentIdEqualTo(parentId);
			}
			if (typeCode != null) {
				c.andTypeCodeEqualTo(typeCode);
			}
			if (typeIcon != null) {
				c.andTypeIconLike("%" + typeIcon + "%");
			}
			if (typeName != null) {
				c.andTypeNameLike("%" + typeName + "%");
			}
			if (typeRemark != null) {
				c.andTypeRemarkLike("%" + typeRemark + "%");
			}
		}
		// 分页设置
		Page page = new Page(pageBegin, pageSize);
		example.setPage(page);
		;
		int totalSize = wzzInfoTypeDao.countByExample(example);
		List<TbWzzInfoType> datas = wzzInfoTypeDao.selectByExample(example);
		result.setDatas(datas);
		result.setTotalSize(totalSize);
		return result;
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
