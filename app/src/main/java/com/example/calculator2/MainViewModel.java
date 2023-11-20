package com.example.calculator2;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends BaseObservable {
    String firstNumber, secondNumber, result;



    public MainViewModel(String firstNumber, String secondNumber, String result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    public MainViewModel() {

    }

    @Bindable
    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
        notifyPropertyChanged(BR.firstNumber);

    }

    @Bindable
    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
        notifyPropertyChanged(BR.secondNumber);
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    public void onSubtractClick() {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            int difference = num1 - num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }

    public void onCalculateClick() {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            int difference = num1 + num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
    public void onMutliClick() {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            int difference = num1 * num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
    public void ondivisonClick() {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            int difference = num1 / num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
}