package models;
import javax.persistence.*;
import play.db.jpa.Model;

@Entity
public class Carreras extends Model{
     public String Nombre;
     @OneToOne
     public Universidades universidad;
     public boolean Activo;
     public String Clave;
   
    
}
