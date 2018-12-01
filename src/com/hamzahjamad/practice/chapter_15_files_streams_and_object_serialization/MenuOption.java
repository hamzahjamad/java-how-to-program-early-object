package com.hamzahjamad.practice.chapter_15_files_streams_and_object_serialization;

public enum MenuOption {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }
}
