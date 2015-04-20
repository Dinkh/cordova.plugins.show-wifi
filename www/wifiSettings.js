var exec = require('cordova/exec'),
	Plugin = function () {};

Plugin.prototype.show = function () {
	var parameters = [];

	return exec(null, null, 'WifiSettings', 'show', parameters);
};

if(!window.plugins) {
	window.plugins = {};
}
if (!window.plugins.WifiSettings) {
	window.plugins.WifiSettings = new Plugin();
}

if (typeof module != 'undefined' && module.exports) {
	module.exports = Plugin;
}
