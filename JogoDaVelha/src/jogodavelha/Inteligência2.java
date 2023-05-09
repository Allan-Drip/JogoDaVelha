package jogodavelha;

import java.util.Random; 

public class Inteligência2 extends Inteligência{ 
    Random numeroAleatorio = new Random(); 
          public void jogar(String[][] mapa) { 
        int x,y; 
        while(true){ 
            x = numeroAleatorio.nextInt(3); 
            y = numeroAleatorio.nextInt(3); 
            if(mapa[x][y].equals(" ")){ 
                mapa[x][y] = "O"; 
                return; 
            } 
             
        } 
    } 
 
}

