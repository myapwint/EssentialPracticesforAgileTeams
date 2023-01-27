package sg.edu.nus.iss.epat.refactor.workshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
	private final String MEMBER_NAME1 = "Anne";
	private final String MEMBER_NAME2 = "John";
	
	private RegularProject project = null;

	@Before
	public void setUp() {
		project = new RegularProject();
	}

	@Test
	public void testAddMember() {
		project.addMember(MEMBER_NAME1);
		project.addMember(MEMBER_NAME2);
		
		assertEquals(2, project.getMembers().size());
		assertTrue(project.getMembers().contains(MEMBER_NAME1));
		assertTrue(project.getMembers().contains(MEMBER_NAME2));
	}

	@Test
	public void testRemoveMember1() {
		// One member added; one removed
		project.addMember(MEMBER_NAME1);
		
		project.removeMember(MEMBER_NAME1);
		
		assertEquals(0, project.getMembers().size());
	}
	
	@Test
	public void testRemoveMember2() {
		// Two members added; one removed
		project.addMember(MEMBER_NAME1);
		project.addMember(MEMBER_NAME2);
		
		project.removeMember(MEMBER_NAME1);
		
		assertEquals(1, project.getMembers().size());
		assertFalse(project.getMembers().contains(MEMBER_NAME1));
		assertTrue(project.getMembers().contains(MEMBER_NAME2));
	}




}
