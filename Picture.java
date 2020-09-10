/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * A take on Van Gogh's Starry Night over the Rhone, with the idea of 
 * revisiting the project at the end of the semester and applying the
 * course teachings to make a "better" version. There are deliberate 
 * redundancies in code for that reason.
 * 
 * @author  Catherine Oldfield
 * @version 2020-09-09
 */
public class Picture
{
    private Square sky;
    private Circle water;
    private Triangle ground;
    private Person woman;
    private Person man;
    private Circle star0;
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle star8;
    private Circle star9;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        water = new Circle();
        ground = new Triangle();
        woman = new Person();
        man = new Person();
        star0 = new Circle();
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        star9 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-310);
            sky.moveVertical(-300);
            sky.changeSize(500);
            sky.changeColor("blue");
            sky.makeVisible();
            
            water.moveHorizontal(-800);
            water.moveVertical(40);
            water.changeSize(1800);
            water.changeColor("green");
            water.makeVisible();
            
            ground.moveHorizontal(75);
            ground.moveVertical(60);
            ground.changeSize(120, 600);
            ground.changeColor("blue");
            ground.makeVisible();
                        
            woman.moveHorizontal(75);
            woman.moveVertical(65);
            woman.changeSize(60, 30);
            woman.changeColor("red");
            woman.makeVisible();
            
            man.moveHorizontal(55);
            man.moveVertical(60);
            man.changeSize(70, 30);
            man.changeColor("black");
            man.makeVisible();
            
            star0.moveHorizontal(-200);
            star0.moveVertical(-40);
            star0.changeSize(10);
            star0.changeColor("yellow");
            star0.makeVisible();
            
            star1.moveHorizontal(-120);
            star1.moveVertical(-50);
            star1.changeSize(15);
            star1.changeColor("yellow");
            star1.makeVisible();
            
            star2.moveHorizontal(-40);
            star2.moveVertical(-70);
            star2.changeSize(15);
            star2.changeColor("yellow");
            star2.makeVisible();
            
            star3.moveHorizontal(10);
            star3.moveVertical(-50);
            star3.changeSize(15);
            star3.changeColor("yellow");
            star3.makeVisible();
            
            star4.moveHorizontal(40);
            star4.moveVertical(-30);
            star4.changeSize(15);
            star4.changeColor("yellow");
            star4.makeVisible();
            
            star5.moveHorizontal(80);
            star5.moveVertical(-10);
            star5.changeSize(10);
            star5.changeColor("yellow");
            star5.makeVisible();
            
            star6.moveHorizontal(120);
            star6.moveVertical(-30);
            star6.changeSize(10);
            star6.changeColor("yellow");
            star6.makeVisible();
            
            star7.moveHorizontal(180);
            star7.moveVertical(5);
            star7.changeSize(10);
            star7.changeColor("magenta");
            star7.makeVisible();
            
            star8.moveHorizontal(220);
            star8.moveVertical(-35);
            star8.changeSize(15);
            star8.changeColor("magenta");
            star8.makeVisible();
            
            star9.moveHorizontal(250);
            star9.moveVertical(-25);
            star9.changeSize(10);
            star9.changeColor("magenta");
            star9.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        water.changeColor("white");
        ground.changeColor("black");
        woman.changeColor("white");
        man.changeColor("white");
        star0.changeColor("white");
        star1.changeColor("white");
        star2.changeColor("white");
        star3.changeColor("white");
        star4.changeColor("white");
        star5.changeColor("white");
        star6.changeColor("white");
        star7.changeColor("white");
        star8.changeColor("white");
        star9.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        water.changeColor("green");
        ground.changeColor("blue");
        woman.changeColor("magenta");
        man.changeColor("black");
        star1.changeColor("yellow");
        star1.changeColor("yellow");
        star2.changeColor("yellow");
        star3.changeColor("yellow");
        star4.changeColor("yellow");
        star5.changeColor("yellow");
        star6.changeColor("yellow");
        star7.changeColor("yellow");
        star8.changeColor("yellow");
        star9.changeColor("white");
    }
}
