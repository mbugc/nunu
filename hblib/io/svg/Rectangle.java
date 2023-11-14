package io.svg;

public class Rectangle extends SVGShape{
	/**
	 * x of center
	 */
	int x;
	/**
	 * y of center
	 */
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	@Override
	public String toString() {
		String s = "\n";
		s += "<rect ";
		s += "\n\tx=\"" + this.x + "\"";
		s += "\n\ty=\"" + this.y + "\"";
		s += "\n\twidth=\"" + this.width + "\"";
		s += "\n\theight=\"" + this.height + "\"";
		//
		s += super.toString();
		//
		s += "\n></rect>";
		return s;
	}

}
// <rect x="120" width="100" height="100" rx="15" />
