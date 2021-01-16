package com.tiya.uas.detail.event

import com.tiya.uas.model.EventDetail


/**
 * Created by Avin on 06/09/2018.
 */
interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}