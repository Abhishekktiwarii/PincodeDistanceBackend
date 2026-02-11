package com.example.PincodeDistanceBackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GoogleMapsResponse {
    private List<Route> routes;
    private String status;

    @Data
    public static class Route {
        private List<Leg> legs;
        private OverviewPolyline overview_polyline;

        @Data
        public static class Leg {
            private Distance distance;
            private Duration duration;
            private String start_address;
            private String end_address;

            @Data
            public static class Distance {
                private String text;
                private Long value;
            }

            @Data
            public static class Duration {
                private String text;
                private Long value;
            }
        }

        @Data
        public static class OverviewPolyline {
            private String points;
        }
    }
}