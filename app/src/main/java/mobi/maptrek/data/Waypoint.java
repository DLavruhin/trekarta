/*
 * MapTrek
 * Copyright (C) 2015  Andrey Novikov <http://andreynovikov.info/>
 *
 * This file is part of MapTrek application.
 *
 * MapTrek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * MapTrek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with MapTrek.  If not, see <http://www.gnu.org/licenses/>.
 */

package mobi.maptrek.data;

import java.util.Date;

//TODO Refactor
public class Waypoint extends MapObject
{
	public Date date;

	public Waypoint()
	{
		super();
	}

	public Waypoint(double latitude, double longitude)
	{
		super(latitude, longitude);
	}

	public Waypoint(String name, String description, double lat, double lon)
	{
		super(lat, lon);
		this.name = name;
		this.description = description;
	}
}