import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ArrayListRoutes{

    List<Route>  routeList = new ArrayList<Route>();

    public ArrayListRoutes()
    {

    }

    public void readRouteData(String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            String line = br.readLine();
            while(line!=null){
                String [] output = line.split(",");
                Route r1 = new Route(output[0],output[1],Double.parseDouble(output[2]),output[3],output[4]);
                routeList.add(r1);
                line=br.readLine();
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }

    public void displayRoute(){
        System.out.print("From To Distance in km Travel Time Typical Airfare");
        System.out.println();
        Consumer<Route> display = (d)->System.out.println(d);
        routeList.forEach(display);
        
    }

    public List<Route> showDirectFlights(String sourceCity){

        List<Route> filterList = new ArrayList<Route>();
    
        Optional<Route> displayFilter = routeList.stream().filter(p->p.getFromCity().equalsIgnoreCase(sourceCity)).findAny();
        if(displayFilter.isPresent()){
           filterList = routeList.stream().filter(p->p.getFromCity().equalsIgnoreCase(sourceCity)).collect(Collectors.toList());
           System.out.print("\nFrom To Distance in km Travel Time Typical Airfare\n");
           Consumer<Route> display = (d)->System.out.println(d);
           filterList.forEach(display);
        }
        else{
            System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+sourceCity);
        }
        return filterList;
    }

    public void sortDirectFlights(List<Route> filterList){

        Comparator<Route> sort= (d1,d2)->{
            if(d1.getToCity().compareTo(d2.getToCity())>0)
                return 1;
            else
                return -1;

        };

        System.out.print("\nFrom To Distance in km Travel Time Typical Airfare\n");
        filterList.stream().sorted(sort).forEach(i->System.out.println(i));

    }

    public void showAllFlights(String sourceCity, String destinationCity){

        System.out.print("\nFrom To Distance in km Travel Time Typical Airfare\n");
        showAllConnections(sourceCity, destinationCity);
    }

    private void showAllConnections(String sourceCity, String destinationCity){

        List<Route> list = new ArrayList<Route>();
        Predicate<Route> check =(c)->(p->p.getFromCity().equalsIgnoreCase(sourceCity) && p.getToCity().equalsIgnoreCase(destinationCity));
        Optional<Route> listFilter = routeList.stream().filter(check)findAny();
        if(listFilter.isPresent()){
            list = routeList.stream().filter(check).collect(Collectors.toList());
            list.forEach(i->System.out.println(i));
        }

        Optional<Route> 



    }
}