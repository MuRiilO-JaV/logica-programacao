package alunos;

public class Aluno {

      private String nome;
      private int Idade;



      public Aluno(String nome, int Idade){
          this.nome = nome;
          this.Idade = Idade;
      }
      public String getNome(){
          return nome;
      }

     public int getIdade() {
        return Idade;
     }

     
}
