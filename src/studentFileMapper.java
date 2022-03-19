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
	
	// get and set
	public String getFirst() {String first = null; return first;}
	public void setFirst(String first) {this.first = first;}
	
	public String getLast() {return last;}
	public void setLast(String last) {this.last = last;}
	
	public int getWnum() {return wNum;}
	public void setWnum(int wNum) {this.wNum = wNum;}
	
	public String getMajor() {return major;}
	public void setMajor(String major) {this.major = major;}
	
	public double getGpa() {return gpa;}
	public void setGpa(double gpa) {this.gpa= gpa;}
	
	public boolean getisPrime() {return isPrime;}
	public void setIsPrime(boolean newIsPrime) {this.isPrime= newIsPrime;}
	
	// create student object
	// student object needs to find and update record

	
	
	
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
