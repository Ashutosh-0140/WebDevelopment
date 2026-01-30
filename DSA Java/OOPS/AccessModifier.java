class BankAccount{
    public String Username;
    private String Password;
    void setPass(String pwd){
        this.Password = pwd;
    }
    
}
class AccessModifier{
    public static void main(String s[]){
        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Ashutosh";
        // myAcc.Password = "A1B2"; we csn not acces it
        myAcc.setPass("A1B2");

    }
}