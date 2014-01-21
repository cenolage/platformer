import processing.core.*;

abstract class Creation {
	PApplet parent;
	PVector position;
	PVector insVelocity;
	
	Shape collisionMask;
	Shape renderedShape;
	
	final public double GRAVITY = 0.1;
	
	public void move(){
		insVelocity.y += GRAVITY;
		
		position.x += insVelocity.x;
		position.y += insVelocity.y;
		
//		insVelocity.x = 0;
//		insVelocity.y = 0;
	}
	
//	public void expMove(int x, int y) {
//		insVelocity.x = x;
//		insVelocity.y = y;
//		
//		// Access its parent somehow and add itself onto Grid A
//	}
	
	public PVector getVel() {
		return insVelocity;
	}
	
	public void expMoveY(int y) {
		insVelocity.y = y;
	}
	
	public void expMoveX(int x) {
		insVelocity.x = x;
	}
		
	//expMoveY and expMoveX are also supposed to 'access its parent somehow and add itself onto grid A'?
	
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
