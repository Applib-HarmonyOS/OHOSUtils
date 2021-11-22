# OHOSUtils

A OHOSUtils library is collection of utils classes which is created for the dependencies used in SlideActionView library for implementation, but feel free to add your own contributions as you wish.

## Source
Inspired by [fennifith/AndroidUtils](https://github.com/fennifith/AndroidUtils) - version 0.0.1

## Feature
This library provides the collection of utils classes.

![](screenshots/ohosutilsgif.gif)
## Dependency
1. For using HMOSUtil module in sample app, include the source code and add the below dependencies in entry/build.gradle to generate hap/support.har.
```groovy
	dependencies {
        implementation fileTree(dir: 'libs', include: ['*.jar', '*.har'])
        testImplementation 'junit:junit:4.13'
        ohosTestImplementation 'com.huawei.ohos.testkit:runner:1.0.0.100'
        implementation project(':ohosutils')
    }
```
2. For using OHOSUtils in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
```groovy
	dependencies {
        implementation fileTree(dir: 'libs', include: ['*.jar'])
        testImplementation 'junit:junit:4.13'
    }
```

## Usage

#### Include code in your layout:

```xml
<Button
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:id="$+id:buttonimageutil"
        ohos:below="$id:buttondimen"
        ohos:right_of="$id:button"
        ohos:top_margin="30vp"
        ohos:top_padding="15vp"
        ohos:bottom_padding="15vp"
        ohos:left_padding="38vp"
        ohos:right_padding="38vp"
        ohos:left_margin="20vp"
        ohos:text="Image Utils"
        ohos:text_size="28vp"
        ohos:text_color="#FFF8F4F4"
        ohos:background_element="#FF03CACA"
        />
```

## DimenUtils

includes some unit conversion functions that use getDeviceCapability() or getDefaultDisplay() to find the display density:

1. dpToPx(Float) : Int

2. spToPx(Float) : Int

3. pxToDp(Int) : Float

4. pxToSp(Int) : Float


## Future Work

1. Since there is no class in HarmonyOS similar to ClipDrawable and LayerDrawable, the SeekBarDrawable.java and SeekBarUtils.java are currently not implemented due to platform dependencies.

2. In DimenUtil, since currently StatusBarHeight and NavigationBarHeight cannot be set in android resources as identifiers, getStatusBarHeight and getNavigationBarHeight method are currently not implemented due to platform dependencies.

 