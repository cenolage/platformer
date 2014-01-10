import java.util.ArrayList;
import processing.core.*;

public class GameWorld {

	PApplet parent;
	ArrayList<Creation> objects;
	
	public GameWorld(PApplet p, ArrayList<Creation> obj) {
		parent = p;
		objects = obj;
	}
	
	public void move() {
		
		int x1 = objects.get(0).position[0];
		int x2 = objects.get(1).position[0];
		int y1 = objects.get(0).position[1];
		int y2 = objects.get(1).position[1];
		int vx = objects.get(0).velocity[0];
		int vy = objects.get(0).velocity[1];
		
//		if (x1 + 50 == x2 && y1 >= y2 && y1 <= y2 + 50) {
//			objects.get(0).changeVelocity('x', -1);
//		}
//		if (x1 == x2 + 50 && y1 >= y2 && y1 <= y2 + 50) {
//			objects.get(0).changeVelocity('x', 1);
//		}
//		if (y1 + 50 == y2 && x1 >= x2 && x1 <= x2 + 50) {
//			objects.get(0).changeVelocity('y', 1);
//		}
//		if (y1 == y2 + 50 && x1 >= x2 && x1 <= x2 + 50) {
//			objects.get(0).changeVelocity('y', -1);
//		}
		
		if (!(x1 + 50 == x2 && y1 + 50 >= y2 && y1 <= y2 + 50 && vx > 0) && !(x1 == x2 + 50 && y1 + 50 >= y2 && y1 <= y2 + 50 && vx < 0) &&
			!(y1 + 50 == y2 && x1 + 50 >= x2 && x1 <= x2 + 50 && vy > 0) && !(y1 == y2 + 50 && x1 + 50 >= x2 && x1 <= x2 + 50 && vy < 0)) {
			objects.get(0).move();
		}
		
		
		
		
		
//		if (objects.get(0).position[0] + 50 == objects.get(1).position[0]) {
//			objects.get(0).changeVelocity('x', 0);
//		}
//		if (objects.get(0).position[1] + 50 == objects.get(1).position[0]) {
//			objects.get(0).changeVelocity('y', 0);
//		}
//		objects.get(0).move();
	}
	
	public void display() {
		for (Creation object : objects) {
			object.display();
		}
	}
	
}
