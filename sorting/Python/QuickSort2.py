# -*- coding: utf-8 -*-
"""
Created on Wed Mar 23 23:30:54 2022

@author: Deepanshu
"""

def quicksort(sequence):
    length = len(sequence)
    if length <= 1:
        return sequence
    else:
        pivot = sequence.pop()
        
    items_greater = []
    items_lower = []
    
    for item in sequence:
        if item > pivot:
            items_greater.append(item)
        else:
            items_lower.append(item)
            
    return quicksort(items_lower) + [pivot] + quicksort(items_greater)

if __name__ == '__main__':
    # elements = [11, 9, 29, 7, 2, 15, 28]
    print("Enter list of elements in unsorted manner seperated by space")
    
    sequence = [int(x) for x in input().split()]
    quicksort(sequence)
    print(sequence)