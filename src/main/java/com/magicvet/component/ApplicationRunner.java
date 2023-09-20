package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

public class ApplicationRunner {

	private final ClientService clientService = new ClientService();
	private final PetService petService = new PetService();

	public void run() {
		if (Authenticator.auth()) {
			Client client = clientService.registerNewClient();

			if (client != null) {
				registerPets(client);
				System.out.println(client);
			}
		}
	}

	private void registerPets(Client client) {
		boolean continueAddPets = true;

		while (continueAddPets) {
			addPet(client);

			System.out.print("Do you want to add more pets for the current client? (y/n): ");
			String answer = Main.SCANNER.nextLine();

			if ("n".equals(answer)) {
				continueAddPets = false;
			}
		}
	}

	private void addPet(Client client) {
		System.out.println("Adding a new pet.");

		Pet pet = petService.registerNewPet();
		if (pet != null) {
			client.addPet(pet);
			pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
			System.out.println("Pet has been added.");
		}
	}

}
