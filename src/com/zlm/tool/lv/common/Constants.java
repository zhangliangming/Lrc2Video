package com.zlm.tool.lv.common;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.zlm.tool.lv.model.PaintColorInfo;

public class Constants {
	/**
	 * 临时目录
	 */
	public final static String PATH_TEMP = "lv";

	/**
	 * 歌词图片
	 */
	public final static String PATH_LRCIMAGE = PATH_TEMP + File.separator
			+ "image";
	
	public final static String PATH_LRCVIDEO = PATH_TEMP + File.separator
			+ "video";
	/**
	 * 字体
	 */
	public final static String PATH_FONTS = PATH_TEMP + File.separator
			+ "fonts";
	/**
	 * 歌词目录
	 */
	public final static String PATH_LRC = PATH_TEMP + File.separator + "lrc";

	
	/**
	 * 未读歌词颜色
	 */
	public static List<PaintColorInfo> DESLRCNOREADCOLORS = new ArrayList<PaintColorInfo>();

	/**
	 * 已读歌词颜色
	 */
	public static List<PaintColorInfo> DESLRCREADEDCOLORS = new ArrayList<PaintColorInfo>();

	static {
		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(0, 52, 138), new Color(0, 128, 192), new Color(3, 202, 252) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(3, 233, 252), new Color(255, 255, 255), new Color(3, 233, 252) }));

		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0) }));

		DESLRCNOREADCOLORS.add(
				new PaintColorInfo(new Color[] { new Color(255, 172, 0), new Color(255, 0, 0), new Color(170, 0, 0) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 255, 164), new Color(255, 255, 0), new Color(255, 100, 26) }));

		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(225, 225, 225), new Color(106, 106, 106), new Color(0, 0, 0) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 255, 255), new Color(0, 255, 255), new Color(128, 255, 255) }));

		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(2, 166, 174), new Color(128, 255, 255), new Color(2, 166, 174) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(247, 132, 38), new Color(255, 255, 0), new Color(255, 128, 0) }));

		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(64, 0, 128), new Color(255, 128, 255), new Color(64, 0, 128) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 55, 146), new Color(255, 243, 134), new Color(255, 55, 146) }));

		DESLRCNOREADCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(147, 255, 38), new Color(70, 176, 0), new Color(0, 85, 0) }));
		DESLRCREADEDCOLORS.add(new PaintColorInfo(
				new Color[] { new Color(255, 255, 255), new Color(154, 255, 17), new Color(255, 255, 0) }));
	}
	
	/***
	 * 桌面歌词颜色
	 */
	public static String desktopLrcIndex_KEY = "DEF_DES_COLOR_INDEX_KEY";
	public static int desktopLrcIndex = 0;
}
