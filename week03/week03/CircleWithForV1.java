package week03;

import java.io.File;

import io.svg.Circle;
import io.svg.Paper;
import io.svg.SVGLib;

public class CircleWithForV1 {

	public static void main(String[] args) {
		
		Paper paper = new Paper(0, 0, 600, 300);

		final int X_0 = 100; // x of the center of the upper-left circle
		final int Y_0 = 100; // y of the center of the upper-left circle
		final int RADIUS = 20;
		
		
		//
		int circleNumberOf = 6;
		double kok800 = Math.sqrt(800);
		int kok = (int) kok800;
		Circle cTmp;
		for (int i = 0; i < circleNumberOf; i++) {
			cTmp = new Circle(X_0 + kok * i, Y_0 + kok * i , RADIUS);
			cTmp.setColorFill(SVGLib.COLOR_CONIFER);
			cTmp.setColorStroke(SVGLib.COLOR_BLACK);
			cTmp.setStrokeWidth(5);
			paper.add(cTmp);
		}

		// to html
		String fileName = "CircleWithForV0";
		String pathToFile = "_generated" //
				+ File.separator + "week03" //
				+ File.separator;
		//
		paper.toHtml(pathToFile, fileName);

	}

}
