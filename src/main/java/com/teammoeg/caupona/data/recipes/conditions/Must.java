/*
 * Copyright (c) 2022 TeamMoeg
 *
 * This file is part of Caupona.
 *
 * Caupona is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * Caupona is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Caupona. If not, see <https://www.gnu.org/licenses/>.
 */

package com.teammoeg.caupona.data.recipes.conditions;

import com.google.gson.JsonObject;
import com.teammoeg.caupona.data.TranslationProvider;
import com.teammoeg.caupona.data.recipes.CookIngredients;
import com.teammoeg.caupona.data.recipes.IPendingContext;

import net.minecraft.network.FriendlyByteBuf;

public class Must extends NumberedStewCondition {

	public Must(JsonObject obj) {
		super(obj);
	}

	public Must(CookIngredients number) {
		super(number);
	}

	@Override
	public boolean test(IPendingContext t, float n) {
		return n > 0;
	}

	@Override
	public JsonObject serialize() {
		JsonObject jo = super.serialize();
		return jo;
	}

	public Must(FriendlyByteBuf buffer) {
		super(buffer);
	}

	@Override
	public String getType() {
		return "contains";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Must))
			return false;
		if (!super.equals(obj))
			return false;
		return true;
	}

	@Override
	public String getTranslation(TranslationProvider p) {
		return p.getTranslation("recipe.caupona.cond.any", number.getTranslation(p));
	}
}
