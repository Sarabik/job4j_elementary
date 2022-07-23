package ru.job4j.array.additional;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int k = 0; k < places[i].length; k++) {
                if (places[i][k] == null
                        && (i == 0 || places[i - 1][k] == null)
                        && (i == places.length - 1 || places[i + 1][k] == null)
                        && (k == 0 || places[i][k - 1] == null)
                        && (k == places[i].length - 1 || places[i][k + 1] == null)) {
                    return new Place(i, k);
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
