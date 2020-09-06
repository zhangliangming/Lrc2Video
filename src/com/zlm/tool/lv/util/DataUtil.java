package com.zlm.tool.lv.util;

import java.io.File;

import com.zlm.tool.lv.common.Constants;

/**
 * 数据处理类
 * 
 * @author zhangliangming
 * 
 */
public class DataUtil {

	/**
	 * 数据初始化
	 */
	public static void init() {
		initFile();
	}

	/**
	 * 
	 * @Title: initFile @Description: (初始化文件夹) @param: @return: void @throws
	 */
	private static void initFile() {
		// 创建相关的文件夹
		File file = new File(Constants.PATH_FONTS);
		if (!file.exists()) {
			file.mkdirs();
		}
		file = new File(Constants.PATH_LRCIMAGE);
		if (!file.exists()) {
			file.mkdirs();
		}
		file = new File(Constants.PATH_LRCVIDEO);
		if (!file.exists()) {
			file.mkdirs();
		}
		file = new File(Constants.PATH_LRC);
		if (!file.exists()) {
			file.mkdirs();
		}
	}
}
