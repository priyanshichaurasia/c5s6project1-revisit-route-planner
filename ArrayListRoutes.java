import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}