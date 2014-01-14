import processing.core.*;

abstract class Creation {
	PApplet parent;
	PVector position;
	PVector insVelocity;
	
	Shape collisionMask;
	Shape renderedShape;
	
	public void move(){
		position.x += insVelocity.x;
		position.y += insVelocity.y;
		
//		insVelocity.x = 0;
//		insVelocity.y = 0;
	}
	
	public void expMove(char c, int num) {
		if (c == 'x') {
			insVelocity.x = num;
		} else if (c == 'y'){
			insVelocity.y = num;
		} else {
			throw new Error("Invalid character: " + c);
		}
		
		// Access its parent somehow and add itself onto Grid A
	}
		
	// Keep for now
	public void display() {
		parent.stroke(0);
		parent.rect(position.x, position.y, 50, 50);
	}
	
	// public void display(renderer r){}
	
	public void printPosition(){
		System.out.println("position: " + position.x + ", " + position.y);
	}
}
