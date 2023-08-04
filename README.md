# Matisse

[![](https://jitpack.io/v/wangchenyan/Matisse.svg)](https://jitpack.io/#wangchenyan/Matisse)

Forked from [zhihu/Matisse](https://github.com/zhihu/Matisse)

## Change Log

### 0.5.4

- 适配 Android 13
- 无需在调用前申请存储权限，组件内部自动申请权限
- Fix issue: https://github.com/zhihu/Matisse/issues/812
- 拍照仅支持存储在私有目录

## Usage

1. 添加 Jitpack 仓库

```kotlin
maven("https://jitpack.io")
```

2. 添加依赖

```kotlin
implementation("com.github.wangchenyan:Matisse:x.x.x")
```