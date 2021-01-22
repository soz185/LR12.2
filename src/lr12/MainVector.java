package lr12;

import java.lang.Math.*;
import java.util.Scanner;
import java.io.*;

import lr11.Radius;
import lr11.Vector;

public class MainVector {
	public static void main(String[] args) {
		try 
		{
		String str = "������ � ��������� � ��������� ���������.";
		int length_str = str.length();
		System.out.println(str);
		System.out.printf("����� ������ %d\n", length_str);
		Radius rad = new Radius(1.5);
		Vector a = new Vector();
		Vector b = new Vector(1, 0, -2, rad);
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
		a.display();
		System.out.println("");
		System.out.print("b ");
		b.display();
		System.out.println("");
		
		System.out.println("�������� ��������� a � b:");
		c = a.add(b);
		System.out.print("c ");
		c.display();
		System.out.printf("\n����� ������� a ����� %g\n", a.length());
		System.out.printf("����� �������� a ����� %g\n", a.cylinderVolume());
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
        arr[0].display();
        System.out.println();
        System.out.print("arr[1] ");
        arr[1].display();
        System.out.println("");

        System.out.println("�������� ��������� arr[0] � arr[1]: ");
        arr[2] = arr[0].add(arr[1]);
        System.out.print("arr[2] ");
        arr[2].display();
        System.out.println("\n����� ������� arr[0] ����� " + arr[0].length());
        System.out.println("����� �������� arr[0] ����� " + arr[0].cylinderVolume());
        System.out.println("��������� ������������ �������� arr[0] � arr[1] ����� " + arr[0].scalar(arr[1]));

        Vector [][] arrayVector = new Vector[2][2];
        for (int i = 0; i < 2; i++)
        	for (int j = 0; j < 2; j++)
        		{
        			arrayVector[i][j] = new Vector(i + j);
        			arrayVector[i][j].display();
        			System.out.println();
        		}
        		
        
		}
		catch(Exception e)
		{
		System.out.println("e");
		}
	}
}
