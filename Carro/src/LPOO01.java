public class LPOO01 {
    public static void main(String args []){
        Carro car1 = new Carro("Fiat","Pálio");
        car1.printStatus();
        car1.acelerar(20);
        car1.acelerar(50);
        car1.acelerar(200);
        car1.frear(100);
        car1.frear(150);
        car1.printStatus();
    }
}
