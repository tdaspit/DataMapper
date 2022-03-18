// Tyler Daspit

// new version

//package csvReader;

//import csvReader.studentFileMapper;

public class studentFileMapper {
	//init var
	String first = "";
	String last = "";
	int wNum;
	String major = "";
	double gpa;

	boolean isPrime;
	
	// constructor
	public studentFileMapper(String first, String last, int wNum, String major, double gpa, boolean isPrime) {
		this.first = first;
		this.last = last;
		this.wNum = wNum;
		this.major = major;
		this.gpa = gpa;

		this.isPrime = isPrime;
	}
	
	// get
	public String getFirst() {String first; return first;}
	public String getLast() {return last;}
	public int getWnum() {return wNum;}
	public String getMajor() {return major;}
	public double getGpa() {return gpa;}
	
	public boolean getisPrime() {return isPrime;}
	
	
	//set
//	class set implements studentFileMapper() {
	public void setFirst(String first) {this.first = first;}
	public void setLast(String last) {this.last = last;}
	public void setWnum(String wNum) {this.wNum = wNum;}
	public void setMajor(String major) {this.major = major;}
	public void setGpa(double gpa) {this.gpa= gpa;}
	
	public void setIsPrime(boolean newIsPrime) {this.isPrime= newIsPrime;}
	
	/*
	Student student = new Student(guid);
	
	student.setName(name);
	student.setGrade(grade);
	student.setStudentId(studentID);
	*/
//	}
	
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
