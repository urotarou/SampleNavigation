package lab.uro.kitori.samplenavigation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import timber.log.Timber

class HogeViewModel(
    app: Application
) : AndroidViewModel(app) {
    private val _data = MutableLiveData<Int>()
    val data: LiveData<Int> = _data

    init {
        Timber.d("init: ${hashCode()}")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.d("onCleared: ${hashCode()}")
    }

    fun getData() {
        _data.value = hashCode()
    }
}
