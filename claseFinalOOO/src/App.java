import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Gato gatico1 = new Gato("rojo",(byte)7, "Egipcia", 34, true);
        
        //Gato gatico2 = new Gato("rojo",(byte)7, "Egipcia", 34, true);
        
        //Gato gatico3 = new Gato("rojo",(byte)7, "Egipcia", 34, true);
        
        System.out.println(Gato.numeroGatos);
        Gato.maulan();
        JOptionPane.showMessageDialog(null, "Hola","Eventos", JOptionPane.ERROR_MESSAGE);
        String nombre = "Joshua";
        

    }
}
