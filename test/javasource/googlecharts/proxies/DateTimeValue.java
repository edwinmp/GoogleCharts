// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlecharts.proxies;

public class DateTimeValue extends googlecharts.proxies.Cell
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleCharts.DateTimeValue";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		v("v"),
		c("GoogleCharts.c");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DateTimeValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GoogleCharts.DateTimeValue"));
	}

	protected DateTimeValue(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dateTimeValueMendixObject)
	{
		super(context, dateTimeValueMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("GoogleCharts.DateTimeValue", dateTimeValueMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GoogleCharts.DateTimeValue");
	}

	/**
	 * @deprecated Use 'DateTimeValue.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static googlecharts.proxies.DateTimeValue initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googlecharts.proxies.DateTimeValue.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static googlecharts.proxies.DateTimeValue initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googlecharts.proxies.DateTimeValue(context, mendixObject);
	}

	public static googlecharts.proxies.DateTimeValue load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googlecharts.proxies.DateTimeValue.initialize(context, mendixObject);
	}

	/**
	 * @return value of v
	 */
	public final java.util.Date getv()
	{
		return getv(getContext());
	}

	/**
	 * @param context
	 * @return value of v
	 */
	public final java.util.Date getv(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.v.toString());
	}

	/**
	 * Set value of v
	 * @param v
	 */
	public final void setv(java.util.Date v)
	{
		setv(getContext(), v);
	}

	/**
	 * Set value of v
	 * @param context
	 * @param v
	 */
	public final void setv(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date v)
	{
		getMendixObject().setValue(context, MemberNames.v.toString(), v);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final googlecharts.proxies.DateTimeValue that = (googlecharts.proxies.DateTimeValue) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "GoogleCharts.DateTimeValue";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
