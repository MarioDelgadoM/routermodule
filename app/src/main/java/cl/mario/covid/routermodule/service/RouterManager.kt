package cl.mario.covid.routermodule.service

import cl.mario.covid.covidmodule.service.CovidHelperRouter
import cl.mario.covid.covidmodule.service.CovidServiceImpl

object RouterManager {

    var covidServiceImpl = CovidServiceImpl().apply {
        CovidHelperRouter.covidService = this
    }
}