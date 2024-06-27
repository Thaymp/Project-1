package employee;

	// Classe principal para testar o sistema
	import java.util.Scanner;

	public class TestSistem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EmployeeManager manager = new EmployeeManager();
	        
	        while (true) {
	            System.out.println("Selecione uma opção:");
	            System.out.println("1. Adicionar funcionário");
	            System.out.println("2. Listar funcionários");
	            System.out.println("3. Buscar funcionário por ID");
	            System.out.println("4. Remover funcionário por ID");
	            System.out.println("5. Sair");
	            
	            int option = scanner.nextInt();
	            scanner.nextLine(); // Limpar o buffer do scanner
	            
	            switch (option) {
	                case 1:
	                    System.out.println("Digite o nome do funcionário:");
	                    String name = scanner.nextLine();
	                    
	                    System.out.println("Digite a idade:");
	                    int age = scanner.nextInt();
	                    scanner.nextLine(); // Limpar o buffer do scanner
	                    
	                    System.out.println("Digite o número de identificação:");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // Limpar o buffer do scanner
	                    
	                    System.out.println("Digite as alergias (separadas por vírgula, se houver):");
	                    String allergies = scanner.nextLine();
	                    
	                    System.out.println("Digite os problemas médicos (separados por vírgula, se houver):");
	                    String medicalProblems = scanner.nextLine();
	                    
	                    Employee newEmployee = new Employee(name, age, id, allergies, medicalProblems);
	                    manager.addEmployee(newEmployee);
	                    System.out.println("Funcionário adicionado com sucesso.");
	                   	                    
	                    break;
	                    
	                case 2:
	                    manager.listEmployees();
	                    
	                    break;	
	                    
	                case 3:
	                    System.out.println("Digite o ID do funcionário:");
	                    int searchId = scanner.nextInt();
	                    scanner.nextLine(); 	                                     
	                    Employee foundEmployee = manager.findEmployeeById(searchId);
	                    if (foundEmployee != null) {
	                        System.out.println("Funcionário encontrado:");
	                        System.out.println("Nome: " + foundEmployee.getName());
	                        System.out.println("Idade: " + foundEmployee.getAge());
	                        System.out.println("ID: " + foundEmployee.getId());
	                        System.out.println("Alergias: " + foundEmployee.getAllergies());
	                        System.out.println("Problemas Médicos: " + foundEmployee.getMedicalProblems());
	                    } else {
	                        System.out.println("Funcionário não encontrado.");
	                    }
	                    
	                    break;
	                    
	                case 4:
	                    System.out.println("Digite o ID do funcionário para remover:");
	                    int removeId = scanner.nextInt();
	                    scanner.nextLine(); 	                    
	                    manager.removeEmployeeById(removeId);
	                    
	                    break;
	                    
	                case 5:
	                    System.out.println("Saindo do programa.");
	                    scanner.close();
	                    System.exit(0);
	                    
	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	        }
	    }
	}
