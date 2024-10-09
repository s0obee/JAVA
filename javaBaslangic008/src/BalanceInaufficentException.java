public class BalanceInaufficentException extends Exception {

    String message;
    public BalanceInaufficentException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }

}
