package com.appMusic.appMusic.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.core.annotation.AliasFor;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SingerR(@JsonAlias("desc") String name,
                      @JsonAlias("genre") String gender,
                      @JsonAlias("toplyrics") String topLyrics,
                      @JsonAlias("lyrics") String lyrics,
                      @JsonAlias("albums") String albums) {
}
