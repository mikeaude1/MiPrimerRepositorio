package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Periodo extends Model{
    public Boolean Activo;
    public String Nombre;
    public String FechaInicio;
    public String FrchaFin;
}
