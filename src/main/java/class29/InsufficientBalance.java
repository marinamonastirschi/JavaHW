package class29;

public class InsufficientBalance extends RuntimeException{
    // this exception is thrown when there is no enough money in the users account
   public InsufficientBalance(String errorMsg){
       super(errorMsg);
   }
}
