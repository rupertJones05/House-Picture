public class Picture
{
    private Square wall3;
    private Square grass;
    private Square background;
    private Square wall;
    private Square wall2;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall3 = new Square();
        wall2 = new Square();
        grass = new Square();
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        drawn = false;
        background = new Square();
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("blue");
            background.moveHorizontal(-500);
            background.moveVertical(-500);
            background.changeSize(1000);
            background.changeSize2(1000);
            background.makeVisible();

            grass.changeColor("green");
            grass.moveHorizontal(-500);
            grass.moveVertical(100);
            grass.changeSize(1000);
            grass.changeSize2(1000);
            grass.makeVisible();

            wall.changeColor("white");
            wall.moveHorizontal(-180);
            wall.moveVertical(25);
            wall.changeSize(25 );
            wall.changeSize2(100);
            wall.makeVisible();

            wall2.changeColor("white");
            wall2.moveHorizontal(-80);
            wall2.moveVertical(25);
            wall2.changeSize(25);
            wall2.changeSize2(100);
            wall2.makeVisible();

            wall3.changeColor("white");
            wall3.moveHorizontal(-180);
            wall3.moveVertical(10);
            wall3.changeSize(125);
            wall3.changeSize2(20);
            wall3.makeVisible();

            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.changeSize2(40);
            window.makeVisible();

            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
