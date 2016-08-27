import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Lab2 {

	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		
		double partimeSalary = 0.0;
		double totalSalary = 0.0;
		
		Employee e[] = new Employee[9];
		e[0] = new Staff("Allen", "Paita", "123", 'M', df.parse("2/23/1959"), 50.0);
		e[1] = new Staff("Zapata", "Steven", "456", 'F', df.parse("7/12/1964"), 35.0);
		e[2] = new Staff("Rios", "Enrique", "789", 'M', df.parse("6/2/1970"), 40.0);
		e[3] = new Faculty("Johnson", "Anne", "243", 'F', df.parse("4/27/1962"), "FU", new Education("PhD", "Engineering", 3));
		e[4] = new Faculty("Bouris", "William", "791", 'F', df.parse("3/14/1975"), "AO", new Education("PhD", "English", 1));
		e[5] = new Faculty("Andrade", "Christopher", "623", 'F', df.parse("5/22/1980"), "AS", new Education("MS", "Physical Education", 0));
		e[6] = new Partime("Guzman", "Augusto", "455", 'F', df.parse("8/10/1977"), 35.0, 30);
		e[7] = new Partime("Depirro", "Martin", "678", 'F', df.parse("9/15/1987"), 35.0, 15);
		e[8] = new Partime("Aldaco", "Marque", "945", 'M', df.parse("11/24/1988"), 20, 35);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i] + "\n");
			totalSalary += e[i].monthlyEarning();
			if (e[i] instanceof Partime)
				partimeSalary += e[i].monthlyEarning();
		}
		
		System.out.println("Total employee earnings: " + totalSalary + "\nTotal partime earnings: " + partimeSalary);
		
		Faculty f1 = new Faculty("Johnson", "Anne", "243", 'F', df.parse("4/27/1962"), "FU", new Education("PhD", "Engineering", 3));
		Faculty clonedFaculty = (Faculty)f1.clone();
		System.out.println("\n" + clonedFaculty);
		

		int array [] = {1, 2, 5, 3, 65, 34, 75, 23, 45, 453};
		InsertionSort.insertionSort(array);
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		Faculty Farray [] = {
				new Faculty("Johnson", "Anne", "243", 'F', df.parse("4/27/1962"), "FU", new Education("PhD", "Engineering", 3)),
				new Faculty("Bouris", "William", "791", 'F', df.parse("3/14/1975"), "AO", new Education("PhD", "English", 1)),
				new Faculty("Andrade", "Christopher", "623", 'F', df.parse("5/22/1980"), "AS", new Education("MS", "Physical Education", 0))
		};
		 InsertionSort.insertionSort(Farray);
		 BinarySearcher b = new BinarySearcher(Farray);
		 

		 
	}
	private static SimpleDateFormat df = new SimpleDateFormat ("MM/dd/yyyy");
}
