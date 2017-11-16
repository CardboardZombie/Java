/**
   *Description:
   *This Program is designed to print the Month associated with the numeric and the seaon it belongs to.
   *A switch determines the String s's content (ie what month has been selected)
   *An if statement is used to determine the season.
   *
   *@author Tadhg Deeney
   *@author 17186226
   *@version 13/09/2017
*/
import java.util.Scanner;
public class D13L2Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        String s = "";
        while (month != -1)
        {
            System.out.println("Please enter the number of the month you are interested in (enter -1 to quit)");
            month = sc.nextInt();
            switch(month)
            {
                
                case 1:
                {
                    s="January";
                    break;
                }
                case 2:
                {
                    s="February";
                    break;
                }
                case 3:
                {
                    s="March";
                    break;
                }
                case 4:
                {
                    s="April";
                    break;
                }
                case 5:
                {
                    s="May";
                    break;
                }
                case 6:
                {
                    s="June";
                    break;
                }
                case 7:
                {
                    s="July";
                    break;
                }
                case 8:
                {
                    s="August";
                    break;
                }
                case 9:
                {
                    s="September";
                    break;
                }
                case 10:
                {
                    s="October";
                    break;
                }
                case 11:
                {
                    s="November";
                    break;
                }
                case 12:
                {
                    s="December";
                    break;
                }
                default:
                {
                    System.out.println("Not a valid month");
                    break;
                }
            }
            System.out.println("Thank you, you have selected "+s);
            if(month > 1 && month <= 4 )
            {
                System.out.println(s+" is in Spring");
            }
            else if(month > 4  && month <= 7)
            {
                System.out.println(s+" is in Summer");
            }
            else if(month > 7 && month <=10)
            {
                System.out.println(s+" is in Autumn");
            }
            else if(month == 1 || (month > 10 && month <= 12))
            {
                System.out.println(s+" is in Winter");
            }
            else
                System.out.println("Please try again");
        }
        
    }
}
