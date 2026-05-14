import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // TC 1.1
    @Test
    public void givenSadMoodMessage_ShouldReturnSAD() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser(
                            "I am in Sad Mood"
                    );

            String mood =
                    moodAnalyser.analyseMood();

            Assert.assertEquals(
                    "SAD",
                    mood
            );

        } catch (MoodAnalyserException e) {

            Assert.fail();
        }
    }

    // TC 1.2
    @Test
    public void givenHappyMoodMessage_ShouldReturnHAPPY() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser(
                            "I am in Happy Mood"
                    );

            String mood =
                    moodAnalyser.analyseMood();

            Assert.assertEquals(
                    "HAPPY",
                    mood
            );

        } catch (MoodAnalyserException e) {

            Assert.fail();
        }
    }

    // UC2 Test Case
    @Test
    public void givenNullMood_ShouldThrowException() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser(null);

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assert.assertEquals(
                    "Invalid Mood",
                    e.getMessage()
            );
        }
    }
}