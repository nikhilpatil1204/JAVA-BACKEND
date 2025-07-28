package inventory_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Product {
	private int id;
	private String name;
	private int quantity;

	public Product(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "ID: " + id + " | Name: " + name + " | Quantity: " + quantity;
	}
}


public class InventoryApplication {

	private static Scanner sc = new Scanner(System.in);

	private static List<Product> productList = new ArrayList<>();

	public static void main(String[] args) {

		int choice = 0;

		do {
			
			System.out.println("--- Inventory Mnagement System ---");
			System.out.println("");

			System.out.println("1.Add Product: ");
			System.out.println("2.View Product: ");
			System.out.println("3.Update Product: ");
			System.out.println("4.Remove Product: ");
			System.out.println("5.Exit");

			System.out.println("");
			
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1: addproducts();
				case 2: viewProducts();
				case 3: updateProduct();
				case 4: removeProduct();
				case 5: System.out.println("Exiting");

				default: System.out.println("Invalid choice, try again");
			}

		} while (choice != 5);

	}

	private static void addproducts() {

		System.out.println("Enter Product ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Product Name: ");
		String name = sc.next();
		sc.nextLine();

		System.out.println("Enter Product Qauntity: ");
		int qty = sc.nextInt();

		productList.add(new Product(id, name, qty));

		System.out.println("Products added Sucessfully!");

	}

	private static void viewProducts() {
		if (productList.isEmpty()) {
			System.out.println("No Products Available!");
		} else {
			System.out.println("Product List");
			for (Product p : productList) {
				System.out.println(p);
			}
		}
	}

	private static void updateProduct() {
		System.out.print("Enter Product ID to update: ");
		int id = sc.nextInt();
		boolean found = false;

		for (Product p : productList) {
			if (p.getId() == id) {
				System.out.print("Enter new quantity: ");
				int qty = sc.nextInt();
				p.setQuantity(qty);
				System.out.println("Quantity updated successfully!");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Product ID not found.");
		}

	}

	private static void removeProduct() {
		System.out.print("Enter product ID to remove: ");
		int id = sc.nextInt();
		Product found = null;
		for (Product p : productList) {
			if (p.getId() == id) {
				found = p;
				break;
			}
		}
		if (found == null) {
			System.out.println("Product not found.");
			return;
		}
		productList.remove(found);
		System.out.println("Product removed.");

	}
}
