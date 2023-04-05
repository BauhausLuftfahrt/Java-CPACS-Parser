/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getStepTypeType()
 * @model extendedMetaData="name='stepType_._type'"
 * @generated
 */
public enum StepTypeType implements Enumerator {
	/**
	 * The '<em><b>Centered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTERED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTERED(0, "centered", "centered"),

	/**
	 * The '<em><b>Full Backboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_BACKBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_BACKBOARD(1, "fullBackboard", "fullBackboard"),

	/**
	 * The '<em><b>Full Starboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_STARBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_STARBOARD(2, "fullStarboard", "fullStarboard");

	/**
	 * The '<em><b>Centered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTERED
	 * @model name="centered"
	 * @generated
	 * @ordered
	 */
	public static final int CENTERED_VALUE = 0;

	/**
	 * The '<em><b>Full Backboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_BACKBOARD
	 * @model name="fullBackboard"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_BACKBOARD_VALUE = 1;

	/**
	 * The '<em><b>Full Starboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_STARBOARD
	 * @model name="fullStarboard"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_STARBOARD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Step Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StepTypeType[] VALUES_ARRAY = new StepTypeType[] { CENTERED, FULL_BACKBOARD, FULL_STARBOARD, };

	/**
	 * A public read-only list of all the '<em><b>Step Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StepTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Step Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType get(int value) {
		switch (value) {
		case CENTERED_VALUE:
			return CENTERED;
		case FULL_BACKBOARD_VALUE:
			return FULL_BACKBOARD;
		case FULL_STARBOARD_VALUE:
			return FULL_STARBOARD;
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
	private StepTypeType(int value, String name, String literal) {
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

} //StepTypeType
