package House;

public class SubdivisionTester {

	public static void main(String[] args) {
		House h1 = new House();
		h1.setBedrooms(3);
		h1.setFamilyRoomArea(300.5);
		h1.setLivingRoomArea(180.3);
		h1.setStyle("Ranch");
		h1.setPlot(1.0);		
		
		House h2 = new House("Colonial", 200, 300, 1, 0.5);

		Subdivision subdivision = new Subdivision();
		subdivision.add(h1);
		subdivision.add(h2);
		
		System.out.println(subdivision.list());
		System.out.println(subdivision.size());
		
		System.out.println(subdivision.find("Ranch"));
		System.out.println(subdivision.get(1));
		
		System.out.println(subdivision.toString());
	}

}
