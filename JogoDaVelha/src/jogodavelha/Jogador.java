package jogodavelha;

public class Jogador {
	 public boolean jogar(String mapa[][], String horizontal, String vertical){ 
         try{ 
             int x = Integer.parseInt(horizontal); 
             int y = Integer.parseInt(vertical); 
             if (mapa[x-1][y-1].equals(" ")){ 
                 mapa[x-1][y-1] = "X"; 
                 return true; 
             }else{ 
              System.out.println("Posição já ocupada"); 
                 return false; 
             } 
         }catch(Exception e){ 
             System.out.println("Valor inválido"); 
             return false; 
         } 
                      
     } 
 }


