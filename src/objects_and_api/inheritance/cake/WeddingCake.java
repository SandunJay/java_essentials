package objects_and_api.inheritance.cake;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake() {
        super("almond");
    }

    //default flavour almound

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
