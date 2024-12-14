class Laptop extends Stock {
    private String processor;
    private String size;
    private String system;

    // Constructor
    public Laptop(double price, int c, String name, int b, String processor, String size, String system) {
        super(name, c, b, price);
        this.processor = processor;
        this.size = size;
        this.system = system;
    }

    public String getProcessor() {
        return processor;
    }

    public String getSize() {
        return size;
    }

    public String getSystem() {
        return system;
    }
}
