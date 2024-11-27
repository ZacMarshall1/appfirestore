package br.edu.up.rgm34353470.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm34353470.Filters

/**
 * ViewModel for [br.edu.up.rgm34353470.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}