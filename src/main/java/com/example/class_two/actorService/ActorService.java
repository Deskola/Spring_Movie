package com.example.class_two.actorService;

import com.example.class_two.actorModel.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();
    Actor findById();

    Actor create(Actor movie);
    void delete(Long id);
    Actor update(Actor movie);
    Actor update(Long id, Actor movie);
}
