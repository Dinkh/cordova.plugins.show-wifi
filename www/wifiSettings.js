var exec = require('cordova/exec'),
	Plugin = function () {};

Plugin.prototype.show = function () {
	var onSuccess = function() {},
		onError = function() {},
		parameters = [];

	return exec(onSuccess, onError, 'WifiSettings', 'show', parameters);
};

module.exports = new Plugin();