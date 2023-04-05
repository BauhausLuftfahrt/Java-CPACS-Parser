/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Side Of First Wheel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getSideOfFirstWheelType()
 * @model extendedMetaData="name='sideOfFirstWheel_._type'"
 * @generated
 */
public enum SideOfFirstWheelType implements Enumerator {
	/**
	 * The '<em><b>Inboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	INBOARD(0, "inboard", "inboard"),

	/**
	 * The '<em><b>Outboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	OUTBOARD(1, "outboard", "outboard"),

	/**
	 * The '<em><b>Centre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRE(2, "centre", "centre");

	/**
	 * The '<em><b>Inboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INBOARD
	 * @model name="inboard"
	 * @generated
	 * @ordered
	 */
	public static final int INBOARD_VALUE = 0;

	/**
	 * The '<em><b>Outboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTBOARD
	 * @model name="outboard"
	 * @generated
	 * @ordered
	 */
	public static final int OUTBOARD_VALUE = 1;

	/**
	 * The '<em><b>Centre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE
	 * @model name="centre"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Side Of First Wheel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SideOfFirstWheelType[] VALUES_ARRAY = new SideOfFirstWheelType[] { INBOARD, OUTBOARD,
			CENTRE, };

	/**
	 * A public read-only list of all the '<em><b>Side Of First Wheel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SideOfFirstWheelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Side Of First Wheel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SideOfFirstWheelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SideOfFirstWheelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Side Of First Wheel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SideOfFirstWheelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SideOfFirstWheelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Side Of First Wheel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SideOfFirstWheelType get(int value) {
		switch (value) {
		case INBOARD_VALUE:
			return INBOARD;
		case OUTBOARD_VALUE:
			return OUTBOARD;
		case CENTRE_VALUE:
			return CENTRE;
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
	private SideOfFirstWheelType(int value, String name, String literal) {
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

} //SideOfFirstWheelType
