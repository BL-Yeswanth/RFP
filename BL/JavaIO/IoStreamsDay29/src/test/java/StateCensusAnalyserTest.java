import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenStateCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecordCount() {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        int actualRecordCount =
                analyser.loadStateCensusData(
                        "src/main/resources/IndiaStateCensusData.csv"
                );

        int expectedRecordCount = 29;

        Assert.assertEquals(
                expectedRecordCount,
                actualRecordCount
        );
    }
}