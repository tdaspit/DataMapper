//package csvReader;

//import csvReader.studentFileMapper;

public class studentFileMapper {

	
	// constructor
	public studentFileMapper() {
	String first = "";
	String last = "";
	int wNum;
	String major = "";
	double gpa;

	boolean isPrime;
	}
	
	// get
	public String getFirst() {String first;
	return first;}
	public String getLast() {return last;}
	
	public int getWnum() {return wNum;}
	
	public String getMajor() {return major;}
	public double getGpa() {return gpa;}
	public boolean getisPrime() {return isPrime;}
	
	
	//set
	class set implements studentFileMapper() {
	public void setFirst(String newFirst) {this.first = newFirst;}
	public void setLast(String newLast) {this.last = newLast;}
	public void setWnum(String newWNum) {this.wNum = newWNum;}
	public void setMajor(String newMajor) {this.major = newMajor;}
	public void setGpa(double newGpa) {this.Gpa= newGpa;}
	public void setIsPrime(double newIsPrime) {this.isPrime= newIsPrime;}
	
	/*
	Student student = new Student(guid);
	
	student.setName(name);
	student.setGrade(grade);
	student.setStudentId(studentID);
	*/
	}
	
	// w# isPrime
	public static boolean isPrime(int wNum) {
		if (wNum <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(wNum); i++) {
            if (wNum % i == 0) {
                return false;
            }
        }
        return true;
		
	}
	
	
}
