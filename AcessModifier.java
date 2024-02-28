public class AcessModifier{
    public static void main(String args[]){
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Mitesh";
        myAcc.setpw("@3443#");
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setpw(String pwd){
        password = pwd;
    }
}