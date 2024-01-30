package AI;

import java.util.*;

class City {
    int x, y;

    public City(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(City other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class State {
    int currentCity;
    Set<Integer> unvisitedCities;
    double gScore;
    double fScore;

    public State(int currentCity, Set<Integer> unvisitedCities, double gScore, double fScore) {
        this.currentCity = currentCity;
        this.unvisitedCities = unvisitedCities;
        this.gScore = gScore;
        this.fScore = fScore;
    }
}

public class AStarTSP {
    public static double calculateTotalDistance(List<Integer> path, List<City> cities) {
        double totalDistance = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            int city1 = path.get(i);
            int city2 = path.get(i + 1);
            totalDistance += cities.get(city1).distanceTo(cities.get(city2));
        }
        return totalDistance;
    }

    public static List<Integer> aStarTSP(List<City> cities) {
        int numCities = cities.size();
        Set<Integer> unvisitedCities = new HashSet<>();
        for (int i = 1; i < numCities; i++) {
            unvisitedCities.add(i);
        }

        PriorityQueue<State> openSet = new PriorityQueue<>(Comparator.comparingDouble(s -> s.fScore));
        openSet.add(new State(0, unvisitedCities, 0, calculateTotalDistance(Collections.singletonList(0), cities)));

        while (!openSet.isEmpty()) {
            State currentState = openSet.poll();
            int currentCity = currentState.currentCity;

            if (currentState.unvisitedCities.isEmpty()) {
                List<Integer> path = new ArrayList<>();
                path.add(currentCity);
                path.add(0); // Return to the starting city to complete the cycle
                return path;
            }

            for (int nextCity : currentState.unvisitedCities) {
                Set<Integer> newUnvisitedCities = new HashSet<>(currentState.unvisitedCities);
                newUnvisitedCities.remove(nextCity);

                double gScore = currentState.gScore + cities.get(currentCity).distanceTo(cities.get(nextCity));
                double hScore = calculateTotalDistance(Collections.singletonList(nextCity), cities);
                double fScore = gScore + hScore;

                openSet.add(new State(nextCity, newUnvisitedCities, gScore, fScore));
            }
        }

        return null; // No valid tour found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numCities = scanner.nextInt();

        List<City> cities = new ArrayList<>();
        System.out.println("Enter the coordinates of cities (x y):");
        for (int i = 0; i < numCities; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            cities.add(new City(x, y));
        }

        List<Integer> tour = aStarTSP(cities);
        if (tour != null) {
            System.out.println("Optimal Tour:");
            System.out.println("Start from city " + tour.get(0));
            System.out.println("Visit cities in order: " + tour);
            System.out.println("Total distance: " + calculateTotalDistance(tour, cities));
        } else {
            System.out.println("No valid tour found.");
        }
    }
}
