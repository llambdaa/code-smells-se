public enum PriceCode {
    REGULAR(0),
    NEW_RELEASE(1),
    CHILDREN(2);
    
    PriceCode(int id) {
        this.id = id;
    }
    
    private int id;
    
    public int getID() {
        return this.id;
    }
}
