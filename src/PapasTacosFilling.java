public class PapasTacosFilling extends AddOnsDecorator{
    public PapasTacosFilling(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Papas Locas";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 7.99;
    }
}
