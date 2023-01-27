package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.Collection;
import java.util.List;

public class ToDoListTest extends TestCase {
    // Define Test Fixtures

    ToDoList toDoList;
    Task task;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        toDoList = new ToDoList();
        task = Task.builder().description("Task 1 ").isComplete(false).build();

    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
        task = null;
    }

    @Test
    public void testAddTask() {
        toDoList.addTask(task);
        Assertions.assertEquals(task.getDescription(), toDoList.getTask(task.getDescription()).getDescription());

    }

    @Test
    public void testGetStatus() {
        toDoList.addTask(task);
        boolean actual = toDoList.getStatus(task.getDescription());
        Assertions.assertEquals(task.isComplete(),actual);
    }

    @Test
    public void testRemoveTask() {
        toDoList.addTask(task);
        Task acutalTask = toDoList.removeTask(task.getDescription());
        Assertions.assertEquals(task,acutalTask);
    }

    @Test
    public void testGetCompletedTasks() {
        toDoList.addTask(task);
        task = Task.builder().description("Task 2").isComplete(true).build();
        toDoList.addTask(task);
        Collection<Task> completedList = toDoList.getCompletedTasks();
        Assertions.assertEquals(1,completedList.size());
    }
}
