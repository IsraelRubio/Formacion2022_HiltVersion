package israelontanilla.es.formacion2022_hiltversion.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import israelontanilla.es.data.models.TransactionModel
import israelontanilla.es.data.repository.TransaccionRepository
import kotlinx.coroutines.launch

class HomeViewModel(
    private val transaccionRepository: TransaccionRepository
): ViewModel() {
    fun onInit() {
        viewModelScope.launch{
                liveListTransaccions.value = transaccionRepository.getTransactions()
        }
    }

    private val liveListTransaccions by lazy {
        MutableLiveData<List<TransactionModel>>()
    }

    val obsListTransactions: LiveData<List<TransactionModel>> = liveListTransaccions
}