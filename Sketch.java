import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Quadrant 1 is a 10 x 10 grid that scales to with the size* of window 
    stroke(0);
    
    for (int intLineX = width/20; intLineX <= width/2; intLineX += width/20) {
      line(intLineX, 0, intLineX, height/2);
    }

    for(int intLineY = height/20; intLineY <= height/2; intLineY += height/20) {
      line(0, intLineY, width/2, intLineY);
    }
    



  }
  
  // define other methods down here.
}