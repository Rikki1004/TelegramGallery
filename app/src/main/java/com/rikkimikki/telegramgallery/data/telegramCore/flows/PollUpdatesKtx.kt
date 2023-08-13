//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.rikkimikki.telegramgallery.data.telegramCore.flows

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapNotNull
import com.rikkimikki.telegramgallery.data.telegramCore.core.TelegramFlow
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.Poll
import org.drinkless.td.libcore.telegram.TdApi.UpdatePollAnswer

/**
 * emits [Poll] if a poll was updated; for bots only.
 */
fun TelegramFlow.pollFlow(): Flow<Poll> = this.getUpdatesFlowOfType<TdApi.UpdatePoll>()
    .mapNotNull { it.poll }

/**
 * emits [UpdatePollAnswer] if a user changed the answer to a poll; for bots only.
 */
fun TelegramFlow.pollAnswerFlow(): Flow<UpdatePollAnswer> = this.getUpdatesFlowOfType()