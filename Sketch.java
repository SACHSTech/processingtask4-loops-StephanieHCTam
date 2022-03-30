import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
  * Program Sketch.java draws sequences of objects. 
  * @author: Stephanie Tam
  */
	
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
  public void draw() {

    // Quadrant 1: 10 x 10 grid that scales to with the size* of window 
    stroke(0);
    
    for (int lineX = width/20; lineX <= width/2; lineX += width/20){
      line(lineX, 0, lineX, height/2);
    }

    for(int lineY = height/20; lineY <= height/2; lineY += height/20){
      line(0, lineY, width/2, lineY);
    }

    // Quadrant 2: 5 x grid of evenly spaced circles that scales to the size* of the window.
    stroke(0);
    fill(190, 52, 125);

    for (int circleY = (height/20); circleY <= (height/2); circleY += (height/10)){
      for (int circleX = (width/2) + (width/20); circleX <= width; circleX += (width/10)){
        ellipse(circleX, circleY, (width/20), (height/20));
      }
    }
    
    

  }
}