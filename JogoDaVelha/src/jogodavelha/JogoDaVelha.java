package jogodavelha;
import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in); 
         
         Jogador jogador = new Jogador(); 
         Inteligência1 pc1 = new Inteligência1(); 
         Inteligência2 pc2 = new Inteligência2(); 
         Inteligência3 pc3 = new Inteligência3(); 
          
         while(true){ 
             Tabuleiro tab = new Tabuleiro(); 
             int nivel = menu();
             boolean vitoriaJogador; 
                           do{  
                 if(tab.numeroJogadas == 9){ 
                     break; 
                 } 
                 String x,y; 
                 x = y = ""; 
                 tab.mostrarTabuleiro();  
                 do{ 
                     System.out.print("Posição linha: "); x = teclado.next(); 
                     System.out.print("Posição coluna: "); y  = teclado.next(); 
                 }while(!(jogador.jogar(tab.posicoesTabuleiro, x, y))); 
                 tab.numeroJogadas++; 
                                   vitoriaJogador = tab.verificarVitoria(); 
                 if(!(vitoriaJogador)){ 
                     
                     switch(nivel){ 
                     case 1: 
                         pc1.jogar(tab.posicoesTabuleiro); 
                         break; 
                     case 2: 
                         pc2.jogar(tab.posicoesTabuleiro); 
                         break; 
                     case 3: 
                         pc3.jogar(tab.posicoesTabuleiro); 
                         break; 
                     } 
                     tab.numeroJogadas++;  } 
                  
                  
             }while(!(tab.verificarVitoria()));               
             tab.mostrarTabuleiro(); 
             System.out.println(tab.status()); 
             System.out.println("Digite qualquer coisa e pressione enter para jogar novamente"); 
             teclado.next(); 
              
              
         } 
          
          
          
          
          
          
          
     } 
     public static int menu(){ 
          
         Scanner teclado = new Scanner(System.in); 
         int nivel = 0; 
          
         while(true){ 
             try{ 
                 System.out.print("\nEscolha o nível (1-3): "); 
                 nivel = Integer.parseInt(teclado.next()); 
                 switch(nivel){ 
                     case 1: 
                         return 1; 
                     case 2: 
                         return 2; 
                     case 3: 
                         return 3; 
                     default: 
                         System.out.println("O Nível selecionado é inválido"); 
                 } 
                  
             }catch(Exception e){ 
                     System.out.println("Dados inválidos"); 
             } 
         } 
     } 
      
      
 } 
 
