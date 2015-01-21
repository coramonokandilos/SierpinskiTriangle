import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup()
{
	background(0);
	size(700, 700);
}
public void draw()
{
sierpinski(100, 600, 500);
}
public void mouseDragged()//optional
{

}
public void sierpinski(int x, int y, int len) 
{
if(len > 20)
{
	fill(200);
	sierpinski(x, y, len/2);
	sierpinski(x + len/2, y, len/2);
	sierpinski(x + len/4, y - len/2, len/2);

}
else 
{
	triangle(x, y, x + len, y, x + len/2, y - len);
}
	
}

// 2. Write the `sierpinski` function:

//     * If `len` is greater than 20 (or some variable) 
//         * recursively call the `sierpinksi` function to draw a triangle with the left corner at (`x`,`y`) and a base and height equal to `len/2`.
//         * Again, call the `sierpinksi` function a second time to draw another triangle a distance of `len/2` to the right of the first triangle.
//         * Now, call the `sierpinksi` function a third time to draw a triangle a distance of `len/4` to the right and `len/2` up from the first triangle. This triangle should "sit on top" of the first two.
//     * else
//         * Draw a triangle with the left corner at (`x`,`y`) and a base and height equal to `len`.
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
