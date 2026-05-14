import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // Refactored TC 1.1
    @Test
    public void givenSadMoodMessageInConstructor_ShouldReturnSAD() {

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
    }

    // Refactored TC 1.2
    @Test
    public void givenHappyMoodMessageInConstructor_ShouldReturnHAPPY() {

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
    }
}