package com.mjc813;

public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SUFACE_AREA;

    static {
        EARTH_SUFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
