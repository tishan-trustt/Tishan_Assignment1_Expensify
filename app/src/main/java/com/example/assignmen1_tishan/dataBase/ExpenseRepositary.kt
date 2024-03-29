package com.example.assignmen1_tishan.dataBase

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ExpenseRepositary(private val dao:ExpenseDAO) {

    val expense = dao.getExpense()
//    val maxExpense = dao.getMaxExpense()
//    val minExpense = dao.getMinExpense()



    fun insert(expense: Expense) {
        dao.inserExpense(expense)
    }

    fun update(expense: Expense){
        dao.updateExpense(expense)
    }

    fun delete(expense: Expense){
        dao.deleteExpense(expense)
    }

    fun deleteAll(){
        dao.deleteALl()
    }

    fun getAvg():Double{
        return dao.getAvg()?:0.0
    }

    fun getMaxi():Double{
        return dao.getMax()
    }

    fun getMin():Double{
        return dao.getMin()
    }

    fun getTotal():Double{
        return dao.getTotal()?:0.0
    }


    fun getMaxExpense():Expense{
        return dao.getMaxExpense()?:(Expense(0,"",0.0,""))
    }


    fun getMinExpense():Expense{
        return dao.getMinExpense()?:(Expense(0,"",0.0,""))
    }

    fun getCount():Int{
        return dao.getCount()
    }



}