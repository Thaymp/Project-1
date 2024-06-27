package employee;

public class Employee {
	// Classe Employee
	    private String name;
	    private int age;
	    private int id;
	    private String allergies;
	    private String medicalProblems;
	    
	    // Construtor
	    public Employee(String name, int age, int id, String allergies, String medicalProblems) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	        this.allergies = allergies;
	        this.medicalProblems = medicalProblems;
	    }
	    
	    // Getters
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getAllergies() {
	        return allergies;
	    }
	    
	    public String getMedicalProblems() {
	        return medicalProblems;
	    }
	}

