package ActividadSumativa2.AS2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name= "titulo")
    private String titulo;
    @Column(name= "año")
    private String año;
    @Column(name = "director")
    private String director;
    @Column(name="genero")
    private String genero;
    @Column(name="sinopsis")
    private String sinopsis;

    //Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño(){
        return año;
    }

    public void setAño(String año){
        this.año=año;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director=director;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis=sinopsis;
    }
}
