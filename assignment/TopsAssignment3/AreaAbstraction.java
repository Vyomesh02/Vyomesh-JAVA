package com.TopsAssignment3;
abstract class Shape
{
	public abstract float reactangleArea(float length,float breadth);
	abstract float squareArea(float length);
	abstract float circleArea(float rad);
}
class Areaa extends Shape
{

	@Override
	public float reactangleArea(float length, float breadth) {
		float R_area=length*breadth;
		return R_area;
	}

	@Override
	float squareArea(float length) {
		float S_area=length*length;
		return S_area;
	}

	@Override
	float circleArea(float rad) {
		float C_area= (3.14f*rad*rad);
		return C_area;
	}
	
}


public class AreaAbstraction {

	public static void main(String[] args) {
		Areaa area = new Areaa();
		float a1=area.squareArea(10);
		float a2=area.reactangleArea(10, 10);
		float a3=area.circleArea(10);
		System.out.println("Area of Reactangle are :"+a2);
		System.out.println("Area of Square are :"+a1);
		System.out.println("Area of circle are :"+a3);

		
	}

}
