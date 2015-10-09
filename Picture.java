/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle campo;
    private Person persona;
    private Circle circulo;
    private Triangle triangulo;
    private Square cuadrado;

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
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        campo = new Circle();
        campo.changeColor("green");
        campo.moveHorizontal(-820);
        campo.moveVertical(130);
        campo.changeSize(1600);
        campo.makeVisible();
        
        
    
        
        
        
    
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * move the sun
     */
    public void moveSun()
    {
        if (wall != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(90);
            campo.changeColor("black"); 
            sun.changeColor("black");
            wall.changeColor("black");
            roof.changeColor("black");
            window.changeColor("white");
            
        }
    }
    /**
     * create a person
     */
    public void createPerson()
    {
        if (wall != null)   // only if it's painted already...
        {
            persona = new Person();
            persona.makeVisible();
            persona.moveHorizontal(-250);
            persona.moveVertical(20);
            persona.slowMoveHorizontal(130);
            
            
}
}
 /**
     * create circle, square, triangle
     */
    public void createFigures()
    {
        if (wall != null)   // only if it's painted already...
        {
            circulo = new Circle();
            cuadrado = new Square();
            triangulo = new Triangle();
            circulo.makeVisible();
            cuadrado.makeVisible();
            triangulo.makeVisible();
            circulo.changeSize(20);
            cuadrado.changeSize(20);
            triangulo.changeSize(20,20);
            circulo.moveHorizontal(120);
            cuadrado.moveHorizontal(120);
            triangulo.moveHorizontal(120);
         
}}
/**
     * move circle, square,triangle
     */
    public void moveFigures()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        campo = new Circle();
        campo.changeColor("green");
        campo.moveHorizontal(-820);
        campo.moveVertical(130);
        campo.changeSize(1600);
        campo.makeVisible();
        
        
        
        
        
            persona = new Person();
            persona.makeVisible();
            persona.moveHorizontal(-250);
            persona.moveVertical(20);
            persona.moveHorizontal(130);
            
            
            circulo = new Circle();
            cuadrado = new Square();
            triangulo = new Triangle();
            circulo.makeVisible();
            cuadrado.makeVisible();
            triangulo.makeVisible();
            circulo.changeSize(20);
            cuadrado.changeSize(20);
            triangulo.changeSize(20,20);
            circulo.moveHorizontal(120);
            cuadrado.moveHorizontal(120);
            triangulo.moveHorizontal(120);
         
        
            circulo.slowMoveHorizontal(40);
            cuadrado.slowMoveHorizontal(40);
            triangulo.slowMoveHorizontal(40);
            circulo.slowMoveVertical(40);
            cuadrado.slowMoveVertical(40);
            triangulo.slowMoveVertical(40);
            circulo.slowMoveHorizontal(-40);
            cuadrado.slowMoveHorizontal(-40);
            triangulo.slowMoveHorizontal(-40);
            circulo.slowMoveVertical(-40);
            cuadrado.slowMoveVertical(-40);
            triangulo.slowMoveVertical(-40);
}}

