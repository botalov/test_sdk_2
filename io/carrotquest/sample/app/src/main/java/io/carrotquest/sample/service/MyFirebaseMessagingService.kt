package io.carrotquest.sample.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import io.carrotquest_sdk.android.Carrot

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        if (Carrot.isCarrotPush(remoteMessage)) {
            Carrot.sendFirebasePushNotification(remoteMessage, this)
        }
    }
}