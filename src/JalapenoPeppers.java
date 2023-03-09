public class JalapenoPeppers extends AddOnsDecorator{
    public JalapenoPeppers(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Jalapeno Peppers";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.61;
    }
}
