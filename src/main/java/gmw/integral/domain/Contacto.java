package gmw.integral.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Contacto {

    @Id
    private String id;
    private String nombre;
    private String email;

    private Contacto() {}

    public Contacto(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(id, contacto.id) &&
                Objects.equals(nombre, contacto.nombre) &&
                Objects.equals(email, contacto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email);
    }
}
