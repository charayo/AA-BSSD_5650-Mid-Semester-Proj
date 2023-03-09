public class AddOnsDecorator implements IMenu{
    IMenu mTempMenu;
    public AddOnsDecorator(IMenu mTempMenu) {
        this.mTempMenu = mTempMenu;
    }

    @Override
    public String getDescription() {
        return mTempMenu.getDescription();
    }

    @Override
    public double getPrice() {
        return mTempMenu.getPrice();
    }
}
