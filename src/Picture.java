public class Picture
{

    private Square grass;
    private Square background;
    private Square wall;
    private Square garage1Window;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    private Triangle driveway;
    private Square driveway1;
    private Square whiteWall;
    private Square garage1;
    private Square windowBorder;
    private Square windowBorder2;
    private Square windowBorder3;
    private Square brickwall;
    private Square wall2;
    private Square garage2;
    private Square whiteWall2;
    private Square whiteWall3;
    private Square garage2Window;
    private Square garage2Window2;
    private Square window2Border;
    private Square window2Border2;
    private Square door;
    private Square sidewalkBorder;
    private Square road;
    private Circle doorknob;
    private Square doorglass;
    private Square doorwindowborder;
    private Square doorwindowborder2;
    private Square window1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        whiteWall = new Square();
        driveway1 = new Square();
        driveway = new Triangle();
        grass = new Square();
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        drawn = false;
        background = new Square();
        garage1 = new Square();
        garage1Window = new Square();
        windowBorder = new Square();
        windowBorder2 = new Square();
        windowBorder3 = new Square();
        brickwall = new Square();
        wall2 = new Square();
        garage2 = new Square();
        whiteWall2 = new Square();
        whiteWall3 = new Square();
        garage2Window = new Square();
        garage2Window2 = new Square();
        window2Border = new Square();
        window2Border2 = new Square();
        door = new Square();
        sidewalkBorder = new Square();
        road = new Square();
        doorknob = new Circle();
        doorglass = new Square();
        doorwindowborder = new Square();
        doorwindowborder2 = new Square();
        window1 = new Square();


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
            background.changeColor("sky blue");
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

            driveway.changeColor("gray");
            driveway.moveHorizontal(-140);
            driveway.moveVertical(112);
            driveway.changeSize(140, 425);
            driveway.makeVisible();

            driveway1.changeColor("gray");
            driveway1.moveHorizontal(-240);
            driveway1.moveVertical(131);
            driveway1.changeSize(260);
            driveway1.changeSize2(100);
            driveway1.makeVisible();

            road.changeColor("road");
            road.moveHorizontal(-310);
            road.moveVertical(160);
            road.changeSize(500);
            road.changeSize2(100);
            road.makeVisible();

            sidewalkBorder.changeColor("sidewalk border");
            sidewalkBorder.moveHorizontal(-310);
            sidewalkBorder.moveVertical(160);
            sidewalkBorder.changeSize(500);
            sidewalkBorder.changeSize2(5);
            sidewalkBorder.makeVisible();

            whiteWall.changeColor("white");
            whiteWall.moveHorizontal(-220);
            whiteWall.moveVertical(25);
            whiteWall.changeSize(90 );
            whiteWall.changeSize2(110);
            whiteWall.makeVisible();

            garage1.changeColor("dark blue");
            garage1.moveHorizontal(-212);
            garage1.moveVertical(30);
            garage1.changeSize(75 );
            garage1.changeSize2(105);
            garage1.makeVisible();

            wall.changeColor("light blue");
            wall.moveHorizontal(-240);
            wall.moveVertical(25);
            wall.changeSize(20 );
            wall.changeSize2(110);
            wall.makeVisible();

            wall2.changeColor("light blue");
            wall2.moveHorizontal(-130);
            wall2.moveVertical(25);
            wall2.changeSize(150 );
            wall2.changeSize2(110);
            wall2.makeVisible();

            whiteWall2.changeColor("white");
            whiteWall2.moveHorizontal(-100);
            whiteWall2.moveVertical(25);
            whiteWall2.changeSize(120);
            whiteWall2.changeSize2(110);
            whiteWall2.makeVisible();

            brickwall.changeColor("dark gray");
            brickwall.moveHorizontal(-130);
            brickwall.moveVertical(95);
            brickwall.changeSize(29 );
            brickwall.changeSize2(40);
            brickwall.makeVisible();

            garage2.changeColor("dark blue");
            garage2.moveHorizontal(-94);
            garage2.moveVertical(30);
            garage2.changeSize(107 );
            garage2.changeSize2(105);
            garage2.makeVisible();

            garage2Window.changeColor("glass");
            garage2Window.moveHorizontal(-85);
            garage2Window.moveVertical(37);
            garage2Window.changeSize(40);
            garage2Window.changeSize2(18);
            garage2Window.makeVisible();

            garage2Window2.changeColor("glass");
            garage2Window2.moveHorizontal(-35);
            garage2Window2.moveVertical(37);
            garage2Window2.changeSize(40);
            garage2Window2.changeSize2(18);
            garage2Window2.makeVisible();

            window2Border.changeColor("dark blue");
            window2Border.moveHorizontal(-67);
            window2Border.moveVertical(37);
            window2Border.changeSize(3);
            window2Border.changeSize2(20);
            window2Border.makeVisible();

            window2Border2.changeColor("dark blue");
            window2Border2.moveHorizontal(-17);
            window2Border2.moveVertical(37);
            window2Border2.changeSize(3);
            window2Border2.changeSize2(20);
            window2Border2.makeVisible();

            garage1Window.changeColor("glass");
            garage1Window.moveHorizontal(-204);
            garage1Window.moveVertical(37);
            garage1Window.changeSize(60);
            garage1Window.changeSize2(18);
            garage1Window.makeVisible();

            whiteWall3.changeColor("white");
            whiteWall3.moveHorizontal(20);
            whiteWall3.moveVertical(25);
            whiteWall3.changeSize(65);
            whiteWall3.changeSize2(105);
            whiteWall3.makeVisible();

            Square whiteWall4 = new Square();
            whiteWall4.changeColor("white");
            whiteWall4.moveHorizontal(70);
            whiteWall4.moveVertical(25);
            whiteWall4.changeSize(65);
            whiteWall4.changeSize2(110);
            whiteWall4.makeVisible();

            Square wall3 = new Square ();
            wall3.changeColor("light blue");
            wall3.moveHorizontal(60);
            wall3.moveVertical(25);
            wall3.changeSize(110);
            wall3.changeSize2(110);
            wall3.makeVisible();

            Square pillar1 = new Square();
            pillar1.changeColor("white");
            pillar1.moveHorizontal(67);
            pillar1.moveVertical(25);
            pillar1.changeSize(15);
            pillar1.changeSize2(110);
            pillar1.makeVisible();

            Square pillar2 = new Square();
            pillar2.changeColor("white");
            pillar2.moveHorizontal(158);
            pillar2.moveVertical(25);
            pillar2.changeSize(15);
            pillar2.changeSize2(110);
            pillar2.makeVisible();

            Square brickwall2 = new Square();
            brickwall2.changeColor("dark gray");
            brickwall2.moveHorizontal(64);
            brickwall2.moveVertical(105);
            brickwall2.changeSize(20 );
            brickwall2.changeSize2(40);
            brickwall2.makeVisible();

            Square brickwall3 = new Square();
            brickwall3.changeColor("dark gray");
            brickwall3.moveHorizontal(155);
            brickwall3.moveVertical(105);
            brickwall3.changeSize(20 );
            brickwall3.changeSize2(40);
            brickwall3.makeVisible();

            Square windowborder = new Square();
            windowborder.changeColor("white");
            windowborder.moveHorizontal(96);
            windowborder.moveVertical(39);
            windowborder.changeSize(48 );
            windowborder.changeSize2(53);
            windowborder.makeVisible();

            Square window2 = new Square();
            window2.changeColor("glass");
            window2.moveHorizontal(98);
            window2.moveVertical(40);
            window2.changeSize(45 );
            window2.changeSize2(50);
            window2.makeVisible();

            door.changeColor("aqua blue");
            door.moveHorizontal(20);
            door.moveVertical(52);
            door.changeSize(35);
            door.changeSize2(75);
            door.makeVisible();



            doorglass.changeColor("glass");
            doorglass.moveHorizontal(27);
            doorglass.moveVertical(58);
            doorglass.changeSize(20);
            doorglass.changeSize2(16);
            doorglass.makeVisible();

            doorwindowborder.changeColor("aqua blue");
            doorwindowborder.moveHorizontal(35);
            doorwindowborder.moveVertical(58);
            doorwindowborder.changeSize(3);
            doorwindowborder.changeSize2(20);
            doorwindowborder.makeVisible();

            doorwindowborder2.changeColor("aqua blue");
            doorwindowborder2.moveHorizontal(27);
            doorwindowborder2.moveVertical(64);
            doorwindowborder2.changeSize(20);
            doorwindowborder2.changeSize2(3);
            doorwindowborder2.makeVisible();

            windowBorder.changeColor("dark blue");
            windowBorder.moveHorizontal(-176);
            windowBorder.moveVertical(37);
            windowBorder.changeSize(3);
            windowBorder.changeSize2(20);
            windowBorder.makeVisible();

            windowBorder2.changeColor("dark blue");
            windowBorder2.moveHorizontal(-192);
            windowBorder2.moveVertical(37);
            windowBorder2.changeSize(3);
            windowBorder2.changeSize2(20);
            windowBorder2.makeVisible();

            windowBorder3.changeColor("dark blue");
            windowBorder3.moveHorizontal(-160);
            windowBorder3.moveVertical(37);
            windowBorder3.changeSize(3);
            windowBorder3.changeSize2(20);
            windowBorder3.makeVisible();

            doorknob.changeColor("yellow");
            doorknob.moveHorizontal(120);
            doorknob.moveVertical(115);
            doorknob.changeSize(10);
            doorknob.makeVisible();
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
