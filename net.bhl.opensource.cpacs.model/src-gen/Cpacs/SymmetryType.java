/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Symmetry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getSymmetryType()
 * @model extendedMetaData="name='symmetry_._type'"
 * @generated
 */
public enum SymmetryType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Inherit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(1, "inherit", "inherit"),

	/**
	 * The '<em><b>XAxis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XAXIS_VALUE
	 * @generated
	 * @ordered
	 */
	XAXIS(2, "xAxis", "x-axis"),

	/**
	 * The '<em><b>YAxis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAXIS_VALUE
	 * @generated
	 * @ordered
	 */
	YAXIS(3, "yAxis", "y-axis");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #INHERIT
	 * @model name="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 1;

	/**
	 * The '<em><b>XAxis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XAXIS
	 * @model name="xAxis" literal="x-axis"
	 * @generated
	 * @ordered
	 */
	public static final int XAXIS_VALUE = 2;

	/**
	 * The '<em><b>YAxis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAXIS
	 * @model name="yAxis" literal="y-axis"
	 * @generated
	 * @ordered
	 */
	public static final int YAXIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SymmetryType[] VALUES_ARRAY = new SymmetryType[] { NONE, INHERIT, XAXIS, YAXIS, };

	/**
	 * A public read-only list of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SymmetryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case INHERIT_VALUE:
			return INHERIT;
		case XAXIS_VALUE:
			return XAXIS;
		case YAXIS_VALUE:
			return YAXIS;
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
	private SymmetryType(int value, String name, String literal) {
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

} //SymmetryType
