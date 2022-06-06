package exercício;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empregado[] funcionarios = new Empregado[4];

        Empregado funcionario0 = new Empregado("Fulano",30);
        Empregado funcionario1 = new Empregado("Ciclano",35);
        Empregado funcionario2 = new Empregado("Beltranho", 31);
        Empregado funcionario3 = new Empregado("Gabriel", 19);

        funcionarios[0] = funcionario0;
        funcionarios[1] = funcionario1;
        funcionarios[2] = funcionario2;
        funcionarios[3] = funcionario3;


        List<Empregado> empregadosList = MyOwnLists.asListedSorted(funcionarios, new Comparator<Empregado>(){

            @Override
            public int compare(Empregado o1, Empregado o2){
                if( o1.getNome().compareTo( o2.getNome() ) > 0 ) {return 1;}
                return -1;
            }

        });

        for(Empregado funcionario: empregadosList){

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Idade: " + funcionario.getIdade());
        }
    }
}
