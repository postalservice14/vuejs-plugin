# Deprecated
In favor of the [Vue.JS plugin](https://github.com/JetBrains/intellij-plugins/tree/master/vuejs) that comes with IntelliJ now

# Vue.js Support Plugin

Vue.js Support for the Intellij Platform (WebStorm, PhpStorm, Rubymine, Intellij, etc)

# Install
You can install it via Settings -> Plugins -> Browse repositories -> (search for) Vue.js

Or download it from here and install it manually:
https://plugins.jetbrains.com/plugin/8057?pr=phpStorm

# Useful tips
### Highlight and formating for SCSS/SASS/LESS styles in `.vue` files

To get proper formating you just have to insert `rel="stylesheet/<preprocessor_code>` in the `<style>` tag.
This is example for `scss`:
```HTML
<style lang="scss" rel="stylesheet/scss">
	@import 'variables.sass';

	body {
	  font: 100% Helvetica, sans-serif;
	  background-color: $light_blue;
	}
</style>
```

# Contributing
This project is still a work in progress.  I welcome ideas and additions.  My goal is to make it have similar functionality and features as the [angularjs-plugin](https://github.com/JetBrains/intellij-plugins/tree/master/AngularJS).
