class Veiculo {
    String marca;
    String modelo;
    int ano;

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    String combustivel;

    Carro(String marca, String modelo, int ano, String combustivel) {
        super(marca, modelo, ano);
        this.combustivel = combustivel;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Combustível: " + combustivel);
    }
}

class CarroEletrico extends Carro {
    double bateria;

    CarroEletrico(String marca, String modelo, int ano, String combustivel, double bateria) {
        super(marca, modelo, ano, combustivel);
        this.bateria = bateria;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade da bateria: " + bateria + " kWh");
    }
}

public class Veículos {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Uno", 2010);  
        Carro carro = new Carro("Volkswagen", "Gol", 2018, "Gasolina");  
        CarroEletrico carroEletrico = new CarroEletrico("Chevrolet", "Bolt EV", 2023, "Elétrico", 66.0);  

        System.out.println("=== Detalhes do Veículo ===");
        veiculo.exibirDetalhes();
        
        System.out.println("\n=== Detalhes do Carro ===");
        carro.exibirDetalhes();
        
        System.out.println("\n=== Detalhes do Carro Elétrico ===");
        carroEletrico.exibirDetalhes();
    }
}
