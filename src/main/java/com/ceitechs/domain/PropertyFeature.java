package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PropertyFeature {
    private int nbrOfRooms;
    private int nbrOfBaths;
    private int nbrOfKitchens;    
    private String propertySize;
    List<String> additionalFeatures;
}
