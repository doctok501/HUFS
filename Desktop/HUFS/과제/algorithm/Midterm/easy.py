#for 문으로 소수점 판단.
a = int(input())
b=0

for i in range(2,a):
    if a%i ==0:
        b = 1

if b == 0:
    print("소수입니다")
else:
    print("소수가 아닙니다")