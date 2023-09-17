package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Dog;

import java.util.Comparator;

public class DogSizeComparator implements Comparator<Dog> {
	@Override
	public int compare(Dog dog1, Dog dog2) {
		return convertSize(dog1.getSize()) - convertSize(dog2.getSize());
	}

	private static int convertSize(String size) {
		return switch (size) {
			case Dog.XS -> 1;
			case Dog.S -> 2;
			case Dog.M -> 3;
			case Dog.L -> 4;
			case Dog.XL -> 5;
			default -> 0;
		};
	}
}
