package models;
import javax.persistence.*;
import play.db.jpa.Model;

@Entity
public class Universidades extends Model{
    public boolean Activo;
    public String Nombre;
    
}
