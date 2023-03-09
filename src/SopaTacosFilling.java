public class SopaTacosFilling extends AddOnsDecorator{
    public SopaTacosFilling(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sopa de Res";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15.99;
    }
}
