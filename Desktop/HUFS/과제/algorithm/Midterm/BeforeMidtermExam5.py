import time, random
def compute_e_ver1(n):
    sum = 1
    for i in range(1, n+1):
        factorial = 1
        for j in range(1, i+1):
            factorial *= j
        sum += 1/factorial
    return sum

def compute_e_ver2(n):
    sum = 1
    factorial = 1
    for i in range(1, n+1):
        factorial *= i
        sum += 1/factorial
    return sum

n = int(input(""))
before = time.process_time()
compute_e_ver1(n)
after = time.process_time()
ver1 = after - before
before = time.process_time()
compute_e_ver2(n)
after = time.process_time()
ver2 = after-before
print(ver1, ver2)
print(format(ver1, "f"), format(ver2, "f"))