public class Onions extends AddOnsDecorator{
    public Onions(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onions";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.61;
    }
}
