public class Chicken extends AddOnsDecorator{
    public Chicken(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.59;
    }
}
