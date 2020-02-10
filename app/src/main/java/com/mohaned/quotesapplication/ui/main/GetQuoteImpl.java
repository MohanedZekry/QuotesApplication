package com.mohaned.quotesapplication.ui.main;

import android.os.Handler;
import com.mohaned.quotesapplication.repository.QuotesRepo;
import java.util.List;
import java.util.Random;

public class GetQuoteImpl implements GetQuoteInterface {

    private List<String> quotes = new QuotesRepo().getInstance().getQuotes();

    @Override
    public void getNextQuotes(OnFinishedListener listner) {
        new Handler().postDelayed(() -> {
            listner.onFinish(getRandomString());
        }, 2000);
    }

    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(quotes.size());

        return quotes.get(index);
    }

}
