package ca.filmare.controller;

import ca.filmare.model.Videos;
import ca.filmare.repositories.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    VideosRepository videosRepo;

    @GetMapping("/getName")

    public String findVideosByName(String name){
        Videos video = videosRepo.findVideosByName(name);
        return video.getName();
    }
    @GetMapping("/getIdVideos")
    public Integer findUsersByIdVideos(Integer idVideos){
        Videos video = videosRepo.findVideosByIdVideos(idVideos);
        return video.getIdVideos();
    }
    @GetMapping("/getLienVideos")
    public String findUsersByLienVideos(String lienVideo){
        Videos video = videosRepo.findVideosByLienVideo(lienVideo);
        return video.getLienVideo();
    }

    @GetMapping("/all")
    public List<Videos> getAll ( ){
        return videosRepo.findAll();
    }



}
