public class BlackBeans extends AddOnsDecorator{
    public BlackBeans(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Black beans";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.37;
    }
}
