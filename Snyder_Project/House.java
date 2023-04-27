package Snyder_Project;

public class House {
    public int bedrooms;
    public double famroomSize;
    public double livroomSize;
    public String houseStyle;
    public double acres;
    
    House()
    {
        this.bedrooms = 0;
        this.famroomSize = 0;
        this.livroomSize = 0;
        this.houseStyle = "Unfinished"; //could also assign this the value of "" or "unbuilt"
        this.acres = 0;
    }

    House(String style, double family, double living, int bed, double area)
    {
        this.houseStyle = style;
        this.famroomSize = family;
        this.livroomSize = living;
        this.bedrooms = bed;
        this.acres = area;
    }
    
    public int getBedrooms(){ return this.bedrooms; }
    public void setBedrooms(int newBeds){ this.bedrooms = newBeds; }
    
    public double getFamilyRoomArea(){ return this.famroomSize; }
    public void setFamilyRoomArea(double newSize){ this.famroomSize = newSize; }
    
    public String getStyle(){ return this.houseStyle; }
    public void setStyle(String newStyle){ this.houseStyle = newStyle; }
    
    public double getPlot(){ return this.acres; }
    public void setPlot(double newSize){ this.acres = newSize; }
    
    public double getLivingRoomArea(){ return this.livroomSize; }
    public void setLivingRoomArea(double newSize){ this.livroomSize = newSize; }
    
    public double getTotalArea()
    {
        return  this.famroomSize + this.livroomSize + this.bedrooms*300;
    }
    
    public int compareArea(House otherHouse)
    { 
        return (int) (this.getTotalArea() - otherHouse.getTotalArea()); 
    }
    
    public String toString()
    {
        return "House style = " + this.houseStyle + 
                "\nBedrooms = " + this.bedrooms + 
                "\nFamily room area = " + this.famroomSize + "\'" +
                "\nLiving room area = " + this.livroomSize + "\'" +
                "\nPlot = " + this.acres +
                "\nSquare feet = " + this.getTotalArea() + "\'";
    }
}



