public class App {

    public static void main(String[] args) {

        // CARRO 1
        Carro fusca = new Carro();
        fusca.cor = "azul";
        fusca.marca = "Volkswagen";
        fusca.modelo = 2000;
        fusca.velMax = 100.00;
        fusca.velAtual = 0;

        Motor motorFusca = new Motor();
        motorFusca.potencia = 65;
        motorFusca.tipo = "tipo 1";

        fusca.motor = motorFusca;
        System.out.println(fusca.toString());
        System.out.println("O fusca possui potencia de " + motorFusca.potencia + " cv, do tipo " + motorFusca.tipo);

        fusca.ligar();
        fusca.acelerar(3.5);

        // CARRO 2
        Carro gol = new Carro();
        gol.cor = "branco";
        gol.marca = "Volkswagen";
        gol.modelo = 2005;
        gol.velMax = 120.00;
        gol.velAtual = 0;

        Motor motorGol = new Motor();
        motorGol.potencia = 84;
        motorGol.tipo = "tipo 3";

        gol.motor = motorGol;
        System.out.println(gol.toString());
        System.out.println("O Gol possui potencia de " + motorGol.potencia + " cv, do tipo " + motorGol.tipo);

        gol.ligar();
        gol.acelerar(10.78);

        // CARRO 3
        Carro ranger = new Carro();
        ranger.cor = "prata";
        ranger.marca = "Ford";
        ranger.modelo = 2017;
        ranger.velMax = 140.00;
        ranger.velAtual = 0;

        Motor motorRanger = new Motor();
        motorRanger.potencia = 160;
        motorRanger.tipo = "tipo 5";

        ranger.motor = motorRanger;
        System.out.println(ranger.toString());
        System.out.println("A Ranger possui potencia de " + motorRanger.potencia + " cv, do tipo " + motorRanger.tipo);

        ranger.ligar();
        ranger.acelerar(20.5);

    }
}
