public enum Color {

    BLACK("Standard", 0),
    RED("Standard", 0),
    WHITE("Standard", 0),
    GREY("Premium", 500),
    METALIC("Premium", 1000),
    GOLDEN("Premium", 2000);

    // tworze POLA dla moich enumow
    private String colorStandardOrPremium;
    private int colorAdditionalCost;

    // tworze konstruktor
    Color(String colorStandardsOrPremium, int colorAdditionalCost) {
        this.colorStandardOrPremium = colorStandardsOrPremium;
        this.colorAdditionalCost = colorAdditionalCost;
    }
    public String getColorStandardOrPremium() {
        return colorStandardOrPremium;
    }
    public int getColorAdditionalCost() {
        return colorAdditionalCost;
    }
}
