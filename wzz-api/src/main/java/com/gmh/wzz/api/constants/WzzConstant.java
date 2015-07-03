package com.gmh.wzz.api.constants;

import java.io.Serializable;
import java.util.UUID;

public class WzzConstant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String RETURN_SUCCESS = "1";
	public static final String RETURN_FAIL = "-1";
	
	public static String getNextPK(){
		return UUID.randomUUID().toString();
	}
}
