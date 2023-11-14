package week04;

public class Ch03_BMI {

	private String name;
	private int age;
	private double weight; // in pounds
	private double height; // in inches

	public Ch03_BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public Ch03_BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	public double getBMI() {
		double bmi = weight / ((height ) * (height ));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

}
