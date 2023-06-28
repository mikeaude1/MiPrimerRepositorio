package models;
import javax.persistence.*;
import play.db.jpa.Model;
/**
 *
 * @author maude
 */
@Entity
public class Personas extends Model {
    
    public String Nombre;
    public String ApellidoPaterno;
    public String ApellidoMaterno;
    public Boolean Activo = true;
}