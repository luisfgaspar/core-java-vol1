package ch3;

public class Constants 
{	/* - the keyword final denote a constant;
	 * - it is customary to name constants in all uppercase;
	 * - these are called class constant (can be used in onother methods in a class);
	 */
	
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) 
	{
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in cintimeters: "
				+ paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
	}
}
