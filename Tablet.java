class Tablet extends Stock {
    private String chip;
    private String size;
    private String system;

    // Constructor
    public Tablet(double price, int c, String name, int b, String chip, String size, String system) {
        super(name, c, b, price);
        this.chip = chip;
        this.size = size;
        this.system = system;
    }

    public String getChip() {
        return chip;
    }

    public String getSize() {
        return size;
    }

    public String getSystem() {
        return system;
    }
}
