package sys.exception;

public class InfoException extends MyException{
    public InfoException() {
        super("信息有误");
    }

    public InfoException(String message) {
        super(message);
    }
}
