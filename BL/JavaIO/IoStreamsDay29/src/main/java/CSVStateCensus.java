import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {

    @CsvBindByName(column = "State")
    private String state;

    @CsvBindByName(column = "Population")
    private long population;

    @CsvBindByName(column = "AreaInSqKm")
    private long areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKm")
    private long densityPerSqKm;

    public String getState() {
        return state;
    }

    public long getPopulation() {
        return population;
    }

    public long getAreaInSqKm() {
        return areaInSqKm;
    }

    public long getDensityPerSqKm() {
        return densityPerSqKm;
    }

    @Override
    public String toString() {

        return "State = " + state +
                ", Population = " + population +
                ", Area = " + areaInSqKm +
                ", Density = " + densityPerSqKm;
    }
}