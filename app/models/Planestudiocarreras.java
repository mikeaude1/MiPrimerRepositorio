package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Planestudiocarreras extends Model{
    public Boolean activo;
    @OneToOne
    public  Carreras carrera;
    @OneToOne
    public  Planestudio planestudio;
    public Boolean Viguente; 
}