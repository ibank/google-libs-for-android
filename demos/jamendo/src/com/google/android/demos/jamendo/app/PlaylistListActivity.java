/*-
 * Copyright (C) 2009 Google Inc.
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

package com.google.android.demos.jamendo.app;

import com.google.android.demos.jamendo.R;
import com.google.android.demos.jamendo.provider.JamendoContract.Playlists;
import com.google.android.demos.jamendo.provider.JamendoContract.Users;

public class PlaylistListActivity extends JamendoListActivity {

    @Override
    protected String[] getProjection() {
        return new String[] {
                Playlists._ID, Users.IMAGE, Playlists.NAME, Users.NAME
        };
    }

    @Override
    protected int getLayout() {
        return R.layout.jamendo_list_item_2;
    }

    @Override
    protected String[] getFrom() {
        return new String[] {
                Users.IMAGE, Playlists.NAME, Users.NAME
        };
    }

    @Override
    protected int[] getTo() {
        return new int[] {
                R.id.icon, R.id.text1, R.id.text2
        };
    }
}
