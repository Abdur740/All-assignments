package shapes;

class Rectangle extends DIMENSIONS
{
    int l;
    int w;
Rectangle(){
        LOGGER.info("Enter length:");
        l=sc.nextInt();
        LOGGER.info("Enter width:");
        w=sc.nextInt();
    }
    public void area() {
        result2=(l*w);
        String print ="Area of rectangle : "+result2;
        LOGGER.info(print);

    }
    public void perimeter() {
        result1=(2*(l*w));
        String print ="Perimeter of rectangle :"+result1;
        LOGGER.info(print);
    }
}
