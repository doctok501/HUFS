#pseudo code of ML
#perseptron algorithm
import numpy as np
#훈련집합 X, Y 설정
X, Y = map(int, input().split())
array = numpy.array([input().strip().split() for _ in range(100)], int) #훈련집합 생성
w= np.array([1., 1., 1.])


def forward(x):
    return np.dot(X, w[1:]) + w[0]

def predict(X):
    return np.where(forward(X) > 0, 1, -1)

for epoch in range(50):
    for x_val, y_val in zip(X, Y):
        update = 0.01 *(y_val - predict(x_val))
        w[1:] += update * x_val
        w[0] += update
    #print("predict (after training", w)


