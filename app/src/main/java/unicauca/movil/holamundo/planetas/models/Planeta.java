package unicauca.movil.holamundo.planetas.models;

/**
 * Created by DarioFernando on 07/07/2015.
 */
public class Planeta {

    String nombre;
    int tamanio;
    float gravity;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }
}
