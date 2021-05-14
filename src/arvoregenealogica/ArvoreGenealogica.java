package arvoregenealogica;


public class ArvoreGenealogica {

   
    public static void main(String[] args) {
        
       Pessoa p1 = new Pessoa ("Iani Vargas", 17);
       Pessoa p2 = new Pessoa ("Sirlei Veni", 39);
       Pessoa p3 = new Pessoa ("Marcio Vargas", 42);
       
       Pessoa p4 = new Pessoa ("Ana Souza", 23);
       Pessoa p5 = new Pessoa ("Maria da Silva", 50);
       Pessoa p6 = new Pessoa ("Marcelo Souza", 69);
       
       
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Pai: " + p3.getNome());
        System.out.println("Mãe: " + p2.getNome());
        System.out.println("------------------------");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Idade: " + p4.getIdade());
        System.out.println("Pai: " + p6.getNome());
        System.out.println("Mãe: " + p5.getNome());
        System.out.println("------------------------");
        
    }
    
}
