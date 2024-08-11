package com.stream.app.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.stream.app.entities.Video;

public interface VideoService {

     // save video
     Video save(Video video, MultipartFile file);

     // get video by id
     Video get(String videoId);

     // get video by title
     Video getByTitle(String title);

     // get all videos
     List<Video> getAll();
}
