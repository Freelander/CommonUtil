Android Common Util
===

This is android develop common utils library.

Import
---

Step 1. Add it in your project's build.gradle at the end of repositories:
```

allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

```

Step 2. Add the dependency:
```

dependencies {
    ...
    compile 'com.github.Freelander:CommonUtil:0.1.3'
}

```

ChangeLog
---

* **0.1.3**
    * Add [NetworkUtils](https://github.com/Freelander/CommonUtil/blob/master/library/src/main/java/com/jun/common/util/NetworkUtils.java)(Network status monitoring helper classes)
    * Add [ShareUtil](https://github.com/Freelander/CommonUtil/blob/master/library/src/main/java/com/jun/common/util/ShareUtil.java)(Android system is Share helper classes )
    * Add [SystemUtil](https://github.com/Freelander/CommonUtil/blob/master/library/src/main/java/com/jun/common/util/SystemUtil.java)(Get app info helper classes)
    * Add some common dimens in [dimens.xml](https://github.com/Freelander/CommonUtil/blob/master/library/src/main/res/values/dimens.xml) file
    
License
-------

    Copyright 2016 Freelander

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
 

