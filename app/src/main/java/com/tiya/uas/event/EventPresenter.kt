package com.tiya.uas.event

import com.google.gson.Gson
import com.tiya.uas.api.ApiRepository
import com.tiya.uas.api.TheSportDBApi
import com.tiya.uas.model.EventResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by Avin on 04/09/2018.
 */
class EventPresenter(private val view: EventView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson){
    fun getEventList(league: String?, event: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getEvent(league, event)),
                EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventList(data.events)
            }
        }
    }
}