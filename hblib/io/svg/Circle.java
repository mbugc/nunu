package io.svg;

/**
 * SVG Circle
 * 
 * @author bingol
 *
 */
public class Circle extends SVGShape {

	/**
	 * x of center
	 */
	int x;
	/**
	 * y of center
	 */
	int y;
	/**
	 * radius
	 */
	int r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String toString() {
		String s = "\n";
		s += "<circle ";
		s += "\n\tcx=\"" + this.x + "\"";
		s += "\n\tcy=\"" + this.y + "\"";
		s += "\n\tr=\"" + this.r + "\"";
		//
		s += super.toString();
		//
		s += "\n></circle>";
		return s;
	}

}
