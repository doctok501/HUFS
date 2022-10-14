#BS
def BS (A, a, b, x):
    if a > b : return -1 
    m = (a + b)//2
    if x < A[m]: return BS(A, a, m-1 , x) # a 부터 m-1까지 왼쪽범위
    elif x > A[m]: return BS(A, m+1, b, x) # m+1 부터 b까지 오른쪽범위
    else: return m
