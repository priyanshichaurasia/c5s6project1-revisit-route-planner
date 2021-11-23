import java.util.*;

public class RouteMain{

    public static void main(String [] args){

        String fileName ="route.csv";
        ArrayListRoutes alr = new ArrayListRoutes();
        alr.readRouteData(fileName);
        alr.displayRoute();
        List<Route> filterdis = alr.showDirectFlights("delhi");
    }
}