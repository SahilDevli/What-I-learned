class Animal:
    def __init__(self, name):
        self.name = name

    def say(self):
        print("I am an animal!")


# Single Inheritance
class Dog(Animal):
    def __init__(self, name, breed, age):
        super().__init__(name)  # call parent constructor
        self.breed = breed
        self.age = age

    # method overriding
    def say(self):
        print("Dog says: Woof!")
        print(f"My name is {self.name}, I'm a {self.breed}, and I'm {self.age} years old woof!")


# Another Single Inheritance (not multiple yet)
class Cat(Animal):
    def __init__(self, name, breed, age):
        super().__init__(name)
        self.breed = breed
        self.age = age

    # def say(self):
    #     print("Cat says: Meow!")
    #     print(f"My name is {self.name}, I'm a {self.breed}, and I'm {self.age} years old meow!")


# Main business logic
dog1 = Dog("Tommy", "Husky", 5)
dog1.say()

cat1 = Cat("Kitty", "Persian", 3)
cat1.say()
