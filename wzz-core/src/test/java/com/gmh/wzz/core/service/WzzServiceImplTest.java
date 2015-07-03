package com.gmh.wzz.core.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gmh.wzz.api.WzzService;
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
		info.setInfoAddress("11111111111111111");
		info.setInfoContext("222222222222222222222");
		info.setInfoPhone("3333333333333333333");
		info.setInfoPic("44444444444444444444");
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
		fail("Not yet implemented");
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
