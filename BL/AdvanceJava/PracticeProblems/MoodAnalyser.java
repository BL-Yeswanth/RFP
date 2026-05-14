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
    public String analyseMood() {

        if (message.contains("Sad")) {

            return "SAD";
        }
        else {

            return "HAPPY";
        }
    }
}