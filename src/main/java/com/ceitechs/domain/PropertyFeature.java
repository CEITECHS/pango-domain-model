package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyFeature {
    private int nbrOfRooms;
    private int nbrOfBaths;
    private int nbrOfKitchens;    
    private String propertySize;
}
