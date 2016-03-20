package cn.tjuscs.st;

public class Triangle {
	public int getTriangleKind(int a,int b,int c)
	{
		int triangleKind = 3;
		if(a <= 0 || b <= 0 || c <= 0)
		{
			triangleKind = -1;
			return triangleKind;
		}
		
		if( a == b && b == c)
		{
			triangleKind = 0;
			return triangleKind;
		}
		else if(a == c || b == c || a == b)
		{
			triangleKind = 1;
			return triangleKind;
		}
		else
		{
			triangleKind = 2;
			return triangleKind;
		}
		
		
	}
	public static void main(String args[])
	{
		int a = 12;
		Triangle triangle = new Triangle();
		System.out.println(triangle.getTriangleKind(5, 5, 5));
		System.out.println(triangle.getTriangleKind(5, 5, 6));
		System.out.println(triangle.getTriangleKind(5, 7, 6));
		System.out.println(triangle.getTriangleKind(-2, 2, 3));
	}

}
