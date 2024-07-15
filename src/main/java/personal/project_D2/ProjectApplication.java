package personal.project_D2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        displayMenu();
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Abrigos");
            System.out.println("2. Doações");
            System.out.println("3. Centro de Distribuição");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Você escolheu Abrigos.");
                    handleShelters(scanner);
                    break;
                case 2:
                    System.out.println("Você escolheu Doações.");
                    handleDonations(scanner);
                    break;
                case 3:
                    System.out.println("Você escolheu Centro de Distribuição.");
                    displayDistributionCenters();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void displayDistributionCenters() {
        System.out.println("Centros de Distribuição:");
        System.out.println("1. Centro de Distribuição Esperança. Av. Boqueirão, 2450 - Igara, Canoas - RS, 92032-420");
        System.out.println("2. Centro de Distribuição Prosperidade. Av. Borges de Medeiros, 1501 – Cidade Baixa, Porto Alegre - RS, 90119-900");
        System.out.println("3. Centro de Distribuição Reconstrução. R. Dr. Décio Martins Costa, 312 - Vila Eunice Nova, Cachoeirinha - RS, 94920-170");
    }

    private static void handleShelters(Scanner scanner) {
        System.out.println("Lista de Abrigos:");
        System.out.println("1. Abrigo A");
        System.out.println("2. Abrigo B");
        System.out.println("3. Abrigo C");
    }

    private static void handleDonations(Scanner scanner) {
        System.out.println("Tipos de Doações:");
        System.out.println("1. Roupas");
        System.out.println("2. Produtos de higiene");
        System.out.println("3. Alimentos");

        System.out.print("Escolha uma opção: ");
        int donationType = scanner.nextInt();
        scanner.nextLine();

        switch (donationType) {
            case 1:
                handleClothesDonation(scanner);
                break;
            case 2:
                handleHygieneProductsDonation(scanner);
                break;
            case 3:
                handleFoodDonation(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void handleClothesDonation(Scanner scanner) {
        System.out.print("Descrição: ");
        String description = scanner.nextLine();
        System.out.print("Gênero (M/F): ");
        String gender = scanner.nextLine();
        System.out.print("Tamanho (Infantil/PP/P/M/G/GG): ");
        String size = scanner.nextLine();

        List<String> shelters = chooseShelters(scanner);
        System.out.println("Doação de Roupas registrada com sucesso para os abrigos: " + shelters);
    }

    private static void handleHygieneProductsDonation(Scanner scanner) {
        System.out.print("Descrição: ");
        String description = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); 

        List<String> shelters = chooseShelters(scanner);
        System.out.println("Doação de Produtos de Higiene registrada com sucesso para os abrigos: " + shelters);
    }

    private static void handleFoodDonation(Scanner scanner) {
        System.out.print("Descrição: ");
        String description = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> shelters = chooseShelters(scanner);
        System.out.println("Doação de Alimentos registrada com sucesso para os abrigos: " + shelters);
    }

    private static List<String> chooseShelters(Scanner scanner) {
        List<String> chosenShelters = new ArrayList<>();
        boolean choosing = true;

        System.out.println("Escolha os abrigos para esta doação (Digite 'ok' para finalizar):");
        displayShelters();
        while (choosing) {
            System.out.print("Digite o número do abrigo ou 'ok': ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("ok")) {
                choosing = false;
            } else {
                chosenShelters.add(getShelterName(choice));
            }
        }

        return chosenShelters;
    }

    private static void displayShelters() {
        System.out.println("Lista de Abrigos:");
        System.out.println("1. Abrigo A");
        System.out.println("2. Abrigo B");
        System.out.println("3. Abrigo C");
    }

    private static String getShelterName(String choice) {
        switch (choice) {
            case "1":
                return "Abrigo A";
            case "2":
                return "Abrigo B";
            case "3":
                return "Abrigo C";
            default:
                return "Abrigo Desconhecido";
        }
    }
}
