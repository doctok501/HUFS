length = None

#quick select 이용	
def SearchRotatePoint(l):
	for i in range(1, length):
		if l[i] < l[i-1]:
			return i
	return -1
		

number = list(map(int, input().split()))
length = len(number)
start_index = SearchRotatePoint(number)

if start_index == -1:
	print(0)
else:
	print(length-start_index)