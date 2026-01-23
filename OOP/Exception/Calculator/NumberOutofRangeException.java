public class NumberOutofRangeException extends Exception{
    private String msg;
    public NumberOutofRangeException(String msg){
        this.msg = msg;
    }
    @Override
    public String getMessage(){
        return msg;
    }
}