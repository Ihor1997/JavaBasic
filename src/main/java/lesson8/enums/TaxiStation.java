package lesson8.enums;

public enum TaxiStation {
    MERSEDES(10), TOYOTA(7), VOLVO;

    private int freeCars;

    TaxiStation() {
    }

    TaxiStation(int freeCars) {
        this.freeCars = freeCars;
    }

    public int getFreeCars() {
        return freeCars;
    }

    public void setFreeCars(int freeCars) {
        this.freeCars = freeCars;
    }

    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCars);
    }
}
