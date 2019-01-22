public enum Padding {

    VELOUR("Velour", 0),
    LEATHER("Leather", 1000),
    QUILTED("Quilted", 2000); // pikowany

    private String paddingType;
    private int paddingAdditionalCost;

    Padding(String paddingType, int paddingAdditionalCost) {
        this.paddingType = paddingType;
        this.paddingAdditionalCost = paddingAdditionalCost;
    }

    public String getPaddingType() {
        return paddingType;
    }

    public int getPaddingAdditionalCost() {
        return paddingAdditionalCost;
    }
}
