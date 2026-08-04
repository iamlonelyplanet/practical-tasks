package com.walking.lesson21_immutable_object.model;

import java.util.Objects;

public final class CarID {
    private final String plateNumber;
    private final String model;

    public CarID(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) {
            return false;
        }

        if (!getClass().equals(o.getClass())) {
            return false;
        }

        CarID a = (CarID) o;

        return a.getPlateNumber().equals(plateNumber) && a.getModel().equals(model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, model);
    }
}
