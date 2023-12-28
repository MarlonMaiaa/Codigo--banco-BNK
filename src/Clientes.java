
import java.util.Random;
public class Clientes extends ContasBnk implements Interacao {

   // Atributos
    private String nome ;
    private String cpff;
    private String tpConta;

    private String abriconta;
    private boolean StatusConta;
    private int numerodcc;
    private double valorsaque ;
    private double valordeposito;




    // Metodo construtor

    public Clientes() {
        Random rand = new Random();
        this.numerodcc = 1000 + rand.nextInt(9000);


    }
// Metodos Especiais

    public void  cadastro () {
        if (this.StatusConta) {
            System.out.println("\n     CADASTRO     " );
            System.out.println(" Nome: " + this.nome);
            System.out.println(" CPF: " + this.cpff);
            System.out.println(" Tipo de conta:" + this.tpConta);
            System.out.println(" Status de Conta = " + this.StatusConta);
            System.out.println(" Numero da conta: "+this.numerodcc);
            System.out.println(" Conta aberta com sucessso!");
            System.out.println("----------------------------");
            System.out.println(" Status da Conta");
            System.out.printf("\n Saldo em conta: R$ %.2f" , getSaldo());

            System.out.println("\n-----------------------------------------------");
        } else {
            System.out.println("encerramento Realizado com sucesso  ");
        }

        if (this.valordeposito >0 && this.StatusConta){
            System.out.println("          Transação Financeira   ");
            System.out.printf("Deposito realizado com sucesso no valor de: R$ %.2f ",this.valordeposito);
            System.out.println("\n-----------------------------------------------");
        }else {
            System.out.println("" );
        }


         if (this.valorsaque >0 && this.StatusConta){
            System.out.println("          Transação Financeira  ");
            System.out.printf("Saque realizado com sucesso no valor de: R$ %.2f ",this.valorsaque );
            System.out.println("\n-----------------------------------------------");

        }
         else {
             System.out.println("          Transação Financeira   ");
             System.out.println("Saque nao autorizado ");

         }




    }



    // Getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpff() {
        return cpff;
    }

    public void setCpff(String cpff) {
        this.cpff = cpff;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    public String getAbriconta() {
        return abriconta;
    }

    public void setAbriconta(String abriconta) {
        this.abriconta = abriconta;
    }

    public boolean getStatusConta() {
        return StatusConta;
    }

    public void setStatusConta(boolean statusConta) {
        StatusConta = statusConta;
    }

    public int getNumerodcc() {
        return numerodcc;
    }

    public void setNumerodcc(int numerodcc) {
        this.numerodcc = numerodcc;
    }

    @Override
    public void Abrirconta()
    {
        if (abriconta != null && "sim".equalsIgnoreCase(abriconta.trim())) {
            this.StatusConta = true;

            System.out.println("--------------------------");
        } else {
            System.out.println("---------------------------");
        }
    }





        @Override
    public void Encerraconta() {
        if (this.getSaldo()==0) {
            this.StatusConta = false;

        }  else {
            System.out.println("Encerramento nao autorizado !! ");
    }
    }

    @Override
    public void Sacar(double s) {
        if (getSaldo()>=s){
            setSaldo(getSaldo() - s);
            this.valorsaque = s;




        } else if  (getSaldo()<0){
            System.out.println("Saldo insuficiente");
        }



        }



    @Override
    public void depositar(double d)

    {
        if (getSaldo() >= 0) {
            setSaldo(getSaldo() + d);
            this.valordeposito = d;
        }
    }

    @Override
    public void saldo() {

      getSaldo() ;

    }
}
