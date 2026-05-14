public class MoodAnalyser {

    String message;

    // Constructor
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