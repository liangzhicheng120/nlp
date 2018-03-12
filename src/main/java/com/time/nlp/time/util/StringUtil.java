package com.time.nlp.time.util;

/**
 * 
 * @ClassName: StringUtil
 * @Description: 字符串工具类
 * @author liangzhicheng
 * @date 2018年2月24日 下午3:02:22
 *
 */
public class StringUtil {

	/**
	 * 字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return ((str == null) || (str.trim().length() == 0));
	}

}
