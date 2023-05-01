package House;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Subdivision 
{
	private ArrayList<House> houses;
	
	Subdivision()
	{
		houses = new ArrayList<>();
	}
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
    		if(houses.get(i).getStyle().equals(style))
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

        ArrayList<House> temp = new ArrayList<House>(houses);

        while(temp.size() > 0){
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

    public  java.util.ArrayList<House> sortByPlot()
    {
        ArrayList<House> output = new ArrayList<House>();

        ArrayList<House> temp = new ArrayList<House>(houses);
        
        while(temp.size() > 0){
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
    /*
     * @Robert
     * 
     * Writes to the subDivision.txt file
     */
    public boolean toDisk() throws java.io.IOException{
    	java.io.File file = new java.io.File("subDivision.txt");
    	if(file.exists()) {
    		System.out.println("File already exists");
    		return false;
    	}
    	else {
    	java.io.PrintWriter output = new java.io.PrintWriter(file);
    	
    	output.print(this.houses);
    	output.close();
		return true;
    	}

    }
    /*
     * @Robert
     * 
     * Reads the subDivision.txt file
     */
    public boolean fromDisk() throws java.io.IOException
    {
    	java.io.File file = new java.io.File("subDivision.txt");

    	if(file.exists()) 
    	{
	    	FileInputStream inputStream = new FileInputStream("subDivision.txt");
	    	BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
	    	String stringLine;
	
	    	while((stringLine = br.readLine()) != null) 
	    	{
	    		String[] parse = stringLine.split(",");
	    		House loadHouse = new House(parse[0], Double.parseDouble(parse[1]), Double.parseDouble(parse[2]), Integer.parseInt(parse[3]), Double.parseDouble(parse[4]));
//	    		System.out.println(stringLine);
	    	}
	    	return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    /*
     * @Robert
     * 
     * Removes the house from the given position
     */
    public void remove(int position) {
    	this.houses.remove(position);
    }
    /*
     * @Robert
     * 
     * Updates the house chosen at the given position
     */
    public void update(int position, House houseToUpdate) {
    	this.houses.remove(position);
    	this.houses.add(position, houseToUpdate);
    	
    }
    
}