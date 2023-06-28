package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Alumnos extends Model{
    public String matricula;
    @OneToOne
    public  Personas Persona;
    public Boolean activo;
}
