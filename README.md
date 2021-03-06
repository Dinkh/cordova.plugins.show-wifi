# Cordova Plugin Show Wifi
Show Wifi Settings Plugin for iOS and Android

Cordova Show WifiSettings Plugin for Android and iOS

##DESCRIPTION

This plugin is for use with Cordova, and allows your application to open the native wifi settings tap on Android and iOS devices.

The Android implementation uses start activity.
The iOS version has to be done.

##Contents

- LICENSE
- Automatic Installation
- Plugin API
- Acknowledgments

##LICENSE

###The MIT License

Copyright (c) 2012 Adobe Systems, inc.
portions Copyright (c) 2012 Olivier Louvignes

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

##Automatic Installation

Below are the methods for installing this plugin automatically using command line tools. For additional info, take a look at Cordova Plugin Specification.

###Cordova

The plugin can be installed via the Cordova command line interface:

1. Navigate to the root folder for your phonegap project.
2. Run the command.

    cordova plugin add https://github.com/Dinkh/cordova.plugins.show-wifi.git

##Plugin API

###show

Show the native wifi settings menu.

```javascript
var WifiSettings;

document.addEventListener("deviceready", function(){
    WifiSettings = window.plugins.WifiSettings;
    WifiSettings.show();
});
```

##Acknowledgments

###iOS

The base part was taken from
