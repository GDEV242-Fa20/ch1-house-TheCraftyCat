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
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle star8;
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
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-140);
            sky.moveVertical(20);
            sky.changeSize(120);
            sky.changeColor("blue");
            sky.makeVisible();
            
            water.moveHorizontal(-140);
            water.moveVertical(20);
            water.changeSize(120);
            water.changeColor("green");
            water.makeVisible();
            
            ground.moveHorizontal(-140);
            ground.moveVertical(20);
            ground.changeSize(120);
            ground.changeColor("blue");
            ground.makeVisible();
                        
            woman.moveHorizontal(-140);
            woman.moveVertical(20);
            woman.changeSize(120);
            woman.changeColor("magenta");
            woman.makeVisible();
            
            man.moveHorizontal(-140);
            man.moveVertical(20);
            man.changeSize(120);
            man.changeColor("black");
            man.makeVisible();
            
            star1.moveHorizontal(-140);
            star1.moveVertical(20);
            star1.changeSize(120);
            star1.changeColor("yellow");
            star1.makeVisible();
            
            star2.moveHorizontal(-140);
            star2.moveVertical(20);
            star2.changeSize(120);
            star2.changeColor("yellow");
            star2.makeVisible();
            
            star3.moveHorizontal(-140);
            star3.moveVertical(20);
            star3.changeSize(120);
            star3.changeColor("yellow");
            star3.makeVisible();
            
            star4.moveHorizontal(-140);
            star4.moveVertical(20);
            star4.changeSize(120);
            star4.changeColor("yellow");
            star4.makeVisible();
            
            star5.moveHorizontal(-140);
            star5.moveVertical(20);
            star5.changeSize(120);
            star5.changeColor("yellow");
            star5.makeVisible();
            
            star6.moveHorizontal(-140);
            star6.moveVertical(20);
            star6.changeSize(120);
            star6.changeColor("yellow");
            star6.makeVisible();
            
            star7.moveHorizontal(-140);
            star7.moveVertical(20);
            star7.changeSize(120);
            star7.changeColor("yellow");
            star7.makeVisible();
            
            star8.moveHorizontal(-140);
            star8.moveVertical(20);
            star8.changeSize(120);
            star8.changeColor("yellow");
            star8.makeVisible();
            
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
        star1.changeColor("white");
        star2.changeColor("white");
        star3.changeColor("white");
        star4.changeColor("white");
        star5.changeColor("white");
        star6.changeColor("white");
        star7.changeColor("white");
        star8.changeColor("white");
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
        star2.changeColor("yellow");
        star3.changeColor("yellow");
        star4.changeColor("yellow");
        star5.changeColor("yellow");
        star6.changeColor("yellow");
        star7.changeColor("yellow");
        star8.changeColor("yellow");
    }
}
