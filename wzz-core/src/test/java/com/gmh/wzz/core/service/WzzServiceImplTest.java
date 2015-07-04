package com.gmh.wzz.core.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gmh.wzz.api.WzzService;
import com.gmh.wzz.api.model.PageList;
import com.gmh.wzz.api.model.TbWzzInfo;

public class WzzServiceImplTest {
	WzzService wzzService;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml",
						"classpath:conf/spring-mybatis.xml" });
		wzzService = (WzzService) context.getBean("wzzServiceImpl");
	}

	@Test
	public void testPublishInfo() {
		TbWzzInfo info = new TbWzzInfo();
		info.setInfoAddress("111111111111111111");
		info.setInfoContext("2222222222222222222221");
		info.setInfoPhone("33333333333333333331");
		info.setInfoPic("444444444444444444441");
		info.setInfoStatus("1");
		info.setInfoTime(new Date());
		info.setUserId("1");
		info.setTypeId("1");
		info.setInfoTitile("测试信息");
		String ret = wzzService.publishInfo(info);
		Assert.assertEquals("1", ret);
	}

	@Test
	public void testFindTbWzzInfo() {
		TbWzzInfo condition = new TbWzzInfo();
		condition.setInfoAddress("111");
		PageList<TbWzzInfo> result = wzzService.findTbWzzInfo(condition, 0, 100);
		System.out.println(result.getTotalSize());
		System.out.println(result.getDatas());
	}

	@Test
	public void testFindTbWzzInfoType() {
		fail("Not yet implemented");
	}

	@Test
	public void testShareWifi() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWifiKey() {
		fail("Not yet implemented");
	}

}
