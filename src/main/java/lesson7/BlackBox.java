package lesson7;

import lesson7.Objects.BasketCats;

import java.util.Objects;

public class BlackBox {

    int varA;
    int varB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlackBox)) return false;
        BlackBox box = (BlackBox) o;
        return varA == box.varA && varB == box.varB;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public static void main(String[] args) {
        BlackBox box = new BlackBox(1,20);
        BlackBox box1 =new BlackBox(1,20);
        BlackBox box2 = box1;

        System.out.println(box1.equals(box2));

    }
}
