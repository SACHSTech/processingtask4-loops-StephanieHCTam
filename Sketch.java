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
    
    for (int intLineX = (width/20); intLineX <= (width/2); intLineX += (width/20)){
      line(intLineX, 0, intLineX, (height/2));
    }

    for(int intLineY = height/20; intLineY <= height/2; intLineY += height/20){
      line(0, intLineY, width/2, intLineY);
    }

    // Quadrant 2: 5 x grid of evenly spaced circles that scales to the size* of the window.
    stroke(0);
    fill(190, 52, 125);

    for (int intCircleY = (height/20); intCircleY <= (height/2); intCircleY += (height/10)){
      for (int intCircleX = (width/2) + (width/20); intCircleX <= width; intCircleX += (width/10)){
        ellipse(intCircleX, intCircleY, (width/20), (height/20));
      }
    }
    
    // Quadrant 3: horizontal grayscale gradient
    for (int intLineGrayScale = 0; intLineGrayScale < (width/2); intLineGrayScale++){
      stroke (intLineGrayScale, intLineGrayScale, intLineGrayScale);
      line(intLineGrayScale, (height/2), intLineGrayScale, height);
    }

    // Quadrant 4: 8 petal flower with a loop to draw the petals evenly.
    translate(300, 300);
    
    for (int intPetalCount = 0; intPetalCount <= 8; intPetalCount++){
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