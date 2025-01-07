package ca.filmare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Videos {

    @Id
    private int idVideos;
    private String name;
    private String description;

    public int getIdVideos() {
        return idVideos;
    }

    public void setIdVideos(int idVideos) {
        this.idVideos = idVideos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLienVideo() {
        return lienVideo;
    }

    public void setLienVideo(String lienVideo) {
        this.lienVideo = lienVideo;
    }

    private String lienVideo;


}
