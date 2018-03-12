package com.time.nlp.time;

/**
 * 
 * @ClassName: TimePoint
 * @Description: 时间表达式单元规范化对应的内部类, 对应时间表达式规范化的每个字段， 六个字段分别是：年-月-日-时-分-秒，
 *               每个字段初始化为-1,时间表达式单元规范化的内部类
 * @author liangzhicheng
 * @date 2018年2月24日 下午3:12:59
 *
 */
public class TimePoint {
	int[] tunit = { -1, -1, -1, -1, -1, -1 };
}