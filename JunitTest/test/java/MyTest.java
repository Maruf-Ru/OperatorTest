package test.java;

public class MyTest {
	
	public int addition(int opr1, int opr2) 
	{
		return opr1 + opr2;
	}
	

	public int subtraction(int opr1, int opr2)
	{
		return opr1 - opr2;
	}
	

	public double division(int opr1, int opr2) 
	{
		return (double)opr1 / (double)opr2;
	}
	

	public int multiplication(int opr1, int opr2) 
	{
		return opr1 * opr2;
	}
	

	public int modulus(int opr1, int opr2) 
	{
		return opr1 % opr2;
	}
	
	public int bitNot(int opr1) {
		
		return ~opr1;
	}

	public int bitAnd(int opr1, int Opr2) {
		
		return opr1 & Opr2;
	}

	public int bitOr(int opr1, int Opr2) {
		
		return opr1 | Opr2;
	}

	public int bitExOr(int opr1, int Opr2) {
		
		return opr1 ^ Opr2 ;
	}

	public int bitShiftRight(int opr1) {
		
		return opr1>>1;
	}

	public int bitShiftRightZero(int opr1) {
		
		return opr1>>>1;
	}

	public int bitShiftLeft(int Opr1) {
		
		return Opr1<<1;
	}

	public boolean equalTo(int opr1, int Opr2) {
		
		
		return opr1 == Opr2;
	}

	public boolean notEqualTo(int opr1, int Opr2) {
		
		return opr1 != Opr2;
	}

	public boolean greaterThan(int opr1, int Opr2) {
		
		return opr1 > Opr2;
	}

	public boolean greaterThanOrEqual(int opr1, int Opr2) {
		
		return opr1 >= Opr2;
	}

	public boolean lessThan(int opr1, int Opr2) {
		
		return opr1 < Opr2;
	}

	public boolean lessThanOrEqual(int opr1, int Opr2) {
		
		return opr1 <= Opr2;
	}

	public boolean logicalNot(boolean opr1) {
	
		return !opr1;
	}

	public boolean logicalAnd(boolean opr1, boolean Opr2) {
		
		return opr1 && Opr2;
	}

	public boolean logicalOr(boolean opr1, boolean Opr2) {
		
		return opr1 || Opr2;
	}

	
	
	
	
	

	
}

