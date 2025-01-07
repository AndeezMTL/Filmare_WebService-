package ca.filmare.repositories;

import ca.filmare.model.Videos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "videos", path="toto")
public interface VideosRepository extends JpaRepository<Videos, Integer> {
    public Videos findVideosByIdVideos(Integer idVideos);
    public Videos findVideosByName(String name);
    public Videos findVideosByLienVideo(String lienVideo);

}
