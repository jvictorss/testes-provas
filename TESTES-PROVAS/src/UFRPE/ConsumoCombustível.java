package UFRPE;

public class ConsumoCombustível {

    public static void main(String[] args) {
        double consumo = 15.2;
        int distancia = 336;
        int kmPorLitro = (int) (distancia / consumo);
        double abastecimento = 15;
        double autonomia = abastecimento * consumo;
        int serraCustodia = 75;
        double autonomiaCustodia = (serraCustodia / consumo) +1;

        System.out.println("O consumo de Serra para Custódia é de " + autonomiaCustodia + ". Abastecemos ontem " + abastecimento + "lt, então precisaremos abastecer " + kmPorLitro + "lt em custódia para chegar ao Recife ");

        System.out.println("A autonomia do carro com " + abastecimento + " litros é de: " + autonomia + "km.");
        System.out.println("Este carro precisa de " + kmPorLitro + " litros de gasolina para percorrer a distância de " + distancia + " km");

    }
}
