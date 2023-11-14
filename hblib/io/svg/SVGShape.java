package io.svg;

public class SVGShape {

	String colorFill = SVGLib.COLOR_CONIFER;
	String colorStroke = SVGLib.COLOR_BLACK;
	int strokeWidth = 0;

	public SVGShape() {

	}

	public void setColorStroke(String color) {
		this.colorStroke = color;
	}

	public void setColorFill(String color) {
		this.colorFill = color;
	}

	public void setStrokeWidth(int styleStrokeWidth) {
		this.strokeWidth = styleStrokeWidth;
	}

	String getStroke() {
		String s = SVGLib.SVG_STYLE_STROKE_WIDTH_1;
		s += this.strokeWidth;
		s += SVGLib.SVG_STYLE_STROKE_WIDTH_2;
		return s;
	}

	@Override
	public String toString() {
		String s = "";
		//
		s += "\n\tstyle=\"";
		s += this.getStroke();
		s += "\"";
		//
		s += "\n\tfill=\"" + this.colorFill + "\" ";
		s += "\n\tstroke=\"" + this.colorStroke + "\" ";
		return s;
	}
}
