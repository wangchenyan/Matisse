/*
 * Copyright 2017 Zhihu Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhihu.matisse.internal.entity;

/**
 * 仅支持保存在私有目录
 */
public class CaptureStrategy {
    public final boolean isCache;
    public final String directory;

    /**
     * @param isCache   是否保存在私有目录的缓存中
     * @param directory 子路径
     */
    public CaptureStrategy(boolean isCache, String directory) {
        this.isCache = isCache;
        this.directory = directory;
    }
}
