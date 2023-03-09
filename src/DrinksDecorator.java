public class DrinksDecorator implements IMenu{
    IMenu mTempMenu;
    public DrinksDecorator(IMenu mTempMenu) {
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
