package main;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

import basiccreditcard.creditcard;
import calculator.Calculator;
import collection.selectset;
import contactsusinglinkedlist.Contacts;
import coordinates.application;
import dbconnection.Database;
import dscollection.Main;
import filereader.FileReader;
import shapes.Shapes;
import simplebankaccount.bankaccount;
import studentgpa.Student;
import studenttest.Studenttest;
import tictactoe.Tictactoe;

public class App{
private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args)throws CloneNotSupportedException, IOException {
    Scanner sc = new Scanner(System.in);
    int option;
    do{
        log.info("Select option: \n1. Basic credit card \n2. Calculator \n3. Collection \n4. Contacts using linked list \n5. Co ordinates \n6. Db connection \n7. Ds collection \n8. File Reader \n9. Shapes \n10. simple Bank Account \n11. Student GPA calculator \n12. Student Test \n13. Tic Tac Toe\n14. Exit\nEnter option: ");
        option = sc.nextInt();
        switch(option){
        case 1:
        creditcard.start();
        break;
        case 2:
        Calculator.start();
        break;
        case 3:
        selectset.start();
        break;
        case 4:
        Contacts.start();
        break;
        case 5:
        application.start();
        break;
        case 6:
        Database.start();
        break;
        case 7:
        Main.start();
        break;
        case 8:
        FileReader.start();
        break;
        case 9:
        Shapes.start();
        break;
        case 10:
        bankaccount.start();
        break;
        case 11:
        Student.start();
        break;
        case 12:
        Studenttest.start();
        break;
        case 13:
        Tictactoe.start();
        break;
        case 14:
        log.info("exit");
        break;
        default;
        break;
        }
    }while(option!=14);
 }   
      
}
