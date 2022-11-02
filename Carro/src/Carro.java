public class Carro {
   int velocidade;
   String marca;
   String modelo;

   Carro(String marca, String modelo){
    velocidade = 0;
    this.marca = marca;
    this.modelo = modelo;
   }
   void printStatus(){
    System.out.println (marca + modelo + velocidade);
   }
   void acelerar (int addvel){
    int soma =this.velocidade+addvel;
    if(soma>=200){
        soma = 200;
    }
    System.out.println(this.velocidade + "+" +addvel + ">" + soma);
    this.velocidade = soma;
   }
   void frear (int remvel){
    int freio = this.velocidade - remvel;
    if(freio <= 0){
          freio=0
    }
    System.out.println(this.velocidade + "-" + remvel +" > " + freio);
    this.velocidade = freio;
   }
}