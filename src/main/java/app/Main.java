package app;

import entity.Employee;
import entity.Organization;
import entity.Subdivision;
import lombok.Builder;
import entity.Assignment;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.AssignmentRepository;
import repository.EmployeeRepository;
import repository.OrganizationRepository;
import repository.SubdivisionRepository;
import util.Util;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AssignmentRepository assignmentRepository = context.getBean(AssignmentRepository.class);
        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        OrganizationRepository organizationRepository = context.getBean(OrganizationRepository.class);
        SubdivisionRepository subdivisionRepository = context.getBean(SubdivisionRepository.class);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, calendar.OCTOBER, 20);

        Assignment testAssignment = new Assignment();
        testAssignment.setId(1L);
        testAssignment.setSubject("testSubject");
        testAssignment.setDeadline(new Date(calendar.getTime().getTime()));
        testAssignment.setAuthorOfAssigment(1L);
        testAssignment.setControlSign("done");
        testAssignment.setExecutionSign("done");
        testAssignment.setPerformersOfAssigment(2L);
        testAssignment.setTextOfAssigment("testTheProgram");

        Employee firstEmployee = new Employee();
        firstEmployee.setemployeeId(1L);
        firstEmployee.setFirstName("firstEmployeeFirstName");
        firstEmployee.setLastName("firstEmployeeLastName");
        firstEmployee.setPatronymicName("firstEmployeePatronymicName");
        firstEmployee.setJob("boss");

        Employee secondEmployee = new Employee();
        secondEmployee.setemployeeId(2L);
        secondEmployee.setFirstName("secondEmployeeFirstName");
        secondEmployee.setLastName("secondEmployeeLastName");
        secondEmployee.setPatronymicName("secondEmployeePatronymicName");
        secondEmployee.setJob("notBoss");

        Employee thirdEmployee = new Employee();
        thirdEmployee.setemployeeId(3L);
        thirdEmployee.setFirstName("thirdEmployeeFirstName");
        thirdEmployee.setLastName("thirdEmployeeLastName");
        thirdEmployee.setPatronymicName("thirdEmployeePatronymicName");
        thirdEmployee.setJob("firstSubdivisionBoss");

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(firstEmployee);
        testAssignment.setEmployees(employees);

        Set<Assignment> assignments = new HashSet<Assignment>();
        assignments.add(testAssignment);
        firstEmployee.setAssignment(testAssignment);

        Organization firstOrganization = new Organization();
        firstOrganization.setIdOrganization(1L);
        firstOrganization.setFizAdressOrg("firstOrganizationFizAdress");
        firstOrganization.setUrAdressOrg("firstOrganizationUrAdress");
        firstOrganization.setNameOrg("firstOrganizationName");
        firstOrganization.setSupervisorOrg(1L);

        Subdivision firstSubdivision = new Subdivision();
        firstSubdivision.setIdSubdivision(1L);
        firstSubdivision.setContactsSubdivision("firstSubdivisionContacts");
        firstSubdivision.setNameSubdivision("firstSubdivisionName");
        firstSubdivision.setSupervisorSubdivision(3L);


        assignmentRepository.save(testAssignment);
        employeeRepository.save(firstEmployee);
        employeeRepository.save(secondEmployee);
        employeeRepository.save(thirdEmployee);
        organizationRepository.save(firstOrganization);
        subdivisionRepository.save(firstSubdivision);



    }
}
