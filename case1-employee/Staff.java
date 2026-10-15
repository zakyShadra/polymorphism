public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("Mary Smith", "P.O. Box 123", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("John Jones", "123 Main Street", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Wanda Winkle", "456 North Street", "555-0102", "987-65-4322", 1169.23);
        staffList[3] = new Hourly("Donald Duck", "789 West Street", "555-0103", "987-65-4323", 10.55);
        staffList[4] = new Volunteer("Mickey Mouse", "987 East Street", "555-0104");
        staffList[5] = new Hourly("Sally Smith", "654 South Street", "555-0105", "987-65-4324", 12.50);

        Commission c1 = new Commission("Alice Sales", "12 Market Street", "555-0106", "987-65-4325", 6.25, 0.20);
        c1.addHours(35);
        c1.addSales(400);
        staffList[6] = c1;

        Commission c2 = new Commission("Bob Sales", "34 Market Street", "555-0107", "987-65-4326", 9.75, 0.15);
        c2.addHours(40);
        c2.addSales(950);
        staffList[7] = c2;
    }

    public void payday() {
        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);
            double amount = staffMember.pay();
            System.out.println("Paid: " + amount);
            System.out.println();
        }
    }
}
