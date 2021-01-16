package com.tiya.uas.api

object TheSportDBApi {
    fun getEvent(league: String?, event: String?): String{
        return Api.BASE_URL + "com.tiya.uas.api/v1/json/${Api.TSDB_API_KEY}" + "/"+event+".php?id="+league
    }

    fun getEventDetail(eventId: String?): String{
        return Api.BASE_URL + "com.tiya.uas.api/v1/json/${Api.TSDB_API_KEY}" + "/lookupevent.php?id="+eventId
    }
}