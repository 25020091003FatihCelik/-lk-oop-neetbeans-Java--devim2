
package bolum9_2;

public class Stock {
    String symbol ; 
    String name ;
    double previousClosingprice ;
    double currentprise ;
    
     public Stock (String symbol ,String name){
     this.symbol = symbol;
     this.name   = name;
     }
     public double getyüzdelikegim(){
     return ((currentprise - previousClosingprice) / (previousClosingprice * 100) );
     }
}
