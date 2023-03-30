package House;

public class houseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //test the constructors
		House house1 = new House("Colonial", 700.0, 500.0, 3, 2100.0);
		House house2 = new House();
	    
	    //test the getters
	    System.out.println(house1.getBedrooms());
	    System.out.println(house1.getFamilyRoomArea()); 
	    System.out.println(house1.getStyle());
	    System.out.println(house1.getPlot());
	    System.out.println(house1.getLivingRoomArea());
	    System.out.println(house1.toString());
	    
	    //test the setters
	    house2.setBedrooms(1000);
	    house2.setFamilyRoomArea(500.0);
	    house2.setStyle("Colonial");
	    house2.setPlot(500.0);
	    house2.setLivingRoomArea(600.0);
	    System.out.println(house2.toString());
	      
	    //test getTotalArea
	    System.out.println(house1.getTotalArea());
	    System.out.println(house2.getTotalArea());
	    
	    //test compareArea
	    System.out.println(house1.compareArea(house2));

	}

}
