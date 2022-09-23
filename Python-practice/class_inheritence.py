class Myclass:

    n1 = "Gursewak singh"
    n2 = "Shanpreet singh"
    def __init__(self,name,breed): #Constructor in Python 
        self.name = name
        print("Human Created")
        self.breed = breed  

    def fun(self):
        print("First name : ", self.n1)
        print("Second name : ", self.n2)

    def __del__(self):
        print("Human destroyed")

class Person(Myclass):
    def __init__(self, name, breed):
        print("In person class __init__ method")
        super().__init__(name, breed)

    def Name(self):
        print("My name is : ",self.name)

# obj = Myclass("Dhillon", "human")
# obj.fun()
# print(obj.n1)
# print(obj.name)
# print(obj.breed)

obj = Person("Gursewak Singh", "Human")
obj.Name()
obj.fun()



