package com.stream.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stream.app.entities.Video;

public interface VideoRepository extends JpaRepository<Video, String> {
     Optional<Video> findByTitle(String title);

     // query methods

     // native

     // criteria api

}
