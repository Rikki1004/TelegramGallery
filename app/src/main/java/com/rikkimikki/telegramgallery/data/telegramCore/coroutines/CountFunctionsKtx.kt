//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.rikkimikki.telegramgallery.data.telegramCore.coroutines

import com.rikkimikki.telegramgallery.data.telegramCore.core.TelegramFlow
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.Count
import org.drinkless.td.libcore.telegram.TdApi.Text

/**
 * Suspend function, which uses current user IP to found their country. Returns two-letter ISO
 * 3166-1 alpha-2 country code. Can be called before authorization.
 *
 * @return [Text] Contains some text.
 */
suspend fun TelegramFlow.getCountryCode(): Text = this.sendFunctionAsync(TdApi.GetCountryCode())

/**
 * Suspend function, which returns the total number of imported contacts.
 *
 * @return [Count] Contains a counter.
 */
suspend fun TelegramFlow.getImportedContactCount(): Count =
    this.sendFunctionAsync(TdApi.GetImportedContactCount())
