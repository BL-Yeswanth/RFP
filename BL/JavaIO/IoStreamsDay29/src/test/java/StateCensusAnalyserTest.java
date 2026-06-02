import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenWrongCSVFile_WhenLoaded_ShouldThrowException() {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        try {

            analyser.loadStateCensusData(
                    "src/main/resources/WrongFile.csv"
            );

        } catch (
                StateCensusAnalyserException e) {

            Assert.assertEquals(
                    StateCensusAnalyserException
                            .ExceptionType
                            .FILE_NOT_FOUND,
                    e.type
            );
        }
    }
}