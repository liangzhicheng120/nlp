package com.time.nlp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.time.nlp.time.TimeNormalizer;
import com.time.nlp.time.TimeUnit;
import com.time.nlp.time.util.DateUtil;

@Controller
@EnableAutoConfiguration
public class ExtractController {

	@RequestMapping("/get")
	@ResponseBody
	public List<String> getTime(String text) {
		String path = TimeNormalizer.class.getResource("").getPath();
		String classPath = path.substring(0, path.indexOf("/com/time/nlp"));
		TimeNormalizer normalizer = new TimeNormalizer(classPath + "/TimeExp.m");
		normalizer.parse(text);
		TimeUnit[] unit = normalizer.getTimeUnit();
		List<String> result = new ArrayList<String>();
		for (TimeUnit timeUnit : unit) {
			result.add(DateUtil.formatDateDefault(timeUnit.getTime()) + "-" + timeUnit.getIsAllDayTime());
		}
		return result;
	}

	public static void main(String[] args) {
		String text = "今天下午三点开会";
		String path = TimeNormalizer.class.getResource("").getPath();
		String classPath = path.substring(0, path.indexOf("/com/time/nlp"));
		TimeNormalizer normalizer = new TimeNormalizer(classPath + "/TimeExp.m");
		normalizer.parse(text);
		TimeUnit[] unit = normalizer.getTimeUnit();
		List<String> result = new ArrayList<String>();
		for (TimeUnit timeUnit : unit) {
			result.add(DateUtil.formatDateDefault(timeUnit.getTime()) + "-" + timeUnit.getIsAllDayTime());
		}
		System.out.println(result);
	}
}
