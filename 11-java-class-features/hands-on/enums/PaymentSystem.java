enum Status{
    PENDING(202,"Payment pending"),
    SUCCESS(200,"Payment sucess"),
    FAILED(400,"Payment failed"),
    REFUNDED(200,"Refund success");

    private final int statusCode;
    private final String message;

    Status(int statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode(){
        return statusCode;
    }
    public String getStatusMessage(){
        return message;
    }
}

public class PaymentSystem {
    public static void main(String[] args){
        Status paymentStatus1 = Status.SUCCESS;
        Status paymentStatus2 = Status.REFUNDED;

        System.out.println("Status of payment 1");
        System.out.println(paymentStatus1.getStatusCode() + " : " + paymentStatus1.getStatusMessage());
        System.out.println();

        System.out.println("Status of payment 2");
        System.out.println(paymentStatus2.getStatusCode() + " : " + paymentStatus2.getStatusMessage());
        System.out.println();
    }
}