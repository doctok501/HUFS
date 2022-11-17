a = int(input())
b=0

for i in range(2,a):
    if a%i ==0:
        b = 1

if b == 0:
    print("%d는 소수입니다" %(a))
else:
    print("%d소수가 아닙니다" %(a))