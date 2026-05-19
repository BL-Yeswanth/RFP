import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // TC 3.1
    @Test
    public void givenNullMood_ShouldThrowMoodAnalysisException() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser(null);

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assert.assertEquals(
                    MoodAnalyserException.ExceptionType.ENTERED_NULL,
                    e.type
            );
        }
    }

    // TC 3.2
    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalysisException() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser("");

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assert.assertEquals(
                    MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                    e.type
            );
        }
    }
}