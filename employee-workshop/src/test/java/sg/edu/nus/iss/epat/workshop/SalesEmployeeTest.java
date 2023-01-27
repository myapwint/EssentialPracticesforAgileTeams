package sg.edu.nus.iss.epat.workshop;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SalesEmployeeTest{

	@Test
	public void testComputeSalary() {
		SalesEmployee salesEmployee = new SalesEmployee("Jack", 2000.0f, 300.0f, 20);
		float variableComponent = salesEmployee.variableComponent();
		assertTrue( salesEmployee.computeSalary(variableComponent) == 7600.0);
	}
}
