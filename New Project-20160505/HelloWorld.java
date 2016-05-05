import java.util.*;

public class HelloWorld{

    public static void main(String []args){
        System.out.println("Hello World");
        
        List<String> stockList = new ArrayList<String>();
        stockList.add("stock1");
        stockList.add("stock2");
    
        String[] stockArr = new String[stockList.size()];
        stockArr = stockList.toArray(stockArr);
    
        for(String s : stockArr){
            System.out.println(s);
        }
    
    }

         
}
