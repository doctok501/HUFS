def doSomething(A, i, j):
    if A[i]>A[j]:
        A[i], A[j] = A[j], A[i]
    if (j-i+1) > 2:
        t= (j - i + 1)//3 #3으로 나눔
        doSomething(A, i, j-t)
        doSomething(A, i+t, j)
        doSomething(A, i , j-t)

A = [3,2,9,1,-6,8,0]
doSomething(A, 0, len(A)-1)
print(A) #오름차순 정렬