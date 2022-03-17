package ru.netology.core2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void done(String result);
}
