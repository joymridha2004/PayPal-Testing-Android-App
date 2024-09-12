package com.joydev.paypaltest

import android.app.Application
import com.paypal.checkout.PayPalCheckout
import com.paypal.checkout.config.CheckoutConfig
import com.paypal.checkout.config.Environment
import com.paypal.checkout.config.SettingsConfig
import com.paypal.checkout.createorder.CurrencyCode
import com.paypal.checkout.createorder.UserAction
class App : Application() {

    var clientId= "AUmpA2GSbdAq26s4YTGPb6VhHIFKxUczezZZYnWnxzFkgPNqjM226ZicMSYKv-a4j0GADftJ9S3CHseb"
    var returnUrl= "com.joydev.paypaltest://paypalpay"
    override fun onCreate() {
        super.onCreate()
        val config = CheckoutConfig(
            application = this,
            clientId = clientId,
            environment = Environment.SANDBOX,
            returnUrl = returnUrl,
            currencyCode = CurrencyCode.USD,
            userAction = UserAction.PAY_NOW,
            settingsConfig = SettingsConfig(
                loggingEnabled = true,
                showWebCheckout = false
            )
        )
        PayPalCheckout.setConfig(config)
    }

}