my_Dict = {"name" : "Gursewak", "Age" : "15", "Phone" : "1542597745","color" : ["red", "blue", "green"]

}



# Accessing and adding keys in dictionary and its values



# print(my_Dict)

# print(len(my_Dict))

# print(type(my_Dict))

# print(my_Dict["name"])

# print(my_Dict["color"])

# print(my_Dict.get("color"))



my_Dict["height"] = '6' #Adding item to dictionary



# print(my_Dict.keys())

# print(my_Dict.items())



# Change Dictionary items



# my_Dict["Age"] = '203'

# my_Dict.update({"name" : "vijay"})

# print(my_Dict)



# Deleting dictionary and dictionary items.



# my_Dict.pop("height")

# my_Dict.popitem()

# del my_Dict["height"]

# del my_Dict

# print(my_Dict)



# looping Statements in Dictionary



# for x in my_Dict:

#   print(x)

# for x in my_Dict.keys():

#   print(x)

# for x in my_Dict.values():

#   print(x)

# for x,y in my_Dict.items():

#   print(x ,":", y)



# copying Dictionary



# my_Dict1 = my_Dict.copy()

# my_Dict1 = dict(my_Dict)

# print(my_Dict1)



# Nested Dictionary



my_family = {

  "c1" : { 

    "name" : "gursewak",

    "age" : "15"

  },

  "c2" : { 

    "name" : "sewak",

    "age" : "5"

  },

  "c3" : { 

    "name" : "Gur",

    "age" : "59"

  }

}



print(my_family)

# print(my_family["c1"])

print(my_family["c1"]["name"]) # Syntax for printing value from nested dictionary



