public class Lemonade extends DrinksDecorator{
    public Lemonade(IMenu mTempMenu) {
        super(mTempMenu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Lemonade Drink";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.37;
    }
}
