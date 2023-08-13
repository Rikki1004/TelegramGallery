//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.rikkimikki.telegramgallery.data.telegramCore.coroutines

import kotlin.Boolean
import com.rikkimikki.telegramgallery.data.telegramCore.core.TelegramFlow
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.NetworkStatistics
import org.drinkless.td.libcore.telegram.TdApi.NetworkStatisticsEntry
import org.drinkless.td.libcore.telegram.TdApi.NetworkType

/**
 * Suspend function, which adds the specified data to data usage statistics. Can be called before
 * authorization.
 *
 * @param entry The network statistics entry with the data to be added to statistics.
 */
suspend fun TelegramFlow.addNetworkStatistics(entry: NetworkStatisticsEntry?) =
    this.sendFunctionLaunch(TdApi.AddNetworkStatistics(entry))

/**
 * Suspend function, which returns network data usage statistics. Can be called before
 * authorization.
 *
 * @param onlyCurrent If true, returns only data for the current library launch.
 *
 * @return [NetworkStatistics] A full list of available network statistic entries.
 */
suspend fun TelegramFlow.getNetworkStatistics(onlyCurrent: Boolean): NetworkStatistics =
    this.sendFunctionAsync(TdApi.GetNetworkStatistics(onlyCurrent))

/**
 * Suspend function, which resets all network data usage statistics to zero. Can be called before
 * authorization.
 */
suspend fun TelegramFlow.resetNetworkStatistics() =
    this.sendFunctionLaunch(TdApi.ResetNetworkStatistics())

/**
 * Suspend function, which sets the current network type. Can be called before authorization.
 * Calling this method forces all network connections to reopen, mitigating the delay in switching
 * between different networks, so it should be called whenever the network is changed, even if the
 * network type remains the same. Network type is used to check whether the library can use the network
 * at all and also for collecting detailed network data usage statistics.
 *
 * @param type The new network type. By default, networkTypeOther.
 */
suspend fun TelegramFlow.setNetworkType(type: NetworkType?) =
    this.sendFunctionLaunch(TdApi.SetNetworkType(type))

/**
 * Suspend function, which sends a simple network request to the Telegram servers; for testing only.
 * Can be called before authorization.
 */
suspend fun TelegramFlow.testNetwork() = this.sendFunctionLaunch(TdApi.TestNetwork())
