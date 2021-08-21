public class Carro {

    String cor;
    String marca;
    int modelo;
    double velMax;
    double velAtual;
    Motor motor;


    void ligar() {
        System.out.println("O carro está ligado");
    }

    void acelerar(double aceleração) {
        velAtual = velAtual + aceleração;
        System.out.println("o carro está à " + velAtual + "Km/hr");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", velMax=" + velMax +
                ", velAtual=" + velAtual +
                ", motor=" + motor +
                '}';
    }
}
