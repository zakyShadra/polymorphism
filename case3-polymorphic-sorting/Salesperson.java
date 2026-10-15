public class Salesperson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public int compareTo(Object other) {
        Salesperson otherSales = (Salesperson) other;
        if (totalSales != otherSales.totalSales) {
            return Integer.compare(totalSales, otherSales.totalSales);
        }
        int lastNameComparison = lastName.compareTo(otherSales.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return firstName.compareTo(otherSales.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + totalSales + ")";
    }
}
