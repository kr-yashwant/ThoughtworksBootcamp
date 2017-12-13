package com;

public class Measurement {
    private final MeasurementType measurementType;
    private final int value;
    public enum MeasurementType {
        INCH, FOOT;
    }

    public Measurement(int value, MeasurementType measurementType) {
        this.value = value; this.measurementType = measurementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return this.getInches() == that.getInches();
    }

    private int getInches() {
        return this.measurementType.equals(MeasurementType.FOOT)?this.value*12:this.value;
    }

    public Measurement add(Measurement measurement) {
        return new Measurement(this.getInches() + measurement.getInches(), MeasurementType.INCH);
    }
}
