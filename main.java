public class main {

    @Override
    public String toString() {
        return "main{}";
    }
    static void addNumbers(int a, int b){
        System.out.println(a+b);
    }
      

    public static void main(String[] args) {
    
    Computer hpPavilionComputer = new Computer(new Storage(), new Processor(), new RAM());
    System.out.println(hpPavilionComputer);

    addNumbers(6,7);
 }

  
}
        