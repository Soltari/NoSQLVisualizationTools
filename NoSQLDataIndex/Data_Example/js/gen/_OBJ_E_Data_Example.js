var DiffMethodsExclusive =
{
	isOfExactType_Entity_1_1: function (obj)
	{
		if (!("Field_1" in obj) || !(typeof obj.Field_1 === "string"))
			return false;
		if (!("hasReference" in obj) || (typeof obj.hasReference === "string" && false)
				|| (obj.hasReference.constructor === Array && (0 > obj.hasReference.size || !checkAllOf(obj.hasReference, "string"))
				|| (typeof obj.hasReference !== "string" && obj.hasReference.constructor !== Array)))
			return false;
		if (!("type" in obj) || !(typeof obj.type === "string") || (obj.type !== "Entity_1"))
			return false;
		if ("Field_2" in obj && !(!(typeof obj.Field_2 === "string")))
			return false;

		return true;
	},

	isOfExactType_Entity_1_2: function (obj)
	{
		if (!("Field_1" in obj) || !(typeof obj.Field_1 === "string"))
			return false;
		if (!("Field_2" in obj) || !(typeof obj.Field_2 === "string"))
			return false;
		if (!("hasReference" in obj) || (typeof obj.hasReference === "string" && false)
				|| (obj.hasReference.constructor === Array && (0 > obj.hasReference.size || !checkAllOf(obj.hasReference, "string"))
				|| (typeof obj.hasReference !== "string" && obj.hasReference.constructor !== Array)))
			return false;
		if (!("type" in obj) || !(typeof obj.type === "string") || (obj.type !== "Entity_1"))
			return false;

		return true;
	},

	isOfExactType_Entity_1_3: function (obj)
	{
		if (!("Field_2" in obj) || !(typeof obj.Field_2 === "string"))
			return false;
		if (!("type" in obj) || !(typeof obj.type === "string") || (obj.type !== "Entity_1"))
			return false;
		if ("Field_1" in obj && !(!(typeof obj.Field_1 === "string")))
			return false;
		if ("hasReference" in obj && !((typeof obj.hasReference === "string" && false)
				|| (obj.hasReference.constructor === Array && (0 > obj.hasReference.size || !checkAllOf(obj.hasReference, "string"))
				|| (typeof obj.hasReference !== "string" && obj.hasReference.constructor !== Array))))
			return false;

		return true;
	}

};

