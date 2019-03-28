package com.example.rayhanpatoary.multiplequiz;

import android.provider.BaseColumns;

public final class Quiz_contract {


    public Quiz_contract(){}


    public static class question_table implements BaseColumns {
        public static final String table_name = "Quiz Question";
        public static final String colum_question = "Question";
        public static final String colum_option = "option1";
        public static final String colum_option2 = "option2";
        public static  final String colum_option3 = "option3";
        public static final String colum_answer = "answer_no";
    }
}
