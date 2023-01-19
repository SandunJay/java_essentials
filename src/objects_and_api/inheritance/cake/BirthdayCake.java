package objects_and_api.inheritance.cake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake() {
        super("Chocolate");
    }

    //default flavour choco
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
