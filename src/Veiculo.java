public class Veiculo {
  // Atributos
  String nome = "";
  String cor = "";

  int numRodas = 0;

  int velocidade = 0;

  // Métodos

  void mover() {
  int velocidadeAcelerada = velocidade + 50;
  }

  void frear() {
    int velocidadeFreada = velocidade - 25;
  }

  void imprimirValores() {
    System.out.println("Modelo: " + nome);
    System.out.println("Cor: " + cor);
    System.out.println("Numero de rodas: " + numRodas);
    System.out.println("Velocidade: " + velocidade);
  }

  int acelerar(int velInicial) {
    int velocidadeAumentada = velInicial + 50;
    return velocidadeAumentada;
  }

  int frear(int velInicial) {
    int velocidadeDiminuida = velInicial - 25;
    return velocidadeDiminuida;
  }

}
