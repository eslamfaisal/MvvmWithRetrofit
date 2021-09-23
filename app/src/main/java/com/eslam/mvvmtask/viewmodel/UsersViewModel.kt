package com.eslam.mvvmtask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eslam.mvvmtask.model.UsersResponse
import com.eslam.mvvmtask.networking.RetrofitClient
import com.urgent.daddody.api.Resource
import com.urgent.daddody.api.Status
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UsersViewModel : ViewModel() {

    val listResponse: MutableLiveData<Resource<UsersResponse>> = MutableLiveData()

    fun getUserData() {
        CoroutineScope(IO).launch {
            setValue(Resource.loading())

           val respose =  RetrofitClient.getInstance().api.listOfUsers()

            if(respose.isSuccessful){
                setValue(Resource.success(respose.body()!!))
            } else {
                setValue(Resource.error(respose.errorBody()!!.string()))
            }
        }
    }

    private suspend fun setValue(result: Resource<UsersResponse>) {
        withContext(Main) {
            listResponse.value = result
        }
    }
}