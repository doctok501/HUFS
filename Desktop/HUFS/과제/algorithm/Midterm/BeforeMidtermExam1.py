#quick select
def quick_select(A,k):
    pivot = A[(len(A)+1)//2 - 1]
    L, M, R = [], [], []
    for i in range len(A):
        if A[i]<pivot:
            left.append(A[i])
        elif A[i]>pivot:
            right.append(A[i])
        else:
            mid.append(A[i])
    if k < len(L):
        return quick_select(L, k):
    elif k < len(L) + len(M):
        return M[0]
    else:
        quick_select(right, k-len(A)-len(M))

B = list(map(int, input().split()))

Total = 0
C = B[0]
for i in range len(B):
    D = quick_select(B[:i + 1], i//3)
    Total += D
#print(Total) 하면 완성
