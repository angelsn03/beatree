package models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Album {
    private String id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portadaPath;
    private List<Cancion> canciones;
    //private Artista artistaId;

    public Album() {
    }

    public Album(String id) {
        this.id = id;
    }

    public Album(String nombre, Date fechaLanzamiento, String genero, String portadaPath, List<Cancion> canciones){//,Artista artistaId) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portadaPath = portadaPath;
        this.canciones = canciones;
       // this.artistaId = artistaId;
    }

    public Album(String id, String nombre, Date fechaLanzamiento, String genero, String portadaPath, List<Cancion> canciones){//,Artista artistaId) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portadaPath = portadaPath;
        this.canciones = canciones;
       // this.artistaId = artistaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPortadaPath() {
        return portadaPath;
    }

    public void setPortadaPath(String portadaPath) {
        this.portadaPath = portadaPath;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

//    public Artista getArtistaId() {
//        return artistaId;
//    }
//
//    public void setArtistaId(Artista artistaId) {
//        this.artistaId = artistaId;
////    }

    @Override
    public String toString() {
        return "Albumes{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", genero=" + genero + ", portadaPath=" + portadaPath + ", canciones=" + canciones + ", artistaId="+ '}'; //+ artistaId + '}';
    }
    
    
}
