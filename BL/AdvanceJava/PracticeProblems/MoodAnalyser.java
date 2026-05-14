public class MoodAnalyser {

    // Analyse Mood Method
    public String analyseMood(String message) {

        if (message.contains("Sad")) {

            return "Sad Mood";
        }
        else {

            return "Happy Mood";
        }
    }

    public static void main(String[] args) {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String result =
                moodAnalyser.analyseMood(
                        "I am in Sad Mood"
                );

        System.out.println(result);
    }
}