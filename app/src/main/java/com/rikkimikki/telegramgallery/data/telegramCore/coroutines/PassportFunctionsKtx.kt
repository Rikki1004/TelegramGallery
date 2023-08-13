//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.rikkimikki.telegramgallery.data.telegramCore.coroutines

import kotlin.Array
import kotlin.Int
import kotlin.String
import com.rikkimikki.telegramgallery.data.telegramCore.core.TelegramFlow
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.InputPassportElement
import org.drinkless.td.libcore.telegram.TdApi.InputPassportElementError
import org.drinkless.td.libcore.telegram.TdApi.PassportAuthorizationForm
import org.drinkless.td.libcore.telegram.TdApi.PassportElement
import org.drinkless.td.libcore.telegram.TdApi.PassportElementType
import org.drinkless.td.libcore.telegram.TdApi.PassportElements
import org.drinkless.td.libcore.telegram.TdApi.PassportElementsWithErrors

/**
 * Suspend function, which deletes a Telegram Passport element.
 *
 * @param type Element type.
 */
suspend fun TelegramFlow.deletePassportElement(type: PassportElementType?) =
    this.sendFunctionLaunch(TdApi.DeletePassportElement(type))

/**
 * Suspend function, which returns all available Telegram Passport elements.
 *
 * @param password Password of the current user.
 *
 * @return [PassportElements] Contains information about saved Telegram Passport elements.
 */
suspend fun TelegramFlow.getAllPassportElements(password: String?): PassportElements =
    this.sendFunctionAsync(TdApi.GetAllPassportElements(password))

/**
 * Suspend function, which returns a Telegram Passport authorization form for sharing data with a
 * service.
 *
 * @param botUserId User identifier of the service's bot.  
 * @param scope Telegram Passport element types requested by the service.  
 * @param publicKey Service's publicKey.  
 * @param nonce Authorization form nonce provided by the service.
 *
 * @return [PassportAuthorizationForm] Contains information about a Telegram Passport authorization
 * form that was requested.
 */
suspend fun TelegramFlow.getPassportAuthorizationForm(
  botUserId: Long,
  scope: String?,
  publicKey: String?,
  nonce: String?
): PassportAuthorizationForm = this.sendFunctionAsync(TdApi.GetPassportAuthorizationForm(botUserId,
    scope, publicKey, nonce))

/**
 * Suspend function, which returns already available Telegram Passport elements suitable for
 * completing a Telegram Passport authorization form. Result can be received only once for each
 * authorization form.
 *
 * @param autorizationFormId Authorization form identifier.  
 * @param password Password of the current user.
 *
 * @return [PassportElementsWithErrors] Contains information about a Telegram Passport elements and
 * corresponding errors.
 */
suspend fun TelegramFlow.getPassportAuthorizationFormAvailableElements(autorizationFormId: Int,
    password: String?): PassportElementsWithErrors =
    this.sendFunctionAsync(TdApi.GetPassportAuthorizationFormAvailableElements(autorizationFormId,
    password))

/**
 * Suspend function, which returns one of the available Telegram Passport elements.
 *
 * @param type Telegram Passport element type.  
 * @param password Password of the current user.
 *
 * @return [PassportElement] This class is an abstract base class.
 */
suspend fun TelegramFlow.getPassportElement(type: PassportElementType?, password: String?):
    PassportElement = this.sendFunctionAsync(TdApi.GetPassportElement(type, password))

/**
 * Suspend function, which sends a Telegram Passport authorization form, effectively sharing data
 * with the service. This method must be called after getPassportAuthorizationFormAvailableElements if
 * some previously available elements need to be used.
 *
 * @param autorizationFormId Authorization form identifier.  
 * @param types Types of Telegram Passport elements chosen by user to complete the authorization
 * form.
 */
suspend fun TelegramFlow.sendPassportAuthorizationForm(autorizationFormId: Int,
    types: Array<PassportElementType>?) =
    this.sendFunctionLaunch(TdApi.SendPassportAuthorizationForm(autorizationFormId, types))

/**
 * Suspend function, which adds an element to the user's Telegram Passport. May return an error with
 * a message &quot;PHONE_VERIFICATION_NEEDED&quot; or &quot;EMAIL_VERIFICATION_NEEDED&quot; if the
 * chosen phone number or the chosen email address must be verified first.
 *
 * @param element Input Telegram Passport element.  
 * @param password Password of the current user.
 *
 * @return [PassportElement] This class is an abstract base class.
 */
suspend fun TelegramFlow.setPassportElement(element: InputPassportElement?, password: String?):
    PassportElement = this.sendFunctionAsync(TdApi.SetPassportElement(element, password))

/**
 * Suspend function, which informs the user that some of the elements in their Telegram Passport
 * contain errors; for bots only. The user will not be able to resend the elements, until the errors
 * are fixed.
 *
 * @param userId User identifier.  
 * @param errors The errors.
 */
suspend fun TelegramFlow.setPassportElementErrors(userId: Long,
    errors: Array<InputPassportElementError>?) =
    this.sendFunctionLaunch(TdApi.SetPassportElementErrors(userId, errors))
