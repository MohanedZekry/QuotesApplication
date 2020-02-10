package com.mohaned.quotesapplication.ui.main;

public class MainPresenterImpl implements MainPresenter, GetQuoteInterface.OnFinishedListener {

    private MainView mainView;
    private GetQuoteInterface getQuoteInterface;

    public MainPresenterImpl(MainView mainView, GetQuoteInterface getQuoteInterface) {
        this.mainView = mainView;
        this.getQuoteInterface = getQuoteInterface;
    }

    @Override
    public void onButtonClick() {
        if (mainView != null)
            mainView.showProgress();
        getQuoteInterface.getNextQuotes(this::onFinish);
    }


    @Override
    public void onFinish(String quote) {
        if (mainView != null){
            mainView.setQuotes(quote);
            mainView.hideProgress();
        }
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }
}