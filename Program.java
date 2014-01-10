import java.util.ArrayList;

import processing.core.*;

public class Program extends PApplet {
	
	Creation player = new Creation(this, 50, 600);
	Creation rock = new Creation(this, 610, 260);
	ArrayList<Creation> a = new ArrayList<Creation>();
	GameWorld game = new GameWorld(this, a);
	
	//either read all info from text file or input the stuff here.
	
	public Program() {
		a.add(player);
		a.add(rock);
	}

	public void setup() {
		size(1280, 720);
		background(0);
	}
	
	public void draw() {
		frameRate(60);
		background(255);
		game.display();
		game.move();
		stroke(50);
//		if (mousePressed) {
//			line(mouseX, mouseY, pmouseX, pmouseY);
//		}

	}
	
	
	//maybe put this listener stuff somewhere else huh...
	
	public void keyPressed() {
		if (key == CODED) {
			switch (keyCode) {
				case UP: game.objects.get(0).changeVelocity('y', 5);
					game.objects.get(0).changeVelocity('x', 0);
					break;
				case DOWN: game.objects.get(0).changeVelocity('y', -5);
					game.objects.get(0).changeVelocity('x', 0);
					break;
				case RIGHT: game.objects.get(0).changeVelocity('x', 5);
					game.objects.get(0).changeVelocity('y', 0);
					break;
				case LEFT: game.objects.get(0).changeVelocity('x', -5);
					game.objects.get(0).changeVelocity('y', 0);
						break;
			}
		}
	}
	
	public void keyReleased() {
		if (key == CODED) {
			switch (keyCode) {
				case UP: game.objects.get(0).changeVelocity('y', 0);
						break;
				case DOWN: game.objects.get(0).changeVelocity('y', 0);
						break;
				case RIGHT: game.objects.get(0).changeVelocity('x', 0);
						break;
				case LEFT: game.objects.get(0).changeVelocity('x', 0);
						break;
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PApplet.main(new String[] { "--present", "Program" });
	}

}
