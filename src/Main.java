public class Main {
  public static void main(String[] args) {
    Veiculo civicSi = new Veiculo();
    civicSi.nome = "Civic SI 2008 (K20)";
    civicSi.cor = "Vermelho";
    civicSi.numRodas = 4;
    civicSi.velocidade = 120;

    civicSi.imprimirValores();

    civicSi.velocidade = civicSi.acelerar(civicSi.velocidade);

    System.out.println("------------------------------------");

    civicSi.imprimirValores();

    System.out.println("------------------------------------");

    civicSi.velocidade = civicSi.frear(civicSi.velocidade);

    civicSi.imprimirValores();

    System.out.println("------------------------------------");


    Veiculo nissanSilvia = new Veiculo();
    nissanSilvia.nome = "Nissan Silvia (S15)";
    nissanSilvia.cor = "Preto";
    nissanSilvia.numRodas = 4;
    nissanSilvia.velocidade = 180;

    civicSi.imprimirValores();

    nissanSilvia.velocidade = nissanSilvia.acelerar(nissanSilvia.velocidade);

    System.out.println("------------------------------------");

    nissanSilvia.imprimirValores();

    System.out.println("------------------------------------");

    nissanSilvia.velocidade = nissanSilvia.frear(nissanSilvia.velocidade);

    nissanSilvia.imprimirValores();

    System.out.println("------------------------------------");

  }
}