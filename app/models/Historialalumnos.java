package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Historialalumnos extends Model{
    public Boolean activo;
    @OneToOne
    public  Grupos grupo;
    @OneToOne
    public  Alumnos alumno;
    @OneToOne
    public  Periodo Periodo;
}