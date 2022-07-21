package org.data;

public class TwoTypes {
public void primitiveData() {
	//datatypes variablename = value;
	byte age = 127;
	short ph = 9544;
	int num = 222222222;
	long whole = 1111111111111111111l;
	float floa = 35.123f;
	double dou = 45.55555555;
	char ch = 'S';
	boolean boo = true;
	String str ="seeni mohammed";
	System.out.println(age+"\n"+ph+"\n"+num+"\n"+whole+"\n"+floa+"\n"+dou+"\n"+ch+"\n"+boo+"\n"+str+"\n");
	}public static void main(String[] args) {
		TwoTypes t = new TwoTypes();
		t.primitiveData();
	}
}
