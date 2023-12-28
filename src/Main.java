// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Clientes e1 = new Clientes();





     e1.setAbriconta("sim");                               // Abrir a conta 'sim' ou 'nao'
     e1.Abrirconta();                                     //  Confirmação do sistema alterar o estatus para true porem depende do sim anterior
     e1.setNome("Miguel Oliveira Santos");               // Nome do solicitante
     e1.setCpff("12549023789");                         // CPF do solicitante
     e1.setTpConta("Corrente ");                // Tipo de conta escolhida

     e1.depositar(5000);                            // Metodo depositar inserindo valores entre parentes
     e1.Sacar(5000);                                // Metodo Sacar inserindo valores entre parentes

        e1.cadastro();










    }
}