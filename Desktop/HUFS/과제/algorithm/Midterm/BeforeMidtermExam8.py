def quicksort(A, first, last):
	global Qc, Qs
	if first >= last:
		return
	left, right = first+1, last
	Qs += 2 
	pivot = A[first]
	while left <= right:
		Qc +=1
		while left <= last and A[left] < pivot:
			Qc +=1
			left +=1
		while right > first and A[right] > pivot:
			Qc +=1
			right -= 1
		if left <= right :
			Qs +=1
			A[left], A[right] = A[right], A[left]
			left += 1
			right -= 1
	A[first], A[right] = A[right], A[first]
	Qs += 1
	quicksort(A, first, right - 1)
	quicksort(A, right+1, last)