package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Grupos extends Model{
    public String Nombre;
    @OneToOne
    public  Periodo periodo;
    @OneToOne
    public  Grados grado;
    @OneToOne
    public  Turnos Turno;
    @OneToOne
    public  Carreras Carrera;
    @OneToOne
    public  Planestudio Plan;
    public Boolean activo;
}