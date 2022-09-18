public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        double fallCost = 250;
        double winterCost = 250;
        double springCost = 250;
        double summerCost = 250;
        double yearlyCost;

        yearlyCost = fallCost+winterCost+springCost+summerCost;
        System.out.println("Your yearly maintenance cost is: " + yearlyCost);
    }
}
