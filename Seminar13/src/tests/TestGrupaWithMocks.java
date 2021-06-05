package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.mocks.StudentDummy;
import clase.mocks.StudentFake;
import clase.mocks.StudentStub;

public class TestGrupaWithMocks {

	@Test
	public void testAdaugareStudent() {
		StudentDummy student=new StudentDummy();
		Grupa grupa=new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
	}
	@Test
	public void testGetPromovabilitate() {
		StudentStub student=new StudentStub();
		Grupa grupa=new Grupa(1100);
		grupa.adaugaStudent(student);
		assertEquals(0,grupa.getPromovabilitate(),0.01);
	}
	public void testGrupaWithFakeRight() {
		Grupa grupa=new Grupa(1077);
		
		for(int i=0;i<7;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7,grupa.getPromovabilitate(),0.01);
	}

}
