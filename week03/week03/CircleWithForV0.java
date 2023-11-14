package week03;

import java.io.File;
import io.svg.*;

public class CircleWithForV0 {
	

	public static void main(String[] args) {

		Paper paper = new Paper(0, 0, 600, 300);

		final int X_0 = 100; // x of the center of the upper-left circle
		final int Y_0 = 110; // y of the center of the upper-left circle
		final int RADIUS = 20;
		
		
		//
		int circleNumberOf = 4;

		Circle cTmp;
		for (int i = 0; i < circleNumberOf; i++) {
			cTmp = new Circle(X_0 + 10 * i, Y_0 + 20 * i, RADIUS);
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
