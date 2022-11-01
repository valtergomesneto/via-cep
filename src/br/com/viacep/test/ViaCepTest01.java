package br.com.viacep.test;
import br.com.viacep.dominio.Endereco;
import br.com.viacep.dominio.ServicoCep;
import java.util.Scanner;

public class ViaCepTest01 {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEndereco(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
    }
}
