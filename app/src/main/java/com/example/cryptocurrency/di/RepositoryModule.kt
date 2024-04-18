package com.example.cryptocurrency.di

import com.example.cryptocurrency.data.remote.SimpleSwapApi
import com.example.cryptocurrency.data.repository.SimpleSwapRepositoryImpl
import com.example.cryptocurrency.domain.repository.SimpleSwapRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideSimpleSwapApi(retrofit: Retrofit): SimpleSwapApi {
        return retrofit.create(SimpleSwapApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSimpleSwapRepository(api: SimpleSwapApi):SimpleSwapRepository {
        return SimpleSwapRepositoryImpl(api);
    }

}