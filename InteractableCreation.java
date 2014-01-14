import processing.core.PApplet;
import processing.core.PVector;

public class InteractableCreation extends Creation{
	public InteractableCreation(PApplet p, int x, int y) {
		parent = p;
		position = new PVector(x, y);
		insVelocity = new PVector(0, 0);
	}
}
