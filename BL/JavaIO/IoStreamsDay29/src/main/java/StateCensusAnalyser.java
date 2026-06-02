import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

public class StateCensusAnalyser {

    public int loadStateCensusData(String csvFilePath)
            throws StateCensusAnalyserException {

        try {

            if (!csvFilePath.endsWith(".csv")) {

                throw new StateCensusAnalyserException(
                        "Invalid File Type",
                        StateCensusAnalyserException.ExceptionType.INVALID_FILE_TYPE
                );
            }

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(csvFilePath));

            String header = br.readLine();

            br.close();

            if (header != null &&
                    !header.contains(",")) {

                throw new StateCensusAnalyserException(
                        "Invalid Delimiter",
                        StateCensusAnalyserException.ExceptionType.INVALID_DELIMITER
                );
            }

            FileReader reader =
                    new FileReader(csvFilePath);

            CsvToBean<CSVStateCensus> csvToBean =
                    new CsvToBeanBuilder<CSVStateCensus>(reader)
                            .withType(CSVStateCensus.class)
                            .build();

            Iterator<CSVStateCensus> iterator =
                    csvToBean.iterator();

            int count = 0;

            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }

            return count;

        } catch (StateCensusAnalyserException e) {

            throw e;

        } catch (Exception e) {

            throw new StateCensusAnalyserException(
                    "CSV File Not Found",
                    StateCensusAnalyserException.ExceptionType.FILE_NOT_FOUND
            );
        }
    }
}