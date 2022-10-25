/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Circle window;
    private Triangle roof;
    private Circle shadow;
    private Circle moon;
    private Triangle thruster1;
    private Triangle thruster2;
    private Triangle flame1;
    private Triangle flame2;
    private Triangle flame3;
    private Triangle flame4;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        thruster1 = new Triangle();
        thruster1.changeColor("blue");
        thruster1.changeSize(25, 50);
        thruster1.moveHorizontal(20);
        thruster1.moveVertical(215);
        thruster1.makeVisible();
        
        thruster2 = new Triangle();
        thruster2.changeColor("blue");
        thruster2.changeSize(25, 50);
        thruster2.moveHorizontal(100);
        thruster2.moveVertical(215);
        thruster2.makeVisible();
        
        flame1 = new Triangle();
        flame1.changeColor("red");
        flame1.changeSize(15, 25);
        flame1.moveHorizontal(20);
        flame1.moveVertical(240);
        flame1.makeVisible();
        
        flame2 = new Triangle();
        flame2.changeColor("red");
        flame2.changeSize(15, 25);
        flame2.moveHorizontal(20);
        flame2.moveVertical(245);
        flame2.makeVisible();
        
        flame4 = new Triangle();
        flame4.changeColor("red");
        flame4.changeSize(15, 25);
        flame4.moveHorizontal(100);
        flame4.moveVertical(245);
        flame4.makeVisible();
        
        flame3 = new Triangle();
        flame3.changeColor("red");
        flame3.changeSize(15, 25);
        flame3.moveHorizontal(100);
        flame3.moveVertical(240);
        flame3.makeVisible();
        
        flame4 = new Triangle();
        flame4.changeColor("red");
        flame4.changeSize(15, 25);
        flame4.moveHorizontal(100);
        flame4.moveVertical(245);
        flame4.makeVisible();
        
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(85);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Circle();
        window.changeColor("magenta");
        window.moveHorizontal(90);
        window.moveVertical(90);
        window.changeSize(40);
        window.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 100);
        roof.changeColor("blue");
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(180);
        moon.moveVertical(-10);
        moon.changeSize(60);
        moon.makeVisible();
        
        shadow = new Circle();
        shadow.changeColor("black");
        shadow.moveHorizontal(170);
        shadow.moveVertical(-10);
        shadow.changeSize(60);
        shadow.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("white");
            window.changeColor("black");
            roof.changeColor("white");
            moon.changeColor("white");
            shadow.changeColor("black");
            thruster1.changeColor("white");
            thruster2.changeColor("white");
            flame1.changeColor("black");
            flame2.changeColor("black");
            flame3.changeColor("black");
            flame4.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            thruster1.changeColor("blue");
            thruster2.changeColor("blue");
            wall.changeColor("white");
            window.changeColor("magenta");
            roof.changeColor("blue");
            moon.changeColor("yellow");
            shadow.changeColor("black");
            flame1.changeColor("red");
            flame2.changeColor("red");
            flame3.changeColor("red");
            flame4.changeColor("red");
        }
    }

}
