class person:
    def __init__(self,name):
        self.name = name

    def getname(self):
        return self.name

    def isemployee(self):
        return False

class employee(person):

    def isemployee(self):
        return True


emp1 = person("gur")
emp2 = employee("sewak")

print(emp1.getname() ," : ", emp1.isemployee())
print(emp2.getname() ," : ", emp2.isemployee())



        