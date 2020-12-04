package com.javaex.ex02;

public class Point {
	private int x;
	private int y;
	int z;
	int a;
	int b;
	int c;
	
	
	
	
	public Point() {}
	
	public Point(int x) {
		this.x = x;
	}

	public Point(int x, int y, int z, int a, int b, int c) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = c;
		this.z = z;
	}
	

	
	public boolean equals1(Object obj) {
		
		if(obj.toString().equals(toString())) {
			return true;
		}
		else {
			return false;
		}
		
	}

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


///////////////////////////////////////////////////////
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z != other.z)
			return false;
		return true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", b=" + b + ", c=" + c + "]";
	}


	
	

	
}
