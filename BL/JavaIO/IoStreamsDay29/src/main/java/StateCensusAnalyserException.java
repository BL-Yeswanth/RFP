public class StateCensusAnalyserException
        extends Exception {

    enum ExceptionType {
        FILE_NOT_FOUND
    }

    ExceptionType type;

    public StateCensusAnalyserException(
            String message,
            ExceptionType type) {

        super(message);
        this.type = type;
    }
}