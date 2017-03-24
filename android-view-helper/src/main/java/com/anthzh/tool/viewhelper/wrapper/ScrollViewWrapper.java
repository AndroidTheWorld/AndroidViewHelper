/*
* Copyright (C) 2017 anthzh89@gmail.com
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
package com.anthzh.tool.viewhelper.wrapper;

import android.widget.ScrollView;

@SuppressWarnings("unchecked")
public class ScrollViewWrapper<W extends ScrollViewWrapper<W>> extends FrameLayoutWrapper<W> {
    protected ScrollView mView;

    public ScrollViewWrapper(ScrollView view) {
        super(view);
        mView = view;
    }

    /**
    * @see ScrollView#setSmoothScrollingEnabled(boolean)
    */
     public W setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
         mView.setSmoothScrollingEnabled(smoothScrollingEnabled);
         return (W) this;
     }

    /**
    * @see ScrollView#smoothScrollBy(int, int)
    */
     public  W smoothScrollBy(int dx, int dy) {
         mView.smoothScrollBy(dx, dy);
         return (W) this;
     }

    /**
    * @see ScrollView#setFillViewport(boolean)
    */
     public W setFillViewport(boolean fillViewport) {
         mView.setFillViewport(fillViewport);
         return (W) this;
     }

    /**
    * @see ScrollView#smoothScrollTo(int, int)
    */
     public  W smoothScrollTo(int x, int y) {
         mView.smoothScrollTo(x, y);
         return (W) this;
     }

    /**
    * @see ScrollView#fling(int)
    */
     public W fling(int velocityY) {
         mView.fling(velocityY);
         return (W) this;
     }

}