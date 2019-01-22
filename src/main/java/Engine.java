public enum Engine {

    FUEL("Fuel", 0),
    DIESEL("Diesel", 10000),
    HYBRID("Hybrid", 15000);

    private String kindOfEngine;
    private int engineAdditionalCost;

    Engine(String kindOfEngine, int engineAdditionalCost) {
        this.kindOfEngine = kindOfEngine;
        this.engineAdditionalCost = engineAdditionalCost;
    }

    public String getKindOfEngine() {
        return kindOfEngine;
    }

    public int getEngineAdditionalCost() {
        return engineAdditionalCost;
    }
}
