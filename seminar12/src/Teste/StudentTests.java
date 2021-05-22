package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Student;

public class StudentTests {

	@Test
	public void testConstructorParametru() {
		String nume="gigel";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	@Test
	public void testConstructorFara() {
		Student student=new Student();
		assertNotNull("Numele e null",student.getNume());
		assertNotNull("Lita e nula",student.getNote());
		
	}
	@Test 
	public void TestAdaugaNote() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	@Test 
	public void TestDimensiune() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
		
	}

	public void TestMedie() {
		Student student=new Student();
		int nota1=10;
		int nota2=7;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		
		float medie1=student.calculeazaMedie();
		float medie2=(nota1+nota2)/2.0f;
		
		assertEquals(medie2,medie1,0.001);
	}
	@Test 
	public void testRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertFalse(student.areRestante());
		
	}
	
	@Test 
	public void tesNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertFalse(student.areRestante());
		
	}
		

}
