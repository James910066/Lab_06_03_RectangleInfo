import java.util.Scanner; //Import of Scanner
public class RectangleInfo

{
    public static void main(String[] args)
    {
        int height = 0; //Constant variable declaration and assignment
        int width = 0; //Constant variable declaration and assignment
        int length = 0; //Constant variable declaration and assignment
        String trash = ""; //Constant variable declaration and assignment
        int area = 0; //Constant variable declaration and assignment
        int perimeter = 0; //Constant variable declaration and assignment
        double diagonalLength = 0; //Constant variable declaration and assignment
        Scanner in = new Scanner(System.in); //Declaration and assignment of Scanner utility

        System.out.print("Enter the rectangles height "); //Prompt user for input
        if (in.hasNextInt()) //Check and validate user input
            {
                height = in.nextInt(); //Variable re-assignment
                in.nextLine();  // clear the buffer
            }
        else //Exit on bad input
            {
                trash = in.nextLine(); //Assignment of bad input from user
                System.out.println("Please enter a valid height " + trash); //Output statement
                return; //End Process
            }
        System.out.print("Enter the rectangles length "); //Prompt user for input
        if (in.hasNextInt()) //Check and validate user input
            {
                length = in.nextInt(); //Variable re-assignment
                in.nextLine();  // clear the buffer
            }
        else //Exit on bad input
            {
                trash = in.nextLine(); //Assignment of bad input from user
                System.out.println("Please enter a valid length " + trash); //Output statement
                return; //End Process
            }

        area = length * height; //Calculation process
        diagonalLength = Math.sqrt((length * length) + (height * height)); //Calculation process
        perimeter = (length + height) * 2; //Calculation process
        System.out.println("The diagonal length of the rectangle is " + diagonalLength); //Output statement
        System.out.println("The area of the rectangle is " + area); //Output statement
        System.out.println("The perimeter of the rectangle is " + perimeter); //Output statement
    }

}