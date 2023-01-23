/**
 * This will be a simple representation of an iconic videogame level
 * from Super Mario Bros., 1-1.
 * 
 * @author  Salvatore Anzalone
 * @version 1/23/2023
 */
public class Picture
{
    private Square block;
    private Square questionBlock;
    private Triangle powerup;
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
            block.moveHorizontal(-140);
            block.moveVertical(20);
            block.changeSize(120);
            block.makeVisible();
            
            questionBlock.changeColor("black");
            questionBlock.moveHorizontal(-120);
            questionBlock.moveVertical(40);
            questionBlock.changeSize(40);
            questionBlock.makeVisible();
    
            powerup.changeSize(60, 180);
            powerup.moveHorizontal(20);
            powerup.moveVertical(-60);
            powerup.makeVisible();
    
            goomba.changeColor("yellow");
            goomba.moveHorizontal(100);
            goomba.moveVertical(-40);
            goomba.changeSize(80);
            goomba.makeVisible();
            
            mario.changeColor("red");
            mario.moveHorizontal(-1);
            mario.moveVertical(-10);
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
        goomba.changeColor("black");
        mario.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        block.changeColor("brown");
        questionBlock.changeColor("yellow");
        powerup.changeColor("orange");
        goomba.changeColor("brown");
        mario.changeColor("red");
    }
}