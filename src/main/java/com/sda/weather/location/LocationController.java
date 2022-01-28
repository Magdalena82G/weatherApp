package com.sda.weather.location;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.weather.exception.InternalServerException;

public class LocationController {

    private final ObjectMapper objectMapper;
    private final LocationService locationService;
    private final LocationMapper locationMapper;

    public LocationController(ObjectMapper objectMapper, LocationService locationService, LocationMapper locationMapper) {
        this.objectMapper = objectMapper;
        this.locationService = locationService;
        this.locationMapper = locationMapper;
    }

    public String createLocation(String city, String region, String country, String longitude, String latitude) {
        Location location = locationService.createLocation(city, region, country, longitude, latitude);
        LocationDTO locationDTO = locationMapper.asLocationDTO(location);
        try {
            return objectMapper.writeValueAsString(locationDTO);
        } catch (JsonProcessingException e) {
            throw new InternalServerException("Wystąpił problem podczas serializacji odpowiedzi: " + e.getMessage());
        }
    }
}