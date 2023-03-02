package shapes;

class Circle extends DIMENSIONS
{
    int r;
    Circle()
    {
        LOGGER.info("Enter radius of the circle:");
        r=sc.nextInt();
    }

    public void area()
    {
        result2=((3.1415)*(r*r));
        String print ="Area of circle :"+result2;
        LOGGER.info(print);
    }
    public void perimeter() {
        result1=((2*3.1415)*r);
        String print ="Perimeter of circle :"+result1;
        LOGGER.info(print);
    }
}