public class Cheese extends AddOnsDecorator{
    public Cheese(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.73;
    }
}
