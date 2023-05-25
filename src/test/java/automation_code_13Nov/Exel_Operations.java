package automation_code_13Nov;

public class Exel_Operations {

	// step1 created the excel file
	// step2 add maven dependecies for excel file
	// step3 use a utility file
	// step 4 operations that are required (we will code)
	/// AUTOMATION_MAVEN/src/test/java/automation_code_13Nov/DataSimple.xlsx

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/src/test/java/automation_code_13Nov/DataSimple.xlsx";
		Xls_Reader obj = new Xls_Reader(path);

		// to get the row count
		int row = obj.getRowCount("Browser Test");
		System.out.println(row);

		int col = obj.getColumnCount("Browser Test");
		System.out.println(col);
		// get the colone count

		// Read Data from the xml file
		String data = obj.getCellData("Browser Test", 1, 2);
		System.out.println(data);
		
		String data1= obj.getCellData("Browser Test","Browser" , 3);
		System.out.println(data1);
		//4.
		obj.setCellData("Browser Test","Browser", 7,"SonyTv");

	}
}