package constants;

public enum EndPoint {
    ACCOUNT("account/");

    public final String url;
    EndPoint(String url){
        this.url = url;
    }
}
