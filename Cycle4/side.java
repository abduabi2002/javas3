//Q.no:2:
abstract class Shapes
{
    abstract void numberofsides();
}

class Rectangle extends Shapes
{
     void numberofsides()
    {
        System.out.println("Number of sides of Rectangle is : 4");
    }
}

class Triangle extends Shapes
{
    void numberofsides()
    {
        System.out.println("Number of sides of Triangle is : 3");
    }
}
    
class Hexagon extends Shapes
{
    void numberofsides()
    {
        System.out.println("Number of sides of Hexagon is : 6");
    }
}

class side
{
    public static void main(String args[])
    {
        
        Rectangle obj=new Rectangle();
        obj.numberofsides();
        Triangle T=new Triangle();
        T.numberofsides();
        Hexagon H=new Hexagon();
        H.numberofsides();      
    }
}
