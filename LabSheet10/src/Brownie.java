public class Brownie extends Bakery {
    private int piece;
    private String topping;

    public Brownie(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
    }

    public String addTopping(String topping) {
        return this.topping = topping;
    }

    public boolean isPackingBox() {
        return this.piece >= 6;
    }

    public int getBoxNumber() {
        if (isPackingBox()) {
            return this.piece / 6;
        }
        return 0;
    }

    public int getBagNumber() {
        return this.piece % 6;
    }

    @Override
    public int getPackingCost() {
        if (isPackingBox()) {
            return getBoxNumber() * super.getPackingCost();
        }
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        if (this.topping == null) {
            return (getUnitPrice() * this.piece);
        }
        return (getUnitPrice() * this.piece) + 20;
    }

    public String toString() {
        return super.toString() +
                "\nBrownie (" + getFlavor() + ") with" +
                (isPackingBox() ? getBagNumber() + " Box " : " " ) + getBagNumber() + " Bag" +
                "\nTotal price of Brownie = " + calculateTotalPrice();
    }
}
