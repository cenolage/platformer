import java.util.ArrayList;

import processing.core.*;

public class Program extends PApplet {
	
	Creation player;
	Creation rock;
	
	GameWorld game = new GameWorld(this);
	
	public void setup() {
		size(1280, 720);
		background(255);
		frameRate(60);
		
		player = new InteractableCreation(this, 50, 600);
		rock = new NonInteractableCreation(this, 610, 260);
		game.addPlayer(player);
		game.addCreation(rock);
	}
	
	public void draw() {
		background(255);
		game.display();
		game.move();
			
//		if (mousePressed) {
//			line(mouseX, mouseY, pmouseX, pmouseY);
//		}
	}
	
	public void keyPressed() {
		if (key == CODED) {
			switch (keyCode) {
				case UP: 
					player.expMove('y', -5);
					player.expMove('x', 0);
					break;
				case DOWN:
					player.expMove('y', 5);
					player.expMove('x', 0);
					break;
				case RIGHT: 
					player.expMove('x', 5);
					player.expMove('y', 0);
					break;
				case LEFT: 
					player.expMove('x', -5);
					player.expMove('y', 0);
					break;
				default:
					return;
			}
		}
	}
	
	public void keyReleased() {
		if (key == CODED) {
			switch (keyCode) {
				case UP: 
					player.expMove('y', 0);
					break;
				case DOWN: 
					player.expMove('y', 0);
					break;
				case RIGHT: 
					player.expMove('x', 0);
					break;
				case LEFT: 
					player.expMove('x', 0);
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
