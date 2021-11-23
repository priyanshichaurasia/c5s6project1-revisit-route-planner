public class Route{

    private String fromCity;
    private String toCity;
    private int distance;
    private String time;
    private String cost;

    public Route(){

    }

    public Route(String fromCity, String toCity, int distance, String time, String cost){
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
    public void setDistance(int distance){
        this.distance=distance;
    }
    public int getDistance(){
        return distance;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return time;
    }
    public void setCost(String cost){
        return cost;
    }
    public String getCost(){
        return cost;
    }

    @Override
    public String toString(){
        return(fromCity+ "::" +toCity+ "::" +distance+ "::" +time+ "::" +cost);
    }
}