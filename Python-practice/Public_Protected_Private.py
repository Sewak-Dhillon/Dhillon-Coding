
# Protected Member

class Teacher:
    _name = None

    def __init__(self,name):
        self._name = name

    def _display(self):
        print("Your name : ",self._name)

class Student(Teacher):
    def __init__(self,name):
       super().__init__(name)


obj = Student("gursewak singh")
obj._display()


# Private Member


class Teacher:
    __name = None

    def __init__(self,name):
        self.__name = name

    def __Name(self):
        print("Your name : ",self.__name)

    def display(self):
        self.__Name()



obj = Teacher("gursewak singh")
obj.display()


# Merge program to illustrate the concept of Public Private and Protected Modifiers

class modifier:
    var = None
    _var = None
    __var = None

    def __init__(self,num1,num2,num3):
        self.var = num1
        self._var = num2
        self.__var = num3

    def displaypublicmember(self):
        print("Public member : ", self.var)
    def _displayprotectedmember(self):
        print("Protected member : ", self._var)
    def __displayprivatemember(self):
        print("Private member : ", self.__var)

    def accessprivatemember(self):
        self.__displayprivatemember()

class access(modifier):
    def __init__(self, num1, num2, num3):
        super().__init__(num1, num2, num3)

    def accessprotectedmember(self):
        self._displayprotectedmember()

class object(access):
    def __init__(self, num1, num2, num3):
        super().__init__(num1, num2, num3)

    def objectprotectedmember(self):
        self._displayprotectedmember() 

obj = object(1,2,3)
# Simple accessing member functions

# obj.displayprivatemember()
# obj.accessprotectedmember()
# obj.displaypublicmember()
        
# Accessing Private and Protected member functions.

# obj.accessprivatemember()
# obj.accessprotectedmember()
# obj.displaypublicmember()
        
# Using third class inheriting access class Private and Protected member functions.

obj.accessprivatemember()
obj.objectprotectedmember()
obj.displaypublicmember()
        






