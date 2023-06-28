package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Historialdocente extends Model{
    public Boolean activo;
    @OneToOne
    public  Materias materia;
    @OneToOne
    public  Grupos grupo;
    @OneToOne
    public  Personas persona;
}