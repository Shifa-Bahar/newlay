package com.lifepharmacy.application.network.endpoints

import com.lifepharmacy.application.model.general.GeneralResponseModel
import com.lifepharmacy.application.model.home.HomeResponseItem
import com.lifepharmacy.application.model.product.ProductDetails
import com.lifepharmacy.application.model.rewards.RewardItem
import com.lifepharmacy.application.utils.URLs
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RewardsApi {

//  @GET(URLs.REWARD_LIST)
//  suspend fun getReswardsList(): Response<RewardModel>

//  @GET(URLs.REWARD_LIST)
//  fun getRewardsList(): Call<GeneralResponseModel<ArrayList<RewardModel>>>


  @GET(URLs.REWARD_LIST)
  suspend fun getRewardsList(): Response<GeneralResponseModel<ArrayList<RewardItem>>>
}
