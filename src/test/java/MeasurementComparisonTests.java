import static org.junit.Assert.*;

import com.Measurement;
import org.junit.Test;
import com.Measurement.MeasurementType;

public class MeasurementComparisonTests {

    @Test
    public void verifyOneFootisTwelveInches() {
        assertTrue(new Measurement(1, MeasurementType.FOOT).equals(new Measurement(12, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoInchesAndTwoInchesAreEqual() {
        assertTrue(new Measurement(2, MeasurementType.INCH).equals( new Measurement(2, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoInchesAndThreeInchesAreNotEqual() {
        assertFalse(new Measurement(2, MeasurementType.INCH).equals( new Measurement(3, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoFeetAndTwoFeetAreEqual() {
        assertTrue(new Measurement(2, MeasurementType.FOOT).equals( new Measurement(2, MeasurementType.FOOT)));
    }

    @Test
    public void verifyTwoFeetAndOneFootAreNotEqual() {
        assertFalse(new Measurement(2, MeasurementType.FOOT).equals( new Measurement(1, MeasurementType.FOOT)));
    }

    @Test
    public void verifyTwoInchesAddedToOneInchIsThreeInches() {
        Measurement firstMeasurement = new Measurement(1, MeasurementType.INCH);
        Measurement secondMeasurement = new Measurement(2, MeasurementType.INCH);
        Measurement measurementSum = firstMeasurement.add(secondMeasurement);
        assertTrue(measurementSum.equals(new Measurement(3, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoInchesAddedToOneFootIsFourteenInches() {
        Measurement firstMeasurement = new Measurement(1, MeasurementType.FOOT);
        Measurement secondMeasurement = new Measurement(2, MeasurementType.INCH);
        Measurement measurementSum = firstMeasurement.add(secondMeasurement);
        assertTrue(measurementSum.equals(new Measurement(14, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoFeetAddedToOneFootIsThirtySixInches() {
        Measurement firstMeasurement = new Measurement(1, MeasurementType.FOOT);
        Measurement secondMeasurement = new Measurement(2, MeasurementType.FOOT);
        Measurement measurementSum = firstMeasurement.add(secondMeasurement);
        assertTrue(measurementSum.equals(new Measurement(36, MeasurementType.INCH)));
    }

    @Test
    public void verifyTwoFeetAddedToOneInchIsTwentyFiveInches() {
        Measurement firstMeasurement = new Measurement(1, MeasurementType.INCH);
        Measurement secondMeasurement = new Measurement(2, MeasurementType.FOOT);
        Measurement measurementSum = firstMeasurement.add(secondMeasurement);
        assertTrue(measurementSum.equals(new Measurement(25, MeasurementType.INCH)));
    }

}
