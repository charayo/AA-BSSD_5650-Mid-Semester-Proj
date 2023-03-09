public class Potatoes extends AddOnsDecorator{
    public Potatoes(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Potatoes ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.73;
    }
}
