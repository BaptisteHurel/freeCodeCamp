Write a function in python that takes  a brand, a model,a high, a weight, a max speed, a creation date and return in a table all inofrmations about 50 random cars.

The function should return a table with the following columns:

- Brand
- Model
- High
- Weight
- Max Speed
- Creation Date
- Price

The price should be calculated as follow:

- If the car is older than 10 years, the price is 0
- If the car is older than 5 years, the price is the max speed * 10
- If the car is older than 2 years, the price is the max speed * 20
- If the car is older than 1 years, the price is the max speed * 30
- If the car is younger than 1 years, the price is the max speed * 40