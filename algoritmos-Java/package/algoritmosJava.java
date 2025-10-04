/**
 * 1.2 algoritmos
 */
public class algoritmosJava {

    public class Persona {
        private String nombre;
        private int edad;

        // Constructores
        public Persona() {
            this.nombre = "";
            this.edad = 0;
        }
        
        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
        // Métodos
        public String getNombre() {
            return nombre;
        }
        
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        /*Persona p = new Persona("",0);
        p.setEdad(35);
        p.setNombre("Ramon");*/
      
        
    }
}