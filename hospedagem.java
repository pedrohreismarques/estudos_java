package hotelReis;
import java.util.Scanner;

public class hospedagem {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		// DISPLAY INICIAL \\
		
		System.out.println("---------- HOTEL REIS ----------");
		System.out.println("Sua melhor experiência é aqui!");
		System.out.println("");
		
		System.out.println("Seja bem vindo (a) ao portal de reservas do HOTEL REIS!");
		System.out.println("");
		
		System.out.println("Antes de iniciarmos o atendimento, nos informe o seu nome: ");
		String nome = sc.next();
		System.out.println("");
		
		System.out.println("Olá " + nome + "! Agora sim, vamos iniciar o atendimento.");

		System.out.println("");
       
		// QTD HÓSPEDES \\
        System.out.print("Primeiro, nos informe a quantidade de hóspedes da reserva: ");
        int numHospedes = sc.nextInt();
        sc.nextLine();

        String[] hospedes = new String[numHospedes];
        
        System.out.println("Agora, insira o nome completo de cada hóspede: ");
        System.out.println("");
        
        for (int i = 0; i < numHospedes; i++) {
            System.out.print("Hóspede " + (i + 1) + ": ");
            hospedes[i] = sc.nextLine();
        }

        // DISPONIBILIDADE \\
        boolean disponibilidade = true;
        
        if (!disponibilidade) {
            System.out.println("Não há quartos disponíveis no momento.");
            return;
        }

        // TIPO DE QUARTO \\
        System.out.println("Agora, escolha o tipo de quarto desejado: ");
        System.out.println("1 - Standard (R$ 150,00)     2 - Superior (R$ 180,00)     3 - Família (R$ 200,00)");
        System.out.println("                       4 - Luxo (R$ 250,00)         5 - Master (R$ 450,00)       ");
        
        int tipoQuarto = sc.nextInt();
        double valorDiaria = 0;

        switch (tipoQuarto) {
            case 1: valorDiaria = 150; break;
            case 2: valorDiaria = 180; break;
            case 3: valorDiaria = 200; break;
            case 4: valorDiaria = 250; break;
            case 5: valorDiaria = 450; break;
            default: 
                System.out.println("Opção inválida! Selecione uma opção válida.");
                return;
        }

        // QTD DIÁRIAS \\
        System.out.print("Informe a quantidade de diárias: ");
        int qtdDiarias = sc.nextInt();

        double valorTotal = valorDiaria * qtdDiarias;

        // SERVIÇOS EXTRAS \\
        System.out.println("Nós oferecemos alguns serviços extras: ");
        System.out.println("");
        System.out.println("1 - Serviço de Beleza (R$180)     2 - Aluguel de Carro (R$80)     3 - Mesa Vip do Restaurante (R$220)");
        System.out.println("Caso não queira nenhum serviço, digite 0.");
        System.out.println("");

        int opcaoExtra;
        
        do {
            
        	System.out.print("Serviço Extra: ");
            opcaoExtra = sc.nextInt();

            if (opcaoExtra == 1) {
                
            	valorTotal += 180;
           
            } 
            
            else if (opcaoExtra == 2) {
               
            	valorTotal += 80;
           
            } 
            
            else if (opcaoExtra == 3) {
                
            	valorTotal += 220;
            
            }
       
        } 
        
        while (opcaoExtra != 0);

        // CONFIRMAÇÃO DE RESERVA \\
        System.out.println("---------- RESERVA DE " + nome + " ----------");
        System.out.println("Hóspedes:");
        
        for (String nomeHospedes : hospedes) {
           
        	System.out.println("- " + nomeHospedes);
       
        }
        
        System.out.println("Quantidade de diárias: " + qtdDiarias);
        System.out.println("Valor total: R$ " + valorTotal);
        
        System.out.println("");
        System.out.println("A sua reserva está correta?");
        System.out.println("1 - SIM             2 - NÃO");
        int confReserva = sc.nextInt();
        
        if (confReserva == 1) {
        	
        	System.out.println("");
        	System.out.println("Sua reserva foi confirmada com sucesso!");
        	
        }
        
        else {
        	
        	return;
        	
        }

        sc.close();
    }
}