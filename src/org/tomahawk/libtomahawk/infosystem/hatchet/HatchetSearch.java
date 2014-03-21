/* == This file is part of Tomahawk Player - <http://tomahawk-player.org> ===
 *
 *   Copyright 2014, Enno Gottschalk <mrmaffen@googlemail.com>
 *
 *   Tomahawk is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Tomahawk is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Tomahawk. If not, see <http://www.gnu.org/licenses/>.
 */
package org.tomahawk.libtomahawk.infosystem.hatchet;

import java.util.List;

public class HatchetSearch {

    public List<HatchetAlbumInfo> albums;

    public List<HatchetArtistInfo> artists;

    public List<HatchetImage> images;

    public List<HatchetPlaylistInfo> playlists;

    public List<HatchetSearchItem> searchResults;

    public List<HatchetSearches> searches;

    public List<HatchetTrackInfo> tracks;

    public List<HatchetUserInfo> users;

    public HatchetSearch() {
    }
}
