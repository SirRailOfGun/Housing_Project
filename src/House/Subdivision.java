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
}
