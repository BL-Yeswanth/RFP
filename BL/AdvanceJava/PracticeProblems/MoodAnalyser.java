public class MoodAnalyser {

    // Message Field
    String message;

    // Default Constructor
    public MoodAnalyser() {

    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {

        this.message = message;
    }

    // Analyse Mood Method
    public String analyseMood()
            throws MoodAnalyserException {

        try {

            if (message.contains("Sad")) {

                return "SAD";
            }
            else {

                return "HAPPY";
            }

        } catch (NullPointerException e) {

            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.ENTERED_NULL,
                    "Mood should not be Null"
            );
        }
    }
}