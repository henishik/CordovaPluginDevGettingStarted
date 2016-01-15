var device_information = {
    getDeviceInformation: function(successCallback, errorCallback) {
        console.log("in plugin function");
        cordova.exec(
            successCallback,
            errorCallback,
            'DeviceInformation',
            'action_get_device_information',
            []
        );
    }
}

module.exports = device_information
