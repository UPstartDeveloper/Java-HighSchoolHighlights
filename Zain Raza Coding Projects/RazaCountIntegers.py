'''
Zain Raza
RazaCountIntegers. Program prompts user for 10 integers, populates an array with them, and prints them back to user. Output is a set with number inputted, and number of times that input exists in the array.
Due Date: 6/11/18
'''
array = [0,0,0,0,0,0,0,0,0,0]#empty array of 10 integers
for i in range(0,10):#prompts 10 numbers
    array[i] = int(raw_input("Enter a number: "))#for loop populates the array 

print("")#empty line for spacing

print([[x,array.count(x)] for x in set(array)])#prints each number inputted as a set with number of times inputted


