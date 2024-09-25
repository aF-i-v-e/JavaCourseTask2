package org.example.task2;

import java.util.ArrayList;

public class MergeSort {
    private ArrayList<Double> sortedList;

    public void divideList(int startIndex, int endIndex) {
        if (startIndex < endIndex && (endIndex - startIndex) >= 1) {
            int middleIndex = (endIndex + startIndex) / 2;

            divideList(startIndex, middleIndex);
            divideList(middleIndex + 1, endIndex);

            merge(startIndex, middleIndex, endIndex);
        }
    }

    private void merge(int startIndex, int middleIndex, int endIndex) {
        ArrayList<Double> tempList = new ArrayList<>();

        int leftBound = startIndex;
        int rightBound = middleIndex + 1;

        while (leftBound <= middleIndex && rightBound <= endIndex) {
            if (sortedList.get(leftBound) <= sortedList.get(rightBound)) {
                tempList.add(sortedList.get(leftBound));
                leftBound++;

            } else {
                tempList.add(sortedList.get(rightBound));
                rightBound++;
            }
        }

        completeList(tempList, leftBound, middleIndex);
        completeList(tempList, rightBound, endIndex);

        copyTempList(tempList, startIndex);
    }

    private void copyTempList(ArrayList<Double> tempList, int startIndex) {
        for (int i = 0; i < tempList.size(); startIndex++) {
            sortedList.set(startIndex, tempList.get(i++));
        }
    }

    private void completeList(ArrayList<Double> tempList, int bound, int endIndex) {
        while (bound <= endIndex) {
            tempList.add(sortedList.get(bound));
            bound++;
        }
    }

    public ArrayList<Double> sortList(ArrayList<Double> list) {
        sortedList = list;
        divideList(0, list.size() - 1);
        return sortedList;
    }
}
