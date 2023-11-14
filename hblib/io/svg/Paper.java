package io.svg;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Simulates a paper to draw onto.
 * 
 * @author bingol
 *
 */
public class Paper {

	/**
	 * x coordinate of upper-left corner
	 */
	int xUL;
	/**
	 * y coordinate of upper-left corner
	 */
	int yUL;
	/**
	 * width of the paper
	 */
	int width;

	/**
	 * height of the paper
	 */
	int height;

	/**
	 * List of SVGShapes to be drawn on the paper
	 */
	ArrayList<SVGShape> drawable = new ArrayList<SVGShape>();

	public Paper(int xUL, int yUL, int width, int height) {
		this.xUL = xUL;
		this.yUL = yUL;
		this.width = width;
		this.height = height;
	}

	/**
	 * Add a SVGShape to be drawn
	 * 
	 * @param svg
	 */
	public void add(SVGShape svg) {
		drawable.add(svg);
	}

	/**
	 * Generate html file.
	 * 
	 * @param pathToFile full path of the html file.
	 * @param fileName   without `.html` extension.
	 */
	public void toHtml(String pathToFile, String fileName) {
		String s = "";
		for (Iterator<SVGShape> iterator = drawable.iterator(); iterator.hasNext();) {
			SVGShape svgShape = (SVGShape) iterator.next();
			s += svgShape;
		}
		SVGLib.writeToFileHTML(pathToFile, fileName, this, s);
//		System.out.println("check \"" + pathToFile + File.separator + fileName + ".html\"");
		System.out.println("check \"" + pathToFile + fileName + ".html\"");
	}

	/**
	 * returns the x coordinate of upper-left corner
	 */
	public int getxUL() {
		return xUL;
	}

	/**
	 * returns the y coordinate of upper-left corner
	 */
	public int getyUL() {
		return yUL;
	}

	/**
	 * returns the width of the paper
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * returns the height of the paper
	 */
	public int getHeight() {
		return height;
	}
}
