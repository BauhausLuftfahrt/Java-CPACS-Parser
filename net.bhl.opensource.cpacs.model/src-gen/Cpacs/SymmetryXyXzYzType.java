/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Symmetry Xy Xz Yz Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getSymmetryXyXzYzType()
 * @model extendedMetaData="name='symmetryXyXzYzType'"
 * @generated
 */
public enum SymmetryXyXzYzType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry inheritance from parent element disabled
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Inherit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry inherited from parent element (default behavior, i.e. also applies if attribute not set)
	 * <!-- end-model-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(1, "inherit", "inherit"),

	/**
	 * The '<em><b>XY Plane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the x-y plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #XY_PLANE_VALUE
	 * @generated
	 * @ordered
	 */
	XY_PLANE(2, "xYPlane", "x-y-plane"),

	/**
	 * The '<em><b>XZ Plane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the x-z plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #XZ_PLANE_VALUE
	 * @generated
	 * @ordered
	 */
	XZ_PLANE(3, "xZPlane", "x-z-plane"),

	/**
	 * The '<em><b>YZ Plane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the y-z plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #YZ_PLANE_VALUE
	 * @generated
	 * @ordered
	 */
	YZ_PLANE(4, "yZPlane", "y-z-plane");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry inheritance from parent element disabled
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Inherit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry inherited from parent element (default behavior, i.e. also applies if attribute not set)
	 * <!-- end-model-doc -->
	 * @see #INHERIT
	 * @model name="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 1;

	/**
	 * The '<em><b>XY Plane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the x-y plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #XY_PLANE
	 * @model name="xYPlane" literal="x-y-plane"
	 * @generated
	 * @ordered
	 */
	public static final int XY_PLANE_VALUE = 2;

	/**
	 * The '<em><b>XZ Plane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the x-z plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #XZ_PLANE
	 * @model name="xZPlane" literal="x-z-plane"
	 * @generated
	 * @ordered
	 */
	public static final int XZ_PLANE_VALUE = 3;

	/**
	 * The '<em><b>YZ Plane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symmetry w.r.t. the y-z plane of the CPACS coordinate system
	 * <!-- end-model-doc -->
	 * @see #YZ_PLANE
	 * @model name="yZPlane" literal="y-z-plane"
	 * @generated
	 * @ordered
	 */
	public static final int YZ_PLANE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Symmetry Xy Xz Yz Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SymmetryXyXzYzType[] VALUES_ARRAY = new SymmetryXyXzYzType[] { NONE, INHERIT, XY_PLANE,
			XZ_PLANE, YZ_PLANE, };

	/**
	 * A public read-only list of all the '<em><b>Symmetry Xy Xz Yz Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SymmetryXyXzYzType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Symmetry Xy Xz Yz Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryXyXzYzType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryXyXzYzType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Xy Xz Yz Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryXyXzYzType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryXyXzYzType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Xy Xz Yz Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryXyXzYzType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case INHERIT_VALUE:
			return INHERIT;
		case XY_PLANE_VALUE:
			return XY_PLANE;
		case XZ_PLANE_VALUE:
			return XZ_PLANE;
		case YZ_PLANE_VALUE:
			return YZ_PLANE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SymmetryXyXzYzType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SymmetryXyXzYzType
