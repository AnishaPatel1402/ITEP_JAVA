
// class User{
//    private int id;
//    private String name;
//    // constructor

// }
// class UserDAO{
//     public void saveUserInDB(User user){
//         // Write logic to save user in database
//     }
// }


//--------------------------------------------------------



class CreditCard{
    public void handlePayment(){}
}
class DebitCard{
    public void handlePayment(){}
}
class UPIPayment{
    public void handlePayment(){}
}
class Payment{
    public void handlePayment(String paymentBy){
        if(paymentBy.equals("credit")){
            // Creadit card payment 
        }
        else if(paymentBy.equals("Debit")){
            // Depit Card payment...
        }
    }
}

