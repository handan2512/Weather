package com.folksdev.weather.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public record Request(
        String type,
        String query,
        String language,
        String unit
) {}

