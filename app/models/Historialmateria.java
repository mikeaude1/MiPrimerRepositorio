package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Historialmateria extends Model{
    public Boolean activo;
    @OneToOne
    public  Historialalumnos Historialalumno;
    @OneToOne
    public  Materias Materia;
  
}