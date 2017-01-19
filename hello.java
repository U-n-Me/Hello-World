public class hello{    
    private int fact;
  
    public hello(int n){
      fact = 1;
      while(n > 1){
        fact = fact * n;
        n--;
      }
    }   
    
    public int getFact(){
      return fact;
    }
  
    public static void main(String args[]){    
    System.out.println("Hello, World!");
    // num is number whose factorial is needed
    int num = 10;
    hello obj = new hello(num);
    
    System.out.println("Factorial is: "+obj.getFact());
    }
}
