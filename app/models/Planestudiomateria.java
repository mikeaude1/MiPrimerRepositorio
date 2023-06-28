package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Planestudiomateria extends Model{
    public Boolean activo;
    @OneToOne
    public  Materias Materia;
    @OneToOne
    public  Grados grado;
    @OneToOne
    public  Planestudio planestudio;
}