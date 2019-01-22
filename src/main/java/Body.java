public enum Body {

    SEDAN("Sedan", 0),
    PICKUP(("Pick-up"), 2000),
    HATCHBACK ("Hatchback", 1000),
    COMBI("Combi", 1000);

    private String kindOfBody;
    private int bodyAdditionalCost;

    Body(String kindOfBody, int bodyAdditionalCost) {
        this.kindOfBody = kindOfBody;
        this.bodyAdditionalCost = bodyAdditionalCost;
    }

    public String getKindOfBody() {
        return kindOfBody;
    }

    public int getBodyAdditionalCost() {
        return bodyAdditionalCost;
    }
}
