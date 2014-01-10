import processing.core.*;

public class Creation {
	PApplet parent;
	int[] position = new int[2];
	int[] velocity = new int[2];
	
	public Creation(PApplet p, int x, int y) {
		parent = p;
		position[0] = x;
		position[1] = y;
		velocity[0] = 0;
		velocity[1] = 0;
	}
	
	public void move() {
		position[0] += velocity[0];
		position[1] += velocity[1];
	}
	
	public void changeVelocity(char c, int num) {
		if (c == 'x') {
			velocity[0] = num;
		}
		else {
			velocity[1] = -num;
		}
	}
	
	public void display() {
		parent.rect(position[0], position[1], 50, 50);
	}
	
}
