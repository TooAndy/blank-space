# blank-space

![Build](https://github.com/TooAndy/blank-space/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)


<!-- Plugin description -->
## Introduce:
Automatically insert whitespace between CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.

自动在CJK(中文，日文，韩文)，半宽英文，数字和符号字符之间插入空格

## Usage
1. 快捷键默认为 `shift`+`ctrl`+`alt`+`U`, 当然也可以自己在 `Settings` 中更改
2. 选中文字后, 点击右键, 可以直接选择 `添加空格` 对选中的文本进行处理

## 为什么不用 `ChineseTypography` 插件
由于插件 `ChineseTypography` 无法在2022及其之后的版本使用, 因此结合了 [ChineseTypography](https://plugins.jetbrains.com/plugin/9374-chinesetypography) 插件作者 [github](https://github.com/judasn/ChineseTypography-IDEA-Plugin) 中的代码, 使用了官方的插件模版, 重新发布一个可用的版本

<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "blank-space"</kbd> >
  <kbd>Install</kbd>
  
- Manually:

  Download the [latest release](https://github.com/TooAndy/blank-space/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
