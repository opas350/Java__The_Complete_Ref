// Extend BoxWeight to  include shipping cost.

// Start with Box.
class Box {
	private double width;
	private double height;
	private double depth;

	// Construct clone of an object
	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimensions specidied
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Add weight
class BoxWeight extends Box {
	double weight; // weight of box

	// Construct clone of an object
	BoxWeight(BoxWeight ob) { // pass object to constructor
		super(ob);
		weight = ob.weight;
	}

	// Constructor when all paremeters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // Call superclass constructor
		weight = m;
	}

	// Default constructor
	BoxWeight() {
		super();
		weight = -1;
	}

	// constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

// Add shipping cost.
class Shipment extends BoxWeight {
	double cost;

	// Construct clone of an object
	Shipment(Shipment ob) { // pass object to constructor
		super(ob);
		cost = ob.cost;
	}

	// Constructor when all parameters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m); // call superclass constructor
		cost = c;
	}

	// default constructor
	Shipment() {
		super();
		cost = -1;
	}

	// Constructor used when cube is created
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}

class DemoShipment {
	public static void main(String args[]) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 4.31);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

		double vol;

		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipment cost: $" + shipment1.cost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
	}
}
