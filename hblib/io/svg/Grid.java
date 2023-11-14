package io.svg;

public class Grid extends SVGShape {

	Paper paper;

//	public Grid(int xUL, int yUL, int width, int height) {
	public Grid(Paper paper) {
		this.paper = paper;
	}

	@Override
	public String toString() {
		int deltaX = 50;
		int deltaY = 50;
		String s = "";
		Line lineHorizontal = null;
		Line lineVertical = null;
		// horizontal
		for (int y = paper.getyUL(), c = 0; y < paper.getHeight(); y += deltaY, c++) {
			lineHorizontal = new Line(0, y, paper.getWidth(), y);
			lineHorizontal.setColorStroke(SVGLib.COLOR_SILVER);
			if (c % 10 == 0) {
				lineHorizontal.setStrokeWidth(5);
			} else if (c % 5 == 0) {
				lineHorizontal.setStrokeWidth(3);
			} else {
				lineHorizontal.setStrokeWidth(1);
			}
			s += lineHorizontal;
		}
		// vertical
		for (int x = paper.getxUL(), c = 0; x < paper.getWidth(); x += deltaX, c++) {
			lineVertical = new Line(x, 0, x, paper.getHeight());
			lineVertical.setColorStroke(SVGLib.COLOR_SILVER);
			if (c % 10 == 0) {
				lineVertical.setStrokeWidth(5);
			} else if (c % 5 == 0) {
				lineVertical.setStrokeWidth(3);
			} else {
				lineVertical.setStrokeWidth(1);
			}
			s += lineVertical;
		}

		return s;
	}
}
