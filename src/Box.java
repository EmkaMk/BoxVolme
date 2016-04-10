/**
 * 
 */

/**
 * @author Emilija
 * 
 */
public class Box {

	private int height;
	private int width;
	private int depth;
	CalculateOperations co;

	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
		co = new CalculateOperations();

	}

	private long volume() {
		return co.volume(depth, height, width);
	}

	public void compareTo(Box b1) {
		if (this.volume() > b1.volume())
			System.out.println("The box with height:" + height + ",width:"
					+ width + " and depth:" + depth + " has greater volume");
		else if (this.volume() < b1.volume())
			System.out.println("The box with height:" + b1.height + ",width:"
					+ b1.width + " and depth:" + b1.depth
					+ " has greater volume");
		else
			System.out.println("They have the same volume!");

	}

}
