//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.rikkimikki.telegramgallery.data.telegramCore.coroutines

import kotlin.String
import com.rikkimikki.telegramgallery.data.telegramCore.core.TelegramFlow
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.EmailAddressAuthenticationCodeInfo
import org.drinkless.td.libcore.telegram.TdApi.PasswordState
import org.drinkless.td.libcore.telegram.TdApi.RecoveryEmailAddress

/**
 * Suspend function, which checks the email address verification code for Telegram Passport.
 *
 * @param code Verification code.
 */
suspend fun TelegramFlow.checkEmailAddressVerificationCode(code: String?) =
    this.sendFunctionLaunch(TdApi.CheckEmailAddressVerificationCode(code))

/**
 * Suspend function, which checks the 2-step verification recovery email address verification code.
 *
 * @param code Verification code.
 *
 * @return [PasswordState] Represents the current state of 2-step verification.
 */
suspend fun TelegramFlow.checkRecoveryEmailAddressCode(code: String?): PasswordState =
    this.sendFunctionAsync(TdApi.CheckRecoveryEmailAddressCode(code))

/**
 * Suspend function, which returns a 2-step verification recovery email address that was previously
 * set up. This method can be used to verify a password provided by the user.
 *
 * @param password The password for the current user.
 *
 * @return [RecoveryEmailAddress] Contains information about the current recovery email address.
 */
suspend fun TelegramFlow.getRecoveryEmailAddress(password: String?): RecoveryEmailAddress =
    this.sendFunctionAsync(TdApi.GetRecoveryEmailAddress(password))

/**
 * Suspend function, which re-sends the code to verify an email address to be added to a user's
 * Telegram Passport.
 *
 * @return [EmailAddressAuthenticationCodeInfo] Information about the email address authentication
 * code that was sent.
 */
suspend fun TelegramFlow.resendEmailAddressVerificationCode(): EmailAddressAuthenticationCodeInfo =
    this.sendFunctionAsync(TdApi.ResendEmailAddressVerificationCode())

/**
 * Suspend function, which resends the 2-step verification recovery email address verification code.
 *
 * @return [PasswordState] Represents the current state of 2-step verification.
 */
suspend fun TelegramFlow.resendRecoveryEmailAddressCode(): PasswordState =
    this.sendFunctionAsync(TdApi.ResendRecoveryEmailAddressCode())

/**
 * Suspend function, which sends a code to verify an email address to be added to a user's Telegram
 * Passport.
 *
 * @param emailAddress Email address.
 *
 * @return [EmailAddressAuthenticationCodeInfo] Information about the email address authentication
 * code that was sent.
 */
suspend fun TelegramFlow.sendEmailAddressVerificationCode(emailAddress: String?):
    EmailAddressAuthenticationCodeInfo =
    this.sendFunctionAsync(TdApi.SendEmailAddressVerificationCode(emailAddress))

/**
 * Suspend function, which changes the 2-step verification recovery email address of the user. If a
 * new recovery email address is specified, then the change will not be applied until the new recovery
 * email address is confirmed. If newRecoveryEmailAddress is the same as the email address that is
 * currently set up, this call succeeds immediately and aborts all other requests waiting for an email
 * confirmation.
 *
 * @param password Password of the current user.  
 * @param newRecoveryEmailAddress New recovery email address.
 *
 * @return [PasswordState] Represents the current state of 2-step verification.
 */
suspend fun TelegramFlow.setRecoveryEmailAddress(password: String?,
    newRecoveryEmailAddress: String?): PasswordState =
    this.sendFunctionAsync(TdApi.SetRecoveryEmailAddress(password, newRecoveryEmailAddress))
