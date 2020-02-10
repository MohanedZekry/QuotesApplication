package com.mohaned.quotesapplication.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuotesRepo {

    static QuotesRepo instance;
    private List<String> quotes;

    public static QuotesRepo getInstance() {
        if (instance == null)
            instance = new QuotesRepo();
        return instance;
    }

    public QuotesRepo() {
        setUpQuotes();
    }

    public void setUpQuotes(){
        quotes = new ArrayList<>();
        quotes = Arrays.asList(
                "Talk is cheap. Show me the code.",
                "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.",
                "Any fool can write code that a computer can understand. Good programmers write code that humans can understand.",
                "I'm not a great programmer; I'm just a good programmer with great habits.",
                "Truth can only be found in one place: the code.",
                "How you look at it is pretty much how you'll see it",
                "You've baked a really lovely cake, but then you've used dog shit for frosting.",
                "The most disastrous thing that you can ever learn is your first programming language."
        );
    }

    public List<String> getQuotes(){
        return quotes;
    }
}