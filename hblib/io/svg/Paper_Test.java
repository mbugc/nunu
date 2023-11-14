package io.svg;

import java.io.File;

public class Paper_Test {

	public static void main(String[] args) {

		Paper paper = new Paper(0, 0, 600, 300);
//		Paper paper = new Paper(70, 80, 600, 300);

		// grid as helper
		Grid grid = new Grid(paper);

		// circle: c1
		Circle c1 = new Circle(100, 200, 70);
		c1.setColorFill(SVGLib.COLOR_CONIFER);
		c1.setColorStroke(SVGLib.COLOR_BLACK);
		c1.setStrokeWidth(5);

		// circle: c2
		Circle c2 = new Circle(200, 100, 100);

		// line: l1
		Line l1 = new Line(10, 30, 500, 250);
		l1.setColorFill(SVGLib.COLOR_RED);
		l1.setColorStroke(SVGLib.COLOR_BLUE);
		l1.setStrokeWidth(20);

		// add shapes to the paper
		paper.add(grid);
		paper.add(c2);
		paper.add(c1);
		paper.add(l1);
		c2.setColorFill(SVGLib.COLOR_RED);

		// to html
		String fileName = "_paperTestAA";
		String pathToFile = "_generated" //
				+ File.separator + "week11" //
				+ File.separator;

		paper.toHtml(pathToFile, fileName);
	}

}
