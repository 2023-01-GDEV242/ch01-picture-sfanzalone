/**
 * This will be a simple representation of an iconic videogame level
 * location from Super Mario Bros., 1-2.  This was going to
 * resemble 1-1, but colors such as brown don't work well in BlueJ,
 * unless I make changes in the Canvas class.
 * 
 * @author  Salvatore Anzalone
 * @version 1/23/2023
 */
public class Picture
{
    private Square block;
    private Square questionBlock;
    private Triangle powerup;
    private Triangle koopa;
    private Circle goomba;
    private Person mario;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        block = new Square();
        questionBlock = new Square();
        powerup = new Triangle();
        koopa = new Triangle();
        goomba = new Circle();
        mario = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            block.changeColor("blue");
            block.moveHorizontal(-140);
            block.moveVertical(3);
            block.changeSize(40);
            block.makeVisible();
            
            questionBlock.changeColor("yellow");
            questionBlock.moveHorizontal(-100);
            questionBlock.moveVertical(3);
            questionBlock.changeSize(40);
            questionBlock.makeVisible();
    
            powerup.changeColor("green");
            powerup.changeSize(15, 45);
            powerup.moveHorizontal(20);
            powerup.moveVertical(-35);
            powerup.makeVisible();
    
            koopa.changeColor("blue");
            koopa.changeSize(15, 45);
            koopa.moveHorizontal(30);
            koopa.moveVertical(75);
            koopa.makeVisible();
            
            goomba.changeColor("blue");
            goomba.moveHorizontal(100);
            goomba.moveVertical(120);
            goomba.changeSize(20);
            goomba.makeVisible();
            
            mario.changeColor("red");
            mario.moveHorizontal(-135);
            mario.moveVertical(-1);
            mario.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        block.changeColor("black");
        questionBlock.changeColor("black");
        powerup.changeColor("black");
        koopa.changeColor("black");
        goomba.changeColor("black");
        mario.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        block.changeColor("blue");
        questionBlock.changeColor("yellow");
        powerup.changeColor("green");
        koopa.changeColor("blue");
        goomba.changeColor("blue");
        mario.changeColor("red");
    }
}