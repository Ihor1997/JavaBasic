package lesson7;

import java.util.Objects;

public class Simphson {
     String name;
     int id;


    public Simphson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null|| getClass() != o.getClass()) return false;
        Simphson simphson = (Simphson) o;
        return id == simphson.id && Objects.equals(name, simphson.name);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
