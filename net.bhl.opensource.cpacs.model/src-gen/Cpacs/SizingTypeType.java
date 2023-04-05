/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sizing Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getSizingTypeType()
 * @model extendedMetaData="name='sizingType_._type'"
 * @generated
 */
public enum SizingTypeType implements Enumerator {
	/**
	 * The '<em><b>Limit Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LIMIT_LOAD(0, "limitLoad", "limitLoad"),

	/**
	 * The '<em><b>Ultimate Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTIMATE_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	ULTIMATE_LOAD(1, "ultimateLoad", "ultimateLoad");

	/**
	 * The '<em><b>Limit Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_LOAD
	 * @model name="limitLoad"
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_LOAD_VALUE = 0;

	/**
	 * The '<em><b>Ultimate Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTIMATE_LOAD
	 * @model name="ultimateLoad"
	 * @generated
	 * @ordered
	 */
	public static final int ULTIMATE_LOAD_VALUE = 1;

	/**
	 * An array of all the '<em><b>Sizing Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizingTypeType[] VALUES_ARRAY = new SizingTypeType[] { LIMIT_LOAD, ULTIMATE_LOAD, };

	/**
	 * A public read-only list of all the '<em><b>Sizing Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizingTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sizing Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizingTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizingTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sizing Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizingTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizingTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sizing Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizingTypeType get(int value) {
		switch (value) {
		case LIMIT_LOAD_VALUE:
			return LIMIT_LOAD;
		case ULTIMATE_LOAD_VALUE:
			return ULTIMATE_LOAD;
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
	private SizingTypeType(int value, String name, String literal) {
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

} //SizingTypeType
