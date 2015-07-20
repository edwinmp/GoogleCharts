// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Parameter
{
	private final IMendixObject parameterMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.Parameter";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Parameter_ValueType("MxModelReflection.Parameter_ValueType"),
		Parameter_MxObjectType("MxModelReflection.Parameter_MxObjectType");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Parameter(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.Parameter"));
	}

	protected Parameter(IContext context, IMendixObject parameterMendixObject)
	{
		if (parameterMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MxModelReflection.Parameter", parameterMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.Parameter");

		this.parameterMendixObject = parameterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Parameter.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.Parameter initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.Parameter.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.Parameter initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.Parameter(context, mendixObject);
	}

	public static mxmodelreflection.proxies.Parameter load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.Parameter.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.Parameter> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.Parameter> result = new java.util.ArrayList<mxmodelreflection.proxies.Parameter>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.Parameter" + xpathConstraint))
			result.add(mxmodelreflection.proxies.Parameter.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Parameter_ValueType
	 */
	public final mxmodelreflection.proxies.ValueType getParameter_ValueType() throws CoreException
	{
		return getParameter_ValueType(getContext());
	}

	/**
	 * @param context
	 * @return value of Parameter_ValueType
	 */
	public final mxmodelreflection.proxies.ValueType getParameter_ValueType(IContext context) throws CoreException
	{
		mxmodelreflection.proxies.ValueType result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parameter_ValueType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.ValueType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Parameter_ValueType
	 * @param parameter_valuetype
	 */
	public final void setParameter_ValueType(mxmodelreflection.proxies.ValueType parameter_valuetype)
	{
		setParameter_ValueType(getContext(), parameter_valuetype);
	}

	/**
	 * Set value of Parameter_ValueType
	 * @param context
	 * @param parameter_valuetype
	 */
	public final void setParameter_ValueType(IContext context, mxmodelreflection.proxies.ValueType parameter_valuetype)
	{
		if (parameter_valuetype == null)
			getMendixObject().setValue(context, MemberNames.Parameter_ValueType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Parameter_ValueType.toString(), parameter_valuetype.getMendixObject().getId());
	}

	/**
	 * @return value of Parameter_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getParameter_MxObjectType() throws CoreException
	{
		return getParameter_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of Parameter_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getParameter_MxObjectType(IContext context) throws CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parameter_MxObjectType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Parameter_MxObjectType
	 * @param parameter_mxobjecttype
	 */
	public final void setParameter_MxObjectType(mxmodelreflection.proxies.MxObjectType parameter_mxobjecttype)
	{
		setParameter_MxObjectType(getContext(), parameter_mxobjecttype);
	}

	/**
	 * Set value of Parameter_MxObjectType
	 * @param context
	 * @param parameter_mxobjecttype
	 */
	public final void setParameter_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType parameter_mxobjecttype)
	{
		if (parameter_mxobjecttype == null)
			getMendixObject().setValue(context, MemberNames.Parameter_MxObjectType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Parameter_MxObjectType.toString(), parameter_mxobjecttype.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return parameterMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.Parameter that = (mxmodelreflection.proxies.Parameter) obj;
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
	public static String getType()
	{
		return "MxModelReflection.Parameter";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}