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

        if (message == null) {

            throw new MoodAnalyserException(
                    "Invalid Mood"
            );
        }

        if (message.contains("Sad")) {

            return "SAD";
        }
        else {

            return "HAPPY";
        }
    }
}