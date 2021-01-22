package lr12;

import java.lang.Math.*;
import java.util.Scanner;
import java.io.*;

import lr12.Radius;
import lr12.Vector;

public class MainVector {
	public static void main(String[] args) {
		try 
		{
		String str = "������ � ��������� � ��������� ���������.";
		int length_str = str.length();
		System.out.println(str);
		System.out.printf("����� ������ %d\n", length_str);
		//Radius rad = new Radius(1.5);
		Vector a = new Vector();
		Vector b = new Vector(1, 0, -2);
		Vector c = new Vector();
		System.out.printf("���������� ��������� ��������: %d\n", Vector.GetCountOfVector());
        int p = 0;
        while (p == 0)
        {
            p = 1;
            try
            {
            	System.out.print("������� ���������� � ������ a [-100;100]: ");
                a.read();
            }
            catch (Exception e)
            {
            	System.out.println("��������� ����");
                p = 0;
            }
        }
		System.out.println("��������:");
		System.out.print("a ");
		System.out.println(a.ToString());
		System.out.println("");
		System.out.print("b ");
		System.out.println(b.ToString());
		System.out.println("");
		
        b = (Vector)a.clone();
        a.add(b);
        System.out.println("��������:");
		System.out.print("a ");
		System.out.println(a.ToString());
		System.out.println("");
		System.out.print("b ");
		System.out.println(b.ToString());
		System.out.println("");
		
		System.out.println("�������� ��������� a � b:");
		c = a.add(b);
		System.out.print("c ");
		System.out.println(c.ToString());
		System.out.printf("\n����� ������� a ����� %g\n", a.length());
		//System.out.printf("����� �������� a ����� %g\n", a.Volume());
		System.out.printf("��������� ������������ �������� a � b ����� %g\n", a.scalar(b));
		
        System.out.println("������ � �������� ��������.");
        Vector [] arr = new Vector[3];
        for (int i = 0; i < 3; i++)
        	arr[i] = new Vector(i);
        
        p = 0;
        while (p == 0)
        {
            p = 1;
            try
            {
            	System.out.print("������� ���������� � ������ a [-100;100]: ");
                a.read();
            }
            catch (Exception e)
            {
            	System.out.println("��������� ����");
                p = 0;
            }
        }
        
        System.out.println("��������:");
        System.out.print("arr[0] ");
        System.out.println(arr[0].ToString());
        System.out.println();
        System.out.print("arr[1] ");
        System.out.println(arr[1].ToString());
        System.out.println("");

        System.out.println("�������� ��������� arr[0] � arr[1]: ");
        arr[2] = arr[0].add(arr[1]);
        System.out.print("arr[2] ");
        System.out.println(arr[2].ToString());
        System.out.println("\n����� ������� arr[0] ����� " + arr[0].length());
        //System.out.println("����� �������� arr[0] ����� " + arr[0].Volume());
        System.out.println("��������� ������������ �������� arr[0] � arr[1] ����� " + arr[0].scalar(arr[1]));

        Vector [][] arrayVector = new Vector[2][2];
        for (int i = 0; i < 2; i++)
        	for (int j = 0; j < 2; j++)
        		{
        			arrayVector[i][j] = new Vector(i + j);
        			System.out.println(arrayVector[i][j].ToString());
        			System.out.println();
        		}
        Circle circle = new Circle();
        Square square = new Square();
        circle.ReturnName();
        square.ReturnName();

        Sphere sphere = new Sphere();
        System.out.println(sphere.Volume());
	
        
		}
		catch(Exception e)
		{
		System.out.println("e");
		}
	}
}
