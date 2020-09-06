package com.zlm.tool.lv.model;

import java.awt.Color;

/**
 * 画笔颜色信息
 * 
 * @author zhangliangming
 *
 */
public class PaintColorInfo {
	private float[] fractions;
	private Color[] colors;

	public PaintColorInfo(Color[] colors) {
		super();
		this.colors = colors;
		int length = colors.length;
		this.fractions = new float[length];
		this.fractions[0] = 0f;
		
		float ave = 1f/(length - 1);
		float fraction = 0;
		for(int i = 1; i < length - 1; i++) {
			fraction = ave + fraction;
			this.fractions[i] = fraction;
		}
		this.fractions[length - 1] = 1f;
	}

	public Color[] getColors() {
		return colors;
	}

	public void setColors(Color[] colors) {
		this.colors = colors;
	}

	public float[] getFractions() {
		return fractions;
	}

}
