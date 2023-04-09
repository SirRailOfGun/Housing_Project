package House;

import java.util.ArrayList;

public class Subdivision 
{
	private ArrayList<House> houses = new ArrayList<>();
	
	Subdivision()
	{ }

	public House get(int i) 
	{
		return houses.get(i);
	}

	public boolean add(House h) 
	{
		boolean out = this.houses.add(h);
		return out;
	}

    public java.util.ArrayList<House> list() 
    {
        return this.houses;
    }

    public int size() 
    {
        return this.houses.size();
    }

    public House find(String style) {
    	for(int i = 0; i < houses.size(); i++)
    	{
    		if(houses.get(i).getStyle() == style)
    		{
    			return houses.get(i);
    		}
    	}
    	return null;
    }
    
    public java.util.ArrayList<House> listByArea​(double floor, double ceiling){
        ArrayList<House> output = new ArrayList<>();
        
        int i = 0;
        
        while(i < houses.size()){
            if((floor <= houses.get(i).getTotalArea()) && (houses.get(i).getTotalArea()<= ceiling)) {
                output.add(houses.get(i));
            }
            i++;
        }
        return output;
    }

    public java.util.ArrayList<House> listByPlot(double floor, double ceiling){
       ArrayList<House> output = new ArrayList<>();
       
       int i = 0;
       
       while(i < houses.size()){
       if((floor <= houses.get(i).getPlot()) && (houses.get(i).getPlot()<= ceiling)) {
           output.add(houses.get(i));
       }
       i++;
       }
       return output;
    }

    public java.util.ArrayList<House> listByBedrooms​(double floor, double ceiling){
       ArrayList<House> output = new ArrayList<>();
       
       int i = 0;
       
       while(i < houses.size()){
       if((floor <= houses.get(i).getBedrooms()) && (houses.get(i).getBedrooms()<= ceiling)) {
           output.add(houses.get(i));
       }
       i++;
       }
       return output;
    }

    public java.util.ArrayList<House> sortByArea()
    {
        ArrayList<House> output = new ArrayList<>();
        
        ArrayList<House> temp = houses;
        
        while(temp.size() < 0){
            double maxSize = 0;
            int indexOfMax = 0;
            
            for(int k = 0; k < temp.size(); k++)
            {
                if(temp.get(k).getTotalArea() > maxSize)
                {
                    indexOfMax = k;
                    maxSize = temp.get(k).getTotalArea();
                }
            }
            output.add(temp.get(indexOfMax));
            temp.remove(indexOfMax);
        }
        for(int i = output.size() - 1; i >= 0; i--) 
        {
        	output.add(output.get(i));
        	output.remove(i);
        }
        return output;
    }

    public java.util.ArrayList<House> sortByPlot()
    {
        ArrayList<House> output = new ArrayList<>();
        
        ArrayList<House> temp = houses;
        
        while(temp.size() < 0){
            double maxSize = 0;
            int indexOfMax = 0;
            
            for(int k = 0; k < temp.size(); k++)
            {
                if(temp.get(k).getPlot() > maxSize)
                {
                    indexOfMax = k;
                    maxSize = temp.get(k).getPlot();
                }
            }
            output.add(temp.get(indexOfMax));
            temp.remove(indexOfMax);
        }
        for(int i = output.size() - 1; i >= 0; i--) 
        {
        	output.add(output.get(i));
        	output.remove(i);
        }
        return output;
    }
}
