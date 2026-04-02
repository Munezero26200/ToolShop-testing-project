package constants;

public enum EndPoint {
   ACCESSIBILITY("accessibility-testing/");

   public final String url;
   EndPoint(String url){
       this.url = url;
   }
}
