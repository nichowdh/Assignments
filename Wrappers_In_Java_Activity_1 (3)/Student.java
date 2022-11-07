
// Hands on Excersize •	Develop simple Java program using Wrapper Classes
class Student {

	Double fees;

//Method 1
	// problem statement 1 to check the student Fee structure
	public void calculateFeesStructure(Long s_id, Character s_grade, Double m_fees, Boolean schollershipeligible) {
		// if statement to check every condition
		if ((s_id != 0) && (s_grade == 'A') && (schollershipeligible = true)) {
			System.out.println("Exemption %: " + (fees = m_fees - m_fees * 10 / 100));

		} else if ((s_id != 0) && (s_grade == 'B') && (schollershipeligible = true)) {
			System.out.println("Exemption %: " + (fees = m_fees - m_fees * 8 / 100));
		} else if ((s_id != 0) && (s_grade == 'C') && (schollershipeligible = true)) {
			System.out.println("Exemption %: " + (fees = m_fees - m_fees * 6 / 100));
		} else if ((s_id != 0) && (s_grade == 'D') && (schollershipeligible = true)) {
			System.out.println("Exemption %: " + (fees = m_fees - m_fees * 4 / 100));
		} else {
			System.out.println("Not eligible for Exemption");
		}
	}

//Method 2
	// problem sttement 2 check if Math marks is greter han English or not
	public void compareMarks(Double english, Long maths) {
		Integer engnum = (int) english.doubleValue();
		Integer mathnum = (int) maths.longValue();
		// if condition to check all condition
		if (mathnum == engnum) {
			System.out.println("Both are Equal");
		} else if (mathnum > engnum) {
			System.out.println("Maths marks is higher than English");
		} else {
			System.out.println("English marks is higher than Maths");
		}

	}

//Method 3
	// problem statement 3 to check if the fee is infinite or not
	public void validateFees(Double Fees) {
		// if condition to check all condition
		if (Fees.isInfinite()) {
			System.out.println("Fees is infinite");
		} else {
			System.out.println("Fees is not infinite");
		}
		System.out.println(Fees.byteValue()); // getting byte values of fee

	}

	public static void main(String[] args) {
		// creating Object
		Student s = new Student();
		// calling and initializing 1st Method
		s.calculateFeesStructure(234l, 'C', 600d, (boolean) true);
		s.calculateFeesStructure(115l, 'C', 909.50d, (boolean) true);
		s.calculateFeesStructure(980l, 'C', 1810d, (boolean) false);
		// calling and initailizing 2nd Method
		s.compareMarks(85d, 65l);
		s.compareMarks(56d, 98l);
		s.compareMarks(84d, 84l);
		// calling and Initializing 3rd Method
		s.validateFees(1023d);
	}

}
