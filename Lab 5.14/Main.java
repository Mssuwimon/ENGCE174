import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // StandardShipping
        String standardId = sc.nextLine();
        double standardFee = Double.parseDouble(sc.nextLine());

        // PremiumShipping
        String premiumId = sc.nextLine();
        double premiumFee = Double.parseDouble(sc.nextLine());
        double insuranceFee = Double.parseDouble(sc.nextLine());

        Shipping standard = new StandardShipping(standardId, standardFee);
        Shipping premium = new PremiumShipping(premiumId, premiumFee, insuranceFee);

        Shipping[] shipments = { standard, premium };

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}
