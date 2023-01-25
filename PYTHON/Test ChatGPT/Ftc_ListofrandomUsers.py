"""
1. Create a list of first names
2. Create a list of last names
3. Combine them randomly into a list of 100 full names
"""

import random

first_names = ["John", "Jane", "Jack", "Jill", "Jeff", "Mary", "Mike", "Molly", "Ava", "Adam", "Alex", "Aiden", "Harry", "Henry", "Hank", "Hanna"]

last_names = ["Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin"]

full_names = []

for i in range(100):
    first_name = random.choice(first_names)
    last_name = random.choice(last_names)
    full_names.append(first_name + " " + last_name)
    
print(full_names)