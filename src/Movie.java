public class Movie {
    private String title;
    private PriceCode code;
    public Movie(String newtitle, PriceCode code) {
        title = newtitle;
        this.code = code;
    }
    public PriceCode getPriceCode() {
        return this.code;
    }
    
    public void setPriceCode(PriceCode code) {
        this.code = code;
    }
    
    public String getTitle () {
        return title;
    }
}