package com.pms.utils;

public class RandomUtil {

	public RandomUtil() {
		// TODO 自动生成的构造函数存根
	}
	public static int getRandNum() {
        return (int)((Math.random()*9+1)*1000);
    }

}
