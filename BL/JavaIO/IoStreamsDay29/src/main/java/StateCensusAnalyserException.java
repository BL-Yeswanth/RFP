public class StateCensusAnalyserException
        extends Exception {

    enum ExceptionType {
        FILE_NOT_FOUND,
        INVALID_FILE_TYPE
    }

    ExceptionType type;

    public StateCensusAnalyserException(
            String message,
            ExceptionType type) {

        super(message);
        this.type = type;
    }
}