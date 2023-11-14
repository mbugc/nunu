package Project01;

import java.io.File;
import java.util.Scanner;

import io.svg.*;

public class Project01 {

	public static void main(String[] args) {

		Paper paper = new Paper(0, 0, 600, 300);
		final String MY_NAME = "NURSENA CIL";
		final String MY_ID = "20221308031";
		String nameId = MY_NAME + "_" + MY_ID;
		/**/System.out.println("nameId: " + nameId);
		//
		final int HEIGHT = 10;
		//
		final int X_0 = 100; // x of the center of the upper-left circle
		final int Y_0 = 100; // y of the center of the upper-left circle
		final int RADIUS = 10; // radius of the circles
		final int DIAMETER = RADIUS * 2;
		final int circleNumberOf = HEIGHT;

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want realistic letters? Type 'yes' or 'no': ");
		String choice = input.next();

		// Make a curve C
		if(choice.equals("yes")) {
			Circle cTmp;

			int paperX = X_0;
			int paperY = paper.getHeight()/2;

			// First base circle at middle height
			cTmp = new Circle(paperX, paperY, RADIUS);
			cTmp.setColorFill(SVGLib.COLOR_CONIFER);
			cTmp.setColorStroke(SVGLib.COLOR_BLACK);
			cTmp.setStrokeWidth(5);
			paper.add(cTmp);

			// Upper curve of 'C' arc
			double xCenter = paperX;
			double yCenter = paperY;
			double degree = 90.0;
			double diffDegree = degree/circleNumberOf;
			double radians;
			for (int i = 0; i < circleNumberOf; i++) {
				degree = degree - diffDegree;
				radians = Math.toRadians(degree);
				xCenter = xCenter + DIAMETER * Math.cos(radians);
				yCenter = yCenter - DIAMETER * Math.sin(radians);
				cTmp = new Circle(((int) xCenter), ((int) yCenter), RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}

			// A circle just under the base circle
			cTmp = new Circle(paperX, paperY + DIAMETER, RADIUS);
			cTmp.setColorFill(SVGLib.COLOR_CONIFER);
			cTmp.setColorStroke(SVGLib.COLOR_BLACK);
			cTmp.setStrokeWidth(5);
			paper.add(cTmp);

			// Lower curve of 'C' arc
			xCenter = paperX;
			yCenter = paperY + DIAMETER;
			degree = 90.0;
			for (int i = 0; i < circleNumberOf; i++) {
				degree = degree + diffDegree;
				radians = Math.toRadians(degree);
				xCenter = xCenter + DIAMETER * Math.cos(radians);
				yCenter = yCenter + DIAMETER * Math.sin(radians);
				cTmp = new Circle(((int) xCenter), ((int) yCenter), RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}

			// Take low-right circle of C as a reference and paint 'I' to upwards
			int startX = ((int) xCenter + RADIUS * circleNumberOf);
			int startY = ((int) yCenter);
			double lengthI = (( yCenter - paperY ) * 2) / DIAMETER;
			for (int i = 0; i < lengthI; i++) {
				cTmp = new Circle( startX , startY - DIAMETER * i, RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}
		} // Else, line by line print
		else {
			Circle cTmp;

			// Up line of 'C'
			for (int i = 0; i < circleNumberOf; i++) {
				cTmp = new Circle(X_0 + DIAMETER * i, Y_0, RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}

			// Left line of 'C'
			for (int i = 0; i < circleNumberOf; i++) {
				cTmp = new Circle(X_0, Y_0 + DIAMETER * i, RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}

			// Buttom line of 'C'
			for (int i = 0; i < circleNumberOf; i++) {
				cTmp = new Circle(X_0 + DIAMETER * i , Y_0 + DIAMETER * (circleNumberOf-1), RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}

			// One line of 'I'
			for (int i = 0; i < circleNumberOf; i++) {
				cTmp = new Circle(X_0 + (DIAMETER) * circleNumberOf * 2 , Y_0 + DIAMETER * i, RADIUS);
				cTmp.setColorFill(SVGLib.COLOR_CONIFER);
				cTmp.setColorStroke(SVGLib.COLOR_BLACK);
				cTmp.setStrokeWidth(5);
				paper.add(cTmp);
			}
		}


		// to html
		String fileName = "Project2023_3_01_" + nameId;
		/**/System.out.println("fileName: " + fileName);
		String pathToFile = "_generated" //
				+ File.separator + "project01" //
				+ File.separator;
		//
		paper.toHtml(pathToFile, fileName);

	}
}
