import java.util.Scanner; 

public class AssignVolenteer {
    
    public static void main(String[] args) {
    int donationType; 
    String volenteer; 
    final int CLOTHING_CODE = 1; 
    final int OTHER_CODE = 2; 
    final String CLOTHING_PRICER = "Regina";
    final String OTHER_PRICER = "Marco";
    
    Scanner input = new Scanner(System.in);
    System.out.println("What type of donation is this?");
    System.out.println("Enter " + CLOTHING_CODE + " for clothing " + OTHER_CODE + " for anything else");
    donationType = input.nextInt(); 
    
     if(donationType == CLOTHING_CODE) {
        volenteer = CLOTHING_PRICER;
        
    } else {
    volenteer = OTHER_PRICER; 
    
    }
    
    System.out.println("You have entered " + donationType);
    System.out.println("The volenteer who will price this item is " + volenteer);
    
    }
    
}
