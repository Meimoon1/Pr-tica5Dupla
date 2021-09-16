import java.util.Scanner;

public class Pratica5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================CADASTRO DEV CAP===================================");
        System.out.println("------------Bem vindo ao cadastro de desenvolvedores da Capgemini----------------");
        System.out.println("Escolha uma opção: \n 1-Cadastrar Desenvolvedor \n 2-Cadastrar Linguagem \n 3-Sair");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                String nome = "";
                boolean validacaoN = true;
                boolean validacaoS = true ;
                boolean validacaoR = true ;

                do{
                    System.out.print("Informe o nome Desenvolvedor:");
                    nome = sc.next();
                    if(nome.length() < 3){
                        System.out.println("O nome cadastrado deve ter no mínimo três caracteres");
                        System.out.println("Digite novamente\n");
                    }else{
                        validacaoN = false;
                    }
                }while(validacaoN);

                String sobrenome = "";

                do{
                    System.out.print("Informe o sobrenome do Desenvolvedor:");
                    sobrenome = sc.next();
                    if(sobrenome.length() < 3){
                        System.out.println("O sobrenome cadastrado deve ter no mínimo três caracteres");
                        System.out.println("Digite novamente \n");
                    }else{
                        validacaoS = false;
                    }
                }while(validacaoS);

                int idade = 0;

                do{
                    System.out.print("Informe a idade do Desenvolvedor:");
                    idade = sc.nextInt();
                    if(idade < 0){
                        System.out.println("A idade cadastrada deve ser superior a zero");
                        System.out.println("Digite novamente \n");
                    }else{
                        validacaoR = false;
                    }
                }while(validacaoR);

                String nivel = "";
                System.out.print("Informe Nível de Senioridade:");
                nivel = sc.next();


                System.out.println("------------Cadastrado realizado com sucesso!----------------");
                System.out.printf("Desenvolvedor: %s %s | Idade: %d | Nível de Senioridade: %s", nome, sobrenome, idade,nivel);
                break;

            case 2:
                String linguagem = " ";
                System.out.println("Informe o nome da linguagem de programção:");
                linguagem = sc.next();

                String desc = " ";
                System.out.println("Informe a descrição:");
                desc = sc.next();

                String ap = " ";
                System.out.println("Informe a aplicação:");
                ap = sc.next();

                System.out.println("-------------Linguagem Cadastrada-----------------");
                break;

            case 3:
                System.out.println("Saindo");
                break;
        }

    }
}
