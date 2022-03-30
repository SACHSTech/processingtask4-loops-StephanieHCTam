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
  
  public void draw() {

    // Quadrant 1: 10 x 10 grid that scales to with the size* of window 
    stroke(0);
    
    for (int lineX = (width/20); lineX <= (width/2); lineX += (width/20)){
      line(lineX, 0, lineX, (height/2));
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
    
    // Quadrant 3: horizontal grayscale gradient
    for (int lineGrayScale = 0; lineGrayScale < (width/2); lineGrayScale++){
      stroke (lineGrayScale, lineGrayScale, lineGrayScale);
      line(lineGrayScale, (height/2), lineGrayScale, height);
    }

    // Quadrant 4: 8 petal flower with a loop to draw the petals evenly.
    translate(300, 300);
    
    for (int petalCount = 0; petalCount <= 8; petalCount++){
      fill(225, 115, 40);
      stroke(0);
      rotate(PI/4);
      ellipse(0, (float)(height * 0.075), (float)(width * 0.05), (float)(height * 0.2));
    }
    // Flower middle
    stroke(0);
    fill(30, 100, 30); 
    ellipse( (float) (width * 0), (float) (height * 0), (float) (width * 0.125), (float) (height * 0.125)); 
  }
}