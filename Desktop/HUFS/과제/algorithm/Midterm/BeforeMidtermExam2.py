import random
def quicksort(A):
    if len(A) <= 1: return A
    pivot = A[0]
    S, M, L = [], [], []
    for x in A:
        if x < pivot: S.append(x)
        elif x > pivot: L.append(x)
        else: M.append(x)
    return quicksort(A)+M+quicksort(L)


random.seed()
n = int(input(" n= "))
A = [random.randiant(1, 10) for x in range(n)]
print(A)
A = quicksort(A)
print(A)