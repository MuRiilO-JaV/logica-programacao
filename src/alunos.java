public class alunos {

      private String nome;
      private int Idade;
      private String cpf;

      public alunos(String nome, int Idade, String cpf){
          this.nome = nome;
          this.Idade = Idade;
      }
      public String getNome(){
          return nome;
      }

     public int getIdade() {
        return Idade;
     }

     private String getCpf(){
          return cpf;
     }
}
