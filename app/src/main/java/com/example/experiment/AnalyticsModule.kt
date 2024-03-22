package com.example.experiment

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {
    @Provides
    fun getAnalyticsService() : AnalyticsService {
        return Mixpanel()
    }
}