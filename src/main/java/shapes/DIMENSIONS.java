package shapes;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class DIMENSIONS
{
    abstract  void area();
    abstract  void perimeter();
    double result1;
    double result2;
    Scanner sc=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
}

