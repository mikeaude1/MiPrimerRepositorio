package models;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author maude
 */
@Entity
    public class Menu extends Model{
    public Boolean Activo;
    public String Nombre;
    public String Ruta;
 
}
