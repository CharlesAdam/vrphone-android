package com.charlesadam.virtualphone

import java.lang.Exception

open class ServiceException(): Exception() {

}

class InvalidNotificationException(): ServiceException()