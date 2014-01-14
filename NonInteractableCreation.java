import processing.core.PApplet;
import processing.core.PVector;


public class NonInteractableCreation extends Creation{
	public NonInteractableCreation(PApplet p, int x, int y) {
		parent = p;
		position = new PVector(x, y);
		insVelocity = new PVector(0, 0);
	}
}
