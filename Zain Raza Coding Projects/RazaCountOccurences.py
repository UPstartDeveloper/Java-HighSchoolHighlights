'''
Zain Raza
RazaCountOccurrences
6/11/18
'''
array = [0,0,0,0,0,0,0,0,0,0]#empty array of 10 integers
for i in range(0,10):#prompts 10 numbers
    array[i] = int(raw_input("Enter a number: "))#for loop populates the array 

print("")#empty line for spacing

'''for i in range(len(array)):#for loop goes through and counts number of times each index was inputted
    print(str(array[i] + "      " + str(array.count(array[i])))
'''
print([[x,array.count(x)] for x in set(array)])#prints each number inputted as a set with number of times inputted

