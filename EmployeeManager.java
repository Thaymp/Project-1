package employee;

	// Classe EmployeeManager
	import java.util.ArrayList;
	import java.util.List;

	public class EmployeeManager {
	    private List<Employee> employees;
	    
	    // Construtor
	    public EmployeeManager() {
	        this.employees = new ArrayList<>();
	    }
	    
	    // Adicionar um novo funcionário
	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	    }
	    
	    // Listar todos os funcionários
	    public void listEmployees() {
	        for (Employee emp : employees) {
	            System.out.println("Nome: " + emp.getName());
	            System.out.println("Idade: " + emp.getAge());
	            System.out.println("ID: " + emp.getId());
	            System.out.println("Alergias: " + emp.getAllergies());
	            System.out.println("Problemas Médicos: " + emp.getMedicalProblems());
	            System.out.println("----------------------");
	        }
	    }
	    
	    // Buscar um funcionário pelo ID
	    public Employee findEmployeeById(int id) {
	        for (Employee emp : employees) {
	            if (emp.getId() == id) {
	                return emp;
	            }
	        }
	        return null; // Retorna null se não encontrar o funcionário
	    }
	    
	    // Remover um funcionário pelo ID
	    public void removeEmployeeById(int id) {
	        Employee empToRemove = null;
	        for (Employee emp : employees) {
	            if (emp.getId() == id) {
	                empToRemove = emp;
	                break;
	            }
	        }
	        if (empToRemove != null) {
	            employees.remove(empToRemove);
	            System.out.println("Funcionário removido com sucesso.");
	        } else {
	            System.out.println("Funcionário não encontrado.");
	        }
	    }
	}

