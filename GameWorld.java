import java.util.ArrayList;

import processing.core.*;

public class GameWorld {

	PApplet parent;
	ArrayList<Creation> objects;
	
	Creation player;
	final public int GRAVITY = 5;
	
	public GameWorld(PApplet p, ArrayList<Creation> obj) {
		parent = p;
		objects = obj;
	}
	
	public GameWorld(PApplet p){
		objects = new ArrayList<Creation>();
	}
	
	public void addCreation(Creation c){
		objects.add(c);
	}
	
	public void addPlayer(Creation c){
		player = c;
	}
	
	public void move() {
		// We may need to store parent.height and parent.width within the GameWorld
		// System.out.println(parent.height + " " + parent.width);

		float x1 = player.position.x;
		float x2 = objects.get(0).position.x;
		float y1 = player.position.y;
		float y2 = objects.get(0).position.y;
		float vx = player.insVelocity.x;
		float vy = player.insVelocity.y;

		if (!(x1 + 50 == x2 && y1 + 50 > y2 && y1 < y2 + 50 && vx > 0) && !(x1 == x2 + 50 && y1 + 50 > y2 && y1 < y2 + 50 && vx < 0) &&
			!(y1 + 50 == y2 && x1 + 50 > x2 && x1 < x2 + 50 && vy > 0) && !(y1 == y2 + 50 && x1 + 50 > x2 && x1 < x2 + 50 && vy < 0)) {
			player.move();
		}
		
		// Movement for the most part:
		//     call expMove --> check if insVelocity will cause object to collide --> call move and move the object
		// 
		// I think we'll partition the GameWorld into a grid and place objects within blocks in that grid
		// 
		// A -> Grid containing all 2d objects in the Game World
		// B -> Grid containing all 2d objects that have just moved
		// 
		// --> if an object has moved place it onto grid B (implement this into expMove)
		// 	       --> loop through all objects in grid B
		//                 --> if an object in grid B is moving in the direction of an object in grid A
		//				       that is not itself and in an adjacent block as it
		//                         --> if they do not collide when insVelocity has been added
		//				                  --> allow it to move
		//				     	   --> else if they do collide
		//				        	      --> check what happens when insVelocity/2 has been added
		//			        				  depending on what happens, check left or right until we find the largest insVelocity that can be added for there to be no collision
		//				   --> if an object in Grid B is moving towards another object in Grid B				 
		//			               --> if they do not collide when insVelocity has been added
		//                                 --> allow them to move
		//                         --> else if they do collide
		//                                 --> find some way to determine the point of contact lolololol
		//                                 --> move both objects until they touch
		//
		// 
		// I think it might make our game run a lot more smoothly to give each Creation a "collision mask" (shape)
		// as well as a normal shape that is rendered onto the screen
	}
	
	// Checks the collision of any 2 objects that are in adjacent "blocks"
//	public boolean collides(Creation c1, Creation c2){
//		return false;
//	}
	
	
	public void display() {
		for (Creation object : objects) {
			object.display();
		}
		player.display();
	}
}
