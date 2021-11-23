public class Route{

    private String fromCity;
    private String toCity;
    private double distance;
    private String time;
    private String cost;

    public Route(){

    }

    public Route(String fromCity, String toCity, double distance, String time, String cost){
        this.fromCity=fromCity;
        this.toCity=toCity;
        this.distance=distance;
        this.time=time;
        this.cost=cost;
    }
    public void setFromCity(String fromCity){
        this.fromCity=fromCity;
    }
    public String getFromCity(){
        return fromCity;
    }
    public void setToCity(String toCity){
        this.toCity=toCity;
    }
    public String getToCity(){
        return toCity;
    }
    public void setDistance(double distance){
        this.distance=distance;
    }
    public double getDistance(){
        return distance;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return time;
    }
    public void setCost(String cost){
        this.cost= cost;
    }
    public String getCost(){
        return cost;
    }

    @Override
    public String toString(){
        return(fromCity+ "::" +toCity+ "::" +distance+ "::" +time+ "::" +cost);
    }
}