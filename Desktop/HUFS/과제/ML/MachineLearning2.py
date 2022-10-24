#퍼셉트론 구현
def AND_gate(x1, x2):
    w1 = 0.3
    w2 = 0.3
    b = -0.5
    result = x1*w1 + x2*w2 + b
    if result <=0:
        return 0
    else:
        return 1

def DAND_gate(x1,x2):
    w1 =-0.4
    w2 =-0.4
    b = 0.5
    result = x1*w1 + x2*w2 + b
    if result <=0:
        return 0
    else:
        return 1

def OR_gate(x1,x2):
    w1 = 0.6
    w2 = 0.6
    b = -0.4
    result = x1*w1 + x2*w2 + b
    if result <= 0 :
        return 0
    else:
        return 1