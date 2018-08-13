//MÉTODO CHAMADO DE SINGLETON
package hotel;

public class Quarto {
    private static String Nome;
    private static Quarto Instance;
    
    private Quarto(){
        
    }
    
    public static Quarto getInstance(){
        if(Instance == null){
           synchronized (Quarto.class){
               if(Instance == null){
                   Instance = new Quarto();
               }
           } 
        }
        return Instance;
    }
    
    
}
