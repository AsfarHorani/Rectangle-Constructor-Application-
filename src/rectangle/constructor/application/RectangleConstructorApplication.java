/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle.constructor.application;

class Rectangle
{ 
    double width, height;
 
   Rectangle()
  {
   width=1; height=1;
  }

 Rectangle(double h, double w)
{
   this.height=h;
   this.width=w;
}

public double getarea()
{
 return width*height;
}
public double getperimeter()
{
 return (height+width)*2;
}

}

public class RectangleConstructorApplication {

    
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
       
        System.out.println(r1.getarea()+"\n"+ r1.getperimeter());
     
    }
    
}
