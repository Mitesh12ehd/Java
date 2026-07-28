
class BalanceLowException extends RuntimeException{
    public BalanceLowException(String message){
        super(message);
    }
}

public class C8_CustomException {
    public static void main(String[] args) {
        throw new BalanceLowException("Your balance is low");
    }
}
