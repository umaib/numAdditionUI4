/*
 * This is a class created to read and output the options that the user has 
 * selected, and store this data into a Rich Text file accessible for later
 * use by administration and TDSB staff.
 * Class: numberAdditionUI3FileWriter
 */
package numberadditionui3writer;

/**
 *
 * @author 322944927
 */
import java.io.*;
public class NumberAdditionUI3Writer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        FileWriter myWriter = new FileWriter("C:\\temp_Umai\\shopOutput1.rtf");
        PrintWriter myPrinter= new PrintWriter(myWriter);
        
        //THINGS TO DO:
        //1. Comment the .getText's from the checkBox variables within the mainClass
        //2. Create another class and put all code inside there
        
        
        myPrinter.print("Four-score and ");
        double d=7.023;
        myPrinter.println(d);
        myPrinter.println("years ago.");
        //Change the above variables accordingly...
        //myPrinter.print(firstNames + " " );
        //myPrinter.print(lastNames);
        //if(jCheckBox1.isSelected()); {System.out.println("Present");} -> this line will take the value from the checkBox
        //if(jCheckBox2.isSelected()); {System.out.println("Absent");}
        myPrinter.close();
        myWriter.close();
    }
    }
    

