
package uni1a;
// Clase Investigador (Agregación)
public class Investigador {
    private String nombre;
    private String campo;
    
     public Investigador(String nombre, String campo){
         this.nombre=nombre;
         this.campo=campo;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
      @Override
    public String toString() {
        return "Investigador: " + nombre + ", Especialidad: " + campo;
    }

}
