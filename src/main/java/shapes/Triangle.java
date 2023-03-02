package shapes;

class Triangle extends DIMENSIONS
{
    int h;
    int b;

    int a;
    int c;

    int calc;
    Triangle(){
        LOGGER.info("Enter height:");
        h=sc.nextInt();
        LOGGER.info("Enter base:");
        b=sc.nextInt();
        LOGGER.info("Enter side1 length:");
        a=sc.nextInt();
        LOGGER.info("Enter side2 length:");
        c=sc.nextInt();
    }
    public void area()
    {
        calc=h*b;
        result2=((calc)/2.0);
        String print ="Area of triangle :"+result2;
        LOGGER.info(print);
    }
    public void perimeter() {

        result1=(a+b+c);
        String print ="Perimeter of triangle :"+result1;
        LOGGER.info(print);
    }
}
