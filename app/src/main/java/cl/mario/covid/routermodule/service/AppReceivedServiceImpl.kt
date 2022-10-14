package cl.mario.covid.routermodule.service

import androidx.fragment.app.Fragment

class AppReceivedServiceImpl : IAppReceivedService {

    override fun getCovidResultFragment(): Fragment {
        return RouterManager.covidServiceImpl.getCovidResultsFragment()
    }
}