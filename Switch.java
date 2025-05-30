
import java.util.Scanner;


class Switch {
    public static void main(String[] args) {
        int n;
        Scanner Switch = new Scanner(System.in);
        System.out.println("choice");
        n=Switch.nextInt();

        switch (n) {
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("therday");
                break;
                case 5:
                System.out.println("F");
                break;
                case 6:
                System.out.println("S");
                break;
                 case 7 :
                System.out.println("Sunday");
                break;
        
            default: 
            
                System.out.println("invalid");
            }
                
        }
    }
