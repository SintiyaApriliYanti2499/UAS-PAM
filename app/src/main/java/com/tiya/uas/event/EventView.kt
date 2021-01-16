package com.tiya.uas.event

import com.tiya.uas.model.Event
/**
 * Created by Avin on 04/09/2018.
 */
interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}