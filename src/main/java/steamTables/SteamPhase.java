package steamTables;

public enum SteamPhase {
    SaturatedLiquid("Saturated Liquid",0),
    SaturatedVapour("Saturated Vapor", 1),
    saturatedMixture("Saturated Mixture", 1.5),
    CompressedLiquid("Compressed Liquid", 0),
    SuperHeatedWater("Superheated Water", 1);

    private final String phaseName;

    SteamPhase(String phaseName, double i) {
        this.phaseName = phaseName;
    }

    @Override
    public String toString() {
        return this.phaseName;
    }

    public double getX() {
        return this.ordinal();
    }
}