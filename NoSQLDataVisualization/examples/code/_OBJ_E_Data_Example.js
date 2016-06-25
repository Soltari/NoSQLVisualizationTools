var DiffMethodsExclusive =
{
	isOfExactType_Entity_1_1: function (obj)
	{
		if (!("HomogeneousTuple" in obj) || !(obj.HomogeneousTuple.constructor === Array) || (!checkAllOf(obj.HomogeneousTuple, "int")))
			return false;
		if (!("type" in obj) || !(typeof obj.type === "string") || (obj.type !== "Entity_1"))
			return false;

		return true;
	}

};

