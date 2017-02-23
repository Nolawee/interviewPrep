def bubble_sort1(A):
    for i in range (0, len(A) - 1):
        for j in range (0, len(A) - i - 1):
            if A[j] > A[j+1]:
                A[j], A[j+1] = A[j+1], A[j]

def bubble_sort2(A):
    for i in range(0, len(A)-1):
        isSorted = true
        for j in range (0, len(A)-1):
            if A[j] > A[j+1]:
                A[j], A[j+1] = A[j+1], A[j]
                isSorted = false
            if isSorted:
                return

def bubble_sort3(A):
    for i in range(0, len(A)-1):
        isSorted = true
        for j in range (0, len(A)-1):
            if A[j] > A[j+1]:
                swap(A, j, j+1)
                isSorted = false
            if isSorted:
                return;

def swap(A, i, j):
    tmp = A[i]
    A[i] = A[j]
    A[j] = A[i]
