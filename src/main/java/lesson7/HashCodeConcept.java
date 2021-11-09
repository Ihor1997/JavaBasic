package lesson7;

public class HashCodeConcept {

    public static void main(String[] args) {
        Simphson simphson = new Simphson("Homer", 1);
        Simphson bart = new Simphson("Homer", 2);

        boolean isHashCodeEquals = simphson.hashCode() == bart.hashCode();
        if (isHashCodeEquals) {
            System.out.println("Use equals instead ==");
        } else {
            System.out.println("Not nessesary to check with equals method because of id difference, what means that objects not equals for sure");

        }
    }
}
