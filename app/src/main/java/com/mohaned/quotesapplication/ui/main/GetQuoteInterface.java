package com.mohaned.quotesapplication.ui.main;

public interface GetQuoteInterface {

    interface OnFinishedListener{
        void onFinish(String quote);
    }

    void getNextQuotes(OnFinishedListener listener);
}
