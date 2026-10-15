public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phone,
                      String socialSecurityNumber, double rate,
                      double commissionRate) {
        super(name, address, phone, socialSecurityNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0.0;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commissionRate;
        totalSales = 0.0;
        return payment;
    }

    @Override
    public String toString() {
        return "Commission\n" + super.toString()
                + "\nTotal sales: " + totalSales;
    }
}
