package arrays;

public class StudentDB {

	String name;
	int rollNo;
	int age;
	String coll;
	
	public StudentDB()
	{
		
	}
	
	public StudentDB(String name,String coll,int rollNo,int age)
	{
		this.age = age;
		this.coll = coll;
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
		return "Name: "+name+" College Name: "+coll+" Roll No: "+rollNo+" Age: "+age;
		
	}
	
	public static void main(String[] args) {
		
		StudentDB [] db = new StudentDB [4];
		
		db [0] = new StudentDB("Raju", "DVVPCOE", 10, 20);
		db [1] = new StudentDB("Kaju", "DY Patil", 20, 20);
		db [2] = new StudentDB("JUJU", "DVVVP", 24, 20);
		
		for(int i=0; i<db.length ; i++)
		{
			System.out.println(db[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
