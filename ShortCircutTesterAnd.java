public class ShortCircutTestAnd {
    
    public static void main(String[] args) {
       
       if(falseMethod() && trueMethod()) 
       System.out.println("Both are true");
       else 
        System.out.println("Both are not true");
      
    }
    
     public static boolean trueMethod() {
           System.out.println("Withing trueMethod()");
           return true; 
        
       }
       
        public static boolean falseMethod() {
           System.out.println("Withing falseMethod()");
           return false; 
        
       }
}
