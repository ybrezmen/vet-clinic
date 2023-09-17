package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;

public class Sandbox {

	public static void main(String[] args) {
		Dog[] dogs = {
				new Dog(Dog.M),
				new Dog(Dog.S),
				new Dog(Dog.XL),
				new Dog(Dog.XL),
				new Dog(Dog.XS),
				new Dog(Dog.S)
		};

		Arrays.sort(dogs, new DogSizeComparator());

		for (Dog dog : dogs) {
			System.out.println(dog.getSize());
		}
	}

}
