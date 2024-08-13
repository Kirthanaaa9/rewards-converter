 // Adjust this if your package structure is different

public class RewardValue {
    private double cashValue; // Cash value of the reward
    private double milesValue; // Miles value of the reward

    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;
    // Conversion rate from cash to miles
    private static final double CASH_TO_MILES_RATE = 1 / MILES_TO_CASH_RATE;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CASH_TO_MILES_RATE;
    }

    // Constructor that accepts miles value
    public RewardValue(boolean isMiles, double value) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = value * MILES_TO_CASH_RATE;
        } else {
            this.cashValue = value;
            this.milesValue = value * CASH_TO_MILES_RATE;
        }
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }
}

