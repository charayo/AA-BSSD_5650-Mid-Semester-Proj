public class Lettuce extends AddOnsDecorator{
    public Lettuce(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Lettuce";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.37;
    }
}
