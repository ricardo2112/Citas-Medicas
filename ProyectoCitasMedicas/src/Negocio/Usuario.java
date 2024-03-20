
package Negocio;

import java.util.Arrays;

public class Usuario {
    private String nombre;
    private char[] clave;

    public Usuario(String nombre, char[] clave) {
        this.nombre = nombre;
        this.clave = clave.clone();
    }

    public boolean autenticar(String nombreUsuario, char[] clave) {
        return this.nombre.equalsIgnoreCase(nombreUsuario) && Arrays.equals(this.clave, clave);
    }
}
    
