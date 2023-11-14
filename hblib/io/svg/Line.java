package io.svg;

/**
 * SVG line from point A to point B.
 * 
 * @author bingol
 *
 */
public class Line extends SVGShape {

	/** 
	 * x of point A
	 */
	int x1; 
	/**
	 * y of Point A
	 */
	int y1;
	/**
	 * x of point B
	 */
	int x2;
	/**
	 * y of point B
	 */
	int y2;

	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public String toString() {
		String s = "\n";
		s += "<line ";
		s += "\n\tx1=\"" + this.x1 + "\" ";
		s += "\n\ty1=\"" + this.y1 + "\" ";
		s += "\n\tx2=\"" + this.x2 + "\" ";
		s += "\n\ty2=\"" + this.y2 + "\" ";
		//
		s += super.toString();
		//
		s += "\n></line>";
		return s;
	}

}

// <line
// x1="0" x2="600" y1="0" y2="300"
// style="stroke-width: 3px; stroke-dasharray: 5px, 2px;"
// stroke="#0000ff">
// </line>
