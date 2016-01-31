def insertionSort(array):
	for j in range(1, len(array)):
		key = array[j]
		i = j - 1
		while i >= 0 and array[i] > key:
			array[i + 1] = array[i]
			i = i -1
		array[i +1] = key
	return array

def printArray(array):
	for element in array:
		print element

a = [2, 1, 3, 5, 4]
printArray(a)
print
sortedA = insertionSort(a)
printArray(sortedA)