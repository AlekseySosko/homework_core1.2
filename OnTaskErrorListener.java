package ru.netology.core2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
