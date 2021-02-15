/**
 */
package Cpacs.util;

import Cpacs.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage
 * @generated
 */
public class CpacsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CpacsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsSwitch() {
		if (modelPackage == null) {
			modelPackage = CpacsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE: {
			ActuatorAttachmentType actuatorAttachmentType = (ActuatorAttachmentType) theEObject;
			T result = caseActuatorAttachmentType(actuatorAttachmentType);
			if (result == null)
				result = caseComplexBaseType(actuatorAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ACTUATOR_CONTROL_SURFACE_ATTACHMENT_TYPE: {
			ActuatorControlSurfaceAttachmentType actuatorControlSurfaceAttachmentType = (ActuatorControlSurfaceAttachmentType) theEObject;
			T result = caseActuatorControlSurfaceAttachmentType(actuatorControlSurfaceAttachmentType);
			if (result == null)
				result = caseComplexBaseType(actuatorControlSurfaceAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE: {
			ActuatorFuselageWingAttachmentType actuatorFuselageWingAttachmentType = (ActuatorFuselageWingAttachmentType) theEObject;
			T result = caseActuatorFuselageWingAttachmentType(actuatorFuselageWingAttachmentType);
			if (result == null)
				result = caseComplexBaseType(actuatorFuselageWingAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE: {
			ActuatorFuselageWingType actuatorFuselageWingType = (ActuatorFuselageWingType) theEObject;
			T result = caseActuatorFuselageWingType(actuatorFuselageWingType);
			if (result == null)
				result = caseComplexBaseType(actuatorFuselageWingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE: {
			ActuatorParentAttachmentType actuatorParentAttachmentType = (ActuatorParentAttachmentType) theEObject;
			T result = caseActuatorParentAttachmentType(actuatorParentAttachmentType);
			if (result == null)
				result = caseComplexBaseType(actuatorParentAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE: {
			ActuatorsFuselageWingType actuatorsFuselageWingType = (ActuatorsFuselageWingType) theEObject;
			T result = caseActuatorsFuselageWingType(actuatorsFuselageWingType);
			if (result == null)
				result = caseComplexBaseType(actuatorsFuselageWingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ADDITIONAL_PARAMETERS_TYPE: {
			AdditionalParametersType additionalParametersType = (AdditionalParametersType) theEObject;
			T result = caseAdditionalParametersType(additionalParametersType);
			if (result == null)
				result = caseComplexBaseType(additionalParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ADDITIONAL_PARAMETER_TYPE: {
			AdditionalParameterType additionalParameterType = (AdditionalParameterType) theEObject;
			T result = caseAdditionalParameterType(additionalParameterType);
			if (result == null)
				result = caseComplexBaseType(additionalParameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE: {
			AeroDataSetForLoadsType aeroDataSetForLoadsType = (AeroDataSetForLoadsType) theEObject;
			T result = caseAeroDataSetForLoadsType(aeroDataSetForLoadsType);
			if (result == null)
				result = caseComplexBaseType(aeroDataSetForLoadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE: {
			AeroDataSetsForLoadsType aeroDataSetsForLoadsType = (AeroDataSetsForLoadsType) theEObject;
			T result = caseAeroDataSetsForLoadsType(aeroDataSetsForLoadsType);
			if (result == null)
				result = caseComplexBaseType(aeroDataSetsForLoadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE: {
			AeroelasticDivergenceType aeroelasticDivergenceType = (AeroelasticDivergenceType) theEObject;
			T result = caseAeroelasticDivergenceType(aeroelasticDivergenceType);
			if (result == null)
				result = caseComplexBaseType(aeroelasticDivergenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE: {
			AeroelasticStaticMaxDisplacementType aeroelasticStaticMaxDisplacementType = (AeroelasticStaticMaxDisplacementType) theEObject;
			T result = caseAeroelasticStaticMaxDisplacementType(aeroelasticStaticMaxDisplacementType);
			if (result == null)
				result = caseComplexBaseType(aeroelasticStaticMaxDisplacementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AEROELASTICS_TYPE: {
			AeroelasticsType aeroelasticsType = (AeroelasticsType) theEObject;
			T result = caseAeroelasticsType(aeroelasticsType);
			if (result == null)
				result = caseComplexBaseType(aeroelasticsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAPS_TYPE: {
			AeroLimitsIncrementMapsType aeroLimitsIncrementMapsType = (AeroLimitsIncrementMapsType) theEObject;
			T result = caseAeroLimitsIncrementMapsType(aeroLimitsIncrementMapsType);
			if (result == null)
				result = caseComplexBaseType(aeroLimitsIncrementMapsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_LIMITS_MAP_TYPE: {
			AeroLimitsMapType aeroLimitsMapType = (AeroLimitsMapType) theEObject;
			T result = caseAeroLimitsMapType(aeroLimitsMapType);
			if (result == null)
				result = caseComplexBaseType(aeroLimitsMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE: {
			AeroMapOperationLimitType aeroMapOperationLimitType = (AeroMapOperationLimitType) theEObject;
			T result = caseAeroMapOperationLimitType(aeroMapOperationLimitType);
			if (result == null)
				result = caseComplexBaseType(aeroMapOperationLimitType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_MAP_TYPE: {
			AeroMapType aeroMapType = (AeroMapType) theEObject;
			T result = caseAeroMapType(aeroMapType);
			if (result == null)
				result = caseComplexBaseType(aeroMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE: {
			AeroPerformanceBoundaryConditionsType aeroPerformanceBoundaryConditionsType = (AeroPerformanceBoundaryConditionsType) theEObject;
			T result = caseAeroPerformanceBoundaryConditionsType(aeroPerformanceBoundaryConditionsType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceBoundaryConditionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENTS_TYPE: {
			AeroPerformanceControlElementsType aeroPerformanceControlElementsType = (AeroPerformanceControlElementsType) theEObject;
			T result = caseAeroPerformanceControlElementsType(aeroPerformanceControlElementsType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceControlElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE: {
			AeroPerformanceControlElementType aeroPerformanceControlElementType = (AeroPerformanceControlElementType) theEObject;
			T result = caseAeroPerformanceControlElementType(aeroPerformanceControlElementType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceControlElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE: {
			AeroPerformanceIncrementMapsType aeroPerformanceIncrementMapsType = (AeroPerformanceIncrementMapsType) theEObject;
			T result = caseAeroPerformanceIncrementMapsType(aeroPerformanceIncrementMapsType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceIncrementMapsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE: {
			AeroPerformanceIncrementMapType aeroPerformanceIncrementMapType = (AeroPerformanceIncrementMapType) theEObject;
			T result = caseAeroPerformanceIncrementMapType(aeroPerformanceIncrementMapType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceIncrementMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE: {
			AeroPerformanceMapRCType aeroPerformanceMapRCType = (AeroPerformanceMapRCType) theEObject;
			T result = caseAeroPerformanceMapRCType(aeroPerformanceMapRCType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceMapRCType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE: {
			AeroPerformanceMapsRCType aeroPerformanceMapsRCType = (AeroPerformanceMapsRCType) theEObject;
			T result = caseAeroPerformanceMapsRCType(aeroPerformanceMapsRCType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceMapsRCType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE: {
			AeroPerformanceMapType aeroPerformanceMapType = (AeroPerformanceMapType) theEObject;
			T result = caseAeroPerformanceMapType(aeroPerformanceMapType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE: {
			AeroPerformanceRCType aeroPerformanceRCType = (AeroPerformanceRCType) theEObject;
			T result = caseAeroPerformanceRCType(aeroPerformanceRCType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceRCType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AERO_PERFORMANCE_TYPE: {
			AeroPerformanceType aeroPerformanceType = (AeroPerformanceType) theEObject;
			T result = caseAeroPerformanceType(aeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(aeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE: {
			AircraftAnalysesType aircraftAnalysesType = (AircraftAnalysesType) theEObject;
			T result = caseAircraftAnalysesType(aircraftAnalysesType);
			if (result == null)
				result = caseComplexBaseType(aircraftAnalysesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE: {
			AircraftGlobalType aircraftGlobalType = (AircraftGlobalType) theEObject;
			T result = caseAircraftGlobalType(aircraftGlobalType);
			if (result == null)
				result = caseComplexBaseType(aircraftGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRCRAFT_MODEL_TYPE: {
			AircraftModelType aircraftModelType = (AircraftModelType) theEObject;
			T result = caseAircraftModelType(aircraftModelType);
			if (result == null)
				result = caseComplexBaseType(aircraftModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRCRAFT_TYPE: {
			AircraftType aircraftType = (AircraftType) theEObject;
			T result = caseAircraftType(aircraftType);
			if (result == null)
				result = caseComplexBaseType(aircraftType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE: {
			AirfoilAeroPerformanceType airfoilAeroPerformanceType = (AirfoilAeroPerformanceType) theEObject;
			T result = caseAirfoilAeroPerformanceType(airfoilAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(airfoilAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE: {
			AirfoilsAeroPerformanceType airfoilsAeroPerformanceType = (AirfoilsAeroPerformanceType) theEObject;
			T result = caseAirfoilsAeroPerformanceType(airfoilsAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(airfoilsAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRFRAME_MAINTENANCE_COST_TYPE: {
			AirframeMaintenanceCostType airframeMaintenanceCostType = (AirframeMaintenanceCostType) theEObject;
			T result = caseAirframeMaintenanceCostType(airframeMaintenanceCostType);
			if (result == null)
				result = caseComplexBaseType(airframeMaintenanceCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRLINES_TYPE: {
			AirlinesType airlinesType = (AirlinesType) theEObject;
			T result = caseAirlinesType(airlinesType);
			if (result == null)
				result = caseComplexBaseType(airlinesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRLINE_TYPE: {
			AirlineType airlineType = (AirlineType) theEObject;
			T result = caseAirlineType(airlineType);
			if (result == null)
				result = caseComplexBaseType(airlineType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE: {
			AirportCompatabilityGlobalType airportCompatabilityGlobalType = (AirportCompatabilityGlobalType) theEObject;
			T result = caseAirportCompatabilityGlobalType(airportCompatabilityGlobalType);
			if (result == null)
				result = caseComplexBaseType(airportCompatabilityGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRPORTS_TYPE: {
			AirportsType airportsType = (AirportsType) theEObject;
			T result = caseAirportsType(airportsType);
			if (result == null)
				result = caseComplexBaseType(airportsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AIRPORT_TYPE: {
			AirportType airportType = (AirportType) theEObject;
			T result = caseAirportType(airportType);
			if (result == null)
				result = caseComplexBaseType(airportType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ALIGNMENT_CROSS_BEAM_TYPE: {
			AlignmentCrossBeamType alignmentCrossBeamType = (AlignmentCrossBeamType) theEObject;
			T result = caseAlignmentCrossBeamType(alignmentCrossBeamType);
			if (result == null)
				result = caseComplexBaseType(alignmentCrossBeamType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE: {
			AlignmentFloorPanelType alignmentFloorPanelType = (AlignmentFloorPanelType) theEObject;
			T result = caseAlignmentFloorPanelType(alignmentFloorPanelType);
			if (result == null)
				result = caseComplexBaseType(alignmentFloorPanelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ALIGNMENT_STRING_FRAME_TYPE: {
			AlignmentStringFrameType alignmentStringFrameType = (AlignmentStringFrameType) theEObject;
			T result = caseAlignmentStringFrameType(alignmentStringFrameType);
			if (result == null)
				result = caseComplexBaseType(alignmentStringFrameType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE: {
			AlignmentStructMemberType alignmentStructMemberType = (AlignmentStructMemberType) theEObject;
			T result = caseAlignmentStructMemberType(alignmentStructMemberType);
			if (result == null)
				result = caseComplexBaseType(alignmentStructMemberType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ANGLE_ACCELERATION_TYPE: {
			AngleAccelerationType angleAccelerationType = (AngleAccelerationType) theEObject;
			T result = caseAngleAccelerationType(angleAccelerationType);
			if (result == null)
				result = caseComplexBaseType(angleAccelerationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE: {
			AngleDisplacementType angleDisplacementType = (AngleDisplacementType) theEObject;
			T result = caseAngleDisplacementType(angleDisplacementType);
			if (result == null)
				result = caseComplexBaseType(angleDisplacementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE: {
			AnisotropicShellPropertiesType anisotropicShellPropertiesType = (AnisotropicShellPropertiesType) theEObject;
			T result = caseAnisotropicShellPropertiesType(anisotropicShellPropertiesType);
			if (result == null)
				result = caseComplexBaseType(anisotropicShellPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE: {
			AnisotropicSolidPropertiesType anisotropicSolidPropertiesType = (AnisotropicSolidPropertiesType) theEObject;
			T result = caseAnisotropicSolidPropertiesType(anisotropicSolidPropertiesType);
			if (result == null)
				result = caseComplexBaseType(anisotropicSolidPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE: {
			AtmosphericConditionsType atmosphericConditionsType = (AtmosphericConditionsType) theEObject;
			T result = caseAtmosphericConditionsType(atmosphericConditionsType);
			if (result == null)
				result = caseComplexBaseType(atmosphericConditionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE: {
			AtmosphericModelOldType atmosphericModelOldType = (AtmosphericModelOldType) theEObject;
			T result = caseAtmosphericModelOldType(atmosphericModelOldType);
			if (result == null)
				result = caseComplexBaseType(atmosphericModelOldType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE: {
			AtmosphericModelType atmosphericModelType = (AtmosphericModelType) theEObject;
			T result = caseAtmosphericModelType(atmosphericModelType);
			if (result == null)
				result = caseStringBaseType(atmosphericModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE1: {
			AtmosphericModelType1 atmosphericModelType1 = (AtmosphericModelType1) theEObject;
			T result = caseAtmosphericModelType1(atmosphericModelType1);
			if (result == null)
				result = caseStringBaseType(atmosphericModelType1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATTACHMENT_PINS_TYPE: {
			AttachmentPinsType attachmentPinsType = (AttachmentPinsType) theEObject;
			T result = caseAttachmentPinsType(attachmentPinsType);
			if (result == null)
				result = caseComplexBaseType(attachmentPinsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATTACHMENT_PIN_TYPE: {
			AttachmentPinType attachmentPinType = (AttachmentPinType) theEObject;
			T result = caseAttachmentPinType(attachmentPinType);
			if (result == null)
				result = caseComplexBaseType(attachmentPinType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE: {
			AttitudeAndMotionType attitudeAndMotionType = (AttitudeAndMotionType) theEObject;
			T result = caseAttitudeAndMotionType(attitudeAndMotionType);
			if (result == null)
				result = caseComplexBaseType(attitudeAndMotionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AXLES_TYPE: {
			AxlesType axlesType = (AxlesType) theEObject;
			T result = caseAxlesType(axlesType);
			if (result == null)
				result = caseComplexBaseType(axlesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.AXLE_TYPE: {
			AxleType axleType = (AxleType) theEObject;
			T result = caseAxleType(axleType);
			if (result == null)
				result = caseComplexBaseType(axleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE: {
			BeamCrossSectionType beamCrossSectionType = (BeamCrossSectionType) theEObject;
			T result = caseBeamCrossSectionType(beamCrossSectionType);
			if (result == null)
				result = caseComplexBaseType(beamCrossSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BEAM_STIFFNESS_TYPE: {
			BeamStiffnessType beamStiffnessType = (BeamStiffnessType) theEObject;
			T result = caseBeamStiffnessType(beamStiffnessType);
			if (result == null)
				result = caseComplexBaseType(beamStiffnessType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BLOCKED_DOF_TYPE: {
			BlockedDOFType blockedDOFType = (BlockedDOFType) theEObject;
			T result = caseBlockedDOFType(blockedDOFType);
			if (result == null)
				result = caseComplexBaseType(blockedDOFType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BOGIE_AXLES_TYPE: {
			BogieAxlesType bogieAxlesType = (BogieAxlesType) theEObject;
			T result = caseBogieAxlesType(bogieAxlesType);
			if (result == null)
				result = caseComplexBaseType(bogieAxlesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BOGIE_AXLE_TYPE: {
			BogieAxleType bogieAxleType = (BogieAxleType) theEObject;
			T result = caseBogieAxleType(bogieAxleType);
			if (result == null)
				result = caseComplexBaseType(bogieAxleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BOGIE_TYPE: {
			BogieType bogieType = (BogieType) theEObject;
			T result = caseBogieType(bogieType);
			if (result == null)
				result = caseStrutType(bogieType);
			if (result == null)
				result = caseComplexBaseType(bogieType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BOOLEAN_BASE_TYPE: {
			BooleanBaseType booleanBaseType = (BooleanBaseType) theEObject;
			T result = caseBooleanBaseType(booleanBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE: {
			BoundingElementUIDsType boundingElementUIDsType = (BoundingElementUIDsType) theEObject;
			T result = caseBoundingElementUIDsType(boundingElementUIDsType);
			if (result == null)
				result = caseComplexBaseType(boundingElementUIDsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CAB_GEOMETRY_TYPE: {
			CabGeometryType cabGeometryType = (CabGeometryType) theEObject;
			T result = caseCabGeometryType(cabGeometryType);
			if (result == null)
				result = caseComplexBaseType(cabGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_AISLES_TYPE: {
			CabinAislesType cabinAislesType = (CabinAislesType) theEObject;
			T result = caseCabinAislesType(cabinAislesType);
			if (result == null)
				result = caseComplexBaseType(cabinAislesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_AISLE_TYPE: {
			CabinAisleType cabinAisleType = (CabinAisleType) theEObject;
			T result = caseCabinAisleType(cabinAisleType);
			if (result == null)
				result = caseComplexBaseType(cabinAisleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_DOORS_TYPE: {
			CabinDoorsType cabinDoorsType = (CabinDoorsType) theEObject;
			T result = caseCabinDoorsType(cabinDoorsType);
			if (result == null)
				result = caseComplexBaseType(cabinDoorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_DOOR_TYPE: {
			CabinDoorType cabinDoorType = (CabinDoorType) theEObject;
			T result = caseCabinDoorType(cabinDoorType);
			if (result == null)
				result = caseComplexBaseType(cabinDoorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE: {
			CabinFloorElementsType cabinFloorElementsType = (CabinFloorElementsType) theEObject;
			T result = caseCabinFloorElementsType(cabinFloorElementsType);
			if (result == null)
				result = caseComplexBaseType(cabinFloorElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE: {
			CabinFloorElementType cabinFloorElementType = (CabinFloorElementType) theEObject;
			T result = caseCabinFloorElementType(cabinFloorElementType);
			if (result == null)
				result = caseComplexBaseType(cabinFloorElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE: {
			CabinSeatElementsType cabinSeatElementsType = (CabinSeatElementsType) theEObject;
			T result = caseCabinSeatElementsType(cabinSeatElementsType);
			if (result == null)
				result = caseComplexBaseType(cabinSeatElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE: {
			CabinSeatElementType cabinSeatElementType = (CabinSeatElementType) theEObject;
			T result = caseCabinSeatElementType(cabinSeatElementType);
			if (result == null)
				result = caseComplexBaseType(cabinSeatElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_SPACES_TYPE: {
			CabinSpacesType cabinSpacesType = (CabinSpacesType) theEObject;
			T result = caseCabinSpacesType(cabinSpacesType);
			if (result == null)
				result = caseComplexBaseType(cabinSpacesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CABIN_SPACE_TYPE: {
			CabinSpaceType cabinSpaceType = (CabinSpaceType) theEObject;
			T result = caseCabinSpaceType(cabinSpaceType);
			if (result == null)
				result = caseComplexBaseType(cabinSpaceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CAP_TYPE: {
			CapType capType = (CapType) theEObject;
			T result = caseCapType(capType);
			if (result == null)
				result = caseComplexBaseType(capType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE: {
			CargoCrossBeamsAssemblyType cargoCrossBeamsAssemblyType = (CargoCrossBeamsAssemblyType) theEObject;
			T result = caseCargoCrossBeamsAssemblyType(cargoCrossBeamsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(cargoCrossBeamsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE: {
			CargoCrossBeamStrutsAssemblyType cargoCrossBeamStrutsAssemblyType = (CargoCrossBeamStrutsAssemblyType) theEObject;
			T result = caseCargoCrossBeamStrutsAssemblyType(cargoCrossBeamStrutsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(cargoCrossBeamStrutsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE: {
			CargoDoorsAssemblyType cargoDoorsAssemblyType = (CargoDoorsAssemblyType) theEObject;
			T result = caseCargoDoorsAssemblyType(cargoDoorsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(cargoDoorsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE: {
			CellPositioningChordwiseType cellPositioningChordwiseType = (CellPositioningChordwiseType) theEObject;
			T result = caseCellPositioningChordwiseType(cellPositioningChordwiseType);
			if (result == null)
				result = caseComplexBaseType(cellPositioningChordwiseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE: {
			CellPositioningSpanwiseType cellPositioningSpanwiseType = (CellPositioningSpanwiseType) theEObject;
			T result = caseCellPositioningSpanwiseType(cellPositioningSpanwiseType);
			if (result == null)
				result = caseComplexBaseType(cellPositioningSpanwiseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE: {
			CenterFuselageAreasAssemblyType centerFuselageAreasAssemblyType = (CenterFuselageAreasAssemblyType) theEObject;
			T result = caseCenterFuselageAreasAssemblyType(centerFuselageAreasAssemblyType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageAreasAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE: {
			CenterFuselageAreaType centerFuselageAreaType = (CenterFuselageAreaType) theEObject;
			T result = caseCenterFuselageAreaType(centerFuselageAreaType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageAreaType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE: {
			CenterFuselageHighWingConfigurationType centerFuselageHighWingConfigurationType = (CenterFuselageHighWingConfigurationType) theEObject;
			T result = caseCenterFuselageHighWingConfigurationType(centerFuselageHighWingConfigurationType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageHighWingConfigurationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE: {
			CenterFuselageKeelbeamType centerFuselageKeelbeamType = (CenterFuselageKeelbeamType) theEObject;
			T result = caseCenterFuselageKeelbeamType(centerFuselageKeelbeamType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageKeelbeamType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE: {
			CenterFuselageLateralPanelsType centerFuselageLateralPanelsType = (CenterFuselageLateralPanelsType) theEObject;
			T result = caseCenterFuselageLateralPanelsType(centerFuselageLateralPanelsType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageLateralPanelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION_TYPE: {
			CenterFuselageLongFloorBeamsConnectionType centerFuselageLongFloorBeamsConnectionType = (CenterFuselageLongFloorBeamsConnectionType) theEObject;
			T result = caseCenterFuselageLongFloorBeamsConnectionType(centerFuselageLongFloorBeamsConnectionType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageLongFloorBeamsConnectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE: {
			CenterFuselageLowWingConfigurationType centerFuselageLowWingConfigurationType = (CenterFuselageLowWingConfigurationType) theEObject;
			T result = caseCenterFuselageLowWingConfigurationType(centerFuselageLowWingConfigurationType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageLowWingConfigurationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE: {
			CenterFuselageMainFramesType centerFuselageMainFramesType = (CenterFuselageMainFramesType) theEObject;
			T result = caseCenterFuselageMainFramesType(centerFuselageMainFramesType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageMainFramesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE: {
			CenterFuselagePressureFloorType centerFuselagePressureFloorType = (CenterFuselagePressureFloorType) theEObject;
			T result = caseCenterFuselagePressureFloorType(centerFuselagePressureFloorType);
			if (result == null)
				result = caseComplexBaseType(centerFuselagePressureFloorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE: {
			CenterFuselageSideboxType centerFuselageSideboxType = (CenterFuselageSideboxType) theEObject;
			T result = caseCenterFuselageSideboxType(centerFuselageSideboxType);
			if (result == null)
				result = caseComplexBaseType(centerFuselageSideboxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CERTIFICATION_CASES_TYPE: {
			CertificationCasesType certificationCasesType = (CertificationCasesType) theEObject;
			T result = caseCertificationCasesType(certificationCasesType);
			if (result == null)
				result = caseComplexBaseType(certificationCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CHARGES_COST_TYPE: {
			ChargesCostType chargesCostType = (ChargesCostType) theEObject;
			T result = caseChargesCostType(chargesCostType);
			if (result == null)
				result = caseComplexBaseType(chargesCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COCKPIT_CONTROLS_TYPE: {
			CockpitControlsType cockpitControlsType = (CockpitControlsType) theEObject;
			T result = caseCockpitControlsType(cockpitControlsType);
			if (result == null)
				result = caseComplexBaseType(cockpitControlsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COCKPIT_CONTROL_TYPE: {
			CockpitControlType cockpitControlType = (CockpitControlType) theEObject;
			T result = caseCockpitControlType(cockpitControlType);
			if (result == null)
				result = caseComplexBaseType(cockpitControlType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COEFFICIENTS_TYPE: {
			CoefficientsType coefficientsType = (CoefficientsType) theEObject;
			T result = caseCoefficientsType(coefficientsType);
			if (result == null)
				result = caseComplexBaseType(coefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE: {
			CommandCaseCommandType commandCaseCommandType = (CommandCaseCommandType) theEObject;
			T result = caseCommandCaseCommandType(commandCaseCommandType);
			if (result == null)
				result = caseComplexBaseType(commandCaseCommandType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMMAND_CASES_TYPE: {
			CommandCasesType commandCasesType = (CommandCasesType) theEObject;
			T result = caseCommandCasesType(commandCasesType);
			if (result == null)
				result = caseComplexBaseType(commandCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMMAND_CASE_TYPE: {
			CommandCaseType commandCaseType = (CommandCaseType) theEObject;
			T result = caseCommandCaseType(commandCaseType);
			if (result == null)
				result = caseComplexBaseType(commandCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE: {
			CompartmentGeometryType compartmentGeometryType = (CompartmentGeometryType) theEObject;
			T result = caseCompartmentGeometryType(compartmentGeometryType);
			if (result == null)
				result = caseComplexBaseType(compartmentGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPARTMENTS_TYPE: {
			CompartmentsType compartmentsType = (CompartmentsType) theEObject;
			T result = caseCompartmentsType(compartmentsType);
			if (result == null)
				result = caseComplexBaseType(compartmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPARTMENT_TYPE: {
			CompartmentType compartmentType = (CompartmentType) theEObject;
			T result = caseCompartmentType(compartmentType);
			if (result == null)
				result = caseComplexBaseType(compartmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPLEX_BASE_TYPE: {
			ComplexBaseType complexBaseType = (ComplexBaseType) theEObject;
			T result = caseComplexBaseType(complexBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_COST_TYPE: {
			ComponentCostType componentCostType = (ComponentCostType) theEObject;
			T result = caseComponentCostType(componentCostType);
			if (result == null)
				result = caseComplexBaseType(componentCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE: {
			ComponentCutLoadsEnvelopeType componentCutLoadsEnvelopeType = (ComponentCutLoadsEnvelopeType) theEObject;
			T result = caseComponentCutLoadsEnvelopeType(componentCutLoadsEnvelopeType);
			if (result == null)
				result = caseComplexBaseType(componentCutLoadsEnvelopeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE: {
			ComponentSegmentPathType componentSegmentPathType = (ComponentSegmentPathType) theEObject;
			T result = caseComponentSegmentPathType(componentSegmentPathType);
			if (result == null)
				result = caseComplexBaseType(componentSegmentPathType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_SEGMENT_STEPS_TYPE: {
			ComponentSegmentStepsType componentSegmentStepsType = (ComponentSegmentStepsType) theEObject;
			T result = caseComponentSegmentStepsType(componentSegmentStepsType);
			if (result == null)
				result = caseComplexBaseType(componentSegmentStepsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE: {
			ComponentSegmentStepType componentSegmentStepType = (ComponentSegmentStepType) theEObject;
			T result = caseComponentSegmentStepType(componentSegmentStepType);
			if (result == null)
				result = caseComplexBaseType(componentSegmentStepType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE: {
			ComponentSegmentsType componentSegmentsType = (ComponentSegmentsType) theEObject;
			T result = caseComponentSegmentsType(componentSegmentsType);
			if (result == null)
				result = caseComplexBaseType(componentSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPONENT_SEGMENT_TYPE: {
			ComponentSegmentType componentSegmentType = (ComponentSegmentType) theEObject;
			T result = caseComponentSegmentType(componentSegmentType);
			if (result == null)
				result = caseComplexBaseType(componentSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPOSITE_LAYER_TYPE: {
			CompositeLayerType compositeLayerType = (CompositeLayerType) theEObject;
			T result = caseCompositeLayerType(compositeLayerType);
			if (result == null)
				result = caseComplexBaseType(compositeLayerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPOSITES_TYPE: {
			CompositesType compositesType = (CompositesType) theEObject;
			T result = caseCompositesType(compositesType);
			if (result == null)
				result = caseComplexBaseType(compositesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COMPOSITE_TYPE: {
			CompositeType compositeType = (CompositeType) theEObject;
			T result = caseCompositeType(compositeType);
			if (result == null)
				result = caseComplexBaseType(compositeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONNECTIVITIES_TYPE: {
			ConnectivitiesType connectivitiesType = (ConnectivitiesType) theEObject;
			T result = caseConnectivitiesType(connectivitiesType);
			if (result == null)
				result = caseComplexBaseType(connectivitiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONNECTIVITY_TYPE: {
			ConnectivityType connectivityType = (ConnectivityType) theEObject;
			T result = caseConnectivityType(connectivityType);
			if (result == null)
				result = caseComplexBaseType(connectivityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE: {
			ConstraintSettingsPointPerformanceType constraintSettingsPointPerformanceType = (ConstraintSettingsPointPerformanceType) theEObject;
			T result = caseConstraintSettingsPointPerformanceType(constraintSettingsPointPerformanceType);
			if (result == null)
				result = caseComplexBaseType(constraintSettingsPointPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE: {
			ConstraintSettingsType constraintSettingsType = (ConstraintSettingsType) theEObject;
			T result = caseConstraintSettingsType(constraintSettingsType);
			if (result == null)
				result = caseComplexBaseType(constraintSettingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_AT_P1_TYPE: {
			ContinuityAtP1Type continuityAtP1Type = (ContinuityAtP1Type) theEObject;
			T result = caseContinuityAtP1Type(continuityAtP1Type);
			if (result == null)
				result = caseIntegerBaseType(continuityAtP1Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_AT_P2_TYPE: {
			ContinuityAtP2Type continuityAtP2Type = (ContinuityAtP2Type) theEObject;
			T result = caseContinuityAtP2Type(continuityAtP2Type);
			if (result == null)
				result = caseIntegerBaseType(continuityAtP2Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_TYPE: {
			ContinuityType continuityType = (ContinuityType) theEObject;
			T result = caseContinuityType(continuityType);
			if (result == null)
				result = caseIntegerBaseType(continuityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_TYPE1: {
			ContinuityType1 continuityType1 = (ContinuityType1) theEObject;
			T result = caseContinuityType1(continuityType1);
			if (result == null)
				result = caseIntegerBaseType(continuityType1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_TYPE2: {
			ContinuityType2 continuityType2 = (ContinuityType2) theEObject;
			T result = caseContinuityType2(continuityType2);
			if (result == null)
				result = caseIntegerBaseType(continuityType2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTINUITY_TYPE3: {
			ContinuityType3 continuityType3 = (ContinuityType3) theEObject;
			T result = caseContinuityType3(continuityType3);
			if (result == null)
				result = caseStringBaseType(continuityType3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTOUR_REFERENCE_TYPE: {
			ContourReferenceType contourReferenceType = (ContourReferenceType) theEObject;
			T result = caseContourReferenceType(contourReferenceType);
			if (result == null)
				result = caseComplexBaseType(contourReferenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE: {
			ControlDistributorsType controlDistributorsType = (ControlDistributorsType) theEObject;
			T result = caseControlDistributorsType(controlDistributorsType);
			if (result == null)
				result = caseComplexBaseType(controlDistributorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE: {
			ControlDistributorType controlDistributorType = (ControlDistributorType) theEObject;
			T result = caseControlDistributorType(controlDistributorType);
			if (result == null)
				result = caseComplexBaseType(controlDistributorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_ELEMENTS_TYPE: {
			ControlElementsType controlElementsType = (ControlElementsType) theEObject;
			T result = caseControlElementsType(controlElementsType);
			if (result == null)
				result = caseComplexBaseType(controlElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_ELEMENT_TYPE: {
			ControlElementType controlElementType = (ControlElementType) theEObject;
			T result = caseControlElementType(controlElementType);
			if (result == null)
				result = caseComplexBaseType(controlElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE: {
			ControlFunctionsType controlFunctionsType = (ControlFunctionsType) theEObject;
			T result = caseControlFunctionsType(controlFunctionsType);
			if (result == null)
				result = caseComplexBaseType(controlFunctionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_FUNCTION_TYPE: {
			ControlFunctionType controlFunctionType = (ControlFunctionType) theEObject;
			T result = caseControlFunctionType(controlFunctionType);
			if (result == null)
				result = caseComplexBaseType(controlFunctionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_INPUTS_TYPE: {
			ControlInputsType controlInputsType = (ControlInputsType) theEObject;
			T result = caseControlInputsType(controlInputsType);
			if (result == null)
				result = caseComplexBaseType(controlInputsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_INPUT_TYPE: {
			ControlInputType controlInputType = (ControlInputType) theEObject;
			T result = caseControlInputType(controlInputType);
			if (result == null)
				result = caseComplexBaseType(controlInputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_LAW_MODES_TYPE: {
			ControlLawModesType controlLawModesType = (ControlLawModesType) theEObject;
			T result = caseControlLawModesType(controlLawModesType);
			if (result == null)
				result = caseComplexBaseType(controlLawModesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_LAW_MODE_TYPE: {
			ControlLawModeType controlLawModeType = (ControlLawModeType) theEObject;
			T result = caseControlLawModeType(controlLawModeType);
			if (result == null)
				result = caseComplexBaseType(controlLawModeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_LAWS_TYPE: {
			ControlLawsType controlLawsType = (ControlLawsType) theEObject;
			T result = caseControlLawsType(controlLawsType);
			if (result == null)
				result = caseComplexBaseType(controlLawsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_ACTUATORS_TYPE: {
			ControlSurfaceActuatorsType controlSurfaceActuatorsType = (ControlSurfaceActuatorsType) theEObject;
			T result = caseControlSurfaceActuatorsType(controlSurfaceActuatorsType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceActuatorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE: {
			ControlSurfaceActuatorType controlSurfaceActuatorType = (ControlSurfaceActuatorType) theEObject;
			T result = caseControlSurfaceActuatorType(controlSurfaceActuatorType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceActuatorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE: {
			ControlSurfaceAirfoilType controlSurfaceAirfoilType = (ControlSurfaceAirfoilType) theEObject;
			T result = caseControlSurfaceAirfoilType(controlSurfaceAirfoilType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceAirfoilType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE: {
			ControlSurfaceBorderLeadingEdgeType controlSurfaceBorderLeadingEdgeType = (ControlSurfaceBorderLeadingEdgeType) theEObject;
			T result = caseControlSurfaceBorderLeadingEdgeType(controlSurfaceBorderLeadingEdgeType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceBorderLeadingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_BORDER_SPOILER_TYPE: {
			ControlSurfaceBorderSpoilerType controlSurfaceBorderSpoilerType = (ControlSurfaceBorderSpoilerType) theEObject;
			T result = caseControlSurfaceBorderSpoilerType(controlSurfaceBorderSpoilerType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceBorderSpoilerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE: {
			ControlSurfaceBorderTrailingEdgeType controlSurfaceBorderTrailingEdgeType = (ControlSurfaceBorderTrailingEdgeType) theEObject;
			T result = caseControlSurfaceBorderTrailingEdgeType(controlSurfaceBorderTrailingEdgeType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceBorderTrailingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE: {
			ControlSurfaceContoursType controlSurfaceContoursType = (ControlSurfaceContoursType) theEObject;
			T result = caseControlSurfaceContoursType(controlSurfaceContoursType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceContoursType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE: {
			ControlSurfaceDeflectionsType controlSurfaceDeflectionsType = (ControlSurfaceDeflectionsType) theEObject;
			T result = caseControlSurfaceDeflectionsType(controlSurfaceDeflectionsType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceDeflectionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE: {
			ControlSurfaceDeflectionType controlSurfaceDeflectionType = (ControlSurfaceDeflectionType) theEObject;
			T result = caseControlSurfaceDeflectionType(controlSurfaceDeflectionType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceDeflectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTORS_TYPE: {
			ControlSurfaceDeflectionVectorsType controlSurfaceDeflectionVectorsType = (ControlSurfaceDeflectionVectorsType) theEObject;
			T result = caseControlSurfaceDeflectionVectorsType(controlSurfaceDeflectionVectorsType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceDeflectionVectorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE: {
			ControlSurfaceDeflectionVectorType controlSurfaceDeflectionVectorType = (ControlSurfaceDeflectionVectorType) theEObject;
			T result = caseControlSurfaceDeflectionVectorType(controlSurfaceDeflectionVectorType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceDeflectionVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAPS_TYPE: {
			ControlSurfaceHingeMomentMapsType controlSurfaceHingeMomentMapsType = (ControlSurfaceHingeMomentMapsType) theEObject;
			T result = caseControlSurfaceHingeMomentMapsType(controlSurfaceHingeMomentMapsType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceHingeMomentMapsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAP_TYPE: {
			ControlSurfaceHingeMomentMapType controlSurfaceHingeMomentMapType = (ControlSurfaceHingeMomentMapType) theEObject;
			T result = caseControlSurfaceHingeMomentMapType(controlSurfaceHingeMomentMapType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceHingeMomentMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE: {
			ControlSurfaceHingePointType controlSurfaceHingePointType = (ControlSurfaceHingePointType) theEObject;
			T result = caseControlSurfaceHingePointType(controlSurfaceHingePointType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceHingePointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_LEADING_EDGE_TYPE: {
			ControlSurfaceOuterShapeLeadingEdgeType controlSurfaceOuterShapeLeadingEdgeType = (ControlSurfaceOuterShapeLeadingEdgeType) theEObject;
			T result = caseControlSurfaceOuterShapeLeadingEdgeType(controlSurfaceOuterShapeLeadingEdgeType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceOuterShapeLeadingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_SPOILER_TYPE: {
			ControlSurfaceOuterShapeSpoilerType controlSurfaceOuterShapeSpoilerType = (ControlSurfaceOuterShapeSpoilerType) theEObject;
			T result = caseControlSurfaceOuterShapeSpoilerType(controlSurfaceOuterShapeSpoilerType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceOuterShapeSpoilerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE: {
			ControlSurfaceOuterShapeTrailingEdgeType controlSurfaceOuterShapeTrailingEdgeType = (ControlSurfaceOuterShapeTrailingEdgeType) theEObject;
			T result = caseControlSurfaceOuterShapeTrailingEdgeType(controlSurfaceOuterShapeTrailingEdgeType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceOuterShapeTrailingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE: {
			ControlSurfacePathType controlSurfacePathType = (ControlSurfacePathType) theEObject;
			T result = caseControlSurfacePathType(controlSurfacePathType);
			if (result == null)
				result = caseComplexBaseType(controlSurfacePathType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE: {
			ControlSurfacePerformanceMapOldType controlSurfacePerformanceMapOldType = (ControlSurfacePerformanceMapOldType) theEObject;
			T result = caseControlSurfacePerformanceMapOldType(controlSurfacePerformanceMapOldType);
			if (result == null)
				result = caseComplexBaseType(controlSurfacePerformanceMapOldType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAPS_OLD_TYPE: {
			ControlSurfacePerformanceMapsOldType controlSurfacePerformanceMapsOldType = (ControlSurfacePerformanceMapsOldType) theEObject;
			T result = caseControlSurfacePerformanceMapsOldType(controlSurfacePerformanceMapsOldType);
			if (result == null)
				result = caseComplexBaseType(controlSurfacePerformanceMapsOldType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE: {
			ControlSurfaceSkinCutOutBorderType controlSurfaceSkinCutOutBorderType = (ControlSurfaceSkinCutOutBorderType) theEObject;
			T result = caseControlSurfaceSkinCutOutBorderType(controlSurfaceSkinCutOutBorderType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceSkinCutOutBorderType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE: {
			ControlSurfaceSkinCutOutType controlSurfaceSkinCutOutType = (ControlSurfaceSkinCutOutType) theEObject;
			T result = caseControlSurfaceSkinCutOutType(controlSurfaceSkinCutOutType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceSkinCutOutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_STEPS_TYPE: {
			ControlSurfaceStepsType controlSurfaceStepsType = (ControlSurfaceStepsType) theEObject;
			T result = caseControlSurfaceStepsType(controlSurfaceStepsType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceStepsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE: {
			ControlSurfaceStepType controlSurfaceStepType = (ControlSurfaceStepType) theEObject;
			T result = caseControlSurfaceStepType(controlSurfaceStepType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceStepType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACES_TYPE: {
			ControlSurfacesType controlSurfacesType = (ControlSurfacesType) theEObject;
			T result = caseControlSurfacesType(controlSurfacesType);
			if (result == null)
				result = caseComplexBaseType(controlSurfacesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_TRACKS_TYPE: {
			ControlSurfaceTracksType controlSurfaceTracksType = (ControlSurfaceTracksType) theEObject;
			T result = caseControlSurfaceTracksType(controlSurfaceTracksType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceTracksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE: {
			ControlSurfaceTrackTypeType controlSurfaceTrackTypeType = (ControlSurfaceTrackTypeType) theEObject;
			T result = caseControlSurfaceTrackTypeType(controlSurfaceTrackTypeType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceTrackTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE: {
			ControlSurfaceWingCutOutType controlSurfaceWingCutOutType = (ControlSurfaceWingCutOutType) theEObject;
			T result = caseControlSurfaceWingCutOutType(controlSurfaceWingCutOutType);
			if (result == null)
				result = caseComplexBaseType(controlSurfaceWingCutOutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_AIR_CONDITIONING_SYSTEMS_TYPE: {
			CostAirConditioningSystemsType costAirConditioningSystemsType = (CostAirConditioningSystemsType) theEObject;
			T result = caseCostAirConditioningSystemsType(costAirConditioningSystemsType);
			if (result == null)
				result = caseComplexBaseType(costAirConditioningSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_AUTOMATIC_FLIGHT_SYSTEMS_TYPE: {
			CostAutomaticFlightSystemsType costAutomaticFlightSystemsType = (CostAutomaticFlightSystemsType) theEObject;
			T result = caseCostAutomaticFlightSystemsType(costAutomaticFlightSystemsType);
			if (result == null)
				result = caseComplexBaseType(costAutomaticFlightSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_AUXILARY_POWER_UNITS_TYPE: {
			CostAuxilaryPowerUnitsType costAuxilaryPowerUnitsType = (CostAuxilaryPowerUnitsType) theEObject;
			T result = caseCostAuxilaryPowerUnitsType(costAuxilaryPowerUnitsType);
			if (result == null)
				result = caseComplexBaseType(costAuxilaryPowerUnitsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_BLEED_AIR_SYSTEMS_TYPE: {
			CostBleedAirSystemsType costBleedAirSystemsType = (CostBleedAirSystemsType) theEObject;
			T result = caseCostBleedAirSystemsType(costBleedAirSystemsType);
			if (result == null)
				result = caseComplexBaseType(costBleedAirSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_COMMUNICATION_SYSTEMS_TYPE: {
			CostCommunicationSystemsType costCommunicationSystemsType = (CostCommunicationSystemsType) theEObject;
			T result = caseCostCommunicationSystemsType(costCommunicationSystemsType);
			if (result == null)
				result = caseComplexBaseType(costCommunicationSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_COMPONENTS_TYPE: {
			CostComponentsType costComponentsType = (CostComponentsType) theEObject;
			T result = caseCostComponentsType(costComponentsType);
			if (result == null)
				result = caseComplexBaseType(costComponentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_DE_ICING_SYSTEMS_TYPE: {
			CostDeIcingSystemsType costDeIcingSystemsType = (CostDeIcingSystemsType) theEObject;
			T result = caseCostDeIcingSystemsType(costDeIcingSystemsType);
			if (result == null)
				result = caseComplexBaseType(costDeIcingSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE: {
			CostElectricalSystemsType costElectricalSystemsType = (CostElectricalSystemsType) theEObject;
			T result = caseCostElectricalSystemsType(costElectricalSystemsType);
			if (result == null)
				result = caseComplexBaseType(costElectricalSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_ENGINE_PYLONS_TYPE: {
			CostEnginePylonsType costEnginePylonsType = (CostEnginePylonsType) theEObject;
			T result = caseCostEnginePylonsType(costEnginePylonsType);
			if (result == null)
				result = caseComplexBaseType(costEnginePylonsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_EQUIPPED_ENGINES_TYPE: {
			CostEquippedEnginesType costEquippedEnginesType = (CostEquippedEnginesType) theEObject;
			T result = caseCostEquippedEnginesType(costEquippedEnginesType);
			if (result == null)
				result = caseComplexBaseType(costEquippedEnginesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FIRE_PROTECTION_SYSTEMS_TYPE: {
			CostFireProtectionSystemsType costFireProtectionSystemsType = (CostFireProtectionSystemsType) theEObject;
			T result = caseCostFireProtectionSystemsType(costFireProtectionSystemsType);
			if (result == null)
				result = caseComplexBaseType(costFireProtectionSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE: {
			CostFixedEmergencyOxygenSystemsType costFixedEmergencyOxygenSystemsType = (CostFixedEmergencyOxygenSystemsType) theEObject;
			T result = caseCostFixedEmergencyOxygenSystemsType(costFixedEmergencyOxygenSystemsType);
			if (result == null)
				result = caseComplexBaseType(costFixedEmergencyOxygenSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FLIGHT_CONTROL_SYSTEMS_TYPE: {
			CostFlightControlSystemsType costFlightControlSystemsType = (CostFlightControlSystemsType) theEObject;
			T result = caseCostFlightControlSystemsType(costFlightControlSystemsType);
			if (result == null)
				result = caseComplexBaseType(costFlightControlSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FUEL_SYSTEMS_TYPE: {
			CostFuelSystemsType costFuelSystemsType = (CostFuelSystemsType) theEObject;
			T result = caseCostFuelSystemsType(costFuelSystemsType);
			if (result == null)
				result = caseComplexBaseType(costFuelSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE: {
			CostFurnishingElementsType costFurnishingElementsType = (CostFurnishingElementsType) theEObject;
			T result = caseCostFurnishingElementsType(costFurnishingElementsType);
			if (result == null)
				result = caseComplexBaseType(costFurnishingElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FURNISHINGS_TYPE: {
			CostFurnishingsType costFurnishingsType = (CostFurnishingsType) theEObject;
			T result = caseCostFurnishingsType(costFurnishingsType);
			if (result == null)
				result = caseComplexBaseType(costFurnishingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_FUSELAGES_TYPE: {
			CostFuselagesType costFuselagesType = (CostFuselagesType) theEObject;
			T result = caseCostFuselagesType(costFuselagesType);
			if (result == null)
				result = caseComplexBaseType(costFuselagesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE: {
			CostHydraulicSystemsType costHydraulicSystemsType = (CostHydraulicSystemsType) theEObject;
			T result = caseCostHydraulicSystemsType(costHydraulicSystemsType);
			if (result == null)
				result = caseComplexBaseType(costHydraulicSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE: {
			CostInstrumentSystemsType costInstrumentSystemsType = (CostInstrumentSystemsType) theEObject;
			T result = caseCostInstrumentSystemsType(costInstrumentSystemsType);
			if (result == null)
				result = caseComplexBaseType(costInstrumentSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_LANDING_GEAR_TYPE: {
			CostLandingGearType costLandingGearType = (CostLandingGearType) theEObject;
			T result = caseCostLandingGearType(costLandingGearType);
			if (result == null)
				result = caseComplexBaseType(costLandingGearType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_LIGHTING_SYSTEMS_TYPE: {
			CostLightingSystemsType costLightingSystemsType = (CostLightingSystemsType) theEObject;
			T result = caseCostLightingSystemsType(costLightingSystemsType);
			if (result == null)
				result = caseComplexBaseType(costLightingSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_NACELLES_TYPE: {
			CostNacellesType costNacellesType = (CostNacellesType) theEObject;
			T result = caseCostNacellesType(costNacellesType);
			if (result == null)
				result = caseComplexBaseType(costNacellesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_NAVIGATION_SYSTEMS_TYPE: {
			CostNavigationSystemsType costNavigationSystemsType = (CostNavigationSystemsType) theEObject;
			T result = caseCostNavigationSystemsType(costNavigationSystemsType);
			if (result == null)
				result = caseComplexBaseType(costNavigationSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_POWER_UNITS_TYPE: {
			CostPowerUnitsType costPowerUnitsType = (CostPowerUnitsType) theEObject;
			T result = caseCostPowerUnitsType(costPowerUnitsType);
			if (result == null)
				result = caseComplexBaseType(costPowerUnitsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_SYSTEMS_TYPE: {
			CostSystemsType costSystemsType = (CostSystemsType) theEObject;
			T result = caseCostSystemsType(costSystemsType);
			if (result == null)
				result = caseComplexBaseType(costSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_WATER_INSTALLATION_SYSTEMS_TYPE: {
			CostWaterInstallationSystemsType costWaterInstallationSystemsType = (CostWaterInstallationSystemsType) theEObject;
			T result = caseCostWaterInstallationSystemsType(costWaterInstallationSystemsType);
			if (result == null)
				result = caseComplexBaseType(costWaterInstallationSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.COST_WINGS_TYPE: {
			CostWingsType costWingsType = (CostWingsType) theEObject;
			T result = caseCostWingsType(costWingsType);
			if (result == null)
				result = caseComplexBaseType(costWingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CPACS_TYPE: {
			CpacsType cpacsType = (CpacsType) theEObject;
			T result = caseCpacsType(cpacsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CRASH_LOAD_CASES_TYPE: {
			CrashLoadCasesType crashLoadCasesType = (CrashLoadCasesType) theEObject;
			T result = caseCrashLoadCasesType(crashLoadCasesType);
			if (result == null)
				result = caseComplexBaseType(crashLoadCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CRASH_LOADCASE_TYPE: {
			CrashLoadcaseType crashLoadcaseType = (CrashLoadcaseType) theEObject;
			T result = caseCrashLoadcaseType(crashLoadcaseType);
			if (result == null)
				result = caseComplexBaseType(crashLoadcaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CREW_COST_TYPE: {
			CrewCostType crewCostType = (CrewCostType) theEObject;
			T result = caseCrewCostType(crewCostType);
			if (result == null)
				result = caseComplexBaseType(crewCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE: {
			CrossBeamAssemblyPositionType crossBeamAssemblyPositionType = (CrossBeamAssemblyPositionType) theEObject;
			T result = caseCrossBeamAssemblyPositionType(crossBeamAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(crossBeamAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE: {
			CrossBeamStrutAssemblyPositionType crossBeamStrutAssemblyPositionType = (CrossBeamStrutAssemblyPositionType) theEObject;
			T result = caseCrossBeamStrutAssemblyPositionType(crossBeamStrutAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(crossBeamStrutAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CRUISE_ROLLERS_TYPE: {
			CruiseRollersType cruiseRollersType = (CruiseRollersType) theEObject;
			T result = caseCruiseRollersType(cruiseRollersType);
			if (result == null)
				result = caseComplexBaseType(cruiseRollersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CRUISE_ROLLER_TYPE: {
			CruiseRollerType cruiseRollerType = (CruiseRollerType) theEObject;
			T result = caseCruiseRollerType(cruiseRollerType);
			if (result == null)
				result = caseComplexBaseType(cruiseRollerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CST2_DTYPE: {
			Cst2DType cst2DType = (Cst2DType) theEObject;
			T result = caseCst2DType(cst2DType);
			if (result == null)
				result = caseComplexBaseType(cst2DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE: {
			CurveParamPointMapType curveParamPointMapType = (CurveParamPointMapType) theEObject;
			T result = caseCurveParamPointMapType(curveParamPointMapType);
			if (result == null)
				result = caseComplexBaseType(curveParamPointMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE: {
			CurvePointListXYZType curvePointListXYZType = (CurvePointListXYZType) theEObject;
			T result = caseCurvePointListXYZType(curvePointListXYZType);
			if (result == null)
				result = casePointListXYZVectorType(curvePointListXYZType);
			if (result == null)
				result = caseComplexBaseType(curvePointListXYZType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CURVE_POINT_TYPE: {
			CurvePointType curvePointType = (CurvePointType) theEObject;
			T result = caseCurvePointType(curvePointType);
			if (result == null)
				result = caseComplexBaseType(curvePointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CURVE_PROFILES_TYPE: {
			CurveProfilesType curveProfilesType = (CurveProfilesType) theEObject;
			T result = caseCurveProfilesType(curveProfilesType);
			if (result == null)
				result = caseComplexBaseType(curveProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE: {
			CutLoadIntegrationPointsType cutLoadIntegrationPointsType = (CutLoadIntegrationPointsType) theEObject;
			T result = caseCutLoadIntegrationPointsType(cutLoadIntegrationPointsType);
			if (result == null)
				result = caseComplexBaseType(cutLoadIntegrationPointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE: {
			CutLoadsEnvelopeType cutLoadsEnvelopeType = (CutLoadsEnvelopeType) theEObject;
			T result = caseCutLoadsEnvelopeType(cutLoadsEnvelopeType);
			if (result == null)
				result = caseComplexBaseType(cutLoadsEnvelopeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_LOADS_TYPE: {
			CutLoadsType cutLoadsType = (CutLoadsType) theEObject;
			T result = caseCutLoadsType(cutLoadsType);
			if (result == null)
				result = caseComplexBaseType(cutLoadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_LOAD_TYPE: {
			CutLoadType cutLoadType = (CutLoadType) theEObject;
			T result = caseCutLoadType(cutLoadType);
			if (result == null)
				result = caseComplexBaseType(cutLoadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE: {
			CutOutControlPointsType cutOutControlPointsType = (CutOutControlPointsType) theEObject;
			T result = caseCutOutControlPointsType(cutOutControlPointsType);
			if (result == null)
				result = caseComplexBaseType(cutOutControlPointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_OUT_CONTROL_POINT_TYPE: {
			CutOutControlPointType cutOutControlPointType = (CutOutControlPointType) theEObject;
			T result = caseCutOutControlPointType(cutOutControlPointType);
			if (result == null)
				result = caseComplexBaseType(cutOutControlPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_OUT_PROFILES_TYPE: {
			CutOutProfilesType cutOutProfilesType = (CutOutProfilesType) theEObject;
			T result = caseCutOutProfilesType(cutOutProfilesType);
			if (result == null)
				result = caseComplexBaseType(cutOutProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_OUT_PROFILE_TYPE: {
			CutOutProfileType cutOutProfileType = (CutOutProfileType) theEObject;
			T result = caseCutOutProfileType(cutOutProfileType);
			if (result == null)
				result = caseComplexBaseType(cutOutProfileType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUT_OUT_TYPE: {
			CutOutType cutOutType = (CutOutType) theEObject;
			T result = caseCutOutType(cutOutType);
			if (result == null)
				result = caseComplexBaseType(cutOutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.CUTOUT_TYPE_TYPE: {
			CutoutTypeType cutoutTypeType = (CutoutTypeType) theEObject;
			T result = caseCutoutTypeType(cutoutTypeType);
			if (result == null)
				result = caseStringBaseType(cutoutTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_ARRAY_TYPE: {
			DampingDerivativesRatesArrayType dampingDerivativesRatesArrayType = (DampingDerivativesRatesArrayType) theEObject;
			T result = caseDampingDerivativesRatesArrayType(dampingDerivativesRatesArrayType);
			if (result == null)
				result = caseComplexBaseType(dampingDerivativesRatesArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE: {
			DampingDerivativesRatesType dampingDerivativesRatesType = (DampingDerivativesRatesType) theEObject;
			T result = caseDampingDerivativesRatesType(dampingDerivativesRatesType);
			if (result == null)
				result = caseComplexBaseType(dampingDerivativesRatesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE: {
			DampingDerivativesType dampingDerivativesType = (DampingDerivativesType) theEObject;
			T result = caseDampingDerivativesType(dampingDerivativesType);
			if (result == null)
				result = caseComplexBaseType(dampingDerivativesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE: {
			DamTolBehaviourType damTolBehaviourType = (DamTolBehaviourType) theEObject;
			T result = caseDamTolBehaviourType(damTolBehaviourType);
			if (result == null)
				result = caseComplexBaseType(damTolBehaviourType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAM_TOL_FORMAN_TYPE: {
			DamTolFormanType damTolFormanType = (DamTolFormanType) theEObject;
			T result = caseDamTolFormanType(damTolFormanType);
			if (result == null)
				result = caseComplexBaseType(damTolFormanType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DAM_TOL_WALKER_TYPE: {
			DamTolWalkerType damTolWalkerType = (DamTolWalkerType) theEObject;
			T result = caseDamTolWalkerType(damTolWalkerType);
			if (result == null)
				result = caseComplexBaseType(damTolWalkerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DATE_BASE_TYPE: {
			DateBaseType dateBaseType = (DateBaseType) theEObject;
			T result = caseDateBaseType(dateBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DATE_TIME_BASE_TYPE: {
			DateTimeBaseType dateTimeBaseType = (DateTimeBaseType) theEObject;
			T result = caseDateTimeBaseType(dateTimeBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DECKS_TYPE: {
			DecksType decksType = (DecksType) theEObject;
			T result = caseDecksType(decksType);
			if (result == null)
				result = caseComplexBaseType(decksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DECK_TYPE: {
			DeckType deckType = (DeckType) theEObject;
			T result = caseDeckType(deckType);
			if (result == null)
				result = caseComplexBaseType(deckType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DELTA_TEMPERATURE_TYPE: {
			DeltaTemperatureType deltaTemperatureType = (DeltaTemperatureType) theEObject;
			T result = caseDeltaTemperatureType(deltaTemperatureType);
			if (result == null)
				result = caseComplexBaseType(deltaTemperatureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_MASSES_TYPE: {
			DesignMassesType designMassesType = (DesignMassesType) theEObject;
			T result = caseDesignMassesType(designMassesType);
			if (result == null)
				result = caseComplexBaseType(designMassesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_PARAMETERS_TYPE: {
			DesignParametersType designParametersType = (DesignParametersType) theEObject;
			T result = caseDesignParametersType(designParametersType);
			if (result == null)
				result = caseComplexBaseType(designParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_PARAMETER_TYPE: {
			DesignParameterType designParameterType = (DesignParameterType) theEObject;
			T result = caseDesignParameterType(designParameterType);
			if (result == null)
				result = caseComplexBaseType(designParameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_SPACE_TYPE: {
			DesignSpaceType designSpaceType = (DesignSpaceType) theEObject;
			T result = caseDesignSpaceType(designSpaceType);
			if (result == null)
				result = caseComplexBaseType(designSpaceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_SPEED_TYPE: {
			DesignSpeedType designSpeedType = (DesignSpeedType) theEObject;
			T result = caseDesignSpeedType(designSpeedType);
			if (result == null)
				result = caseStringBaseType(designSpeedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_STUDIES_TYPE: {
			DesignStudiesType designStudiesType = (DesignStudiesType) theEObject;
			T result = caseDesignStudiesType(designStudiesType);
			if (result == null)
				result = caseComplexBaseType(designStudiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DESIGN_VOLUME_TYPE: {
			DesignVolumeType designVolumeType = (DesignVolumeType) theEObject;
			T result = caseDesignVolumeType(designVolumeType);
			if (result == null)
				result = caseDoubleBaseType(designVolumeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE: {
			DirectOperatingCostType directOperatingCostType = (DirectOperatingCostType) theEObject;
			T result = caseDirectOperatingCostType(directOperatingCostType);
			if (result == null)
				result = caseComplexBaseType(directOperatingCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DIVERGENCE_CASES_TYPE: {
			DivergenceCasesType divergenceCasesType = (DivergenceCasesType) theEObject;
			T result = caseDivergenceCasesType(divergenceCasesType);
			if (result == null)
				result = caseComplexBaseType(divergenceCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DIVERGENCE_CASE_TYPE: {
			DivergenceCaseType divergenceCaseType = (DivergenceCaseType) theEObject;
			T result = caseDivergenceCaseType(divergenceCaseType);
			if (result == null)
				result = caseComplexBaseType(divergenceCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE: {
			DoorAssemblyPositionType doorAssemblyPositionType = (DoorAssemblyPositionType) theEObject;
			T result = caseDoorAssemblyPositionType(doorAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(doorAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOOR_CUT_OUT_TYPE: {
			DoorCutOutType doorCutOutType = (DoorCutOutType) theEObject;
			T result = caseDoorCutOutType(doorCutOutType);
			if (result == null)
				result = caseComplexBaseType(doorCutOutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOORS_TYPE: {
			DoorsType doorsType = (DoorsType) theEObject;
			T result = caseDoorsType(doorsType);
			if (result == null)
				result = caseComplexBaseType(doorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE: {
			DoorSurroundStructurePositionType doorSurroundStructurePositionType = (DoorSurroundStructurePositionType) theEObject;
			T result = caseDoorSurroundStructurePositionType(doorSurroundStructurePositionType);
			if (result == null)
				result = caseComplexBaseType(doorSurroundStructurePositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE: {
			DoorSurroundStructuresAssemblyType doorSurroundStructuresAssemblyType = (DoorSurroundStructuresAssemblyType) theEObject;
			T result = caseDoorSurroundStructuresAssemblyType(doorSurroundStructuresAssemblyType);
			if (result == null)
				result = caseComplexBaseType(doorSurroundStructuresAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOOR_TYPE_TYPE: {
			DoorTypeType doorTypeType = (DoorTypeType) theEObject;
			T result = caseDoorTypeType(doorTypeType);
			if (result == null)
				result = caseStringBaseType(doorTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOUBLE_BASE_TYPE: {
			DoubleBaseType doubleBaseType = (DoubleBaseType) theEObject;
			T result = caseDoubleBaseType(doubleBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE: {
			DoubleConstraintBaseType doubleConstraintBaseType = (DoubleConstraintBaseType) theEObject;
			T result = caseDoubleConstraintBaseType(doubleConstraintBaseType);
			if (result == null)
				result = caseDoubleBaseType(doubleConstraintBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DRIVE_SYSTEMS_TYPE: {
			DriveSystemsType driveSystemsType = (DriveSystemsType) theEObject;
			T result = caseDriveSystemsType(driveSystemsType);
			if (result == null)
				result = caseComplexBaseType(driveSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DRIVE_SYSTEM_TYPE: {
			DriveSystemType driveSystemType = (DriveSystemType) theEObject;
			T result = caseDriveSystemType(driveSystemType);
			if (result == null)
				result = caseComplexBaseType(driveSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE: {
			DynamicAircraftModelAnalysisType dynamicAircraftModelAnalysisType = (DynamicAircraftModelAnalysisType) theEObject;
			T result = caseDynamicAircraftModelAnalysisType(dynamicAircraftModelAnalysisType);
			if (result == null)
				result = caseComplexBaseType(dynamicAircraftModelAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_POINTS_TYPE: {
			DynamicAircraftModelPointsType dynamicAircraftModelPointsType = (DynamicAircraftModelPointsType) theEObject;
			T result = caseDynamicAircraftModelPointsType(dynamicAircraftModelPointsType);
			if (result == null)
				result = caseComplexBaseType(dynamicAircraftModelPointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE: {
			DynamicAircraftModelType dynamicAircraftModelType = (DynamicAircraftModelType) theEObject;
			T result = caseDynamicAircraftModelType(dynamicAircraftModelType);
			if (result == null)
				result = caseComplexBaseType(dynamicAircraftModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.EMISSIVITY_MAP_TYPE: {
			EmissivityMapType emissivityMapType = (EmissivityMapType) theEObject;
			T result = caseEmissivityMapType(emissivityMapType);
			if (result == null)
				result = caseComplexBaseType(emissivityMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_ANALYSIS_TYPE: {
			EngineAnalysisType engineAnalysisType = (EngineAnalysisType) theEObject;
			T result = caseEngineAnalysisType(engineAnalysisType);
			if (result == null)
				result = caseComplexBaseType(engineAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_CONCEPT_TYPE: {
			EngineConceptType engineConceptType = (EngineConceptType) theEObject;
			T result = caseEngineConceptType(engineConceptType);
			if (result == null)
				result = caseStringBaseType(engineConceptType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_FAN_TYPE: {
			EngineFanType engineFanType = (EngineFanType) theEObject;
			T result = caseEngineFanType(engineFanType);
			if (result == null)
				result = caseComplexBaseType(engineFanType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_GEOMETRY_TYPE: {
			EngineGeometryType engineGeometryType = (EngineGeometryType) theEObject;
			T result = caseEngineGeometryType(engineGeometryType);
			if (result == null)
				result = caseComplexBaseType(engineGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_GLOBAL_TYPE: {
			EngineGlobalType engineGlobalType = (EngineGlobalType) theEObject;
			T result = caseEngineGlobalType(engineGlobalType);
			if (result == null)
				result = caseComplexBaseType(engineGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_MOUNTS_TYPE: {
			EngineMountsType engineMountsType = (EngineMountsType) theEObject;
			T result = caseEngineMountsType(engineMountsType);
			if (result == null)
				result = caseComplexBaseType(engineMountsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_MOUNT_TYPE: {
			EngineMountType engineMountType = (EngineMountType) theEObject;
			T result = caseEngineMountType(engineMountType);
			if (result == null)
				result = caseComplexBaseType(engineMountType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_NACELLE_TYPE: {
			EngineNacelleType engineNacelleType = (EngineNacelleType) theEObject;
			T result = caseEngineNacelleType(engineNacelleType);
			if (result == null)
				result = caseComplexBaseType(engineNacelleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE: {
			EnginePerformanceMapsType enginePerformanceMapsType = (EnginePerformanceMapsType) theEObject;
			T result = caseEnginePerformanceMapsType(enginePerformanceMapsType);
			if (result == null)
				result = caseComplexBaseType(enginePerformanceMapsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE: {
			EnginePerformanceMapType enginePerformanceMapType = (EnginePerformanceMapType) theEObject;
			T result = caseEnginePerformanceMapType(enginePerformanceMapType);
			if (result == null)
				result = caseComplexBaseType(enginePerformanceMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_POSITIONS_TYPE: {
			EnginePositionsType enginePositionsType = (EnginePositionsType) theEObject;
			T result = caseEnginePositionsType(enginePositionsType);
			if (result == null)
				result = caseComplexBaseType(enginePositionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_POSITION_TYPE: {
			EnginePositionType enginePositionType = (EnginePositionType) theEObject;
			T result = caseEnginePositionType(enginePositionType);
			if (result == null)
				result = caseComplexBaseType(enginePositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_PYLONS_TYPE: {
			EnginePylonsType enginePylonsType = (EnginePylonsType) theEObject;
			T result = caseEnginePylonsType(enginePylonsType);
			if (result == null)
				result = caseComplexBaseType(enginePylonsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_PYLON_TYPE: {
			EnginePylonType enginePylonType = (EnginePylonType) theEObject;
			T result = caseEnginePylonType(enginePylonType);
			if (result == null)
				result = caseComplexBaseType(enginePylonType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_SETTING_TYPE: {
			EngineSettingType engineSettingType = (EngineSettingType) theEObject;
			T result = caseEngineSettingType(engineSettingType);
			if (result == null)
				result = caseComplexBaseType(engineSettingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_SPINNER_TYPE: {
			EngineSpinnerType engineSpinnerType = (EngineSpinnerType) theEObject;
			T result = caseEngineSpinnerType(engineSpinnerType);
			if (result == null)
				result = caseComplexBaseType(engineSpinnerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINES_TYPE: {
			EnginesType enginesType = (EnginesType) theEObject;
			T result = caseEnginesType(enginesType);
			if (result == null)
				result = caseComplexBaseType(enginesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ENGINE_TYPE: {
			EngineType engineType = (EngineType) theEObject;
			T result = caseEngineType(engineType);
			if (result == null)
				result = caseComplexBaseType(engineType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ETA_ISO_LINE_TYPE: {
			EtaIsoLineType etaIsoLineType = (EtaIsoLineType) theEObject;
			T result = caseEtaIsoLineType(etaIsoLineType);
			if (result == null)
				result = caseComplexBaseType(etaIsoLineType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ETA_XSI_POINT_TYPE: {
			EtaXsiPointType etaXsiPointType = (EtaXsiPointType) theEObject;
			T result = caseEtaXsiPointType(etaXsiPointType);
			if (result == null)
				result = caseComplexBaseType(etaXsiPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ETA_XSI_REL_HEIGHT_POINT_TYPE: {
			EtaXsiRelHeightPointType etaXsiRelHeightPointType = (EtaXsiRelHeightPointType) theEObject;
			T result = caseEtaXsiRelHeightPointType(etaXsiRelHeightPointType);
			if (result == null)
				result = caseComplexBaseType(etaXsiRelHeightPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE: {
			FatigueBehaviourType fatigueBehaviourType = (FatigueBehaviourType) theEObject;
			T result = caseFatigueBehaviourType(fatigueBehaviourType);
			if (result == null)
				result = caseComplexBaseType(fatigueBehaviourType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE: {
			FatigueStressBasedBrownMillerType fatigueStressBasedBrownMillerType = (FatigueStressBasedBrownMillerType) theEObject;
			T result = caseFatigueStressBasedBrownMillerType(fatigueStressBasedBrownMillerType);
			if (result == null)
				result = caseComplexBaseType(fatigueStressBasedBrownMillerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLEET_TYPE: {
			FleetType fleetType = (FleetType) theEObject;
			T result = caseFleetType(fleetType);
			if (result == null)
				result = caseComplexBaseType(fleetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE: {
			FlightAnalysisType flightAnalysisType = (FlightAnalysisType) theEObject;
			T result = caseFlightAnalysisType(flightAnalysisType);
			if (result == null)
				result = caseComplexBaseType(flightAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE: {
			FlightDynamicsAnalysisType flightDynamicsAnalysisType = (FlightDynamicsAnalysisType) theEObject;
			T result = caseFlightDynamicsAnalysisType(flightDynamicsAnalysisType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE: {
			FlightDynamicsFlightCasesType flightDynamicsFlightCasesType = (FlightDynamicsFlightCasesType) theEObject;
			T result = caseFlightDynamicsFlightCasesType(flightDynamicsFlightCasesType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsFlightCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE: {
			FlightDynamicsFlightCaseType flightDynamicsFlightCaseType = (FlightDynamicsFlightCaseType) theEObject;
			T result = caseFlightDynamicsFlightCaseType(flightDynamicsFlightCaseType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsFlightCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE: {
			FlightDynamicsLinearModelType flightDynamicsLinearModelType = (FlightDynamicsLinearModelType) theEObject;
			T result = caseFlightDynamicsLinearModelType(flightDynamicsLinearModelType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsLinearModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE: {
			FlightDynamicsModelType flightDynamicsModelType = (FlightDynamicsModelType) theEObject;
			T result = caseFlightDynamicsModelType(flightDynamicsModelType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE: {
			FlightDynamicsTrimResultType flightDynamicsTrimResultType = (FlightDynamicsTrimResultType) theEObject;
			T result = caseFlightDynamicsTrimResultType(flightDynamicsTrimResultType);
			if (result == null)
				result = caseComplexBaseType(flightDynamicsTrimResultType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE: {
			FlightLoadCasesType flightLoadCasesType = (FlightLoadCasesType) theEObject;
			T result = caseFlightLoadCasesType(flightLoadCasesType);
			if (result == null)
				result = caseComplexBaseType(flightLoadCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_LOAD_CASE_TYPE: {
			FlightLoadCaseType flightLoadCaseType = (FlightLoadCaseType) theEObject;
			T result = caseFlightLoadCaseType(flightLoadCaseType);
			if (result == null)
				result = caseComplexBaseType(flightLoadCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PATH_TYPE: {
			FlightPathType flightPathType = (FlightPathType) theEObject;
			T result = caseFlightPathType(flightPathType);
			if (result == null)
				result = caseComplexBaseType(flightPathType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE: {
			FlightPerformanceCasesType flightPerformanceCasesType = (FlightPerformanceCasesType) theEObject;
			T result = caseFlightPerformanceCasesType(flightPerformanceCasesType);
			if (result == null)
				result = caseComplexBaseType(flightPerformanceCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE: {
			FlightPerformanceCaseType flightPerformanceCaseType = (FlightPerformanceCaseType) theEObject;
			T result = caseFlightPerformanceCaseType(flightPerformanceCaseType);
			if (result == null)
				result = caseComplexBaseType(flightPerformanceCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE: {
			FlightPerformanceLandingType flightPerformanceLandingType = (FlightPerformanceLandingType) theEObject;
			T result = caseFlightPerformanceLandingType(flightPerformanceLandingType);
			if (result == null)
				result = caseComplexBaseType(flightPerformanceLandingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE: {
			FlightPerformanceTakeoffType flightPerformanceTakeoffType = (FlightPerformanceTakeoffType) theEObject;
			T result = caseFlightPerformanceTakeoffType(flightPerformanceTakeoffType);
			if (result == null)
				result = caseComplexBaseType(flightPerformanceTakeoffType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE: {
			FlightPerformanceType flightPerformanceType = (FlightPerformanceType) theEObject;
			T result = caseFlightPerformanceType(flightPerformanceType);
			if (result == null)
				result = caseComplexBaseType(flightPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_POINT_TYPE: {
			FlightPointType flightPointType = (FlightPointType) theEObject;
			T result = caseFlightPointType(flightPointType);
			if (result == null)
				result = caseComplexBaseType(flightPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHTS_TYPE: {
			FlightsType flightsType = (FlightsType) theEObject;
			T result = caseFlightsType(flightsType);
			if (result == null)
				result = caseComplexBaseType(flightsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE: {
			FlightSystemsType flightSystemsType = (FlightSystemsType) theEObject;
			T result = caseFlightSystemsType(flightSystemsType);
			if (result == null)
				result = caseComplexBaseType(flightSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLIGHT_TYPE: {
			FlightType flightType = (FlightType) theEObject;
			T result = caseFlightType(flightType);
			if (result == null)
				result = caseComplexBaseType(flightType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLOOR_PANELS_TYPE: {
			FloorPanelsType floorPanelsType = (FloorPanelsType) theEObject;
			T result = caseFloorPanelsType(floorPanelsType);
			if (result == null)
				result = caseComplexBaseType(floorPanelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLOOR_PANEL_TYPE: {
			FloorPanelType floorPanelType = (FloorPanelType) theEObject;
			T result = caseFloorPanelType(floorPanelType);
			if (result == null)
				result = caseComplexBaseType(floorPanelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLOW_CONDITION_TYPE: {
			FlowConditionType flowConditionType = (FlowConditionType) theEObject;
			T result = caseFlowConditionType(flowConditionType);
			if (result == null)
				result = caseComplexBaseType(flowConditionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FLYING_QUALITIES_TYPE: {
			FlyingQualitiesType flyingQualitiesType = (FlyingQualitiesType) theEObject;
			T result = caseFlyingQualitiesType(flyingQualitiesType);
			if (result == null)
				result = caseComplexBaseType(flyingQualitiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_CASE_TYPE: {
			FqCaseType fqCaseType = (FqCaseType) theEObject;
			T result = caseFqCaseType(fqCaseType);
			if (result == null)
				result = caseComplexBaseType(fqCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_CHAR_PARAMETERS_TYPE: {
			FqCharParametersType fqCharParametersType = (FqCharParametersType) theEObject;
			T result = caseFqCharParametersType(fqCharParametersType);
			if (result == null)
				result = caseComplexBaseType(fqCharParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_EIGLAT_TYPE: {
			FqEiglatType fqEiglatType = (FqEiglatType) theEObject;
			T result = caseFqEiglatType(fqEiglatType);
			if (result == null)
				result = caseComplexBaseType(fqEiglatType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_LATERAL_TYPE: {
			FqLateralType fqLateralType = (FqLateralType) theEObject;
			T result = caseFqLateralType(fqLateralType);
			if (result == null)
				result = caseComplexBaseType(fqLateralType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_LONGITUDINAL_TYPE: {
			FqLongitudinalType fqLongitudinalType = (FqLongitudinalType) theEObject;
			T result = caseFqLongitudinalType(fqLongitudinalType);
			if (result == null)
				result = caseComplexBaseType(fqLongitudinalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_PHUGOID_TYPE: {
			FqPhugoidType fqPhugoidType = (FqPhugoidType) theEObject;
			T result = caseFqPhugoidType(fqPhugoidType);
			if (result == null)
				result = caseComplexBaseType(fqPhugoidType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_RATINGS_TYPE: {
			FqRatingsType fqRatingsType = (FqRatingsType) theEObject;
			T result = caseFqRatingsType(fqRatingsType);
			if (result == null)
				result = caseComplexBaseType(fqRatingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_ROLL_PERF_TYPE: {
			FqRollPerfType fqRollPerfType = (FqRollPerfType) theEObject;
			T result = caseFqRollPerfType(fqRollPerfType);
			if (result == null)
				result = caseComplexBaseType(fqRollPerfType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_ROLOSC_TYPE: {
			FqRoloscType fqRoloscType = (FqRoloscType) theEObject;
			T result = caseFqRoloscType(fqRoloscType);
			if (result == null)
				result = caseComplexBaseType(fqRoloscType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE: {
			FqShortPeriodType fqShortPeriodType = (FqShortPeriodType) theEObject;
			T result = caseFqShortPeriodType(fqShortPeriodType);
			if (result == null)
				result = caseComplexBaseType(fqShortPeriodType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FQ_TREFF_TYPE: {
			FqTreffType fqTreffType = (FqTreffType) theEObject;
			T result = caseFqTreffType(fqTreffType);
			if (result == null)
				result = caseComplexBaseType(fqTreffType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FRAMES_ASSEMBLY_TYPE: {
			FramesAssemblyType framesAssemblyType = (FramesAssemblyType) theEObject;
			T result = caseFramesAssemblyType(framesAssemblyType);
			if (result == null)
				result = caseComplexBaseType(framesAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FRAME_TYPE: {
			FrameType frameType = (FrameType) theEObject;
			T result = caseFrameType(frameType);
			if (result == null)
				result = caseComplexBaseType(frameType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FREE_PATH_TYPE: {
			FreePathType freePathType = (FreePathType) theEObject;
			T result = caseFreePathType(freePathType);
			if (result == null)
				result = caseComplexBaseType(freePathType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUEL_IN_TANK_TYPE: {
			FuelInTankType fuelInTankType = (FuelInTankType) theEObject;
			T result = caseFuelInTankType(fuelInTankType);
			if (result == null)
				result = caseComplexBaseType(fuelInTankType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUEL_PLANNING_TYPE_TYPE: {
			FuelPlanningTypeType fuelPlanningTypeType = (FuelPlanningTypeType) theEObject;
			T result = caseFuelPlanningTypeType(fuelPlanningTypeType);
			if (result == null)
				result = caseStringBaseType(fuelPlanningTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUELS_TYPE: {
			FuelsType fuelsType = (FuelsType) theEObject;
			T result = caseFuelsType(fuelsType);
			if (result == null)
				result = caseComplexBaseType(fuelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE: {
			FuelTankVolumeType fuelTankVolumeType = (FuelTankVolumeType) theEObject;
			T result = caseFuelTankVolumeType(fuelTankVolumeType);
			if (result == null)
				result = caseComplexBaseType(fuelTankVolumeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUEL_TYPE: {
			FuelType fuelType = (FuelType) theEObject;
			T result = caseFuelType(fuelType);
			if (result == null)
				result = caseComplexBaseType(fuelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_AERO_PERFORMANCE_TYPE: {
			FuselageAeroPerformanceType fuselageAeroPerformanceType = (FuselageAeroPerformanceType) theEObject;
			T result = caseFuselageAeroPerformanceType(fuselageAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(fuselageAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE: {
			FuselageCoefficientsType fuselageCoefficientsType = (FuselageCoefficientsType) theEObject;
			T result = caseFuselageCoefficientsType(fuselageCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(fuselageCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_CUT_OUTS_TYPE: {
			FuselageCutOutsType fuselageCutOutsType = (FuselageCutOutsType) theEObject;
			T result = caseFuselageCutOutsType(fuselageCutOutsType);
			if (result == null)
				result = caseComplexBaseType(fuselageCutOutsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE: {
			FuselageCutOutType fuselageCutOutType = (FuselageCutOutType) theEObject;
			T result = caseFuselageCutOutType(fuselageCutOutType);
			if (result == null)
				result = caseComplexBaseType(fuselageCutOutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_ELEMENTS_TYPE: {
			FuselageElementsType fuselageElementsType = (FuselageElementsType) theEObject;
			T result = caseFuselageElementsType(fuselageElementsType);
			if (result == null)
				result = caseComplexBaseType(fuselageElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_ELEMENT_TYPE: {
			FuselageElementType fuselageElementType = (FuselageElementType) theEObject;
			T result = caseFuselageElementType(fuselageElementType);
			if (result == null)
				result = caseComplexBaseType(fuselageElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE: {
			FuselageFuelTanksType fuselageFuelTanksType = (FuselageFuelTanksType) theEObject;
			T result = caseFuselageFuelTanksType(fuselageFuelTanksType);
			if (result == null)
				result = caseComplexBaseType(fuselageFuelTanksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_FUEL_TANK_TYPE: {
			FuselageFuelTankType fuselageFuelTankType = (FuselageFuelTankType) theEObject;
			T result = caseFuselageFuelTankType(fuselageFuelTankType);
			if (result == null)
				result = caseComplexBaseType(fuselageFuelTankType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_PROFILES_TYPE: {
			FuselageProfilesType fuselageProfilesType = (FuselageProfilesType) theEObject;
			T result = caseFuselageProfilesType(fuselageProfilesType);
			if (result == null)
				result = caseComplexBaseType(fuselageProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE: {
			FuselagesAeroPerformanceType fuselagesAeroPerformanceType = (FuselagesAeroPerformanceType) theEObject;
			T result = caseFuselagesAeroPerformanceType(fuselagesAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(fuselagesAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE: {
			FuselagesCoefficientsType fuselagesCoefficientsType = (FuselagesCoefficientsType) theEObject;
			T result = caseFuselagesCoefficientsType(fuselagesCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(fuselagesCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SECTIONS_TYPE: {
			FuselageSectionsType fuselageSectionsType = (FuselageSectionsType) theEObject;
			T result = caseFuselageSectionsType(fuselageSectionsType);
			if (result == null)
				result = caseComplexBaseType(fuselageSectionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SECTION_TYPE: {
			FuselageSectionType fuselageSectionType = (FuselageSectionType) theEObject;
			T result = caseFuselageSectionType(fuselageSectionType);
			if (result == null)
				result = caseComplexBaseType(fuselageSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SEGMENT_COEFFICIENTS_TYPE: {
			FuselageSegmentCoefficientsType fuselageSegmentCoefficientsType = (FuselageSegmentCoefficientsType) theEObject;
			T result = caseFuselageSegmentCoefficientsType(fuselageSegmentCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(fuselageSegmentCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE: {
			FuselageSegmentsCoefficientsType fuselageSegmentsCoefficientsType = (FuselageSegmentsCoefficientsType) theEObject;
			T result = caseFuselageSegmentsCoefficientsType(fuselageSegmentsCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(fuselageSegmentsCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE: {
			FuselageSegmentStripCoefficientsType fuselageSegmentStripCoefficientsType = (FuselageSegmentStripCoefficientsType) theEObject;
			T result = caseFuselageSegmentStripCoefficientsType(fuselageSegmentStripCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(fuselageSegmentStripCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SEGMENTS_TYPE: {
			FuselageSegmentsType fuselageSegmentsType = (FuselageSegmentsType) theEObject;
			T result = caseFuselageSegmentsType(fuselageSegmentsType);
			if (result == null)
				result = caseComplexBaseType(fuselageSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE: {
			FuselageSegmentType fuselageSegmentType = (FuselageSegmentType) theEObject;
			T result = caseFuselageSegmentType(fuselageSegmentType);
			if (result == null)
				result = caseComplexBaseType(fuselageSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE: {
			FuselageStructureType fuselageStructureType = (FuselageStructureType) theEObject;
			T result = caseFuselageStructureType(fuselageStructureType);
			if (result == null)
				result = caseComplexBaseType(fuselageStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGES_TYPE: {
			FuselagesType fuselagesType = (FuselagesType) theEObject;
			T result = caseFuselagesType(fuselagesType);
			if (result == null)
				result = caseComplexBaseType(fuselagesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.FUSELAGE_TYPE: {
			FuselageType fuselageType = (FuselageType) theEObject;
			T result = caseFuselageType(fuselageType);
			if (result == null)
				result = caseComplexBaseType(fuselageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEAR_COMPONENTS_TYPE: {
			GearComponentsType gearComponentsType = (GearComponentsType) theEObject;
			T result = caseGearComponentsType(gearComponentsType);
			if (result == null)
				result = caseComplexBaseType(gearComponentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE: {
			GearDeflectionVectorsType gearDeflectionVectorsType = (GearDeflectionVectorsType) theEObject;
			T result = caseGearDeflectionVectorsType(gearDeflectionVectorsType);
			if (result == null)
				result = caseComplexBaseType(gearDeflectionVectorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE: {
			GearDeflectionVectorType gearDeflectionVectorType = (GearDeflectionVectorType) theEObject;
			T result = caseGearDeflectionVectorType(gearDeflectionVectorType);
			if (result == null)
				result = caseComplexBaseType(gearDeflectionVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE: {
			GeneralStructuralMemberPositionType generalStructuralMemberPositionType = (GeneralStructuralMemberPositionType) theEObject;
			T result = caseGeneralStructuralMemberPositionType(generalStructuralMemberPositionType);
			if (result == null)
				result = caseComplexBaseType(generalStructuralMemberPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE: {
			GeneralStructuralMembersAssemblyType generalStructuralMembersAssemblyType = (GeneralStructuralMembersAssemblyType) theEObject;
			T result = caseGeneralStructuralMembersAssemblyType(generalStructuralMembersAssemblyType);
			if (result == null)
				result = caseComplexBaseType(generalStructuralMembersAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE: {
			GeneralStructuralMemberType generalStructuralMemberType = (GeneralStructuralMemberType) theEObject;
			T result = caseGeneralStructuralMemberType(generalStructuralMemberType);
			if (result == null)
				result = caseComplexBaseType(generalStructuralMemberType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_COMPONENT_COEFFICIENTS_TYPE: {
			GenericComponentCoefficientsType genericComponentCoefficientsType = (GenericComponentCoefficientsType) theEObject;
			T result = caseGenericComponentCoefficientsType(genericComponentCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(genericComponentCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE: {
			GenericComponentsCoefficientsType genericComponentsCoefficientsType = (GenericComponentsCoefficientsType) theEObject;
			T result = caseGenericComponentsCoefficientsType(genericComponentsCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(genericComponentsCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_COST_TYPE: {
			GenericCostType genericCostType = (GenericCostType) theEObject;
			T result = caseGenericCostType(genericCostType);
			if (result == null)
				result = caseComplexBaseType(genericCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE: {
			GenericGeometricComponentType genericGeometricComponentType = (GenericGeometricComponentType) theEObject;
			T result = caseGenericGeometricComponentType(genericGeometricComponentType);
			if (result == null)
				result = caseComplexBaseType(genericGeometricComponentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE: {
			GenericGeometryComponentsType genericGeometryComponentsType = (GenericGeometryComponentsType) theEObject;
			T result = caseGenericGeometryComponentsType(genericGeometryComponentsType);
			if (result == null)
				result = caseComplexBaseType(genericGeometryComponentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_MASS_TYPE: {
			GenericMassType genericMassType = (GenericMassType) theEObject;
			T result = caseGenericMassType(genericMassType);
			if (result == null)
				result = caseComplexBaseType(genericMassType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_SYSTEMS_TYPE: {
			GenericSystemsType genericSystemsType = (GenericSystemsType) theEObject;
			T result = caseGenericSystemsType(genericSystemsType);
			if (result == null)
				result = caseComplexBaseType(genericSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GENERIC_SYSTEM_TYPE: {
			GenericSystemType genericSystemType = (GenericSystemType) theEObject;
			T result = caseGenericSystemType(genericSystemType);
			if (result == null)
				result = caseComplexBaseType(genericSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE: {
			GeogenWingOutputOptionsType geogenWingOutputOptionsType = (GeogenWingOutputOptionsType) theEObject;
			T result = caseGeogenWingOutputOptionsType(geogenWingOutputOptionsType);
			if (result == null)
				result = caseComplexBaseType(geogenWingOutputOptionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE: {
			GeographicPointConstraintType geographicPointConstraintType = (GeographicPointConstraintType) theEObject;
			T result = caseGeographicPointConstraintType(geographicPointConstraintType);
			if (result == null)
				result = caseComplexBaseType(geographicPointConstraintType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GEOGRAPHIC_POINT_TYPE: {
			GeographicPointType geographicPointType = (GeographicPointType) theEObject;
			T result = caseGeographicPointType(geographicPointType);
			if (result == null)
				result = caseComplexBaseType(geographicPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GLOBAL_AERO_PERFORMANCE_TYPE: {
			GlobalAeroPerformanceType globalAeroPerformanceType = (GlobalAeroPerformanceType) theEObject;
			T result = caseGlobalAeroPerformanceType(globalAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(globalAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE: {
			GlobalBeamPropertiesType globalBeamPropertiesType = (GlobalBeamPropertiesType) theEObject;
			T result = caseGlobalBeamPropertiesType(globalBeamPropertiesType);
			if (result == null)
				result = caseComplexBaseType(globalBeamPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GROUND_LOAD_CASES_TYPE: {
			GroundLoadCasesType groundLoadCasesType = (GroundLoadCasesType) theEObject;
			T result = caseGroundLoadCasesType(groundLoadCasesType);
			if (result == null)
				result = caseComplexBaseType(groundLoadCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GROUND_LOAD_CASE_TYPE: {
			GroundLoadCaseType groundLoadCaseType = (GroundLoadCaseType) theEObject;
			T result = caseGroundLoadCaseType(groundLoadCaseType);
			if (result == null)
				result = caseComplexBaseType(groundLoadCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE: {
			GuideCurveProfileGeometryType guideCurveProfileGeometryType = (GuideCurveProfileGeometryType) theEObject;
			T result = caseGuideCurveProfileGeometryType(guideCurveProfileGeometryType);
			if (result == null)
				result = caseComplexBaseType(guideCurveProfileGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE: {
			GuideCurveProfilesType guideCurveProfilesType = (GuideCurveProfilesType) theEObject;
			T result = caseGuideCurveProfilesType(guideCurveProfilesType);
			if (result == null)
				result = caseComplexBaseType(guideCurveProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GUIDE_CURVES_TYPE: {
			GuideCurvesType guideCurvesType = (GuideCurvesType) theEObject;
			T result = caseGuideCurvesType(guideCurvesType);
			if (result == null)
				result = caseComplexBaseType(guideCurvesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.GUIDE_CURVE_TYPE: {
			GuideCurveType guideCurveType = (GuideCurveType) theEObject;
			T result = caseGuideCurveType(guideCurveType);
			if (result == null)
				result = caseComplexBaseType(guideCurveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HANDBOOK_AERO_LAST_TRANSITION_REGION_TYPE: {
			HandbookAeroLastTransitionRegionType handbookAeroLastTransitionRegionType = (HandbookAeroLastTransitionRegionType) theEObject;
			T result = caseHandbookAeroLastTransitionRegionType(handbookAeroLastTransitionRegionType);
			if (result == null)
				result = caseComplexBaseType(handbookAeroLastTransitionRegionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE: {
			HandbookAeroPolynomialCoefficientsType handbookAeroPolynomialCoefficientsType = (HandbookAeroPolynomialCoefficientsType) theEObject;
			T result = caseHandbookAeroPolynomialCoefficientsType(handbookAeroPolynomialCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(handbookAeroPolynomialCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE: {
			HandbookAeroTransitionRegionType handbookAeroTransitionRegionType = (HandbookAeroTransitionRegionType) theEObject;
			T result = caseHandbookAeroTransitionRegionType(handbookAeroTransitionRegionType);
			if (result == null)
				result = caseComplexBaseType(handbookAeroTransitionRegionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HEADER_TYPE: {
			HeaderType headerType = (HeaderType) theEObject;
			T result = caseHeaderType(headerType);
			if (result == null)
				result = caseComplexBaseType(headerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE: {
			HingeMomentsMapType hingeMomentsMapType = (HingeMomentsMapType) theEObject;
			T result = caseHingeMomentsMapType(hingeMomentsMapType);
			if (result == null)
				result = caseComplexBaseType(hingeMomentsMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE: {
			HtpFwdInterfaceDefType htpFwdInterfaceDefType = (HtpFwdInterfaceDefType) theEObject;
			T result = caseHtpFwdInterfaceDefType(htpFwdInterfaceDefType);
			if (result == null)
				result = caseComplexBaseType(htpFwdInterfaceDefType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE: {
			HtpInterfaceDefType htpInterfaceDefType = (HtpInterfaceDefType) theEObject;
			T result = caseHtpInterfaceDefType(htpInterfaceDefType);
			if (result == null)
				result = caseComplexBaseType(htpInterfaceDefType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE: {
			HtpStructElemDefType htpStructElemDefType = (HtpStructElemDefType) theEObject;
			T result = caseHtpStructElemDefType(htpStructElemDefType);
			if (result == null)
				result = caseComplexBaseType(htpStructElemDefType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.IDENTIFIER_TYPE: {
			IdentifierType identifierType = (IdentifierType) theEObject;
			T result = caseIdentifierType(identifierType);
			if (result == null)
				result = caseStringBaseType(identifierType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.IMPACT_SURFACE_DEFINITION_TYPE: {
			ImpactSurfaceDefinitionType impactSurfaceDefinitionType = (ImpactSurfaceDefinitionType) theEObject;
			T result = caseImpactSurfaceDefinitionType(impactSurfaceDefinitionType);
			if (result == null)
				result = caseStringBaseType(impactSurfaceDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INDIRECT_OPERATING_COST_TYPE: {
			IndirectOperatingCostType indirectOperatingCostType = (IndirectOperatingCostType) theEObject;
			T result = caseIndirectOperatingCostType(indirectOperatingCostType);
			if (result == null)
				result = caseComplexBaseType(indirectOperatingCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTEGER_BASE_TYPE: {
			IntegerBaseType integerBaseType = (IntegerBaseType) theEObject;
			T result = caseIntegerBaseType(integerBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTER_CONNECTION_STRUT_ATTACHMENT_TYPE: {
			InterConnectionStrutAttachmentType interConnectionStrutAttachmentType = (InterConnectionStrutAttachmentType) theEObject;
			T result = caseInterConnectionStrutAttachmentType(interConnectionStrutAttachmentType);
			if (result == null)
				result = caseComplexBaseType(interConnectionStrutAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE: {
			InterconnectionStrutsType interconnectionStrutsType = (InterconnectionStrutsType) theEObject;
			T result = caseInterconnectionStrutsType(interconnectionStrutsType);
			if (result == null)
				result = caseComplexBaseType(interconnectionStrutsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE: {
			InterconnectionStrutType interconnectionStrutType = (InterconnectionStrutType) theEObject;
			T result = caseInterconnectionStrutType(interconnectionStrutType);
			if (result == null)
				result = caseComplexBaseType(interconnectionStrutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE: {
			IntercostalPositionType intercostalPositionType = (IntercostalPositionType) theEObject;
			T result = caseIntercostalPositionType(intercostalPositionType);
			if (result == null)
				result = caseComplexBaseType(intercostalPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE: {
			IntercostalsAssemblyType intercostalsAssemblyType = (IntercostalsAssemblyType) theEObject;
			T result = caseIntercostalsAssemblyType(intercostalsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(intercostalsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE: {
			InterfaceDefinitionsType interfaceDefinitionsType = (InterfaceDefinitionsType) theEObject;
			T result = caseInterfaceDefinitionsType(interfaceDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(interfaceDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERPOLATION_TYPE: {
			InterpolationType interpolationType = (InterpolationType) theEObject;
			T result = caseInterpolationType(interpolationType);
			if (result == null)
				result = caseIntegerBaseType(interpolationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERPOLATION_TYPE1: {
			InterpolationType1 interpolationType1 = (InterpolationType1) theEObject;
			T result = caseInterpolationType1(interpolationType1);
			if (result == null)
				result = caseIntegerBaseType(interpolationType1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.INTERPOLATION_TYPE2: {
			InterpolationType2 interpolationType2 = (InterpolationType2) theEObject;
			T result = caseInterpolationType2(interpolationType2);
			if (result == null)
				result = caseIntegerBaseType(interpolationType2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE: {
			IsotropicPropertiesType isotropicPropertiesType = (IsotropicPropertiesType) theEObject;
			T result = caseIsotropicPropertiesType(isotropicPropertiesType);
			if (result == null)
				result = caseComplexBaseType(isotropicPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE: {
			LandingGearInterfaceDefinitionsType landingGearInterfaceDefinitionsType = (LandingGearInterfaceDefinitionsType) theEObject;
			T result = caseLandingGearInterfaceDefinitionsType(landingGearInterfaceDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_KEELBEAM_TYPE: {
			LandingGearInterfaceKeelbeamType landingGearInterfaceKeelbeamType = (LandingGearInterfaceKeelbeamType) theEObject;
			T result = caseLandingGearInterfaceKeelbeamType(landingGearInterfaceKeelbeamType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceKeelbeamType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_LATERAL_PANELS_TYPE: {
			LandingGearInterfaceLateralPanelsType landingGearInterfaceLateralPanelsType = (LandingGearInterfaceLateralPanelsType) theEObject;
			T result = caseLandingGearInterfaceLateralPanelsType(landingGearInterfaceLateralPanelsType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceLateralPanelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION_TYPE: {
			LandingGearInterfaceLongFloorBeamsConnectionType landingGearInterfaceLongFloorBeamsConnectionType = (LandingGearInterfaceLongFloorBeamsConnectionType) theEObject;
			T result = caseLandingGearInterfaceLongFloorBeamsConnectionType(
					landingGearInterfaceLongFloorBeamsConnectionType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceLongFloorBeamsConnectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE: {
			LandingGearInterfaceMainFramesType landingGearInterfaceMainFramesType = (LandingGearInterfaceMainFramesType) theEObject;
			T result = caseLandingGearInterfaceMainFramesType(landingGearInterfaceMainFramesType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceMainFramesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_PRESSURE_FLOOR_TYPE: {
			LandingGearInterfacePressureFloorType landingGearInterfacePressureFloorType = (LandingGearInterfacePressureFloorType) theEObject;
			T result = caseLandingGearInterfacePressureFloorType(landingGearInterfacePressureFloorType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfacePressureFloorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_INTERFACE_SIDEBOX_TYPE: {
			LandingGearInterfaceSideboxType landingGearInterfaceSideboxType = (LandingGearInterfaceSideboxType) theEObject;
			T result = caseLandingGearInterfaceSideboxType(landingGearInterfaceSideboxType);
			if (result == null)
				result = caseComplexBaseType(landingGearInterfaceSideboxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE: {
			LandingGearPositionSafetyMarginsType landingGearPositionSafetyMarginsType = (LandingGearPositionSafetyMarginsType) theEObject;
			T result = caseLandingGearPositionSafetyMarginsType(landingGearPositionSafetyMarginsType);
			if (result == null)
				result = caseComplexBaseType(landingGearPositionSafetyMarginsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE: {
			LandingGearSettingType landingGearSettingType = (LandingGearSettingType) theEObject;
			T result = caseLandingGearSettingType(landingGearSettingType);
			if (result == null)
				result = caseComplexBaseType(landingGearSettingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LANDING_GEAR_TYPE: {
			LandingGearType landingGearType = (LandingGearType) theEObject;
			T result = caseLandingGearType(landingGearType);
			if (result == null)
				result = caseComplexBaseType(landingGearType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LATERAL_CAP_TYPE: {
			LateralCapType lateralCapType = (LateralCapType) theEObject;
			T result = caseLateralCapType(lateralCapType);
			if (result == null)
				result = caseCapType(lateralCapType);
			if (result == null)
				result = caseComplexBaseType(lateralCapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE: {
			LeadingEdgeDevicesType leadingEdgeDevicesType = (LeadingEdgeDevicesType) theEObject;
			T result = caseLeadingEdgeDevicesType(leadingEdgeDevicesType);
			if (result == null)
				result = caseComplexBaseType(leadingEdgeDevicesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE: {
			LeadingEdgeDeviceType leadingEdgeDeviceType = (LeadingEdgeDeviceType) theEObject;
			T result = caseLeadingEdgeDeviceType(leadingEdgeDeviceType);
			if (result == null)
				result = caseComplexBaseType(leadingEdgeDeviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE: {
			LeadingEdgeHollowType leadingEdgeHollowType = (LeadingEdgeHollowType) theEObject;
			T result = caseLeadingEdgeHollowType(leadingEdgeHollowType);
			if (result == null)
				result = caseComplexBaseType(leadingEdgeHollowType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE: {
			LeadingEdgeShapeType leadingEdgeShapeType = (LeadingEdgeShapeType) theEObject;
			T result = caseLeadingEdgeShapeType(leadingEdgeShapeType);
			if (result == null)
				result = caseComplexBaseType(leadingEdgeShapeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LINER_TYPE: {
			LinerType linerType = (LinerType) theEObject;
			T result = caseLinerType(linerType);
			if (result == null)
				result = caseComplexBaseType(linerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LINK_TO_FILE_TYPE: {
			LinkToFileType linkToFileType = (LinkToFileType) theEObject;
			T result = caseLinkToFileType(linkToFileType);
			if (result == null)
				result = caseStringBaseType(linkToFileType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_ANALYSIS_TYPE: {
			LoadAnalysisType loadAnalysisType = (LoadAnalysisType) theEObject;
			T result = caseLoadAnalysisType(loadAnalysisType);
			if (result == null)
				result = caseComplexBaseType(loadAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_BREAKDOWN_TYPE: {
			LoadBreakdownType loadBreakdownType = (LoadBreakdownType) theEObject;
			T result = caseLoadBreakdownType(loadBreakdownType);
			if (result == null)
				result = caseComplexBaseType(loadBreakdownType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_ENGINES_TYPE: {
			LoadCaseEnginesType loadCaseEnginesType = (LoadCaseEnginesType) theEObject;
			T result = caseLoadCaseEnginesType(loadCaseEnginesType);
			if (result == null)
				result = caseComplexBaseType(loadCaseEnginesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE: {
			LoadCaseLandingGearsType loadCaseLandingGearsType = (LoadCaseLandingGearsType) theEObject;
			T result = caseLoadCaseLandingGearsType(loadCaseLandingGearsType);
			if (result == null)
				result = caseComplexBaseType(loadCaseLandingGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_MASS_TYPE: {
			LoadCaseMassType loadCaseMassType = (LoadCaseMassType) theEObject;
			T result = caseLoadCaseMassType(loadCaseMassType);
			if (result == null)
				result = caseComplexBaseType(loadCaseMassType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE: {
			LoadCaseRotationType loadCaseRotationType = (LoadCaseRotationType) theEObject;
			T result = caseLoadCaseRotationType(loadCaseRotationType);
			if (result == null)
				result = caseComplexBaseType(loadCaseRotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE: {
			LoadCaseRotationVelocityType loadCaseRotationVelocityType = (LoadCaseRotationVelocityType) theEObject;
			T result = caseLoadCaseRotationVelocityType(loadCaseRotationVelocityType);
			if (result == null)
				result = caseComplexBaseType(loadCaseRotationVelocityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE: {
			LoadCaseSettingsType loadCaseSettingsType = (LoadCaseSettingsType) theEObject;
			T result = caseLoadCaseSettingsType(loadCaseSettingsType);
			if (result == null)
				result = caseComplexBaseType(loadCaseSettingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_STATE_TYPE: {
			LoadCaseStateType loadCaseStateType = (LoadCaseStateType) theEObject;
			T result = caseLoadCaseStateType(loadCaseStateType);
			if (result == null)
				result = caseComplexBaseType(loadCaseStateType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASES_TYPE: {
			LoadCasesType loadCasesType = (LoadCasesType) theEObject;
			T result = caseLoadCasesType(loadCasesType);
			if (result == null)
				result = caseComplexBaseType(loadCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE: {
			LoadCaseTranslationAccelerationType loadCaseTranslationAccelerationType = (LoadCaseTranslationAccelerationType) theEObject;
			T result = caseLoadCaseTranslationAccelerationType(loadCaseTranslationAccelerationType);
			if (result == null)
				result = caseComplexBaseType(loadCaseTranslationAccelerationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE: {
			LoadCaseTranslationType loadCaseTranslationType = (LoadCaseTranslationType) theEObject;
			T result = caseLoadCaseTranslationType(loadCaseTranslationType);
			if (result == null)
				result = caseComplexBaseType(loadCaseTranslationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE: {
			LoadCaseTranslationVelocityType loadCaseTranslationVelocityType = (LoadCaseTranslationVelocityType) theEObject;
			T result = caseLoadCaseTranslationVelocityType(loadCaseTranslationVelocityType);
			if (result == null)
				result = caseComplexBaseType(loadCaseTranslationVelocityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_CONDITION_TYPE: {
			LoadConditionType loadConditionType = (LoadConditionType) theEObject;
			T result = caseLoadConditionType(loadConditionType);
			if (result == null)
				result = caseComplexBaseType(loadConditionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE: {
			LoadReferenceAxisPointsType loadReferenceAxisPointsType = (LoadReferenceAxisPointsType) theEObject;
			T result = caseLoadReferenceAxisPointsType(loadReferenceAxisPointsType);
			if (result == null)
				result = caseComplexBaseType(loadReferenceAxisPointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE: {
			LoadReferenceAxisPointType loadReferenceAxisPointType = (LoadReferenceAxisPointType) theEObject;
			T result = caseLoadReferenceAxisPointType(loadReferenceAxisPointType);
			if (result == null)
				result = caseComplexBaseType(loadReferenceAxisPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOAD_REFERENCE_TYPE: {
			LoadReferenceType loadReferenceType = (LoadReferenceType) theEObject;
			T result = caseLoadReferenceType(loadReferenceType);
			if (result == null)
				result = caseComplexBaseType(loadReferenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LOADS_ENVELOPE_TYPE: {
			LoadsEnvelopeType loadsEnvelopeType = (LoadsEnvelopeType) theEObject;
			T result = caseLoadsEnvelopeType(loadsEnvelopeType);
			if (result == null)
				result = caseComplexBaseType(loadsEnvelopeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE: {
			LongFloorBeamPositionType longFloorBeamPositionType = (LongFloorBeamPositionType) theEObject;
			T result = caseLongFloorBeamPositionType(longFloorBeamPositionType);
			if (result == null)
				result = caseComplexBaseType(longFloorBeamPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE: {
			LongFloorBeamsAssemblyType longFloorBeamsAssemblyType = (LongFloorBeamsAssemblyType) theEObject;
			T result = caseLongFloorBeamsAssemblyType(longFloorBeamsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(longFloorBeamsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE: {
			LongFloorBeamType longFloorBeamType = (LongFloorBeamType) theEObject;
			T result = caseLongFloorBeamType(longFloorBeamType);
			if (result == null)
				result = caseComplexBaseType(longFloorBeamType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_ACTUATOR_TYPE: {
			MainActuatorType mainActuatorType = (MainActuatorType) theEObject;
			T result = caseMainActuatorType(mainActuatorType);
			if (result == null)
				result = caseComplexBaseType(mainActuatorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE: {
			MainGearGlobalType mainGearGlobalType = (MainGearGlobalType) theEObject;
			T result = caseMainGearGlobalType(mainGearGlobalType);
			if (result == null)
				result = caseComplexBaseType(mainGearGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEARS_TYPE: {
			MainGearsType mainGearsType = (MainGearsType) theEObject;
			T result = caseMainGearsType(mainGearsType);
			if (result == null)
				result = caseComplexBaseType(mainGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_POSITION_TYPE: {
			MainGearSupportBeamPositionType mainGearSupportBeamPositionType = (MainGearSupportBeamPositionType) theEObject;
			T result = caseMainGearSupportBeamPositionType(mainGearSupportBeamPositionType);
			if (result == null)
				result = caseComplexBaseType(mainGearSupportBeamPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE: {
			MainGearSupportBeamType mainGearSupportBeamType = (MainGearSupportBeamType) theEObject;
			T result = caseMainGearSupportBeamType(mainGearSupportBeamType);
			if (result == null)
				result = caseComplexBaseType(mainGearSupportBeamType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEAR_TYPE: {
			MainGearType mainGearType = (MainGearType) theEObject;
			T result = caseMainGearType(mainGearType);
			if (result == null)
				result = caseComplexBaseType(mainGearType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE: {
			MainGearWingAttachmentType mainGearWingAttachmentType = (MainGearWingAttachmentType) theEObject;
			T result = caseMainGearWingAttachmentType(mainGearWingAttachmentType);
			if (result == null)
				result = caseComplexBaseType(mainGearWingAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE: {
			MainStrutInterfaceDefinitionsType mainStrutInterfaceDefinitionsType = (MainStrutInterfaceDefinitionsType) theEObject;
			T result = caseMainStrutInterfaceDefinitionsType(mainStrutInterfaceDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(mainStrutInterfaceDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIN_STRUT_WING_FUSELAGE_ATTACHMENT_TYPE: {
			MainStrutWingFuselageAttachmentType mainStrutWingFuselageAttachmentType = (MainStrutWingFuselageAttachmentType) theEObject;
			T result = caseMainStrutWingFuselageAttachmentType(mainStrutWingFuselageAttachmentType);
			if (result == null)
				result = caseComplexBaseType(mainStrutWingFuselageAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAINTENANCE_COST_TYPE: {
			MaintenanceCostType maintenanceCostType = (MaintenanceCostType) theEObject;
			T result = caseMaintenanceCostType(maintenanceCostType);
			if (result == null)
				result = caseComplexBaseType(maintenanceCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAIR_CONDITIONING_TYPE: {
			MAirConditioningType mAirConditioningType = (MAirConditioningType) theEObject;
			T result = caseMAirConditioningType(mAirConditioningType);
			if (result == null)
				result = caseComplexBaseType(mAirConditioningType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MASS_BREAKDOWN_TYPE: {
			MassBreakdownType massBreakdownType = (MassBreakdownType) theEObject;
			T result = caseMassBreakdownType(massBreakdownType);
			if (result == null)
				result = caseComplexBaseType(massBreakdownType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MASS_FRACTION_TYPE: {
			MassFractionType massFractionType = (MassFractionType) theEObject;
			T result = caseMassFractionType(massFractionType);
			if (result == null)
				result = caseComplexBaseType(massFractionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MASS_INERTIA_TYPE: {
			MassInertiaType massInertiaType = (MassInertiaType) theEObject;
			T result = caseMassInertiaType(massInertiaType);
			if (result == null)
				result = caseComplexBaseType(massInertiaType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE: {
			MassInertiaVectorType massInertiaVectorType = (MassInertiaVectorType) theEObject;
			T result = caseMassInertiaVectorType(massInertiaVectorType);
			if (result == null)
				result = caseComplexBaseType(massInertiaVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE: {
			MaterialDefinitionForProfileBasedPointType materialDefinitionForProfileBasedPointType = (MaterialDefinitionForProfileBasedPointType) theEObject;
			T result = caseMaterialDefinitionForProfileBasedPointType(materialDefinitionForProfileBasedPointType);
			if (result == null)
				result = caseComplexBaseType(materialDefinitionForProfileBasedPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE: {
			MaterialDefinitionForProfileBasedType materialDefinitionForProfileBasedType = (MaterialDefinitionForProfileBasedType) theEObject;
			T result = caseMaterialDefinitionForProfileBasedType(materialDefinitionForProfileBasedType);
			if (result == null)
				result = caseComplexBaseType(materialDefinitionForProfileBasedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MATERIAL_DEFINITION_TYPE: {
			MaterialDefinitionType materialDefinitionType = (MaterialDefinitionType) theEObject;
			T result = caseMaterialDefinitionType(materialDefinitionType);
			if (result == null)
				result = caseComplexBaseType(materialDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MATERIALS_TYPE: {
			MaterialsType materialsType = (MaterialsType) theEObject;
			T result = caseMaterialsType(materialsType);
			if (result == null)
				result = caseComplexBaseType(materialsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MATERIAL_TYPE: {
			MaterialType materialType = (MaterialType) theEObject;
			T result = caseMaterialType(materialType);
			if (result == null)
				result = caseComplexBaseType(materialType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAUTOMATIC_FLIGHT_SYSTEM_TYPE: {
			MAutomaticFlightSystemType mAutomaticFlightSystemType = (MAutomaticFlightSystemType) theEObject;
			T result = caseMAutomaticFlightSystemType(mAutomaticFlightSystemType);
			if (result == null)
				result = caseComplexBaseType(mAutomaticFlightSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MAUXILLARY_POWER_UNIT_TYPE: {
			MAuxillaryPowerUnitType mAuxillaryPowerUnitType = (MAuxillaryPowerUnitType) theEObject;
			T result = caseMAuxillaryPowerUnitType(mAuxillaryPowerUnitType);
			if (result == null)
				result = caseComplexBaseType(mAuxillaryPowerUnitType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MBELLY_FAIRINGS_TYPE: {
			MBellyFairingsType mBellyFairingsType = (MBellyFairingsType) theEObject;
			T result = caseMBellyFairingsType(mBellyFairingsType);
			if (result == null)
				result = caseComplexBaseType(mBellyFairingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MBLEED_AIR_SYSTEM_TYPE: {
			MBleedAirSystemType mBleedAirSystemType = (MBleedAirSystemType) theEObject;
			T result = caseMBleedAirSystemType(mBleedAirSystemType);
			if (result == null)
				result = caseComplexBaseType(mBleedAirSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MBULK_CARGOS_TYPE: {
			MBulkCargosType mBulkCargosType = (MBulkCargosType) theEObject;
			T result = caseMBulkCargosType(mBulkCargosType);
			if (result == null)
				result = caseComplexBaseType(mBulkCargosType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MBULK_CARGO_TYPE: {
			MBulkCargoType mBulkCargoType = (MBulkCargoType) theEObject;
			T result = caseMBulkCargoType(mBulkCargoType);
			if (result == null)
				result = caseComplexBaseType(mBulkCargoType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MBULKHEADS_TYPE: {
			MBulkheadsType mBulkheadsType = (MBulkheadsType) theEObject;
			T result = caseMBulkheadsType(mBulkheadsType);
			if (result == null)
				result = caseComplexBaseType(mBulkheadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCABIN_FLOORS_TYPE: {
			MCabinFloorsType mCabinFloorsType = (MCabinFloorsType) theEObject;
			T result = caseMCabinFloorsType(mCabinFloorsType);
			if (result == null)
				result = caseComplexBaseType(mCabinFloorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCABIN_LIGHTINGS_TYPE: {
			MCabinLightingsType mCabinLightingsType = (MCabinLightingsType) theEObject;
			T result = caseMCabinLightingsType(mCabinLightingsType);
			if (result == null)
				result = caseComplexBaseType(mCabinLightingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARGO_FLOORS_TYPE: {
			MCargoFloorsType mCargoFloorsType = (MCargoFloorsType) theEObject;
			T result = caseMCargoFloorsType(mCargoFloorsType);
			if (result == null)
				result = caseComplexBaseType(mCargoFloorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARGO_LININGS_TYPE: {
			MCargoLiningsType mCargoLiningsType = (MCargoLiningsType) theEObject;
			T result = caseMCargoLiningsType(mCargoLiningsType);
			if (result == null)
				result = caseComplexBaseType(mCargoLiningsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARGO_LOADINGS_TYPE: {
			MCargoLoadingsType mCargoLoadingsType = (MCargoLoadingsType) theEObject;
			T result = caseMCargoLoadingsType(mCargoLoadingsType);
			if (result == null)
				result = caseComplexBaseType(mCargoLoadingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARGO_TYPE: {
			MCargoType mCargoType = (MCargoType) theEObject;
			T result = caseMCargoType(mCargoType);
			if (result == null)
				result = caseComplexBaseType(mCargoType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARRIAGES_TYPE: {
			MCarriagesType mCarriagesType = (MCarriagesType) theEObject;
			T result = caseMCarriagesType(mCarriagesType);
			if (result == null)
				result = caseComplexBaseType(mCarriagesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARRY_ONS_TYPE: {
			MCarryOnsType mCarryOnsType = (MCarryOnsType) theEObject;
			T result = caseMCarryOnsType(mCarryOnsType);
			if (result == null)
				result = caseComplexBaseType(mCarryOnsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCARRY_ON_TYPE: {
			MCarryOnType mCarryOnType = (MCarryOnType) theEObject;
			T result = caseMCarryOnType(mCarryOnType);
			if (result == null)
				result = caseComplexBaseType(mCarryOnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCATERINGS_TYPE: {
			MCateringsType mCateringsType = (MCateringsType) theEObject;
			T result = caseMCateringsType(mCateringsType);
			if (result == null)
				result = caseComplexBaseType(mCateringsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCELLS_TYPE: {
			MCellsType mCellsType = (MCellsType) theEObject;
			T result = caseMCellsType(mCellsType);
			if (result == null)
				result = caseComplexBaseType(mCellsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCOCKPIT_LIGHTINGS_TYPE: {
			MCockpitLightingsType mCockpitLightingsType = (MCockpitLightingsType) theEObject;
			T result = caseMCockpitLightingsType(mCockpitLightingsType);
			if (result == null)
				result = caseComplexBaseType(mCockpitLightingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCOMMUNICATION_TYPE: {
			MCommunicationType mCommunicationType = (MCommunicationType) theEObject;
			T result = caseMCommunicationType(mCommunicationType);
			if (result == null)
				result = caseComplexBaseType(mCommunicationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCOMPONENT_SEGMENTS_TYPE: {
			MComponentSegmentsType mComponentSegmentsType = (MComponentSegmentsType) theEObject;
			T result = caseMComponentSegmentsType(mComponentSegmentsType);
			if (result == null)
				result = caseComplexBaseType(mComponentSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE: {
			MComponentSegmentType mComponentSegmentType = (MComponentSegmentType) theEObject;
			T result = caseMComponentSegmentType(mComponentSegmentType);
			if (result == null)
				result = caseComplexBaseType(mComponentSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE: {
			MControlSurfaceSupportsType mControlSurfaceSupportsType = (MControlSurfaceSupportsType) theEObject;
			T result = caseMControlSurfaceSupportsType(mControlSurfaceSupportsType);
			if (result == null)
				result = caseComplexBaseType(mControlSurfaceSupportsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE: {
			MControlSurfaceSupportType mControlSurfaceSupportType = (MControlSurfaceSupportType) theEObject;
			T result = caseMControlSurfaceSupportType(mControlSurfaceSupportType);
			if (result == null)
				result = caseComplexBaseType(mControlSurfaceSupportType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCREW_MEMBERS_TYPE: {
			MCrewMembersType mCrewMembersType = (MCrewMembersType) theEObject;
			T result = caseMCrewMembersType(mCrewMembersType);
			if (result == null)
				result = caseComplexBaseType(mCrewMembersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MCREW_SEATS_TYPE: {
			MCrewSeatsType mCrewSeatsType = (MCrewSeatsType) theEObject;
			T result = caseMCrewSeatsType(mCrewSeatsType);
			if (result == null)
				result = caseComplexBaseType(mCrewSeatsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MDE_ICING_TYPE: {
			MDeIcingType mDeIcingType = (MDeIcingType) theEObject;
			T result = caseMDeIcingType(mDeIcingType);
			if (result == null)
				result = caseComplexBaseType(mDeIcingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MDOCUMENTS_TOOLS_TYPE: {
			MDocumentsToolsType mDocumentsToolsType = (MDocumentsToolsType) theEObject;
			T result = caseMDocumentsToolsType(mDocumentsToolsType);
			if (result == null)
				result = caseComplexBaseType(mDocumentsToolsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MDOORS_TYPE: {
			MDoorsType mDoorsType = (MDoorsType) theEObject;
			T result = caseMDoorsType(mDoorsType);
			if (result == null)
				result = caseComplexBaseType(mDoorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MELECTRICAL_DISTRIBUTION_TYPE: {
			MElectricalDistributionType mElectricalDistributionType = (MElectricalDistributionType) theEObject;
			T result = caseMElectricalDistributionType(mElectricalDistributionType);
			if (result == null)
				result = caseComplexBaseType(mElectricalDistributionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MELECTRICAL_GENERATION_TYPE: {
			MElectricalGenerationType mElectricalGenerationType = (MElectricalGenerationType) theEObject;
			T result = caseMElectricalGenerationType(mElectricalGenerationType);
			if (result == null)
				result = caseComplexBaseType(mElectricalGenerationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEMERGENCY_EQUIPMENTS_TYPE: {
			MEmergencyEquipmentsType mEmergencyEquipmentsType = (MEmergencyEquipmentsType) theEObject;
			T result = caseMEmergencyEquipmentsType(mEmergencyEquipmentsType);
			if (result == null)
				result = caseComplexBaseType(mEmergencyEquipmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEMERGENCY_OXYGEN_SYSTEMS_TYPE: {
			MEmergencyOxygenSystemsType mEmergencyOxygenSystemsType = (MEmergencyOxygenSystemsType) theEObject;
			T result = caseMEmergencyOxygenSystemsType(mEmergencyOxygenSystemsType);
			if (result == null)
				result = caseComplexBaseType(mEmergencyOxygenSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEMPTY_UL_DS_TYPE: {
			MEmptyULDsType mEmptyULDsType = (MEmptyULDsType) theEObject;
			T result = caseMEmptyULDsType(mEmptyULDsType);
			if (result == null)
				result = caseComplexBaseType(mEmptyULDsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEMPTY_ULD_TYPE: {
			MEmptyULDType mEmptyULDType = (MEmptyULDType) theEObject;
			T result = caseMEmptyULDType(mEmptyULDType);
			if (result == null)
				result = caseComplexBaseType(mEmptyULDType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MENGINE_CONTROL_TYPE: {
			MEngineControlType mEngineControlType = (MEngineControlType) theEObject;
			T result = caseMEngineControlType(mEngineControlType);
			if (result == null)
				result = caseComplexBaseType(mEngineControlType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEQUIPPED_ENGINES_TYPE: {
			MEquippedEnginesType mEquippedEnginesType = (MEquippedEnginesType) theEObject;
			T result = caseMEquippedEnginesType(mEquippedEnginesType);
			if (result == null)
				result = caseComplexBaseType(mEquippedEnginesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MEXT_LIGHTINGS_TYPE: {
			MExtLightingsType mExtLightingsType = (MExtLightingsType) theEObject;
			T result = caseMExtLightingsType(mExtLightingsType);
			if (result == null)
				result = caseComplexBaseType(mExtLightingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIRE_PROTECTION_TYPE: {
			MFireProtectionType mFireProtectionType = (MFireProtectionType) theEObject;
			T result = caseMFireProtectionType(mFireProtectionType);
			if (result == null)
				result = caseComplexBaseType(mFireProtectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIXED_GALLEYS_TYPE: {
			MFixedGalleysType mFixedGalleysType = (MFixedGalleysType) theEObject;
			T result = caseMFixedGalleysType(mFixedGalleysType);
			if (result == null)
				result = caseComplexBaseType(mFixedGalleysType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIXED_LEADING_EDGES_TYPE: {
			MFixedLeadingEdgesType mFixedLeadingEdgesType = (MFixedLeadingEdgesType) theEObject;
			T result = caseMFixedLeadingEdgesType(mFixedLeadingEdgesType);
			if (result == null)
				result = caseComplexBaseType(mFixedLeadingEdgesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIXED_LEADING_EDGE_TYPE: {
			MFixedLeadingEdgeType mFixedLeadingEdgeType = (MFixedLeadingEdgeType) theEObject;
			T result = caseMFixedLeadingEdgeType(mFixedLeadingEdgeType);
			if (result == null)
				result = caseComplexBaseType(mFixedLeadingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIXED_TRAILING_EDGES_TYPE: {
			MFixedTrailingEdgesType mFixedTrailingEdgesType = (MFixedTrailingEdgesType) theEObject;
			T result = caseMFixedTrailingEdgesType(mFixedTrailingEdgesType);
			if (result == null)
				result = caseComplexBaseType(mFixedTrailingEdgesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE: {
			MFixedTrailingEdgeType mFixedTrailingEdgeType = (MFixedTrailingEdgeType) theEObject;
			T result = caseMFixedTrailingEdgeType(mFixedTrailingEdgeType);
			if (result == null)
				result = caseComplexBaseType(mFixedTrailingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFLIGHT_CONTROLS_TYPE: {
			MFlightControlsType mFlightControlsType = (MFlightControlsType) theEObject;
			T result = caseMFlightControlsType(mFlightControlsType);
			if (result == null)
				result = caseComplexBaseType(mFlightControlsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFLOOR_COVERINGS_TYPE: {
			MFloorCoveringsType mFloorCoveringsType = (MFloorCoveringsType) theEObject;
			T result = caseMFloorCoveringsType(mFloorCoveringsType);
			if (result == null)
				result = caseComplexBaseType(mFloorCoveringsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFRAMES_TYPE: {
			MFramesType mFramesType = (MFramesType) theEObject;
			T result = caseMFramesType(mFramesType);
			if (result == null)
				result = caseComplexBaseType(mFramesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFRESH_WATER_SYSTEMS_TYPE: {
			MFreshWaterSystemsType mFreshWaterSystemsType = (MFreshWaterSystemsType) theEObject;
			T result = caseMFreshWaterSystemsType(mFreshWaterSystemsType);
			if (result == null)
				result = caseComplexBaseType(mFreshWaterSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFUEL_SYSTEM_TYPE: {
			MFuelSystemType mFuelSystemType = (MFuelSystemType) theEObject;
			T result = caseMFuelSystemType(mFuelSystemType);
			if (result == null)
				result = caseComplexBaseType(mFuelSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFUEL_TYPE: {
			MFuelType mFuelType = (MFuelType) theEObject;
			T result = caseMFuelType(mFuelType);
			if (result == null)
				result = caseComplexBaseType(mFuelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFURNISHING_TYPE: {
			MFurnishingType mFurnishingType = (MFurnishingType) theEObject;
			T result = caseMFurnishingType(mFurnishingType);
			if (result == null)
				result = caseComplexBaseType(mFurnishingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFUSELAGES_STRUCTURE_TYPE: {
			MFuselagesStructureType mFuselagesStructureType = (MFuselagesStructureType) theEObject;
			T result = caseMFuselagesStructureType(mFuselagesStructureType);
			if (result == null)
				result = caseComplexBaseType(mFuselagesStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE: {
			MFuselageStructureType mFuselageStructureType = (MFuselageStructureType) theEObject;
			T result = caseMFuselageStructureType(mFuselageStructureType);
			if (result == null)
				result = caseComplexBaseType(mFuselageStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MHYDRAULIC_DISTRIBUTION_TYPE: {
			MHydraulicDistributionType mHydraulicDistributionType = (MHydraulicDistributionType) theEObject;
			T result = caseMHydraulicDistributionType(mHydraulicDistributionType);
			if (result == null)
				result = caseComplexBaseType(mHydraulicDistributionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MHYDRAULIC_GENERATION_TYPE: {
			MHydraulicGenerationType mHydraulicGenerationType = (MHydraulicGenerationType) theEObject;
			T result = caseMHydraulicGenerationType(mHydraulicGenerationType);
			if (result == null)
				result = caseComplexBaseType(mHydraulicGenerationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MIFE_SYSTEMS_TYPE: {
			MIFESystemsType mifeSystemsType = (MIFESystemsType) theEObject;
			T result = caseMIFESystemsType(mifeSystemsType);
			if (result == null)
				result = caseComplexBaseType(mifeSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MINSTRUMENT_PANEL_TYPE: {
			MInstrumentPanelType mInstrumentPanelType = (MInstrumentPanelType) theEObject;
			T result = caseMInstrumentPanelType(mInstrumentPanelType);
			if (result == null)
				result = caseComplexBaseType(mInstrumentPanelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MINSULATIONS_TYPE: {
			MInsulationsType mInsulationsType = (MInsulationsType) theEObject;
			T result = caseMInsulationsType(mInsulationsType);
			if (result == null)
				result = caseComplexBaseType(mInsulationsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MINTEGRATED_MODULAR_AVIONICS_TYPE: {
			MIntegratedModularAvionicsType mIntegratedModularAvionicsType = (MIntegratedModularAvionicsType) theEObject;
			T result = caseMIntegratedModularAvionicsType(mIntegratedModularAvionicsType);
			if (result == null)
				result = caseComplexBaseType(mIntegratedModularAvionicsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MINTER_GAS_SYSTEM_TYPE: {
			MInterGasSystemType mInterGasSystemType = (MInterGasSystemType) theEObject;
			T result = caseMInterGasSystemType(mInterGasSystemType);
			if (result == null)
				result = caseComplexBaseType(mInterGasSystemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_DEFINITIONS_TYPE: {
			MissionDefinitionsType missionDefinitionsType = (MissionDefinitionsType) theEObject;
			T result = caseMissionDefinitionsType(missionDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(missionDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE: {
			MissionPerformanceMapDefinitionType missionPerformanceMapDefinitionType = (MissionPerformanceMapDefinitionType) theEObject;
			T result = caseMissionPerformanceMapDefinitionType(missionPerformanceMapDefinitionType);
			if (result == null)
				result = caseComplexBaseType(missionPerformanceMapDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE: {
			MissionSegmentBlockConstraintsType missionSegmentBlockConstraintsType = (MissionSegmentBlockConstraintsType) theEObject;
			T result = caseMissionSegmentBlockConstraintsType(missionSegmentBlockConstraintsType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentBlockConstraintsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE: {
			MissionSegmentBlocksType missionSegmentBlocksType = (MissionSegmentBlocksType) theEObject;
			T result = caseMissionSegmentBlocksType(missionSegmentBlocksType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentBlocksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE: {
			MissionSegmentBlockType missionSegmentBlockType = (MissionSegmentBlockType) theEObject;
			T result = caseMissionSegmentBlockType(missionSegmentBlockType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentBlockType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE: {
			MissionSegmentEndConditionType missionSegmentEndConditionType = (MissionSegmentEndConditionType) theEObject;
			T result = caseMissionSegmentEndConditionType(missionSegmentEndConditionType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentEndConditionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENTS_TYPE: {
			MissionSegmentsType missionSegmentsType = (MissionSegmentsType) theEObject;
			T result = caseMissionSegmentsType(missionSegmentsType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_SEGMENT_TYPE: {
			MissionSegmentType missionSegmentType = (MissionSegmentType) theEObject;
			T result = caseMissionSegmentType(missionSegmentType);
			if (result == null)
				result = caseComplexBaseType(missionSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_START_CONDITION_TYPE: {
			MissionStartConditionType missionStartConditionType = (MissionStartConditionType) theEObject;
			T result = caseMissionStartConditionType(missionStartConditionType);
			if (result == null)
				result = caseComplexBaseType(missionStartConditionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSIONS_TYPE: {
			MissionsType missionsType = (MissionsType) theEObject;
			T result = caseMissionsType(missionsType);
			if (result == null)
				result = caseComplexBaseType(missionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MISSION_TYPE: {
			MissionType missionType = (MissionType) theEObject;
			T result = caseMissionType(missionType);
			if (result == null)
				result = caseComplexBaseType(missionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MLANDING_GEARS_TYPE: {
			MLandingGearsType mLandingGearsType = (MLandingGearsType) theEObject;
			T result = caseMLandingGearsType(mLandingGearsType);
			if (result == null)
				result = caseComplexBaseType(mLandingGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MLANDING_GEAR_SUPPORTS_TYPE: {
			MLandingGearSupportsType mLandingGearSupportsType = (MLandingGearSupportsType) theEObject;
			T result = caseMLandingGearSupportsType(mLandingGearSupportsType);
			if (result == null)
				result = caseComplexBaseType(mLandingGearSupportsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MLAVATORIES_TYPE: {
			MLavatoriesType mLavatoriesType = (MLavatoriesType) theEObject;
			T result = caseMLavatoriesType(mLavatoriesType);
			if (result == null)
				result = caseComplexBaseType(mLavatoriesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MLININGS_TYPE: {
			MLiningsType mLiningsType = (MLiningsType) theEObject;
			T result = caseMLiningsType(mLiningsType);
			if (result == null)
				result = caseComplexBaseType(mLiningsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMAIN_GEARS_TYPE: {
			MMainGearsType mMainGearsType = (MMainGearsType) theEObject;
			T result = caseMMainGearsType(mMainGearsType);
			if (result == null)
				result = caseComplexBaseType(mMainGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE: {
			MManufacturerEmptyType mManufacturerEmptyType = (MManufacturerEmptyType) theEObject;
			T result = caseMManufacturerEmptyType(mManufacturerEmptyType);
			if (result == null)
				result = caseComplexBaseType(mManufacturerEmptyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMILLITARY_SYSTEMS_TYPE: {
			MMillitarySystemsType mMillitarySystemsType = (MMillitarySystemsType) theEObject;
			T result = caseMMillitarySystemsType(mMillitarySystemsType);
			if (result == null)
				result = caseComplexBaseType(mMillitarySystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMISCELLANEOUS_TYPE: {
			MMiscellaneousType mMiscellaneousType = (MMiscellaneousType) theEObject;
			T result = caseMMiscellaneousType(mMiscellaneousType);
			if (result == null)
				result = caseComplexBaseType(mMiscellaneousType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMOVEABLE_LEADING_EDGES_TYPE: {
			MMoveableLeadingEdgesType mMoveableLeadingEdgesType = (MMoveableLeadingEdgesType) theEObject;
			T result = caseMMoveableLeadingEdgesType(mMoveableLeadingEdgesType);
			if (result == null)
				result = caseComplexBaseType(mMoveableLeadingEdgesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMOVEABLE_LEADING_EDGE_TYPE: {
			MMoveableLeadingEdgeType mMoveableLeadingEdgeType = (MMoveableLeadingEdgeType) theEObject;
			T result = caseMMoveableLeadingEdgeType(mMoveableLeadingEdgeType);
			if (result == null)
				result = caseComplexBaseType(mMoveableLeadingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMOVEABLES_TYPE: {
			MMoveablesType mMoveablesType = (MMoveablesType) theEObject;
			T result = caseMMoveablesType(mMoveablesType);
			if (result == null)
				result = caseComplexBaseType(mMoveablesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE: {
			MMoveableTrailingEdgeType mMoveableTrailingEdgeType = (MMoveableTrailingEdgeType) theEObject;
			T result = caseMMoveableTrailingEdgeType(mMoveableTrailingEdgeType);
			if (result == null)
				result = caseComplexBaseType(mMoveableTrailingEdgeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MNAVIGATION_TYPE: {
			MNavigationType mNavigationType = (MNavigationType) theEObject;
			T result = caseMNavigationType(mNavigationType);
			if (result == null)
				result = caseComplexBaseType(mNavigationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MNOSE_GEARS_TYPE: {
			MNoseGearsType mNoseGearsType = (MNoseGearsType) theEObject;
			T result = caseMNoseGearsType(mNoseGearsType);
			if (result == null)
				result = caseComplexBaseType(mNoseGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MODEL_TYPE: {
			ModelType modelType = (ModelType) theEObject;
			T result = caseModelType(modelType);
			if (result == null)
				result = caseStringBaseType(modelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE: {
			MonetaryValuesAnalysisType monetaryValuesAnalysisType = (MonetaryValuesAnalysisType) theEObject;
			T result = caseMonetaryValuesAnalysisType(monetaryValuesAnalysisType);
			if (result == null)
				result = caseComplexBaseType(monetaryValuesAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MOPERATOR_ITEMS_TYPE: {
			MOperatorItemsType mOperatorItemsType = (MOperatorItemsType) theEObject;
			T result = caseMOperatorItemsType(mOperatorItemsType);
			if (result == null)
				result = caseComplexBaseType(mOperatorItemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MOVERHEAD_BINS_TYPE: {
			MOverheadBinsType mOverheadBinsType = (MOverheadBinsType) theEObject;
			T result = caseMOverheadBinsType(mOverheadBinsType);
			if (result == null)
				result = caseComplexBaseType(mOverheadBinsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPART_STOW_DOORS_TYPE: {
			MPartStowDoorsType mPartStowDoorsType = (MPartStowDoorsType) theEObject;
			T result = caseMPartStowDoorsType(mPartStowDoorsType);
			if (result == null)
				result = caseComplexBaseType(mPartStowDoorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPASSENGERS_TYPE: {
			MPassengersType mPassengersType = (MPassengersType) theEObject;
			T result = caseMPassengersType(mPassengersType);
			if (result == null)
				result = caseComplexBaseType(mPassengersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPASSENGER_TYPE: {
			MPassengerType mPassengerType = (MPassengerType) theEObject;
			T result = caseMPassengerType(mPassengerType);
			if (result == null)
				result = caseComplexBaseType(mPassengerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPAX_TYPE: {
			MPaxType mPaxType = (MPaxType) theEObject;
			T result = caseMPaxType(mPaxType);
			if (result == null)
				result = caseComplexBaseType(mPaxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPAYLOAD_TYPE: {
			MPayloadType mPayloadType = (MPayloadType) theEObject;
			T result = caseMPayloadType(mPayloadType);
			if (result == null)
				result = caseComplexBaseType(mPayloadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPOWER_UNITS_TYPE: {
			MPowerUnitsType mPowerUnitsType = (MPowerUnitsType) theEObject;
			T result = caseMPowerUnitsType(mPowerUnitsType);
			if (result == null)
				result = caseComplexBaseType(mPowerUnitsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPYLON_ATTACHMENTS_TYPE: {
			MPylonAttachmentsType mPylonAttachmentsType = (MPylonAttachmentsType) theEObject;
			T result = caseMPylonAttachmentsType(mPylonAttachmentsType);
			if (result == null)
				result = caseComplexBaseType(mPylonAttachmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MPYLONS_TYPE: {
			MPylonsType mPylonsType = (MPylonsType) theEObject;
			T result = caseMPylonsType(mPylonsType);
			if (result == null)
				result = caseComplexBaseType(mPylonsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MRIBS_TYPE: {
			MRibsType mRibsType = (MRibsType) theEObject;
			T result = caseMRibsType(mRibsType);
			if (result == null)
				result = caseComplexBaseType(mRibsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MRIB_TYPE: {
			MRibType mRibType = (MRibType) theEObject;
			T result = caseMRibType(mRibType);
			if (result == null)
				result = caseGenericMassType(mRibType);
			if (result == null)
				result = caseComplexBaseType(mRibType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSEATS_TYPE: {
			MSeatsType mSeatsType = (MSeatsType) theEObject;
			T result = caseMSeatsType(mSeatsType);
			if (result == null)
				result = caseComplexBaseType(mSeatsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSHELLS_TYPE: {
			MShellsType mShellsType = (MShellsType) theEObject;
			T result = caseMShellsType(mShellsType);
			if (result == null)
				result = caseComplexBaseType(mShellsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSHELL_TYPE: {
			MShellType mShellType = (MShellType) theEObject;
			T result = caseMShellType(mShellType);
			if (result == null)
				result = caseComplexBaseType(mShellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSKIN_PANELS_TYPE: {
			MSkinPanelsType mSkinPanelsType = (MSkinPanelsType) theEObject;
			T result = caseMSkinPanelsType(mSkinPanelsType);
			if (result == null)
				result = caseComplexBaseType(mSkinPanelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSKINS_TYPE: {
			MSkinsType mSkinsType = (MSkinsType) theEObject;
			T result = caseMSkinsType(mSkinsType);
			if (result == null)
				result = caseComplexBaseType(mSkinsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSPARS_TYPE: {
			MSparsType mSparsType = (MSparsType) theEObject;
			T result = caseMSparsType(mSparsType);
			if (result == null)
				result = caseComplexBaseType(mSparsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSPECIAL_STRUCTURES_TYPE: {
			MSpecialStructuresType mSpecialStructuresType = (MSpecialStructuresType) theEObject;
			T result = caseMSpecialStructuresType(mSpecialStructuresType);
			if (result == null)
				result = caseComplexBaseType(mSpecialStructuresType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSPOILERS_TYPE: {
			MSpoilersType mSpoilersType = (MSpoilersType) theEObject;
			T result = caseMSpoilersType(mSpoilersType);
			if (result == null)
				result = caseComplexBaseType(mSpoilersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSTRINGERS_TYPE: {
			MStringersType mStringersType = (MStringersType) theEObject;
			T result = caseMStringersType(mStringersType);
			if (result == null)
				result = caseComplexBaseType(mStringersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSTRUCTURE_TYPE: {
			MStructureType mStructureType = (MStructureType) theEObject;
			T result = caseMStructureType(mStructureType);
			if (result == null)
				result = caseComplexBaseType(mStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MSYSTEMS_TYPE: {
			MSystemsType mSystemsType = (MSystemsType) theEObject;
			T result = caseMSystemsType(mSystemsType);
			if (result == null)
				result = caseComplexBaseType(mSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE: {
			MTrailingEdgeDevicesType mTrailingEdgeDevicesType = (MTrailingEdgeDevicesType) theEObject;
			T result = caseMTrailingEdgeDevicesType(mTrailingEdgeDevicesType);
			if (result == null)
				result = caseComplexBaseType(mTrailingEdgeDevicesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE: {
			MTrailingEdgeDeviceType mTrailingEdgeDeviceType = (MTrailingEdgeDeviceType) theEObject;
			T result = caseMTrailingEdgeDeviceType(mTrailingEdgeDeviceType);
			if (result == null)
				result = caseComplexBaseType(mTrailingEdgeDeviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MULD_CONTENTS_TYPE: {
			MULDContentsType muldContentsType = (MULDContentsType) theEObject;
			T result = caseMULDContentsType(muldContentsType);
			if (result == null)
				result = caseComplexBaseType(muldContentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MULD_CONTENT_TYPE: {
			MULDContentType muldContentType = (MULDContentType) theEObject;
			T result = caseMULDContentType(muldContentType);
			if (result == null)
				result = caseComplexBaseType(muldContentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MVACUUM_WASTE_SYSTEMS_TYPE: {
			MVacuumWasteSystemsType mVacuumWasteSystemsType = (MVacuumWasteSystemsType) theEObject;
			T result = caseMVacuumWasteSystemsType(mVacuumWasteSystemsType);
			if (result == null)
				result = caseComplexBaseType(mVacuumWasteSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MWASTE_WATER_SYSTEMS_TYPE: {
			MWasteWaterSystemsType mWasteWaterSystemsType = (MWasteWaterSystemsType) theEObject;
			T result = caseMWasteWaterSystemsType(mWasteWaterSystemsType);
			if (result == null)
				result = caseComplexBaseType(mWasteWaterSystemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MWINDOWS_TYPE: {
			MWindowsType mWindowsType = (MWindowsType) theEObject;
			T result = caseMWindowsType(mWindowsType);
			if (result == null)
				result = caseComplexBaseType(mWindowsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MWING_BOX_TYPE: {
			MWingBoxType mWingBoxType = (MWingBoxType) theEObject;
			T result = caseMWingBoxType(mWingBoxType);
			if (result == null)
				result = caseComplexBaseType(mWingBoxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MWINGS_STRUCTURE_TYPE: {
			MWingsStructureType mWingsStructureType = (MWingsStructureType) theEObject;
			T result = caseMWingsStructureType(mWingsStructureType);
			if (result == null)
				result = caseComplexBaseType(mWingsStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.MWING_STRUCTURE_TYPE: {
			MWingStructureType mWingStructureType = (MWingStructureType) theEObject;
			T result = caseMWingStructureType(mWingStructureType);
			if (result == null)
				result = caseComplexBaseType(mWingStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE: {
			NacelleCenterCowlType nacelleCenterCowlType = (NacelleCenterCowlType) theEObject;
			T result = caseNacelleCenterCowlType(nacelleCenterCowlType);
			if (result == null)
				result = caseComplexBaseType(nacelleCenterCowlType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_COWL_TYPE: {
			NacelleCowlType nacelleCowlType = (NacelleCowlType) theEObject;
			T result = caseNacelleCowlType(nacelleCowlType);
			if (result == null)
				result = caseComplexBaseType(nacelleCowlType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE: {
			NacelleGuideCurvesType nacelleGuideCurvesType = (NacelleGuideCurvesType) theEObject;
			T result = caseNacelleGuideCurvesType(nacelleGuideCurvesType);
			if (result == null)
				result = caseComplexBaseType(nacelleGuideCurvesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE: {
			NacelleGuideCurveType nacelleGuideCurveType = (NacelleGuideCurveType) theEObject;
			T result = caseNacelleGuideCurveType(nacelleGuideCurveType);
			if (result == null)
				result = caseComplexBaseType(nacelleGuideCurveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_PROFILES_TYPE: {
			NacelleProfilesType nacelleProfilesType = (NacelleProfilesType) theEObject;
			T result = caseNacelleProfilesType(nacelleProfilesType);
			if (result == null)
				result = caseComplexBaseType(nacelleProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_SECTIONS_TYPE: {
			NacelleSectionsType nacelleSectionsType = (NacelleSectionsType) theEObject;
			T result = caseNacelleSectionsType(nacelleSectionsType);
			if (result == null)
				result = caseComplexBaseType(nacelleSectionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NACELLE_SECTION_TYPE: {
			NacelleSectionType nacelleSectionType = (NacelleSectionType) theEObject;
			T result = caseNacelleSectionType(nacelleSectionType);
			if (result == null)
				result = caseComplexBaseType(nacelleSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NODAL_LOADS_TYPE: {
			NodalLoadsType nodalLoadsType = (NodalLoadsType) theEObject;
			T result = caseNodalLoadsType(nodalLoadsType);
			if (result == null)
				result = caseComplexBaseType(nodalLoadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NODAL_LOAD_TYPE: {
			NodalLoadType nodalLoadType = (NodalLoadType) theEObject;
			T result = caseNodalLoadType(nodalLoadType);
			if (result == null)
				result = caseComplexBaseType(nodalLoadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NOISE_ANALYSIS_TYPE: {
			NoiseAnalysisType noiseAnalysisType = (NoiseAnalysisType) theEObject;
			T result = caseNoiseAnalysisType(noiseAnalysisType);
			if (result == null)
				result = caseComplexBaseType(noiseAnalysisType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE: {
			NoseGearGlobalType noseGearGlobalType = (NoseGearGlobalType) theEObject;
			T result = caseNoseGearGlobalType(noseGearGlobalType);
			if (result == null)
				result = caseComplexBaseType(noseGearGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NOSE_GEARS_TYPE: {
			NoseGearsType noseGearsType = (NoseGearsType) theEObject;
			T result = caseNoseGearsType(noseGearsType);
			if (result == null)
				result = caseComplexBaseType(noseGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.NOSE_GEAR_TYPE: {
			NoseGearType noseGearType = (NoseGearType) theEObject;
			T result = caseNoseGearType(noseGearType);
			if (result == null)
				result = caseComplexBaseType(noseGearType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.OEM_TYPE: {
			OEMType oemType = (OEMType) theEObject;
			T result = caseOEMType(oemType);
			if (result == null)
				result = caseComplexBaseType(oemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.OPERATIONAL_CASES_TYPE: {
			OperationalCasesType operationalCasesType = (OperationalCasesType) theEObject;
			T result = caseOperationalCasesType(operationalCasesType);
			if (result == null)
				result = caseComplexBaseType(operationalCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.OPERATIONAL_CASE_TYPE: {
			OperationalCaseType operationalCaseType = (OperationalCaseType) theEObject;
			T result = caseOperationalCaseType(operationalCaseType);
			if (result == null)
				result = caseComplexBaseType(operationalCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE: {
			OperationLimitIncrementsType operationLimitIncrementsType = (OperationLimitIncrementsType) theEObject;
			T result = caseOperationLimitIncrementsType(operationLimitIncrementsType);
			if (result == null)
				result = caseComplexBaseType(operationLimitIncrementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ORIENTATION_TYPE: {
			OrientationType orientationType = (OrientationType) theEObject;
			T result = caseOrientationType(orientationType);
			if (result == null)
				result = caseComplexBaseType(orientationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE: {
			OrthotropicShellPropertiesType orthotropicShellPropertiesType = (OrthotropicShellPropertiesType) theEObject;
			T result = caseOrthotropicShellPropertiesType(orthotropicShellPropertiesType);
			if (result == null)
				result = caseComplexBaseType(orthotropicShellPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE: {
			OrthotropicSolidPropertiesType orthotropicSolidPropertiesType = (OrthotropicSolidPropertiesType) theEObject;
			T result = caseOrthotropicSolidPropertiesType(orthotropicSolidPropertiesType);
			if (result == null)
				result = caseComplexBaseType(orthotropicSolidPropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE: {
			OuterCutOutProfileType outerCutOutProfileType = (OuterCutOutProfileType) theEObject;
			T result = caseOuterCutOutProfileType(outerCutOutProfileType);
			if (result == null)
				result = caseComplexBaseType(outerCutOutProfileType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PARAMETERS_TYPE: {
			ParametersType parametersType = (ParametersType) theEObject;
			T result = caseParametersType(parametersType);
			if (result == null)
				result = caseComplexBaseType(parametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PARAMETER_TYPE: {
			ParameterType parameterType = (ParameterType) theEObject;
			T result = caseParameterType(parameterType);
			if (result == null)
				result = caseComplexBaseType(parameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE: {
			PaxCrossBeamsAssemblyType paxCrossBeamsAssemblyType = (PaxCrossBeamsAssemblyType) theEObject;
			T result = casePaxCrossBeamsAssemblyType(paxCrossBeamsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(paxCrossBeamsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE: {
			PaxCrossBeamStrutsAssemblyType paxCrossBeamStrutsAssemblyType = (PaxCrossBeamStrutsAssemblyType) theEObject;
			T result = casePaxCrossBeamStrutsAssemblyType(paxCrossBeamStrutsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(paxCrossBeamStrutsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE: {
			PaxDoorsAssemblyType paxDoorsAssemblyType = (PaxDoorsAssemblyType) theEObject;
			T result = casePaxDoorsAssemblyType(paxDoorsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(paxDoorsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE: {
			PayloadGlobalType payloadGlobalType = (PayloadGlobalType) theEObject;
			T result = casePayloadGlobalType(payloadGlobalType);
			if (result == null)
				result = caseComplexBaseType(payloadGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PERFORMANCE_CASES_TYPE: {
			PerformanceCasesType performanceCasesType = (PerformanceCasesType) theEObject;
			T result = casePerformanceCasesType(performanceCasesType);
			if (result == null)
				result = caseComplexBaseType(performanceCasesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PERFORMANCE_CASE_TYPE: {
			PerformanceCaseType performanceCaseType = (PerformanceCaseType) theEObject;
			T result = casePerformanceCaseType(performanceCaseType);
			if (result == null)
				result = caseComplexBaseType(performanceCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE: {
			PerformanceMapSelectionType performanceMapSelectionType = (PerformanceMapSelectionType) theEObject;
			T result = casePerformanceMapSelectionType(performanceMapSelectionType);
			if (result == null)
				result = caseComplexBaseType(performanceMapSelectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE: {
			PerformanceRequirementsType performanceRequirementsType = (PerformanceRequirementsType) theEObject;
			T result = casePerformanceRequirementsType(performanceRequirementsType);
			if (result == null)
				result = caseComplexBaseType(performanceRequirementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE: {
			PerformanceTargetsGlobalType performanceTargetsGlobalType = (PerformanceTargetsGlobalType) theEObject;
			T result = casePerformanceTargetsGlobalType(performanceTargetsGlobalType);
			if (result == null)
				result = caseComplexBaseType(performanceTargetsGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PHI_TYPE: {
			PhiType phiType = (PhiType) theEObject;
			T result = casePhiType(phiType);
			if (result == null)
				result = caseDoubleBaseType(phiType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PISTON_TYPE: {
			PistonType pistonType = (PistonType) theEObject;
			T result = casePistonType(pistonType);
			if (result == null)
				result = caseStrutType(pistonType);
			if (result == null)
				result = caseComplexBaseType(pistonType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE: {
			PlasticityCurvePointsType plasticityCurvePointsType = (PlasticityCurvePointsType) theEObject;
			T result = casePlasticityCurvePointsType(plasticityCurvePointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE: {
			PlasticityCurvePointType plasticityCurvePointType = (PlasticityCurvePointType) theEObject;
			T result = casePlasticityCurvePointType(plasticityCurvePointType);
			if (result == null)
				result = caseComplexBaseType(plasticityCurvePointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PLASTICITY_CURVES_TYPE: {
			PlasticityCurvesType plasticityCurvesType = (PlasticityCurvesType) theEObject;
			T result = casePlasticityCurvesType(plasticityCurvesType);
			if (result == null)
				result = caseComplexBaseType(plasticityCurvesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PLASTICITY_CURVE_TYPE: {
			PlasticityCurveType plasticityCurveType = (PlasticityCurveType) theEObject;
			T result = casePlasticityCurveType(plasticityCurveType);
			if (result == null)
				result = caseComplexBaseType(plasticityCurveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_ABS_REL_TYPE: {
			PointAbsRelType pointAbsRelType = (PointAbsRelType) theEObject;
			T result = casePointAbsRelType(pointAbsRelType);
			if (result == null)
				result = caseComplexBaseType(pointAbsRelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_CONSTRAINT_TYPE: {
			PointConstraintType pointConstraintType = (PointConstraintType) theEObject;
			T result = casePointConstraintType(pointConstraintType);
			if (result == null)
				result = caseComplexBaseType(pointConstraintType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE: {
			PointListRelXYZVectorType pointListRelXYZVectorType = (PointListRelXYZVectorType) theEObject;
			T result = casePointListRelXYZVectorType(pointListRelXYZVectorType);
			if (result == null)
				result = caseComplexBaseType(pointListRelXYZVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_LIST_TYPE: {
			PointListType pointListType = (PointListType) theEObject;
			T result = casePointListType(pointListType);
			if (result == null)
				result = caseComplexBaseType(pointListType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_LIST_XY_TYPE: {
			PointListXYType pointListXYType = (PointListXYType) theEObject;
			T result = casePointListXYType(pointListXYType);
			if (result == null)
				result = caseComplexBaseType(pointListXYType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_LIST_XY_VECTOR_TYPE: {
			PointListXYVectorType pointListXYVectorType = (PointListXYVectorType) theEObject;
			T result = casePointListXYVectorType(pointListXYVectorType);
			if (result == null)
				result = caseComplexBaseType(pointListXYVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_LIST_XYZ_VECTOR_TYPE: {
			PointListXYZVectorType pointListXYZVectorType = (PointListXYZVectorType) theEObject;
			T result = casePointListXYZVectorType(pointListXYZVectorType);
			if (result == null)
				result = caseComplexBaseType(pointListXYZVectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_PERFORMANCES_TYPE: {
			PointPerformancesType pointPerformancesType = (PointPerformancesType) theEObject;
			T result = casePointPerformancesType(pointPerformancesType);
			if (result == null)
				result = caseComplexBaseType(pointPerformancesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_PERFORMANCE_TYPE: {
			PointPerformanceType pointPerformanceType = (PointPerformanceType) theEObject;
			T result = casePointPerformanceType(pointPerformanceType);
			if (result == null)
				result = caseComplexBaseType(pointPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_TYPE: {
			PointType pointType = (PointType) theEObject;
			T result = casePointType(pointType);
			if (result == null)
				result = caseComplexBaseType(pointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_XTYPE: {
			PointXType pointXType = (PointXType) theEObject;
			T result = casePointXType(pointXType);
			if (result == null)
				result = caseComplexBaseType(pointXType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_XY_TYPE: {
			PointXYType pointXYType = (PointXYType) theEObject;
			T result = casePointXYType(pointXYType);
			if (result == null)
				result = caseComplexBaseType(pointXYType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_XYZ_TYPE: {
			PointXYZType pointXYZType = (PointXYZType) theEObject;
			T result = casePointXYZType(pointXYZType);
			if (result == null)
				result = caseComplexBaseType(pointXYZType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_XZ_TYPE: {
			PointXZType pointXZType = (PointXZType) theEObject;
			T result = casePointXZType(pointXZType);
			if (result == null)
				result = caseComplexBaseType(pointXZType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_YTYPE: {
			PointYType pointYType = (PointYType) theEObject;
			T result = casePointYType(pointYType);
			if (result == null)
				result = caseComplexBaseType(pointYType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_YZ_TYPE: {
			PointYZType pointYZType = (PointYZType) theEObject;
			T result = casePointYZType(pointYZType);
			if (result == null)
				result = caseComplexBaseType(pointYZType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POINT_ZTYPE: {
			PointZType pointZType = (PointZType) theEObject;
			T result = casePointZType(pointZType);
			if (result == null)
				result = caseComplexBaseType(pointZType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POSITIONINGS_TYPE: {
			PositioningsType positioningsType = (PositioningsType) theEObject;
			T result = casePositioningsType(positioningsType);
			if (result == null)
				result = caseComplexBaseType(positioningsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.POSITIONING_TYPE: {
			PositioningType positioningType = (PositioningType) theEObject;
			T result = casePositioningType(positioningType);
			if (result == null)
				result = caseComplexBaseType(positioningType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE: {
			PressureBulkheadAssemblyPositionType pressureBulkheadAssemblyPositionType = (PressureBulkheadAssemblyPositionType) theEObject;
			T result = casePressureBulkheadAssemblyPositionType(pressureBulkheadAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(pressureBulkheadAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_TYPE: {
			PressureBulkheadAssemblyType pressureBulkheadAssemblyType = (PressureBulkheadAssemblyType) theEObject;
			T result = casePressureBulkheadAssemblyType(pressureBulkheadAssemblyType);
			if (result == null)
				result = caseComplexBaseType(pressureBulkheadAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE: {
			PressureBulkheadsType pressureBulkheadsType = (PressureBulkheadsType) theEObject;
			T result = casePressureBulkheadsType(pressureBulkheadsType);
			if (result == null)
				result = caseComplexBaseType(pressureBulkheadsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE: {
			PressureBulkheadType pressureBulkheadType = (PressureBulkheadType) theEObject;
			T result = casePressureBulkheadType(pressureBulkheadType);
			if (result == null)
				result = caseComplexBaseType(pressureBulkheadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PRIORITY_SETTING_TYPE: {
			PrioritySettingType prioritySettingType = (PrioritySettingType) theEObject;
			T result = casePrioritySettingType(prioritySettingType);
			if (result == null)
				result = caseStringBaseType(prioritySettingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE: {
			ProfileBasedStructuralElementsType profileBasedStructuralElementsType = (ProfileBasedStructuralElementsType) theEObject;
			T result = caseProfileBasedStructuralElementsType(profileBasedStructuralElementsType);
			if (result == null)
				result = caseComplexBaseType(profileBasedStructuralElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE: {
			ProfileBasedStructuralElementType profileBasedStructuralElementType = (ProfileBasedStructuralElementType) theEObject;
			T result = caseProfileBasedStructuralElementType(profileBasedStructuralElementType);
			if (result == null)
				result = caseComplexBaseType(profileBasedStructuralElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE: {
			ProfileGeometry2DType profileGeometry2DType = (ProfileGeometry2DType) theEObject;
			T result = caseProfileGeometry2DType(profileGeometry2DType);
			if (result == null)
				result = caseComplexBaseType(profileGeometry2DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PROFILE_GEOMETRY_TYPE: {
			ProfileGeometryType profileGeometryType = (ProfileGeometryType) theEObject;
			T result = caseProfileGeometryType(profileGeometryType);
			if (result == null)
				result = caseComplexBaseType(profileGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PROFILES_TYPE: {
			ProfilesType profilesType = (ProfilesType) theEObject;
			T result = caseProfilesType(profilesType);
			if (result == null)
				result = caseComplexBaseType(profilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE: {
			PylonAttachmentsType pylonAttachmentsType = (PylonAttachmentsType) theEObject;
			T result = casePylonAttachmentsType(pylonAttachmentsType);
			if (result == null)
				result = caseComplexBaseType(pylonAttachmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_ATTACHMENT_TYPE: {
			PylonAttachmentType pylonAttachmentType = (PylonAttachmentType) theEObject;
			T result = casePylonAttachmentType(pylonAttachmentType);
			if (result == null)
				result = caseComplexBaseType(pylonAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_BOX_TYPE: {
			PylonBoxType pylonBoxType = (PylonBoxType) theEObject;
			T result = casePylonBoxType(pylonBoxType);
			if (result == null)
				result = caseComplexBaseType(pylonBoxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_PINS_TYPE: {
			PylonPinsType pylonPinsType = (PylonPinsType) theEObject;
			T result = casePylonPinsType(pylonPinsType);
			if (result == null)
				result = caseComplexBaseType(pylonPinsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_PIN_TYPE: {
			PylonPinType pylonPinType = (PylonPinType) theEObject;
			T result = casePylonPinType(pylonPinType);
			if (result == null)
				result = caseComplexBaseType(pylonPinType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE: {
			PylonRibsDefinitionsType pylonRibsDefinitionsType = (PylonRibsDefinitionsType) theEObject;
			T result = casePylonRibsDefinitionsType(pylonRibsDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(pylonRibsDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE: {
			PylonRibsDefinitionType pylonRibsDefinitionType = (PylonRibsDefinitionType) theEObject;
			T result = casePylonRibsDefinitionType(pylonRibsDefinitionType);
			if (result == null)
				result = caseComplexBaseType(pylonRibsDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE: {
			PylonRibsPositioningType pylonRibsPositioningType = (PylonRibsPositioningType) theEObject;
			T result = casePylonRibsPositioningType(pylonRibsPositioningType);
			if (result == null)
				result = caseComplexBaseType(pylonRibsPositioningType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_SHACKLES_TYPE: {
			PylonShacklesType pylonShacklesType = (PylonShacklesType) theEObject;
			T result = casePylonShacklesType(pylonShacklesType);
			if (result == null)
				result = caseComplexBaseType(pylonShacklesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_SHACKLE_TYPE: {
			PylonShackleType pylonShackleType = (PylonShackleType) theEObject;
			T result = casePylonShackleType(pylonShackleType);
			if (result == null)
				result = caseComplexBaseType(pylonShackleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_SHELL_TYPE: {
			PylonShellType pylonShellType = (PylonShellType) theEObject;
			T result = casePylonShellType(pylonShellType);
			if (result == null)
				result = caseComplexBaseType(pylonShellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_STRUCTURE_TYPE: {
			PylonStructureType pylonStructureType = (PylonStructureType) theEObject;
			T result = casePylonStructureType(pylonStructureType);
			if (result == null)
				result = caseComplexBaseType(pylonStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.PYLON_STRUTS_TYPE: {
			PylonStrutsType pylonStrutsType = (PylonStrutsType) theEObject;
			T result = casePylonStrutsType(pylonStrutsType);
			if (result == null)
				result = caseComplexBaseType(pylonStrutsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE: {
			QuasiSteadyRotationType quasiSteadyRotationType = (QuasiSteadyRotationType) theEObject;
			T result = caseQuasiSteadyRotationType(quasiSteadyRotationType);
			if (result == null)
				result = caseComplexBaseType(quasiSteadyRotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RADIATIVE_FORCING_TYPE: {
			RadiativeForcingType radiativeForcingType = (RadiativeForcingType) theEObject;
			T result = caseRadiativeForcingType(radiativeForcingType);
			if (result == null)
				result = caseComplexBaseType(radiativeForcingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RECURRING_COST_TYPE: {
			RecurringCostType recurringCostType = (RecurringCostType) theEObject;
			T result = caseRecurringCostType(recurringCostType);
			if (result == null)
				result = caseComplexBaseType(recurringCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.REFERENCE_TYPE: {
			ReferenceType referenceType = (ReferenceType) theEObject;
			T result = caseReferenceType(referenceType);
			if (result == null)
				result = caseComplexBaseType(referenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.REQUIREMENT_TYPE: {
			RequirementType requirementType = (RequirementType) theEObject;
			T result = caseRequirementType(requirementType);
			if (result == null)
				result = caseComplexBaseType(requirementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE: {
			RibCrossingBehaviourType ribCrossingBehaviourType = (RibCrossingBehaviourType) theEObject;
			T result = caseRibCrossingBehaviourType(ribCrossingBehaviourType);
			if (result == null)
				result = caseStringBaseType(ribCrossingBehaviourType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE1: {
			RibCrossingBehaviourType1 ribCrossingBehaviourType1 = (RibCrossingBehaviourType1) theEObject;
			T result = caseRibCrossingBehaviourType1(ribCrossingBehaviourType1);
			if (result == null)
				result = caseStringBaseType(ribCrossingBehaviourType1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIB_IDENTIFICATION_TYPE: {
			RibIdentificationType ribIdentificationType = (RibIdentificationType) theEObject;
			T result = caseRibIdentificationType(ribIdentificationType);
			if (result == null)
				result = caseComplexBaseType(ribIdentificationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIB_ROTATION_TYPE: {
			RibRotationType ribRotationType = (RibRotationType) theEObject;
			T result = caseRibRotationType(ribRotationType);
			if (result == null)
				result = caseComplexBaseType(ribRotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE: {
			RivetJointAreaAssemblyPositionType rivetJointAreaAssemblyPositionType = (RivetJointAreaAssemblyPositionType) theEObject;
			T result = caseRivetJointAreaAssemblyPositionType(rivetJointAreaAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(rivetJointAreaAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE: {
			RivetJointAreasAssemblyType rivetJointAreasAssemblyType = (RivetJointAreasAssemblyType) theEObject;
			T result = caseRivetJointAreasAssemblyType(rivetJointAreasAssemblyType);
			if (result == null)
				result = caseComplexBaseType(rivetJointAreasAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIVETS_TYPE: {
			RivetsType rivetsType = (RivetsType) theEObject;
			T result = caseRivetsType(rivetsType);
			if (result == null)
				result = caseComplexBaseType(rivetsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RIVET_TYPE: {
			RivetType rivetType = (RivetType) theEObject;
			T result = caseRivetType(rivetType);
			if (result == null)
				result = caseComplexBaseType(rivetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTATION_CURVE_TYPE: {
			RotationCurveType rotationCurveType = (RotationCurveType) theEObject;
			T result = caseRotationCurveType(rotationCurveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROT_DIRECTION_TYPE: {
			RotDirectionType rotDirectionType = (RotDirectionType) theEObject;
			T result = caseRotDirectionType(rotDirectionType);
			if (result == null)
				result = caseStringBaseType(rotDirectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_AIRFOILS_TYPE: {
			RotorAirfoilsType rotorAirfoilsType = (RotorAirfoilsType) theEObject;
			T result = caseRotorAirfoilsType(rotorAirfoilsType);
			if (result == null)
				result = caseComplexBaseType(rotorAirfoilsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE: {
			RotorBladeAttachmentsType rotorBladeAttachmentsType = (RotorBladeAttachmentsType) theEObject;
			T result = caseRotorBladeAttachmentsType(rotorBladeAttachmentsType);
			if (result == null)
				result = caseComplexBaseType(rotorBladeAttachmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE: {
			RotorBladeAttachmentType rotorBladeAttachmentType = (RotorBladeAttachmentType) theEObject;
			T result = caseRotorBladeAttachmentType(rotorBladeAttachmentType);
			if (result == null)
				result = caseComplexBaseType(rotorBladeAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_BLADES_TYPE: {
			RotorBladesType rotorBladesType = (RotorBladesType) theEObject;
			T result = caseRotorBladesType(rotorBladesType);
			if (result == null)
				result = caseComplexBaseType(rotorBladesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE: {
			RotorcraftAnalysesType rotorcraftAnalysesType = (RotorcraftAnalysesType) theEObject;
			T result = caseRotorcraftAnalysesType(rotorcraftAnalysesType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftAnalysesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE: {
			RotorcraftGlobalType rotorcraftGlobalType = (RotorcraftGlobalType) theEObject;
			T result = caseRotorcraftGlobalType(rotorcraftGlobalType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MASS_BREAKDOWN_TYPE: {
			RotorcraftMassBreakdownType rotorcraftMassBreakdownType = (RotorcraftMassBreakdownType) theEObject;
			T result = caseRotorcraftMassBreakdownType(rotorcraftMassBreakdownType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftMassBreakdownType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE: {
			RotorcraftMassEMType rotorcraftMassEMType = (RotorcraftMassEMType) theEObject;
			T result = caseRotorcraftMassEMType(rotorcraftMassEMType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftMassEMType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE: {
			RotorcraftMassGroupLevel1Type rotorcraftMassGroupLevel1Type = (RotorcraftMassGroupLevel1Type) theEObject;
			T result = caseRotorcraftMassGroupLevel1Type(rotorcraftMassGroupLevel1Type);
			if (result == null)
				result = caseComplexBaseType(rotorcraftMassGroupLevel1Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL2_TYPE: {
			RotorcraftMassGroupLevel2Type rotorcraftMassGroupLevel2Type = (RotorcraftMassGroupLevel2Type) theEObject;
			T result = caseRotorcraftMassGroupLevel2Type(rotorcraftMassGroupLevel2Type);
			if (result == null)
				result = caseComplexBaseType(rotorcraftMassGroupLevel2Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MASS_OEM_TYPE: {
			RotorcraftMassOEMType rotorcraftMassOEMType = (RotorcraftMassOEMType) theEObject;
			T result = caseRotorcraftMassOEMType(rotorcraftMassOEMType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftMassOEMType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE: {
			RotorcraftModelType rotorcraftModelType = (RotorcraftModelType) theEObject;
			T result = caseRotorcraftModelType(rotorcraftModelType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORCRAFT_TYPE: {
			RotorcraftType rotorcraftType = (RotorcraftType) theEObject;
			T result = caseRotorcraftType(rotorcraftType);
			if (result == null)
				result = caseComplexBaseType(rotorcraftType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE: {
			RotorHubHingesType rotorHubHingesType = (RotorHubHingesType) theEObject;
			T result = caseRotorHubHingesType(rotorHubHingesType);
			if (result == null)
				result = caseComplexBaseType(rotorHubHingesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE: {
			RotorHubHingeType rotorHubHingeType = (RotorHubHingeType) theEObject;
			T result = caseRotorHubHingeType(rotorHubHingeType);
			if (result == null)
				result = caseComplexBaseType(rotorHubHingeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_HUB_TYPE: {
			RotorHubType rotorHubType = (RotorHubType) theEObject;
			T result = caseRotorHubType(rotorHubType);
			if (result == null)
				result = caseComplexBaseType(rotorHubType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTORS_TYPE: {
			RotorsType rotorsType = (RotorsType) theEObject;
			T result = caseRotorsType(rotorsType);
			if (result == null)
				result = caseComplexBaseType(rotorsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ROTOR_TYPE: {
			RotorType rotorType = (RotorType) theEObject;
			T result = caseRotorType(rotorType);
			if (result == null)
				result = caseComplexBaseType(rotorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RUNWAY_ILS_TYPE: {
			RunwayILSType runwayILSType = (RunwayILSType) theEObject;
			T result = caseRunwayILSType(runwayILSType);
			if (result == null)
				result = caseComplexBaseType(runwayILSType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RUNWAYS_TYPE: {
			RunwaysType runwaysType = (RunwaysType) theEObject;
			T result = caseRunwaysType(runwaysType);
			if (result == null)
				result = caseComplexBaseType(runwaysType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.RUNWAY_TYPE: {
			RunwayType runwayType = (RunwayType) theEObject;
			T result = caseRunwayType(runwayType);
			if (result == null)
				result = caseComplexBaseType(runwayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SEAT_MODULES_TYPE: {
			SeatModulesType seatModulesType = (SeatModulesType) theEObject;
			T result = caseSeatModulesType(seatModulesType);
			if (result == null)
				result = caseComplexBaseType(seatModulesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SEAT_MODULE_TYPE: {
			SeatModuleType seatModuleType = (SeatModuleType) theEObject;
			T result = caseSeatModuleType(seatModuleType);
			if (result == null)
				result = caseComplexBaseType(seatModuleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SECTION_DISTRIBUTION_MODE_TYPE: {
			SectionDistributionModeType sectionDistributionModeType = (SectionDistributionModeType) theEObject;
			T result = caseSectionDistributionModeType(sectionDistributionModeType);
			if (result == null)
				result = caseStringBaseType(sectionDistributionModeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SEGMENT_DIRECTION_TYPE: {
			SegmentDirectionType segmentDirectionType = (SegmentDirectionType) theEObject;
			T result = caseSegmentDirectionType(segmentDirectionType);
			if (result == null)
				result = caseStringBaseType(segmentDirectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SEGMENT_TYPE_TYPE: {
			SegmentTypeType segmentTypeType = (SegmentTypeType) theEObject;
			T result = caseSegmentTypeType(segmentTypeType);
			if (result == null)
				result = caseStringBaseType(segmentTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE: {
			ShaftLinkedComponentsType shaftLinkedComponentsType = (ShaftLinkedComponentsType) theEObject;
			T result = caseShaftLinkedComponentsType(shaftLinkedComponentsType);
			if (result == null)
				result = caseComplexBaseType(shaftLinkedComponentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHAFTS_TYPE: {
			ShaftsType shaftsType = (ShaftsType) theEObject;
			T result = caseShaftsType(shaftsType);
			if (result == null)
				result = caseComplexBaseType(shaftsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHAFT_TYPE: {
			ShaftType shaftType = (ShaftType) theEObject;
			T result = caseShaftType(shaftType);
			if (result == null)
				result = caseComplexBaseType(shaftType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET3_DTYPE: {
			Sheet3DType sheet3DType = (Sheet3DType) theEObject;
			T result = caseSheet3DType(sheet3DType);
			if (result == null)
				result = caseComplexBaseType(sheet3DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE: {
			SheetBasedStructuralElementsType sheetBasedStructuralElementsType = (SheetBasedStructuralElementsType) theEObject;
			T result = caseSheetBasedStructuralElementsType(sheetBasedStructuralElementsType);
			if (result == null)
				result = caseComplexBaseType(sheetBasedStructuralElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE: {
			SheetBasedStructuralElementType sheetBasedStructuralElementType = (SheetBasedStructuralElementType) theEObject;
			T result = caseSheetBasedStructuralElementType(sheetBasedStructuralElementType);
			if (result == null)
				result = caseComplexBaseType(sheetBasedStructuralElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_LIST3_DTYPE: {
			SheetList3DType sheetList3DType = (SheetList3DType) theEObject;
			T result = caseSheetList3DType(sheetList3DType);
			if (result == null)
				result = caseComplexBaseType(sheetList3DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_LIST_TYPE: {
			SheetListType sheetListType = (SheetListType) theEObject;
			T result = caseSheetListType(sheetListType);
			if (result == null)
				result = caseComplexBaseType(sheetListType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_POINTS_TYPE: {
			SheetPointsType sheetPointsType = (SheetPointsType) theEObject;
			T result = caseSheetPointsType(sheetPointsType);
			if (result == null)
				result = caseComplexBaseType(sheetPointsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SHEET_TYPE: {
			SheetType sheetType = (SheetType) theEObject;
			T result = caseSheetType(sheetType);
			if (result == null)
				result = caseComplexBaseType(sheetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SIDE_STRUTS_TYPE: {
			SideStrutsType sideStrutsType = (SideStrutsType) theEObject;
			T result = caseSideStrutsType(sideStrutsType);
			if (result == null)
				result = caseComplexBaseType(sideStrutsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SIDE_TYPE: {
			SideType sideType = (SideType) theEObject;
			T result = caseSideType(sideType);
			if (result == null)
				result = caseStringBaseType(sideType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SINGLE_GENERIC_MASS_TYPE: {
			SingleGenericMassType singleGenericMassType = (SingleGenericMassType) theEObject;
			T result = caseSingleGenericMassType(singleGenericMassType);
			if (result == null)
				result = caseComplexBaseType(singleGenericMassType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SIZING_TYPE_TYPE: {
			SizingTypeType sizingTypeType = (SizingTypeType) theEObject;
			T result = caseSizingTypeType(sizingTypeType);
			if (result == null)
				result = caseStringBaseType(sizingTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE: {
			SkidGearGlobalType skidGearGlobalType = (SkidGearGlobalType) theEObject;
			T result = caseSkidGearGlobalType(skidGearGlobalType);
			if (result == null)
				result = caseComplexBaseType(skidGearGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKID_GEARS_TYPE: {
			SkidGearsType skidGearsType = (SkidGearsType) theEObject;
			T result = caseSkidGearsType(skidGearsType);
			if (result == null)
				result = caseComplexBaseType(skidGearsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKID_GEAR_TYPE: {
			SkidGearType skidGearType = (SkidGearType) theEObject;
			T result = caseSkidGearType(skidGearType);
			if (result == null)
				result = caseComplexBaseType(skidGearType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKIN_SEGMENTS_TYPE: {
			SkinSegmentsType skinSegmentsType = (SkinSegmentsType) theEObject;
			T result = caseSkinSegmentsType(skinSegmentsType);
			if (result == null)
				result = caseComplexBaseType(skinSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKIN_SEGMENT_TYPE: {
			SkinSegmentType skinSegmentType = (SkinSegmentType) theEObject;
			T result = caseSkinSegmentType(skinSegmentType);
			if (result == null)
				result = caseComplexBaseType(skinSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SKIN_TYPE: {
			SkinType skinType = (SkinType) theEObject;
			T result = caseSkinType(skinType);
			if (result == null)
				result = caseComplexBaseType(skinType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_CELLS_TYPE: {
			SparCellsType sparCellsType = (SparCellsType) theEObject;
			T result = caseSparCellsType(sparCellsType);
			if (result == null)
				result = caseComplexBaseType(sparCellsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_CELL_TYPE: {
			SparCellType sparCellType = (SparCellType) theEObject;
			T result = caseSparCellType(sparCellType);
			if (result == null)
				result = caseComplexBaseType(sparCellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE: {
			SparCrossSectionType sparCrossSectionType = (SparCrossSectionType) theEObject;
			T result = caseSparCrossSectionType(sparCrossSectionType);
			if (result == null)
				result = caseComplexBaseType(sparCrossSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_POSITIONS_TYPE: {
			SparPositionsType sparPositionsType = (SparPositionsType) theEObject;
			T result = caseSparPositionsType(sparPositionsType);
			if (result == null)
				result = caseComplexBaseType(sparPositionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_POSITION_TYPE: {
			SparPositionType sparPositionType = (SparPositionType) theEObject;
			T result = caseSparPositionType(sparPositionType);
			if (result == null)
				result = caseComplexBaseType(sparPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_POSITION_UI_DS_TYPE: {
			SparPositionUIDsType sparPositionUIDsType = (SparPositionUIDsType) theEObject;
			T result = caseSparPositionUIDsType(sparPositionUIDsType);
			if (result == null)
				result = caseComplexBaseType(sparPositionUIDsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_SEGMENTS_TYPE: {
			SparSegmentsType sparSegmentsType = (SparSegmentsType) theEObject;
			T result = caseSparSegmentsType(sparSegmentsType);
			if (result == null)
				result = caseComplexBaseType(sparSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPAR_SEGMENT_TYPE: {
			SparSegmentType sparSegmentType = (SparSegmentType) theEObject;
			T result = caseSparSegmentType(sparSegmentType);
			if (result == null)
				result = caseComplexBaseType(sparSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE: {
			SpecificHeatMapType specificHeatMapType = (SpecificHeatMapType) theEObject;
			T result = caseSpecificHeatMapType(specificHeatMapType);
			if (result == null)
				result = caseComplexBaseType(specificHeatMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE: {
			SpecificPerformanceMapsType specificPerformanceMapsType = (SpecificPerformanceMapsType) theEObject;
			T result = caseSpecificPerformanceMapsType(specificPerformanceMapsType);
			if (result == null)
				result = caseComplexBaseType(specificPerformanceMapsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE: {
			SpecificPerformanceMapType specificPerformanceMapType = (SpecificPerformanceMapType) theEObject;
			T result = caseSpecificPerformanceMapType(specificPerformanceMapType);
			if (result == null)
				result = caseComplexBaseType(specificPerformanceMapType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPOILERS_TYPE: {
			SpoilersType spoilersType = (SpoilersType) theEObject;
			T result = caseSpoilersType(spoilersType);
			if (result == null)
				result = caseComplexBaseType(spoilersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SPOILER_TYPE: {
			SpoilerType spoilerType = (SpoilerType) theEObject;
			T result = caseSpoilerType(spoilerType);
			if (result == null)
				result = caseComplexBaseType(spoilerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STANDARD_PROFILE_TYPE_TYPE: {
			StandardProfileTypeType standardProfileTypeType = (StandardProfileTypeType) theEObject;
			T result = caseStandardProfileTypeType(standardProfileTypeType);
			if (result == null)
				result = caseStringBaseType(standardProfileTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STATE_PARAMETERS_TYPE: {
			StateParametersType stateParametersType = (StateParametersType) theEObject;
			T result = caseStateParametersType(stateParametersType);
			if (result == null)
				result = caseComplexBaseType(stateParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STATE_PARAMETER_TYPE: {
			StateParameterType stateParameterType = (StateParameterType) theEObject;
			T result = caseStateParameterType(stateParameterType);
			if (result == null)
				result = caseComplexBaseType(stateParameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STIFFNESS_TYPE: {
			StiffnessType stiffnessType = (StiffnessType) theEObject;
			T result = caseStiffnessType(stiffnessType);
			if (result == null)
				result = caseComplexBaseType(stiffnessType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRING_ARRAY_BASE_TYPE: {
			StringArrayBaseType stringArrayBaseType = (StringArrayBaseType) theEObject;
			T result = caseStringArrayBaseType(stringArrayBaseType);
			if (result == null)
				result = caseStringBaseType(stringArrayBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRING_BASE_TYPE: {
			StringBaseType stringBaseType = (StringBaseType) theEObject;
			T result = caseStringBaseType(stringBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE: {
			StringerFramePositionType stringerFramePositionType = (StringerFramePositionType) theEObject;
			T result = caseStringerFramePositionType(stringerFramePositionType);
			if (result == null)
				result = caseComplexBaseType(stringerFramePositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE: {
			StringersAssemblyType stringersAssemblyType = (StringersAssemblyType) theEObject;
			T result = caseStringersAssemblyType(stringersAssemblyType);
			if (result == null)
				result = caseComplexBaseType(stringersAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRINGER_TYPE: {
			StringerType stringerType = (StringerType) theEObject;
			T result = caseStringerType(stringerType);
			if (result == null)
				result = caseComplexBaseType(stringerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRING_UID_BASE_TYPE: {
			StringUIDBaseType stringUIDBaseType = (StringUIDBaseType) theEObject;
			T result = caseStringUIDBaseType(stringUIDBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRING_VECTOR_BASE_TYPE: {
			StringVectorBaseType stringVectorBaseType = (StringVectorBaseType) theEObject;
			T result = caseStringVectorBaseType(stringVectorBaseType);
			if (result == null)
				result = caseStringBaseType(stringVectorBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE: {
			StructuralElementsType structuralElementsType = (StructuralElementsType) theEObject;
			T result = caseStructuralElementsType(structuralElementsType);
			if (result == null)
				result = caseComplexBaseType(structuralElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE: {
			StructuralMountType structuralMountType = (StructuralMountType) theEObject;
			T result = caseStructuralMountType(structuralMountType);
			if (result == null)
				result = caseComplexBaseType(structuralMountType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE: {
			StructuralProfile3DType structuralProfile3DType = (StructuralProfile3DType) theEObject;
			T result = caseStructuralProfile3DType(structuralProfile3DType);
			if (result == null)
				result = caseComplexBaseType(structuralProfile3DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE: {
			StructuralProfilesType structuralProfilesType = (StructuralProfilesType) theEObject;
			T result = caseStructuralProfilesType(structuralProfilesType);
			if (result == null)
				result = caseComplexBaseType(structuralProfilesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE: {
			StructuralProfileType structuralProfileType = (StructuralProfileType) theEObject;
			T result = caseStructuralProfileType(structuralProfileType);
			if (result == null)
				result = caseComplexBaseType(structuralProfileType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE: {
			StructuralWallElementsType structuralWallElementsType = (StructuralWallElementsType) theEObject;
			T result = caseStructuralWallElementsType(structuralWallElementsType);
			if (result == null)
				result = caseComplexBaseType(structuralWallElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE: {
			StructuralWallElementType structuralWallElementType = (StructuralWallElementType) theEObject;
			T result = caseStructuralWallElementType(structuralWallElementType);
			if (result == null)
				result = caseComplexBaseType(structuralWallElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUT_TYPE: {
			StrutType strutType = (StrutType) theEObject;
			T result = caseStrutType(strutType);
			if (result == null)
				result = caseComplexBaseType(strutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE: {
			StrutWithActuatorType strutWithActuatorType = (StrutWithActuatorType) theEObject;
			T result = caseStrutWithActuatorType(strutWithActuatorType);
			if (result == null)
				result = caseComplexBaseType(strutWithActuatorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.STUDIES_TYPE: {
			StudiesType studiesType = (StudiesType) theEObject;
			T result = caseStudiesType(studiesType);
			if (result == null)
				result = caseComplexBaseType(studiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SUB_FLEETS_TYPE: {
			SubFleetsType subFleetsType = (SubFleetsType) theEObject;
			T result = caseSubFleetsType(subFleetsType);
			if (result == null)
				result = caseComplexBaseType(subFleetsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SUB_FLEET_TYPE: {
			SubFleetType subFleetType = (SubFleetType) theEObject;
			T result = caseSubFleetType(subFleetType);
			if (result == null)
				result = caseComplexBaseType(subFleetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SUB_LOAD_TYPE: {
			SubLoadType subLoadType = (SubLoadType) theEObject;
			T result = caseSubLoadType(subLoadType);
			if (result == null)
				result = caseComplexBaseType(subLoadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SYMMETRY_TYPE3: {
			SymmetryType3 symmetryType3 = (SymmetryType3) theEObject;
			T result = caseSymmetryType3(symmetryType3);
			if (result == null)
				result = caseStringBaseType(symmetryType3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.SYSTEMS_TYPE: {
			SystemsType systemsType = (SystemsType) theEObject;
			T result = caseSystemsType(systemsType);
			if (result == null)
				result = caseComplexBaseType(systemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE: {
			TailplaneAttachmentAreaType tailplaneAttachmentAreaType = (TailplaneAttachmentAreaType) theEObject;
			T result = caseTailplaneAttachmentAreaType(tailplaneAttachmentAreaType);
			if (result == null)
				result = caseComplexBaseType(tailplaneAttachmentAreaType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TAILPLANE_ATTACHMENT_TYPE_TYPE: {
			TailplaneAttachmentTypeType tailplaneAttachmentTypeType = (TailplaneAttachmentTypeType) theEObject;
			T result = caseTailplaneAttachmentTypeType(tailplaneAttachmentTypeType);
			if (result == null)
				result = caseStringBaseType(tailplaneAttachmentTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE: {
			TakeoffPerformanceParametersType takeoffPerformanceParametersType = (TakeoffPerformanceParametersType) theEObject;
			T result = caseTakeoffPerformanceParametersType(takeoffPerformanceParametersType);
			if (result == null)
				result = caseComplexBaseType(takeoffPerformanceParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TANGENT_LINKS_TYPE: {
			TangentLinksType tangentLinksType = (TangentLinksType) theEObject;
			T result = caseTangentLinksType(tangentLinksType);
			if (result == null)
				result = caseComplexBaseType(tangentLinksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TIED_INTERFACES_TYPE: {
			TiedInterfacesType tiedInterfacesType = (TiedInterfacesType) theEObject;
			T result = caseTiedInterfacesType(tiedInterfacesType);
			if (result == null)
				result = caseComplexBaseType(tiedInterfacesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TIED_INTERFACE_TYPE: {
			TiedInterfaceType tiedInterfaceType = (TiedInterfaceType) theEObject;
			T result = caseTiedInterfaceType(tiedInterfaceType);
			if (result == null)
				result = caseComplexBaseType(tiedInterfaceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TIME_BASE_TYPE: {
			TimeBaseType timeBaseType = (TimeBaseType) theEObject;
			T result = caseTimeBaseType(timeBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TOOLSPECIFIC_TYPE: {
			ToolspecificType toolspecificType = (ToolspecificType) theEObject;
			T result = caseToolspecificType(toolspecificType);
			if (result == null)
				result = caseComplexBaseType(toolspecificType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TOOL_TYPE: {
			ToolType toolType = (ToolType) theEObject;
			T result = caseToolType(toolType);
			if (result == null)
				result = caseComplexBaseType(toolType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE: {
			TopologyEntriesType topologyEntriesType = (TopologyEntriesType) theEObject;
			T result = caseTopologyEntriesType(topologyEntriesType);
			if (result == null)
				result = caseComplexBaseType(topologyEntriesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TOPOLOGY_ENTRY_TYPE: {
			TopologyEntryType topologyEntryType = (TopologyEntryType) theEObject;
			T result = caseTopologyEntryType(topologyEntryType);
			if (result == null)
				result = caseComplexBaseType(topologyEntryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE: {
			TotalOperatingCostType totalOperatingCostType = (TotalOperatingCostType) theEObject;
			T result = caseTotalOperatingCostType(totalOperatingCostType);
			if (result == null)
				result = caseComplexBaseType(totalOperatingCostType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_ACTUATOR_TYPE: {
			TrackActuatorType trackActuatorType = (TrackActuatorType) theEObject;
			T result = caseTrackActuatorType(trackActuatorType);
			if (result == null)
				result = caseComplexBaseType(trackActuatorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_CAR_TYPE: {
			TrackCarType trackCarType = (TrackCarType) theEObject;
			T result = caseTrackCarType(trackCarType);
			if (result == null)
				result = caseComplexBaseType(trackCarType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_FAIRING_TYPE: {
			TrackFairingType trackFairingType = (TrackFairingType) theEObject;
			T result = caseTrackFairingType(trackFairingType);
			if (result == null)
				result = caseComplexBaseType(trackFairingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_STRUCTURE_TYPE: {
			TrackStructureType trackStructureType = (TrackStructureType) theEObject;
			T result = caseTrackStructureType(trackStructureType);
			if (result == null)
				result = caseComplexBaseType(trackStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_STRUT1_TYPE: {
			TrackStrut1Type trackStrut1Type = (TrackStrut1Type) theEObject;
			T result = caseTrackStrut1Type(trackStrut1Type);
			if (result == null)
				result = caseComplexBaseType(trackStrut1Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_STRUT2_TYPE: {
			TrackStrut2Type trackStrut2Type = (TrackStrut2Type) theEObject;
			T result = caseTrackStrut2Type(trackStrut2Type);
			if (result == null)
				result = caseComplexBaseType(trackStrut2Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_SUB_TYPE_TYPE: {
			TrackSubTypeType trackSubTypeType = (TrackSubTypeType) theEObject;
			T result = caseTrackSubTypeType(trackSubTypeType);
			if (result == null)
				result = caseStringBaseType(trackSubTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRACK_TYPE_TYPE: {
			TrackTypeType trackTypeType = (TrackTypeType) theEObject;
			T result = caseTrackTypeType(trackTypeType);
			if (result == null)
				result = caseStringBaseType(trackTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE: {
			TrailingEdgeDevicesType trailingEdgeDevicesType = (TrailingEdgeDevicesType) theEObject;
			T result = caseTrailingEdgeDevicesType(trailingEdgeDevicesType);
			if (result == null)
				result = caseComplexBaseType(trailingEdgeDevicesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRAILING_EDGE_DEVICE_TYPE: {
			TrailingEdgeDeviceType trailingEdgeDeviceType = (TrailingEdgeDeviceType) theEObject;
			T result = caseTrailingEdgeDeviceType(trailingEdgeDeviceType);
			if (result == null)
				result = caseComplexBaseType(trailingEdgeDeviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRAJECTORIES_TYPE: {
			TrajectoriesType trajectoriesType = (TrajectoriesType) theEObject;
			T result = caseTrajectoriesType(trajectoriesType);
			if (result == null)
				result = caseComplexBaseType(trajectoriesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE: {
			TrajectoryGlobalType trajectoryGlobalType = (TrajectoryGlobalType) theEObject;
			T result = caseTrajectoryGlobalType(trajectoryGlobalType);
			if (result == null)
				result = caseComplexBaseType(trajectoryGlobalType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRAJECTORY_TYPE: {
			TrajectoryType trajectoryType = (TrajectoryType) theEObject;
			T result = caseTrajectoryType(trajectoryType);
			if (result == null)
				result = caseComplexBaseType(trajectoryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSFORMATION2_DTYPE: {
			Transformation2DType transformation2DType = (Transformation2DType) theEObject;
			T result = caseTransformation2DType(transformation2DType);
			if (result == null)
				result = caseComplexBaseType(transformation2DType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSFORMATION_TYPE: {
			TransformationType transformationType = (TransformationType) theEObject;
			T result = caseTransformationType(transformationType);
			if (result == null)
				result = caseComplexBaseType(transformationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE: {
			TransmissionGearRatioType transmissionGearRatioType = (TransmissionGearRatioType) theEObject;
			T result = caseTransmissionGearRatioType(transmissionGearRatioType);
			if (result == null)
				result = caseComplexBaseType(transmissionGearRatioType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE: {
			TransmissionShaftInputsType transmissionShaftInputsType = (TransmissionShaftInputsType) theEObject;
			T result = caseTransmissionShaftInputsType(transmissionShaftInputsType);
			if (result == null)
				result = caseComplexBaseType(transmissionShaftInputsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE: {
			TransmissionShaftInputType transmissionShaftInputType = (TransmissionShaftInputType) theEObject;
			T result = caseTransmissionShaftInputType(transmissionShaftInputType);
			if (result == null)
				result = caseComplexBaseType(transmissionShaftInputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE: {
			TransmissionShaftOutputsType transmissionShaftOutputsType = (TransmissionShaftOutputsType) theEObject;
			T result = caseTransmissionShaftOutputsType(transmissionShaftOutputsType);
			if (result == null)
				result = caseComplexBaseType(transmissionShaftOutputsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE: {
			TransmissionShaftOutputType transmissionShaftOutputType = (TransmissionShaftOutputType) theEObject;
			T result = caseTransmissionShaftOutputType(transmissionShaftOutputType);
			if (result == null)
				result = caseComplexBaseType(transmissionShaftOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSIONS_TYPE: {
			TransmissionsType transmissionsType = (TransmissionsType) theEObject;
			T result = caseTransmissionsType(transmissionsType);
			if (result == null)
				result = caseComplexBaseType(transmissionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRANSMISSION_TYPE: {
			TransmissionType transmissionType = (TransmissionType) theEObject;
			T result = caseTransmissionType(transmissionType);
			if (result == null)
				result = caseComplexBaseType(transmissionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TRIM_PARAMETERS_TYPE: {
			TrimParametersType trimParametersType = (TrimParametersType) theEObject;
			T result = caseTrimParametersType(trimParametersType);
			if (result == null)
				result = caseComplexBaseType(trimParametersType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_OF_POINT_PERFORMANCE_TYPE: {
			TypeOfPointPerformanceType typeOfPointPerformanceType = (TypeOfPointPerformanceType) theEObject;
			T result = caseTypeOfPointPerformanceType(typeOfPointPerformanceType);
			if (result == null)
				result = caseStringBaseType(typeOfPointPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_TYPE1: {
			TypeType1 typeType1 = (TypeType1) theEObject;
			T result = caseTypeType1(typeType1);
			if (result == null)
				result = caseStringBaseType(typeType1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_TYPE2: {
			TypeType2 typeType2 = (TypeType2) theEObject;
			T result = caseTypeType2(typeType2);
			if (result == null)
				result = caseStringBaseType(typeType2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_TYPE5: {
			TypeType5 typeType5 = (TypeType5) theEObject;
			T result = caseTypeType5(typeType5);
			if (result == null)
				result = caseStringBaseType(typeType5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_TYPE6: {
			TypeType6 typeType6 = (TypeType6) theEObject;
			T result = caseTypeType6(typeType6);
			if (result == null)
				result = caseStringBaseType(typeType6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.TYPE_TYPE7: {
			TypeType7 typeType7 = (TypeType7) theEObject;
			T result = caseTypeType7(typeType7);
			if (result == null)
				result = caseStringBaseType(typeType7);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.UID_GROUP_DEFINITIONS_TYPE: {
			UIDGroupDefinitionsType uidGroupDefinitionsType = (UIDGroupDefinitionsType) theEObject;
			T result = caseUIDGroupDefinitionsType(uidGroupDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(uidGroupDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE: {
			UIDGroupDefinitionType uidGroupDefinitionType = (UIDGroupDefinitionType) theEObject;
			T result = caseUIDGroupDefinitionType(uidGroupDefinitionType);
			if (result == null)
				result = caseComplexBaseType(uidGroupDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.UPDATES_TYPE: {
			UpdatesType updatesType = (UpdatesType) theEObject;
			T result = caseUpdatesType(updatesType);
			if (result == null)
				result = caseComplexBaseType(updatesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.UPDATE_TYPE: {
			UpdateType updateType = (UpdateType) theEObject;
			T result = caseUpdateType(updateType);
			if (result == null)
				result = caseComplexBaseType(updateType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.UPPER_LINKS_TYPE: {
			UpperLinksType upperLinksType = (UpperLinksType) theEObject;
			T result = caseUpperLinksType(upperLinksType);
			if (result == null)
				result = caseComplexBaseType(upperLinksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE: {
			VariableSegmentsType variableSegmentsType = (VariableSegmentsType) theEObject;
			T result = caseVariableSegmentsType(variableSegmentsType);
			if (result == null)
				result = caseComplexBaseType(variableSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.VARIABLE_SEGMENT_TYPE: {
			VariableSegmentType variableSegmentType = (VariableSegmentType) theEObject;
			T result = caseVariableSegmentType(variableSegmentType);
			if (result == null)
				result = caseComplexBaseType(variableSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.VEHICLES_TYPE: {
			VehiclesType vehiclesType = (VehiclesType) theEObject;
			T result = caseVehiclesType(vehiclesType);
			if (result == null)
				result = caseComplexBaseType(vehiclesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.VTP_FRAME_DEF_TYPE: {
			VtpFrameDefType vtpFrameDefType = (VtpFrameDefType) theEObject;
			T result = caseVtpFrameDefType(vtpFrameDefType);
			if (result == null)
				result = caseComplexBaseType(vtpFrameDefType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE: {
			VtpInterfaceDefType vtpInterfaceDefType = (VtpInterfaceDefType) theEObject;
			T result = caseVtpInterfaceDefType(vtpInterfaceDefType);
			if (result == null)
				result = caseComplexBaseType(vtpInterfaceDefType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALL_POSITIONS_TYPE: {
			WallPositionsType wallPositionsType = (WallPositionsType) theEObject;
			T result = caseWallPositionsType(wallPositionsType);
			if (result == null)
				result = caseComplexBaseType(wallPositionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALL_POSITION_TYPE: {
			WallPositionType wallPositionType = (WallPositionType) theEObject;
			T result = caseWallPositionType(wallPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE: {
			WallPositionUIDsType wallPositionUIDsType = (WallPositionUIDsType) theEObject;
			T result = caseWallPositionUIDsType(wallPositionUIDsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALL_SEGMENTS_TYPE: {
			WallSegmentsType wallSegmentsType = (WallSegmentsType) theEObject;
			T result = caseWallSegmentsType(wallSegmentsType);
			if (result == null)
				result = caseComplexBaseType(wallSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALL_SEGMENT_TYPE: {
			WallSegmentType wallSegmentType = (WallSegmentType) theEObject;
			T result = caseWallSegmentType(wallSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WALLS_TYPE: {
			WallsType wallsType = (WallsType) theEObject;
			T result = caseWallsType(wallsType);
			if (result == null)
				result = caseComplexBaseType(wallsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WAY_POINT_TYPE_TYPE: {
			WayPointTypeType wayPointTypeType = (WayPointTypeType) theEObject;
			T result = caseWayPointTypeType(wayPointTypeType);
			if (result == null)
				result = caseStringBaseType(wayPointTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEB_TYPE: {
			WebType webType = (WebType) theEObject;
			T result = caseWebType(webType);
			if (result == null)
				result = caseComplexBaseType(webType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_CASE_TYPE: {
			WeightAndBalanceCaseType weightAndBalanceCaseType = (WeightAndBalanceCaseType) theEObject;
			T result = caseWeightAndBalanceCaseType(weightAndBalanceCaseType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalanceCaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE: {
			WeightAndBalanceFuelInTanksType weightAndBalanceFuelInTanksType = (WeightAndBalanceFuelInTanksType) theEObject;
			T result = caseWeightAndBalanceFuelInTanksType(weightAndBalanceFuelInTanksType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalanceFuelInTanksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE: {
			WeightAndBalanceFuelInTankType weightAndBalanceFuelInTankType = (WeightAndBalanceFuelInTankType) theEObject;
			T result = caseWeightAndBalanceFuelInTankType(weightAndBalanceFuelInTankType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalanceFuelInTankType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_TYPE: {
			WeightAndBalanceFuelType weightAndBalanceFuelType = (WeightAndBalanceFuelType) theEObject;
			T result = caseWeightAndBalanceFuelType(weightAndBalanceFuelType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalanceFuelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCEM_CARGOS_TYPE: {
			WeightAndBalancemCargosType weightAndBalancemCargosType = (WeightAndBalancemCargosType) theEObject;
			T result = caseWeightAndBalancemCargosType(weightAndBalancemCargosType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalancemCargosType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE: {
			WeightAndBalancemPaxxType weightAndBalancemPaxxType = (WeightAndBalancemPaxxType) theEObject;
			T result = caseWeightAndBalancemPaxxType(weightAndBalancemPaxxType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalancemPaxxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_PAYLOAD_TYPE: {
			WeightAndBalancePayloadType weightAndBalancePayloadType = (WeightAndBalancePayloadType) theEObject;
			T result = caseWeightAndBalancePayloadType(weightAndBalancePayloadType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalancePayloadType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE: {
			WeightAndBalanceType weightAndBalanceType = (WeightAndBalanceType) theEObject;
			T result = caseWeightAndBalanceType(weightAndBalanceType);
			if (result == null)
				result = caseComplexBaseType(weightAndBalanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WHEELS_TYPE: {
			WheelsType wheelsType = (WheelsType) theEObject;
			T result = caseWheelsType(wheelsType);
			if (result == null)
				result = caseComplexBaseType(wheelsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WHEEL_TYPE: {
			WheelType wheelType = (WheelType) theEObject;
			T result = caseWheelType(wheelType);
			if (result == null)
				result = caseComplexBaseType(wheelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE: {
			WindowAssemblyPositionType windowAssemblyPositionType = (WindowAssemblyPositionType) theEObject;
			T result = caseWindowAssemblyPositionType(windowAssemblyPositionType);
			if (result == null)
				result = caseComplexBaseType(windowAssemblyPositionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE: {
			WindowsAssemblyType windowsAssemblyType = (WindowsAssemblyType) theEObject;
			T result = caseWindowsAssemblyType(windowsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(windowsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINDOWS_TYPE: {
			WindowsType windowsType = (WindowsType) theEObject;
			T result = caseWindowsType(windowsType);
			if (result == null)
				result = caseComplexBaseType(windowsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_AERO_PERFORMANCE_TYPE: {
			WingAeroPerformanceType wingAeroPerformanceType = (WingAeroPerformanceType) theEObject;
			T result = caseWingAeroPerformanceType(wingAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(wingAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_AIRFOILS_TYPE: {
			WingAirfoilsType wingAirfoilsType = (WingAirfoilsType) theEObject;
			T result = caseWingAirfoilsType(wingAirfoilsType);
			if (result == null)
				result = caseComplexBaseType(wingAirfoilsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_CELLS_TYPE: {
			WingCellsType wingCellsType = (WingCellsType) theEObject;
			T result = caseWingCellsType(wingCellsType);
			if (result == null)
				result = caseComplexBaseType(wingCellsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_CELL_TYPE: {
			WingCellType wingCellType = (WingCellType) theEObject;
			T result = caseWingCellType(wingCellType);
			if (result == null)
				result = caseComplexBaseType(wingCellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_COEFFICIENTS_TYPE: {
			WingCoefficientsType wingCoefficientsType = (WingCoefficientsType) theEObject;
			T result = caseWingCoefficientsType(wingCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(wingCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE: {
			WingComponentSegmentStructureType wingComponentSegmentStructureType = (WingComponentSegmentStructureType) theEObject;
			T result = caseWingComponentSegmentStructureType(wingComponentSegmentStructureType);
			if (result == null)
				result = caseComplexBaseType(wingComponentSegmentStructureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_ELEMENTS_TYPE: {
			WingElementsType wingElementsType = (WingElementsType) theEObject;
			T result = caseWingElementsType(wingElementsType);
			if (result == null)
				result = caseComplexBaseType(wingElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_ELEMENT_TYPE: {
			WingElementType wingElementType = (WingElementType) theEObject;
			T result = caseWingElementType(wingElementType);
			if (result == null)
				result = caseComplexBaseType(wingElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE: {
			WingFuelTankBorderType wingFuelTankBorderType = (WingFuelTankBorderType) theEObject;
			T result = caseWingFuelTankBorderType(wingFuelTankBorderType);
			if (result == null)
				result = caseComplexBaseType(wingFuelTankBorderType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE: {
			WingFuelTankGeometryType wingFuelTankGeometryType = (WingFuelTankGeometryType) theEObject;
			T result = caseWingFuelTankGeometryType(wingFuelTankGeometryType);
			if (result == null)
				result = caseComplexBaseType(wingFuelTankGeometryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUEL_TANKS_TYPE: {
			WingFuelTanksType wingFuelTanksType = (WingFuelTanksType) theEObject;
			T result = caseWingFuelTanksType(wingFuelTanksType);
			if (result == null)
				result = caseComplexBaseType(wingFuelTanksType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUEL_TANK_TYPE: {
			WingFuelTankType wingFuelTankType = (WingFuelTankType) theEObject;
			T result = caseWingFuelTankType(wingFuelTankType);
			if (result == null)
				result = caseComplexBaseType(wingFuelTankType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE: {
			WingFuselageAttachmentsType wingFuselageAttachmentsType = (WingFuselageAttachmentsType) theEObject;
			T result = caseWingFuselageAttachmentsType(wingFuselageAttachmentsType);
			if (result == null)
				result = caseComplexBaseType(wingFuselageAttachmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE: {
			WingFuselageAttachmentType wingFuselageAttachmentType = (WingFuselageAttachmentType) theEObject;
			T result = caseWingFuselageAttachmentType(wingFuselageAttachmentType);
			if (result == null)
				result = caseComplexBaseType(wingFuselageAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE: {
			WingInterfaceDefinitionsType wingInterfaceDefinitionsType = (WingInterfaceDefinitionsType) theEObject;
			T result = caseWingInterfaceDefinitionsType(wingInterfaceDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(wingInterfaceDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE: {
			WingInterfaceMainFramesType wingInterfaceMainFramesType = (WingInterfaceMainFramesType) theEObject;
			T result = caseWingInterfaceMainFramesType(wingInterfaceMainFramesType);
			if (result == null)
				result = caseComplexBaseType(wingInterfaceMainFramesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE: {
			WingInterfaceSupportStrutsAssemblyType wingInterfaceSupportStrutsAssemblyType = (WingInterfaceSupportStrutsAssemblyType) theEObject;
			T result = caseWingInterfaceSupportStrutsAssemblyType(wingInterfaceSupportStrutsAssemblyType);
			if (result == null)
				result = caseComplexBaseType(wingInterfaceSupportStrutsAssemblyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE: {
			WingInterfaceSupportStrutType wingInterfaceSupportStrutType = (WingInterfaceSupportStrutType) theEObject;
			T result = caseWingInterfaceSupportStrutType(wingInterfaceSupportStrutType);
			if (result == null)
				result = caseComplexBaseType(wingInterfaceSupportStrutType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE: {
			WingIntermediateStructureCellsType wingIntermediateStructureCellsType = (WingIntermediateStructureCellsType) theEObject;
			T result = caseWingIntermediateStructureCellsType(wingIntermediateStructureCellsType);
			if (result == null)
				result = caseComplexBaseType(wingIntermediateStructureCellsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE: {
			WingIntermediateStructureCellType wingIntermediateStructureCellType = (WingIntermediateStructureCellType) theEObject;
			T result = caseWingIntermediateStructureCellType(wingIntermediateStructureCellType);
			if (result == null)
				result = caseComplexBaseType(wingIntermediateStructureCellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIB_CELL_TYPE: {
			WingRibCellType wingRibCellType = (WingRibCellType) theEObject;
			T result = caseWingRibCellType(wingRibCellType);
			if (result == null)
				result = caseComplexBaseType(wingRibCellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE: {
			WingRibCrossSectionType wingRibCrossSectionType = (WingRibCrossSectionType) theEObject;
			T result = caseWingRibCrossSectionType(wingRibCrossSectionType);
			if (result == null)
				result = caseComplexBaseType(wingRibCrossSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE: {
			WingRibExplicitPositioningType wingRibExplicitPositioningType = (WingRibExplicitPositioningType) theEObject;
			T result = caseWingRibExplicitPositioningType(wingRibExplicitPositioningType);
			if (result == null)
				result = caseComplexBaseType(wingRibExplicitPositioningType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIB_POINT_TYPE: {
			WingRibPointType wingRibPointType = (WingRibPointType) theEObject;
			T result = caseWingRibPointType(wingRibPointType);
			if (result == null)
				result = caseComplexBaseType(wingRibPointType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE: {
			WingRibsDefinitionsType wingRibsDefinitionsType = (WingRibsDefinitionsType) theEObject;
			T result = caseWingRibsDefinitionsType(wingRibsDefinitionsType);
			if (result == null)
				result = caseComplexBaseType(wingRibsDefinitionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE: {
			WingRibsDefinitionType wingRibsDefinitionType = (WingRibsDefinitionType) theEObject;
			T result = caseWingRibsDefinitionType(wingRibsDefinitionType);
			if (result == null)
				result = caseComplexBaseType(wingRibsDefinitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE: {
			WingRibsPositioningType wingRibsPositioningType = (WingRibsPositioningType) theEObject;
			T result = caseWingRibsPositioningType(wingRibsPositioningType);
			if (result == null)
				result = caseComplexBaseType(wingRibsPositioningType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE: {
			WingsAeroPerformanceType wingsAeroPerformanceType = (WingsAeroPerformanceType) theEObject;
			T result = caseWingsAeroPerformanceType(wingsAeroPerformanceType);
			if (result == null)
				result = caseComplexBaseType(wingsAeroPerformanceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINGS_COEFFICIENTS_TYPE: {
			WingsCoefficientsType wingsCoefficientsType = (WingsCoefficientsType) theEObject;
			T result = caseWingsCoefficientsType(wingsCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(wingsCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SECTIONS_TYPE: {
			WingSectionsType wingSectionsType = (WingSectionsType) theEObject;
			T result = caseWingSectionsType(wingSectionsType);
			if (result == null)
				result = caseComplexBaseType(wingSectionsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SECTION_TYPE: {
			WingSectionType wingSectionType = (WingSectionType) theEObject;
			T result = caseWingSectionType(wingSectionType);
			if (result == null)
				result = caseComplexBaseType(wingSectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE: {
			WingSegmentCoefficientsType wingSegmentCoefficientsType = (WingSegmentCoefficientsType) theEObject;
			T result = caseWingSegmentCoefficientsType(wingSegmentCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(wingSegmentCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SEGMENTS_COEFFICIENTS_TYPE: {
			WingSegmentsCoefficientsType wingSegmentsCoefficientsType = (WingSegmentsCoefficientsType) theEObject;
			T result = caseWingSegmentsCoefficientsType(wingSegmentsCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(wingSegmentsCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SEGMENT_STRIP_COEFFICIENTS_TYPE: {
			WingSegmentStripCoefficientsType wingSegmentStripCoefficientsType = (WingSegmentStripCoefficientsType) theEObject;
			T result = caseWingSegmentStripCoefficientsType(wingSegmentStripCoefficientsType);
			if (result == null)
				result = caseComplexBaseType(wingSegmentStripCoefficientsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SEGMENTS_TYPE: {
			WingSegmentsType wingSegmentsType = (WingSegmentsType) theEObject;
			T result = caseWingSegmentsType(wingSegmentsType);
			if (result == null)
				result = caseComplexBaseType(wingSegmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SEGMENT_TYPE: {
			WingSegmentType wingSegmentType = (WingSegmentType) theEObject;
			T result = caseWingSegmentType(wingSegmentType);
			if (result == null)
				result = caseComplexBaseType(wingSegmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SHELL_TYPE: {
			WingShellType wingShellType = (WingShellType) theEObject;
			T result = caseWingShellType(wingShellType);
			if (result == null)
				result = caseComplexBaseType(wingShellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SKIN_TYPE: {
			WingSkinType wingSkinType = (WingSkinType) theEObject;
			T result = caseWingSkinType(wingSkinType);
			if (result == null)
				result = caseComplexBaseType(wingSkinType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_SPAR_TYPE: {
			WingSparType wingSparType = (WingSparType) theEObject;
			T result = caseWingSparType(wingSparType);
			if (result == null)
				result = caseComplexBaseType(wingSparType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_STRINGER_TYPE: {
			WingStringerType wingStringerType = (WingStringerType) theEObject;
			T result = caseWingStringerType(wingStringerType);
			if (result == null)
				result = caseComplexBaseType(wingStringerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE: {
			WingStructuralMountsType wingStructuralMountsType = (WingStructuralMountsType) theEObject;
			T result = caseWingStructuralMountsType(wingStructuralMountsType);
			if (result == null)
				result = caseComplexBaseType(wingStructuralMountsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WINGS_TYPE: {
			WingsType wingsType = (WingsType) theEObject;
			T result = caseWingsType(wingsType);
			if (result == null)
				result = caseComplexBaseType(wingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_TYPE: {
			WingType wingType = (WingType) theEObject;
			T result = caseWingType(wingType);
			if (result == null)
				result = caseComplexBaseType(wingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE: {
			WingWingAttachmentElementsType wingWingAttachmentElementsType = (WingWingAttachmentElementsType) theEObject;
			T result = caseWingWingAttachmentElementsType(wingWingAttachmentElementsType);
			if (result == null)
				result = caseComplexBaseType(wingWingAttachmentElementsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE: {
			WingWingAttachmentSparsType wingWingAttachmentSparsType = (WingWingAttachmentSparsType) theEObject;
			T result = caseWingWingAttachmentSparsType(wingWingAttachmentSparsType);
			if (result == null)
				result = caseComplexBaseType(wingWingAttachmentSparsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE: {
			WingWingAttachmentsSparsType wingWingAttachmentsSparsType = (WingWingAttachmentsSparsType) theEObject;
			T result = caseWingWingAttachmentsSparsType(wingWingAttachmentsSparsType);
			if (result == null)
				result = caseComplexBaseType(wingWingAttachmentsSparsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE: {
			WingWingAttachmentsType wingWingAttachmentsType = (WingWingAttachmentsType) theEObject;
			T result = caseWingWingAttachmentsType(wingWingAttachmentsType);
			if (result == null)
				result = caseComplexBaseType(wingWingAttachmentsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE: {
			WingWingAttachmentType wingWingAttachmentType = (WingWingAttachmentType) theEObject;
			T result = caseWingWingAttachmentType(wingWingAttachmentType);
			if (result == null)
				result = caseComplexBaseType(wingWingAttachmentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.XSI_ISO_LINE_TYPE: {
			XsiIsoLineType xsiIsoLineType = (XsiIsoLineType) theEObject;
			T result = caseXsiIsoLineType(xsiIsoLineType);
			if (result == null)
				result = caseComplexBaseType(xsiIsoLineType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ZCOUPLINGS_TYPE: {
			ZCouplingsType zCouplingsType = (ZCouplingsType) theEObject;
			T result = caseZCouplingsType(zCouplingsType);
			if (result == null)
				result = caseComplexBaseType(zCouplingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CpacsPackage.ZCOUPLING_TYPE: {
			ZCouplingType zCouplingType = (ZCouplingType) theEObject;
			T result = caseZCouplingType(zCouplingType);
			if (result == null)
				result = caseComplexBaseType(zCouplingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorAttachmentType(ActuatorAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Control Surface Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Control Surface Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorControlSurfaceAttachmentType(ActuatorControlSurfaceAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Fuselage Wing Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Fuselage Wing Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorFuselageWingAttachmentType(ActuatorFuselageWingAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Fuselage Wing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Fuselage Wing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorFuselageWingType(ActuatorFuselageWingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Parent Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Parent Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorParentAttachmentType(ActuatorParentAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuators Fuselage Wing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuators Fuselage Wing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorsFuselageWingType(ActuatorsFuselageWingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalParametersType(AdditionalParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalParameterType(AdditionalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Data Set For Loads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Data Set For Loads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroDataSetForLoadsType(AeroDataSetForLoadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Data Sets For Loads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Data Sets For Loads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroDataSetsForLoadsType(AeroDataSetsForLoadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aeroelastic Divergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aeroelastic Divergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroelasticDivergenceType(AeroelasticDivergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aeroelastic Static Max Displacement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aeroelastic Static Max Displacement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroelasticStaticMaxDisplacementType(AeroelasticStaticMaxDisplacementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aeroelastics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aeroelastics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroelasticsType(AeroelasticsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Limits Increment Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Limits Increment Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroLimitsIncrementMapsType(AeroLimitsIncrementMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Limits Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Limits Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroLimitsMapType(AeroLimitsMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Map Operation Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Map Operation Limit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroMapOperationLimitType(AeroMapOperationLimitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroMapType(AeroMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Boundary Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Boundary Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceBoundaryConditionsType(AeroPerformanceBoundaryConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Control Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Control Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceControlElementsType(AeroPerformanceControlElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Control Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Control Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceControlElementType(AeroPerformanceControlElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Increment Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Increment Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceIncrementMapsType(AeroPerformanceIncrementMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Increment Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Increment Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceIncrementMapType(AeroPerformanceIncrementMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Map RC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Map RC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceMapRCType(AeroPerformanceMapRCType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Maps RC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Maps RC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceMapsRCType(AeroPerformanceMapsRCType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceMapType(AeroPerformanceMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance RC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance RC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceRCType(AeroPerformanceRCType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAeroPerformanceType(AeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Analyses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Analyses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftAnalysesType(AircraftAnalysesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftGlobalType(AircraftGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftModelType(AircraftModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftType(AircraftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airfoil Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airfoil Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirfoilAeroPerformanceType(AirfoilAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airfoils Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airfoils Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirfoilsAeroPerformanceType(AirfoilsAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airframe Maintenance Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airframe Maintenance Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirframeMaintenanceCostType(AirframeMaintenanceCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airlines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airlines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirlinesType(AirlinesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirlineType(AirlineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airport Compatability Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airport Compatability Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirportCompatabilityGlobalType(AirportCompatabilityGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirportsType(AirportsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airport Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airport Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirportType(AirportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Cross Beam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Cross Beam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentCrossBeamType(AlignmentCrossBeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Floor Panel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Floor Panel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentFloorPanelType(AlignmentFloorPanelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment String Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment String Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentStringFrameType(AlignmentStringFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Struct Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Struct Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentStructMemberType(AlignmentStructMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Acceleration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Acceleration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleAccelerationType(AngleAccelerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Displacement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Displacement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleDisplacementType(AngleDisplacementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anisotropic Shell Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anisotropic Shell Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnisotropicShellPropertiesType(AnisotropicShellPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anisotropic Solid Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anisotropic Solid Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnisotropicSolidPropertiesType(AnisotropicSolidPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atmospheric Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmospheric Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtmosphericConditionsType(AtmosphericConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atmospheric Model Old Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmospheric Model Old Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtmosphericModelOldType(AtmosphericModelOldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atmospheric Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmospheric Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtmosphericModelType(AtmosphericModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atmospheric Model Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmospheric Model Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtmosphericModelType1(AtmosphericModelType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Pins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Pins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentPinsType(AttachmentPinsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Pin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Pin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentPinType(AttachmentPinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attitude And Motion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attitude And Motion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttitudeAndMotionType(AttitudeAndMotionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxlesType(AxlesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxleType(AxleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beam Cross Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beam Cross Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeamCrossSectionType(BeamCrossSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beam Stiffness Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beam Stiffness Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeamStiffnessType(BeamStiffnessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blocked DOF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blocked DOF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockedDOFType(BlockedDOFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bogie Axles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bogie Axles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBogieAxlesType(BogieAxlesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bogie Axle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bogie Axle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBogieAxleType(BogieAxleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bogie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bogie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBogieType(BogieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBaseType(BooleanBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Element UI Ds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Element UI Ds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingElementUIDsType(BoundingElementUIDsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cab Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cab Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabGeometryType(CabGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Aisles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Aisles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinAislesType(CabinAislesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Aisle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Aisle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinAisleType(CabinAisleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Doors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Doors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinDoorsType(CabinDoorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Door Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Door Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinDoorType(CabinDoorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Floor Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Floor Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinFloorElementsType(CabinFloorElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Floor Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Floor Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinFloorElementType(CabinFloorElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Seat Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Seat Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinSeatElementsType(CabinSeatElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Seat Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Seat Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinSeatElementType(CabinSeatElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Spaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Spaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinSpacesType(CabinSpacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinSpaceType(CabinSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapType(CapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cargo Cross Beams Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cargo Cross Beams Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCargoCrossBeamsAssemblyType(CargoCrossBeamsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cargo Cross Beam Struts Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cargo Cross Beam Struts Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCargoCrossBeamStrutsAssemblyType(CargoCrossBeamStrutsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cargo Doors Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cargo Doors Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCargoDoorsAssemblyType(CargoDoorsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Positioning Chordwise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Positioning Chordwise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellPositioningChordwiseType(CellPositioningChordwiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Positioning Spanwise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Positioning Spanwise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellPositioningSpanwiseType(CellPositioningSpanwiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Areas Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Areas Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageAreasAssemblyType(CenterFuselageAreasAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageAreaType(CenterFuselageAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage High Wing Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage High Wing Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageHighWingConfigurationType(CenterFuselageHighWingConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Keelbeam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Keelbeam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageKeelbeamType(CenterFuselageKeelbeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Lateral Panels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Lateral Panels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageLateralPanelsType(CenterFuselageLateralPanelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Long Floor Beams Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Long Floor Beams Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageLongFloorBeamsConnectionType(CenterFuselageLongFloorBeamsConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Low Wing Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Low Wing Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageLowWingConfigurationType(CenterFuselageLowWingConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Main Frames Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Main Frames Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageMainFramesType(CenterFuselageMainFramesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Pressure Floor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Pressure Floor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselagePressureFloorType(CenterFuselagePressureFloorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Fuselage Sidebox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Fuselage Sidebox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterFuselageSideboxType(CenterFuselageSideboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certification Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certification Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificationCasesType(CertificationCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charges Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charges Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargesCostType(ChargesCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cockpit Controls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cockpit Controls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCockpitControlsType(CockpitControlsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cockpit Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cockpit Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCockpitControlType(CockpitControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoefficientsType(CoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Case Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Case Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandCaseCommandType(CommandCaseCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandCasesType(CommandCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandCaseType(CommandCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentGeometryType(CompartmentGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentsType(CompartmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentType(CompartmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexBaseType(ComplexBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCostType(ComponentCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Cut Loads Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Cut Loads Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCutLoadsEnvelopeType(ComponentCutLoadsEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Segment Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Segment Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSegmentPathType(ComponentSegmentPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Segment Steps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Segment Steps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSegmentStepsType(ComponentSegmentStepsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Segment Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Segment Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSegmentStepType(ComponentSegmentStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSegmentsType(ComponentSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSegmentType(ComponentSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Layer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Layer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeLayerType(CompositeLayerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composites Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composites Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositesType(CompositesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivitiesType(ConnectivitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityType(ConnectivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Settings Point Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Settings Point Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSettingsPointPerformanceType(ConstraintSettingsPointPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSettingsType(ConstraintSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity At P1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity At P1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityAtP1Type(ContinuityAtP1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity At P2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity At P2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityAtP2Type(ContinuityAtP2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityType(ContinuityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityType1(ContinuityType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityType2(ContinuityType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityType3(ContinuityType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contour Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contour Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContourReferenceType(ContourReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Distributors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Distributors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDistributorsType(ControlDistributorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Distributor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Distributor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDistributorType(ControlDistributorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlElementsType(ControlElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlElementType(ControlElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Functions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFunctionsType(ControlFunctionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFunctionType(ControlFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlInputsType(ControlInputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlInputType(ControlInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Law Modes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Law Modes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlLawModesType(ControlLawModesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Law Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Law Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlLawModeType(ControlLawModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Laws Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Laws Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlLawsType(ControlLawsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Actuators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Actuators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceActuatorsType(ControlSurfaceActuatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Actuator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Actuator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceActuatorType(ControlSurfaceActuatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Airfoil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Airfoil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceAirfoilType(ControlSurfaceAirfoilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Border Leading Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Border Leading Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceBorderLeadingEdgeType(ControlSurfaceBorderLeadingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Border Spoiler Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Border Spoiler Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceBorderSpoilerType(ControlSurfaceBorderSpoilerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Border Trailing Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Border Trailing Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceBorderTrailingEdgeType(ControlSurfaceBorderTrailingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Contours Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Contours Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceContoursType(ControlSurfaceContoursType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Deflections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Deflections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceDeflectionsType(ControlSurfaceDeflectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Deflection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Deflection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceDeflectionType(ControlSurfaceDeflectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Deflection Vectors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Deflection Vectors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceDeflectionVectorsType(ControlSurfaceDeflectionVectorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Deflection Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Deflection Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceDeflectionVectorType(ControlSurfaceDeflectionVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Hinge Moment Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Hinge Moment Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceHingeMomentMapsType(ControlSurfaceHingeMomentMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Hinge Moment Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Hinge Moment Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceHingeMomentMapType(ControlSurfaceHingeMomentMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Hinge Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Hinge Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceHingePointType(ControlSurfaceHingePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Leading Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Leading Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceOuterShapeLeadingEdgeType(ControlSurfaceOuterShapeLeadingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Spoiler Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Spoiler Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceOuterShapeSpoilerType(ControlSurfaceOuterShapeSpoilerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Trailing Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Outer Shape Trailing Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceOuterShapeTrailingEdgeType(ControlSurfaceOuterShapeTrailingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfacePathType(ControlSurfacePathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Performance Map Old Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Performance Map Old Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfacePerformanceMapOldType(ControlSurfacePerformanceMapOldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Performance Maps Old Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Performance Maps Old Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfacePerformanceMapsOldType(ControlSurfacePerformanceMapsOldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Skin Cut Out Border Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Skin Cut Out Border Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceSkinCutOutBorderType(ControlSurfaceSkinCutOutBorderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Skin Cut Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Skin Cut Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceSkinCutOutType(ControlSurfaceSkinCutOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Steps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Steps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceStepsType(ControlSurfaceStepsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceStepType(ControlSurfaceStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfacesType(ControlSurfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Tracks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Tracks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceTracksType(ControlSurfaceTracksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Track Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Track Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceTrackTypeType(ControlSurfaceTrackTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface Wing Cut Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface Wing Cut Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurfaceWingCutOutType(ControlSurfaceWingCutOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Air Conditioning Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Air Conditioning Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostAirConditioningSystemsType(CostAirConditioningSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Automatic Flight Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Automatic Flight Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostAutomaticFlightSystemsType(CostAutomaticFlightSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Auxilary Power Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Auxilary Power Units Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostAuxilaryPowerUnitsType(CostAuxilaryPowerUnitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Bleed Air Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Bleed Air Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostBleedAirSystemsType(CostBleedAirSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Communication Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Communication Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostCommunicationSystemsType(CostCommunicationSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostComponentsType(CostComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost De Icing Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost De Icing Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostDeIcingSystemsType(CostDeIcingSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Electrical Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Electrical Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostElectricalSystemsType(CostElectricalSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Engine Pylons Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Engine Pylons Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostEnginePylonsType(CostEnginePylonsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Equipped Engines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Equipped Engines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostEquippedEnginesType(CostEquippedEnginesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Fire Protection Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Fire Protection Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFireProtectionSystemsType(CostFireProtectionSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Fixed Emergency Oxygen Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Fixed Emergency Oxygen Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFixedEmergencyOxygenSystemsType(CostFixedEmergencyOxygenSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Flight Control Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Flight Control Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFlightControlSystemsType(CostFlightControlSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Fuel Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Fuel Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFuelSystemsType(CostFuelSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Furnishing Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Furnishing Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFurnishingElementsType(CostFurnishingElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Furnishings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Furnishings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFurnishingsType(CostFurnishingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Fuselages Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Fuselages Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostFuselagesType(CostFuselagesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Hydraulic Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Hydraulic Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostHydraulicSystemsType(CostHydraulicSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Instrument Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Instrument Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostInstrumentSystemsType(CostInstrumentSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Landing Gear Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Landing Gear Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostLandingGearType(CostLandingGearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Lighting Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Lighting Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostLightingSystemsType(CostLightingSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Nacelles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Nacelles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostNacellesType(CostNacellesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Navigation Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Navigation Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostNavigationSystemsType(CostNavigationSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Power Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Power Units Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostPowerUnitsType(CostPowerUnitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostSystemsType(CostSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Water Installation Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Water Installation Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostWaterInstallationSystemsType(CostWaterInstallationSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Wings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Wings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostWingsType(CostWingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpacsType(CpacsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crash Load Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crash Load Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrashLoadCasesType(CrashLoadCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crash Loadcase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crash Loadcase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrashLoadcaseType(CrashLoadcaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crew Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crew Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrewCostType(CrewCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Beam Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Beam Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossBeamAssemblyPositionType(CrossBeamAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Beam Strut Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Beam Strut Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossBeamStrutAssemblyPositionType(CrossBeamStrutAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cruise Rollers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cruise Rollers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCruiseRollersType(CruiseRollersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cruise Roller Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cruise Roller Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCruiseRollerType(CruiseRollerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cst2 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cst2 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCst2DType(Cst2DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Param Point Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Param Point Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveParamPointMapType(CurveParamPointMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Point List XYZ Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Point List XYZ Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvePointListXYZType(CurvePointListXYZType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvePointType(CurvePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveProfilesType(CurveProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Load Integration Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Load Integration Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutLoadIntegrationPointsType(CutLoadIntegrationPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Loads Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Loads Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutLoadsEnvelopeType(CutLoadsEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Loads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Loads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutLoadsType(CutLoadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Load Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Load Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutLoadType(CutLoadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Out Control Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Out Control Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOutControlPointsType(CutOutControlPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Out Control Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Out Control Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOutControlPointType(CutOutControlPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Out Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Out Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOutProfilesType(CutOutProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Out Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Out Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOutProfileType(CutOutProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOutType(CutOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cutout Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cutout Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutoutTypeType(CutoutTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Damping Derivatives Rates Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Damping Derivatives Rates Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDampingDerivativesRatesArrayType(DampingDerivativesRatesArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Damping Derivatives Rates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Damping Derivatives Rates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDampingDerivativesRatesType(DampingDerivativesRatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Damping Derivatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Damping Derivatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDampingDerivativesType(DampingDerivativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dam Tol Behaviour Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dam Tol Behaviour Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDamTolBehaviourType(DamTolBehaviourType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dam Tol Forman Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dam Tol Forman Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDamTolFormanType(DamTolFormanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dam Tol Walker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dam Tol Walker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDamTolWalkerType(DamTolWalkerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateBaseType(DateBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeBaseType(DateTimeBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecksType(DecksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deck Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deck Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeckType(DeckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Temperature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Temperature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaTemperatureType(DeltaTemperatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Masses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Masses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignMassesType(DesignMassesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignParametersType(DesignParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignParameterType(DesignParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignSpaceType(DesignSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Speed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Speed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignSpeedType(DesignSpeedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Studies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Studies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignStudiesType(DesignStudiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignVolumeType(DesignVolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Operating Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Operating Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectOperatingCostType(DirectOperatingCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divergence Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divergence Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergenceCasesType(DivergenceCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divergence Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divergence Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivergenceCaseType(DivergenceCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorAssemblyPositionType(DoorAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Cut Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Cut Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorCutOutType(DoorCutOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorsType(DoorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Surround Structure Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Surround Structure Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorSurroundStructurePositionType(DoorSurroundStructurePositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Surround Structures Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Surround Structures Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorSurroundStructuresAssemblyType(DoorSurroundStructuresAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorTypeType(DoorTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleBaseType(DoubleBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Constraint Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Constraint Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleConstraintBaseType(DoubleConstraintBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriveSystemsType(DriveSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriveSystemType(DriveSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicAircraftModelAnalysisType(DynamicAircraftModelAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicAircraftModelPointsType(DynamicAircraftModelPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Aircraft Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicAircraftModelType(DynamicAircraftModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emissivity Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emissivity Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmissivityMapType(EmissivityMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineAnalysisType(EngineAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Concept Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineConceptType(EngineConceptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Fan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Fan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineFanType(EngineFanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineGeometryType(EngineGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineGlobalType(EngineGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Mounts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Mounts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineMountsType(EngineMountsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Mount Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Mount Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineMountType(EngineMountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Nacelle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Nacelle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineNacelleType(EngineNacelleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Performance Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Performance Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePerformanceMapsType(EnginePerformanceMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Performance Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Performance Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePerformanceMapType(EnginePerformanceMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Positions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Positions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePositionsType(EnginePositionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePositionType(EnginePositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Pylons Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Pylons Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePylonsType(EnginePylonsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Pylon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Pylon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginePylonType(EnginePylonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineSettingType(EngineSettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Spinner Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Spinner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineSpinnerType(EngineSpinnerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnginesType(EnginesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineType(EngineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eta Iso Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eta Iso Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtaIsoLineType(EtaIsoLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eta Xsi Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eta Xsi Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtaXsiPointType(EtaXsiPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eta Xsi Rel Height Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eta Xsi Rel Height Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtaXsiRelHeightPointType(EtaXsiRelHeightPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fatigue Behaviour Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fatigue Behaviour Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFatigueBehaviourType(FatigueBehaviourType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fatigue Stress Based Brown Miller Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fatigue Stress Based Brown Miller Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFatigueStressBasedBrownMillerType(FatigueStressBasedBrownMillerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fleet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fleet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFleetType(FleetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightAnalysisType(FlightAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsAnalysisType(FlightDynamicsAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Flight Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Flight Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsFlightCasesType(FlightDynamicsFlightCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Flight Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Flight Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsFlightCaseType(FlightDynamicsFlightCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Linear Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Linear Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsLinearModelType(FlightDynamicsLinearModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsModelType(FlightDynamicsModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Dynamics Trim Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Dynamics Trim Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightDynamicsTrimResultType(FlightDynamicsTrimResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Load Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Load Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightLoadCasesType(FlightLoadCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Load Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Load Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightLoadCaseType(FlightLoadCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPathType(FlightPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Performance Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Performance Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPerformanceCasesType(FlightPerformanceCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Performance Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Performance Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPerformanceCaseType(FlightPerformanceCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Performance Landing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Performance Landing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPerformanceLandingType(FlightPerformanceLandingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Performance Takeoff Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Performance Takeoff Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPerformanceTakeoffType(FlightPerformanceTakeoffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPerformanceType(FlightPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPointType(FlightPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flights Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flights Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightsType(FlightsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightSystemsType(FlightSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightType(FlightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Panels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Panels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloorPanelsType(FloorPanelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Panel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Panel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloorPanelType(FloorPanelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowConditionType(FlowConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flying Qualities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flying Qualities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlyingQualitiesType(FlyingQualitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqCaseType(FqCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Char Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Char Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqCharParametersType(FqCharParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Eiglat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Eiglat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqEiglatType(FqEiglatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Lateral Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Lateral Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqLateralType(FqLateralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Longitudinal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Longitudinal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqLongitudinalType(FqLongitudinalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Phugoid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Phugoid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqPhugoidType(FqPhugoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Ratings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Ratings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqRatingsType(FqRatingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Roll Perf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Roll Perf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqRollPerfType(FqRollPerfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Rolosc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Rolosc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqRoloscType(FqRoloscType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Short Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Short Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqShortPeriodType(FqShortPeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fq Treff Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fq Treff Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqTreffType(FqTreffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frames Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frames Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramesAssemblyType(FramesAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameType(FrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreePathType(FreePathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel In Tank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel In Tank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelInTankType(FuelInTankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel Planning Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel Planning Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelPlanningTypeType(FuelPlanningTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelsType(FuelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel Tank Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel Tank Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelTankVolumeType(FuelTankVolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelType(FuelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageAeroPerformanceType(FuselageAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageCoefficientsType(FuselageCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Cut Outs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Cut Outs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageCutOutsType(FuselageCutOutsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Cut Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Cut Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageCutOutType(FuselageCutOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageElementsType(FuselageElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageElementType(FuselageElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Fuel Tanks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Fuel Tanks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageFuelTanksType(FuselageFuelTanksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Fuel Tank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Fuel Tank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageFuelTankType(FuselageFuelTankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageProfilesType(FuselageProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselages Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselages Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselagesAeroPerformanceType(FuselagesAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselages Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselages Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselagesCoefficientsType(FuselagesCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Sections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Sections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSectionsType(FuselageSectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSectionType(FuselageSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Segment Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Segment Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSegmentCoefficientsType(FuselageSegmentCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Segments Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Segments Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSegmentsCoefficientsType(FuselageSegmentsCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Segment Strip Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Segment Strip Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSegmentStripCoefficientsType(FuselageSegmentStripCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSegmentsType(FuselageSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageSegmentType(FuselageSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageStructureType(FuselageStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselages Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselages Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselagesType(FuselagesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuselage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuselage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuselageType(FuselageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gear Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gear Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearComponentsType(GearComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gear Deflection Vectors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gear Deflection Vectors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearDeflectionVectorsType(GearDeflectionVectorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gear Deflection Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gear Deflection Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearDeflectionVectorType(GearDeflectionVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Structural Member Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Structural Member Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStructuralMemberPositionType(GeneralStructuralMemberPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Structural Members Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Structural Members Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStructuralMembersAssemblyType(GeneralStructuralMembersAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Structural Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Structural Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStructuralMemberType(GeneralStructuralMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Component Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Component Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericComponentCoefficientsType(GenericComponentCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Components Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Components Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericComponentsCoefficientsType(GenericComponentsCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericCostType(GenericCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Geometric Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Geometric Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericGeometricComponentType(GenericGeometricComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Geometry Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Geometry Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericGeometryComponentsType(GenericGeometryComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Mass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Mass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMassType(GenericMassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericSystemsType(GenericSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericSystemType(GenericSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geogen Wing Output Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geogen Wing Output Options Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeogenWingOutputOptionsType(GeogenWingOutputOptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic Point Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic Point Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicPointConstraintType(GeographicPointConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicPointType(GeographicPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalAeroPerformanceType(GlobalAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Beam Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Beam Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalBeamPropertiesType(GlobalBeamPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Load Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Load Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundLoadCasesType(GroundLoadCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Load Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Load Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundLoadCaseType(GroundLoadCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Curve Profile Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Curve Profile Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideCurveProfileGeometryType(GuideCurveProfileGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Curve Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Curve Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideCurveProfilesType(GuideCurveProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Curves Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Curves Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideCurvesType(GuideCurvesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideCurveType(GuideCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handbook Aero Last Transition Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handbook Aero Last Transition Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandbookAeroLastTransitionRegionType(HandbookAeroLastTransitionRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handbook Aero Polynomial Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handbook Aero Polynomial Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandbookAeroPolynomialCoefficientsType(HandbookAeroPolynomialCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handbook Aero Transition Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handbook Aero Transition Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandbookAeroTransitionRegionType(HandbookAeroTransitionRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hinge Moments Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hinge Moments Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHingeMomentsMapType(HingeMomentsMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Htp Fwd Interface Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Htp Fwd Interface Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtpFwdInterfaceDefType(HtpFwdInterfaceDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Htp Interface Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Htp Interface Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtpInterfaceDefType(HtpInterfaceDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Htp Struct Elem Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Htp Struct Elem Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtpStructElemDefType(HtpStructElemDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierType(IdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact Surface Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact Surface Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpactSurfaceDefinitionType(ImpactSurfaceDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indirect Operating Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indirect Operating Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndirectOperatingCostType(IndirectOperatingCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerBaseType(IntegerBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Connection Strut Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Connection Strut Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterConnectionStrutAttachmentType(InterConnectionStrutAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Struts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Struts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectionStrutsType(InterconnectionStrutsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Strut Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Strut Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectionStrutType(InterconnectionStrutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercostal Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercostal Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercostalPositionType(IntercostalPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercostals Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercostals Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercostalsAssemblyType(IntercostalsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinitionsType(InterfaceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpolation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpolation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpolationType(InterpolationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpolation Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpolation Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpolationType1(InterpolationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpolation Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpolation Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpolationType2(InterpolationType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isotropic Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isotropic Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsotropicPropertiesType(IsotropicPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceDefinitionsType(LandingGearInterfaceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Keelbeam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Keelbeam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceKeelbeamType(LandingGearInterfaceKeelbeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Lateral Panels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Lateral Panels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceLateralPanelsType(LandingGearInterfaceLateralPanelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Long Floor Beams Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Long Floor Beams Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceLongFloorBeamsConnectionType(
			LandingGearInterfaceLongFloorBeamsConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Main Frames Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Main Frames Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceMainFramesType(LandingGearInterfaceMainFramesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Pressure Floor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Pressure Floor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfacePressureFloorType(LandingGearInterfacePressureFloorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Interface Sidebox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Interface Sidebox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearInterfaceSideboxType(LandingGearInterfaceSideboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Position Safety Margins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Position Safety Margins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearPositionSafetyMarginsType(LandingGearPositionSafetyMarginsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearSettingType(LandingGearSettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Gear Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Gear Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingGearType(LandingGearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lateral Cap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lateral Cap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLateralCapType(LateralCapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leading Edge Devices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leading Edge Devices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadingEdgeDevicesType(LeadingEdgeDevicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leading Edge Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leading Edge Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadingEdgeDeviceType(LeadingEdgeDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leading Edge Hollow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leading Edge Hollow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadingEdgeHollowType(LeadingEdgeHollowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leading Edge Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leading Edge Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadingEdgeShapeType(LeadingEdgeShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Liner Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Liner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinerType(LinerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link To File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link To File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkToFileType(LinkToFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadAnalysisType(LoadAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Breakdown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Breakdown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBreakdownType(LoadBreakdownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Engines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Engines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseEnginesType(LoadCaseEnginesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Landing Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Landing Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseLandingGearsType(LoadCaseLandingGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Mass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Mass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseMassType(LoadCaseMassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Rotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Rotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseRotationType(LoadCaseRotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Rotation Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Rotation Velocity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseRotationVelocityType(LoadCaseRotationVelocityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseSettingsType(LoadCaseSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseStateType(LoadCaseStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCasesType(LoadCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Translation Acceleration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Translation Acceleration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseTranslationAccelerationType(LoadCaseTranslationAccelerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Translation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Translation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseTranslationType(LoadCaseTranslationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Case Translation Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Case Translation Velocity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCaseTranslationVelocityType(LoadCaseTranslationVelocityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadConditionType(LoadConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Reference Axis Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Reference Axis Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadReferenceAxisPointsType(LoadReferenceAxisPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Reference Axis Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Reference Axis Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadReferenceAxisPointType(LoadReferenceAxisPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadReferenceType(LoadReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loads Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loads Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadsEnvelopeType(LoadsEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Floor Beam Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Floor Beam Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongFloorBeamPositionType(LongFloorBeamPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Floor Beams Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Floor Beams Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongFloorBeamsAssemblyType(LongFloorBeamsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Floor Beam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Floor Beam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongFloorBeamType(LongFloorBeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Actuator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Actuator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainActuatorType(MainActuatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gear Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gear Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearGlobalType(MainGearGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearsType(MainGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gear Support Beam Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gear Support Beam Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearSupportBeamPositionType(MainGearSupportBeamPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gear Support Beam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gear Support Beam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearSupportBeamType(MainGearSupportBeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gear Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gear Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearType(MainGearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Gear Wing Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Gear Wing Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGearWingAttachmentType(MainGearWingAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Strut Interface Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Strut Interface Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainStrutInterfaceDefinitionsType(MainStrutInterfaceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Strut Wing Fuselage Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Strut Wing Fuselage Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainStrutWingFuselageAttachmentType(MainStrutWingFuselageAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenanceCostType(MaintenanceCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAir Conditioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAir Conditioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAirConditioningType(MAirConditioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Breakdown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Breakdown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassBreakdownType(MassBreakdownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Fraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Fraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassFractionType(MassFractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Inertia Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Inertia Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassInertiaType(MassInertiaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Inertia Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Inertia Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassInertiaVectorType(MassInertiaVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Definition For Profile Based Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Definition For Profile Based Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialDefinitionForProfileBasedPointType(MaterialDefinitionForProfileBasedPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Definition For Profile Based Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Definition For Profile Based Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialDefinitionForProfileBasedType(MaterialDefinitionForProfileBasedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialDefinitionType(MaterialDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Materials Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Materials Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialsType(MaterialsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialType(MaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAutomatic Flight System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAutomatic Flight System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAutomaticFlightSystemType(MAutomaticFlightSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAuxillary Power Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAuxillary Power Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAuxillaryPowerUnitType(MAuxillaryPowerUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBelly Fairings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBelly Fairings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBellyFairingsType(MBellyFairingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBleed Air System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBleed Air System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBleedAirSystemType(MBleedAirSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBulk Cargos Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBulk Cargos Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBulkCargosType(MBulkCargosType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBulk Cargo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBulk Cargo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBulkCargoType(MBulkCargoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBulkheads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBulkheads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBulkheadsType(MBulkheadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCabin Floors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCabin Floors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCabinFloorsType(MCabinFloorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCabin Lightings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCabin Lightings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCabinLightingsType(MCabinLightingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCargo Floors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCargo Floors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCargoFloorsType(MCargoFloorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCargo Linings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCargo Linings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCargoLiningsType(MCargoLiningsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCargo Loadings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCargo Loadings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCargoLoadingsType(MCargoLoadingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCargo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCargo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCargoType(MCargoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCarriages Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCarriages Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCarriagesType(MCarriagesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCarry Ons Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCarry Ons Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCarryOnsType(MCarryOnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCarry On Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCarry On Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCarryOnType(MCarryOnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCaterings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCaterings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCateringsType(MCateringsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCells Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCells Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCellsType(MCellsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCockpit Lightings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCockpit Lightings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCockpitLightingsType(MCockpitLightingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommunication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommunication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommunicationType(MCommunicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponent Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponent Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentSegmentsType(MComponentSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponent Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponent Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentSegmentType(MComponentSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MControl Surface Supports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MControl Surface Supports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMControlSurfaceSupportsType(MControlSurfaceSupportsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MControl Surface Support Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MControl Surface Support Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMControlSurfaceSupportType(MControlSurfaceSupportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCrew Members Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCrew Members Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCrewMembersType(MCrewMembersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCrew Seats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCrew Seats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCrewSeatsType(MCrewSeatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDe Icing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDe Icing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDeIcingType(MDeIcingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDocuments Tools Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDocuments Tools Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDocumentsToolsType(MDocumentsToolsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDoors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDoors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDoorsType(MDoorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MElectrical Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MElectrical Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMElectricalDistributionType(MElectricalDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MElectrical Generation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MElectrical Generation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMElectricalGenerationType(MElectricalGenerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEmergency Equipments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEmergency Equipments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEmergencyEquipmentsType(MEmergencyEquipmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEmergency Oxygen Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEmergency Oxygen Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEmergencyOxygenSystemsType(MEmergencyOxygenSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEmpty UL Ds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEmpty UL Ds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEmptyULDsType(MEmptyULDsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEmpty ULD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEmpty ULD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEmptyULDType(MEmptyULDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEngine Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEngine Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEngineControlType(MEngineControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEquipped Engines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEquipped Engines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEquippedEnginesType(MEquippedEnginesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExt Lightings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExt Lightings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExtLightingsType(MExtLightingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFire Protection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFire Protection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFireProtectionType(MFireProtectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFixed Galleys Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFixed Galleys Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFixedGalleysType(MFixedGalleysType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFixed Leading Edges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFixed Leading Edges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFixedLeadingEdgesType(MFixedLeadingEdgesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFixed Leading Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFixed Leading Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFixedLeadingEdgeType(MFixedLeadingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFixed Trailing Edges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFixed Trailing Edges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFixedTrailingEdgesType(MFixedTrailingEdgesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFixed Trailing Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFixed Trailing Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFixedTrailingEdgeType(MFixedTrailingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlight Controls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlight Controls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlightControlsType(MFlightControlsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFloor Coverings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFloor Coverings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFloorCoveringsType(MFloorCoveringsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFrames Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFrames Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFramesType(MFramesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFresh Water Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFresh Water Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFreshWaterSystemsType(MFreshWaterSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFuel System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFuel System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFuelSystemType(MFuelSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFuel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFuel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFuelType(MFuelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFurnishing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFurnishing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFurnishingType(MFurnishingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFuselages Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFuselages Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFuselagesStructureType(MFuselagesStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFuselage Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFuselage Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFuselageStructureType(MFuselageStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MHydraulic Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MHydraulic Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMHydraulicDistributionType(MHydraulicDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MHydraulic Generation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MHydraulic Generation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMHydraulicGenerationType(MHydraulicGenerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIFE Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIFE Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIFESystemsType(MIFESystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInstrument Panel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInstrument Panel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInstrumentPanelType(MInstrumentPanelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInsulations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInsulations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInsulationsType(MInsulationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegrated Modular Avionics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegrated Modular Avionics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegratedModularAvionicsType(MIntegratedModularAvionicsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInter Gas System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInter Gas System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInterGasSystemType(MInterGasSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionDefinitionsType(MissionDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Performance Map Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Performance Map Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionPerformanceMapDefinitionType(MissionPerformanceMapDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segment Block Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segment Block Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentBlockConstraintsType(MissionSegmentBlockConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segment Blocks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segment Blocks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentBlocksType(MissionSegmentBlocksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segment Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segment Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentBlockType(MissionSegmentBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segment End Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segment End Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentEndConditionType(MissionSegmentEndConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentsType(MissionSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionSegmentType(MissionSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Start Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Start Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionStartConditionType(MissionStartConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionsType(MissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionType(MissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLanding Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLanding Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLandingGearsType(MLandingGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLanding Gear Supports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLanding Gear Supports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLandingGearSupportsType(MLandingGearSupportsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLavatories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLavatories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLavatoriesType(MLavatoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLinings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLinings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLiningsType(MLiningsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMain Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMain Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMainGearsType(MMainGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MManufacturer Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MManufacturer Empty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMManufacturerEmptyType(MManufacturerEmptyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMillitary Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMillitary Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMillitarySystemsType(MMillitarySystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMiscellaneous Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMiscellaneous Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMiscellaneousType(MMiscellaneousType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMoveable Leading Edges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMoveable Leading Edges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMoveableLeadingEdgesType(MMoveableLeadingEdgesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMoveable Leading Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMoveable Leading Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMoveableLeadingEdgeType(MMoveableLeadingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMoveables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMoveables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMoveablesType(MMoveablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMoveable Trailing Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMoveable Trailing Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMoveableTrailingEdgeType(MMoveableTrailingEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MNavigation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MNavigation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMNavigationType(MNavigationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MNose Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MNose Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMNoseGearsType(MNoseGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monetary Values Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monetary Values Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonetaryValuesAnalysisType(MonetaryValuesAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOperator Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOperator Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOperatorItemsType(MOperatorItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOverhead Bins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOverhead Bins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOverheadBinsType(MOverheadBinsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPart Stow Doors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPart Stow Doors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPartStowDoorsType(MPartStowDoorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPassengers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPassengers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPassengersType(MPassengersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPassenger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPassenger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPassengerType(MPassengerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPax Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPax Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPaxType(MPaxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPayload Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPayload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPayloadType(MPayloadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPower Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPower Units Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPowerUnitsType(MPowerUnitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPylon Attachments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPylon Attachments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPylonAttachmentsType(MPylonAttachmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPylons Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPylons Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPylonsType(MPylonsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRibs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRibs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRibsType(MRibsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRib Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRibType(MRibType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSeats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSeats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSeatsType(MSeatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MShells Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MShells Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMShellsType(MShellsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MShell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MShell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMShellType(MShellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSkin Panels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSkin Panels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSkinPanelsType(MSkinPanelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSkins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSkins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSkinsType(MSkinsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSpars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSpars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSparsType(MSparsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSpecial Structures Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSpecial Structures Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSpecialStructuresType(MSpecialStructuresType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSpoilers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSpoilers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSpoilersType(MSpoilersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringersType(MStringersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStructure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStructure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStructureType(MStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemsType(MSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTrailing Edge Devices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTrailing Edge Devices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTrailingEdgeDevicesType(MTrailingEdgeDevicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTrailing Edge Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTrailing Edge Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTrailingEdgeDeviceType(MTrailingEdgeDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MULD Contents Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MULD Contents Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMULDContentsType(MULDContentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MULD Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MULD Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMULDContentType(MULDContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MVacuum Waste Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MVacuum Waste Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMVacuumWasteSystemsType(MVacuumWasteSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWaste Water Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWaste Water Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWasteWaterSystemsType(MWasteWaterSystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWindows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWindows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWindowsType(MWindowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWing Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWing Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWingBoxType(MWingBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWings Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWings Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWingsStructureType(MWingsStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWing Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWing Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWingStructureType(MWingStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Center Cowl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Center Cowl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleCenterCowlType(NacelleCenterCowlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Cowl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Cowl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleCowlType(NacelleCowlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Guide Curves Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Guide Curves Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleGuideCurvesType(NacelleGuideCurvesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Guide Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Guide Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleGuideCurveType(NacelleGuideCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleProfilesType(NacelleProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Sections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Sections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleSectionsType(NacelleSectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nacelle Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nacelle Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacelleSectionType(NacelleSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodal Loads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodal Loads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodalLoadsType(NodalLoadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodal Load Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodal Load Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodalLoadType(NodalLoadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noise Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noise Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoiseAnalysisType(NoiseAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nose Gear Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nose Gear Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoseGearGlobalType(NoseGearGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nose Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nose Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoseGearsType(NoseGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nose Gear Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nose Gear Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoseGearType(NoseGearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OEM Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OEM Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOEMType(OEMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCasesType(OperationalCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCaseType(OperationalCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Limit Increments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Limit Increments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationLimitIncrementsType(OperationLimitIncrementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationType(OrientationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orthotropic Shell Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orthotropic Shell Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrthotropicShellPropertiesType(OrthotropicShellPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orthotropic Solid Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orthotropic Solid Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrthotropicSolidPropertiesType(OrthotropicSolidPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outer Cut Out Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outer Cut Out Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOuterCutOutProfileType(OuterCutOutProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pax Cross Beams Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pax Cross Beams Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxCrossBeamsAssemblyType(PaxCrossBeamsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pax Cross Beam Struts Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pax Cross Beam Struts Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxCrossBeamStrutsAssemblyType(PaxCrossBeamStrutsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pax Doors Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pax Doors Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxDoorsAssemblyType(PaxDoorsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayloadGlobalType(PayloadGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceCasesType(PerformanceCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceCaseType(PerformanceCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Map Selection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Map Selection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMapSelectionType(PerformanceMapSelectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Requirements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Requirements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceRequirementsType(PerformanceRequirementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Targets Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Targets Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceTargetsGlobalType(PerformanceTargetsGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phi Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phi Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhiType(PhiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piston Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piston Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePistonType(PistonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plasticity Curve Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasticity Curve Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasticityCurvePointsType(PlasticityCurvePointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plasticity Curve Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasticity Curve Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasticityCurvePointType(PlasticityCurvePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plasticity Curves Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasticity Curves Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasticityCurvesType(PlasticityCurvesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plasticity Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasticity Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasticityCurveType(PlasticityCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Abs Rel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Abs Rel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointAbsRelType(PointAbsRelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointConstraintType(PointConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List Rel XYZ Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List Rel XYZ Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointListRelXYZVectorType(PointListRelXYZVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointListType(PointListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List XY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List XY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointListXYType(PointListXYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List XY Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List XY Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointListXYVectorType(PointListXYVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List XYZ Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List XYZ Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointListXYZVectorType(PointListXYZVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Performances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Performances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointPerformancesType(PointPerformancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointPerformanceType(PointPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point XType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point XType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointXType(PointXType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point XY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point XY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointXYType(PointXYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point XYZ Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point XYZ Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointXYZType(PointXYZType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point XZ Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point XZ Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointXZType(PointXZType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point YType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point YType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointYType(PointYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point YZ Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point YZ Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointYZType(PointYZType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point ZType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point ZType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointZType(PointZType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positionings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positionings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositioningsType(PositioningsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositioningType(PositioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Bulkhead Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Bulkhead Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureBulkheadAssemblyPositionType(PressureBulkheadAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Bulkhead Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Bulkhead Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureBulkheadAssemblyType(PressureBulkheadAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Bulkheads Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Bulkheads Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureBulkheadsType(PressureBulkheadsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Bulkhead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Bulkhead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureBulkheadType(PressureBulkheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritySettingType(PrioritySettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Based Structural Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Based Structural Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileBasedStructuralElementsType(ProfileBasedStructuralElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Based Structural Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Based Structural Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileBasedStructuralElementType(ProfileBasedStructuralElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Geometry2 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Geometry2 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileGeometry2DType(ProfileGeometry2DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileGeometryType(ProfileGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfilesType(ProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Attachments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Attachments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonAttachmentsType(PylonAttachmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonAttachmentType(PylonAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonBoxType(PylonBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Pins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Pins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonPinsType(PylonPinsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Pin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Pin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonPinType(PylonPinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Ribs Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Ribs Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonRibsDefinitionsType(PylonRibsDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Ribs Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Ribs Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonRibsDefinitionType(PylonRibsDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Ribs Positioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Ribs Positioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonRibsPositioningType(PylonRibsPositioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Shackles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Shackles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonShacklesType(PylonShacklesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Shackle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Shackle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonShackleType(PylonShackleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Shell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Shell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonShellType(PylonShellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonStructureType(PylonStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pylon Struts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pylon Struts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePylonStrutsType(PylonStrutsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quasi Steady Rotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quasi Steady Rotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuasiSteadyRotationType(QuasiSteadyRotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radiative Forcing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radiative Forcing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadiativeForcingType(RadiativeForcingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurring Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurring Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurringCostType(RecurringCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementType(RequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rib Crossing Behaviour Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rib Crossing Behaviour Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRibCrossingBehaviourType(RibCrossingBehaviourType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rib Crossing Behaviour Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rib Crossing Behaviour Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRibCrossingBehaviourType1(RibCrossingBehaviourType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rib Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rib Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRibIdentificationType(RibIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rib Rotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rib Rotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRibRotationType(RibRotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rivet Joint Area Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rivet Joint Area Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRivetJointAreaAssemblyPositionType(RivetJointAreaAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rivet Joint Areas Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rivet Joint Areas Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRivetJointAreasAssemblyType(RivetJointAreasAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rivets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rivets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRivetsType(RivetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rivet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rivet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRivetType(RivetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationCurveType(RotationCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rot Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rot Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotDirectionType(RotDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Airfoils Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Airfoils Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorAirfoilsType(RotorAirfoilsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Blade Attachments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Blade Attachments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorBladeAttachmentsType(RotorBladeAttachmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Blade Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Blade Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorBladeAttachmentType(RotorBladeAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Blades Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Blades Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorBladesType(RotorBladesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Analyses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Analyses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftAnalysesType(RotorcraftAnalysesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftGlobalType(RotorcraftGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Mass Breakdown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Mass Breakdown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftMassBreakdownType(RotorcraftMassBreakdownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Mass EM Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Mass EM Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftMassEMType(RotorcraftMassEMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Mass Group Level1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Mass Group Level1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftMassGroupLevel1Type(RotorcraftMassGroupLevel1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Mass Group Level2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Mass Group Level2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftMassGroupLevel2Type(RotorcraftMassGroupLevel2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Mass OEM Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Mass OEM Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftMassOEMType(RotorcraftMassOEMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftModelType(RotorcraftModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotorcraft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotorcraft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorcraftType(RotorcraftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Hub Hinges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Hub Hinges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorHubHingesType(RotorHubHingesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Hub Hinge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Hub Hinge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorHubHingeType(RotorHubHingeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Hub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Hub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorHubType(RotorHubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorsType(RotorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotorType(RotorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runway ILS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runway ILS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunwayILSType(RunwayILSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runways Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runways Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunwaysType(RunwaysType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runway Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runway Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunwayType(RunwayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seat Modules Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seat Modules Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeatModulesType(SeatModulesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seat Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seat Module Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeatModuleType(SeatModuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Distribution Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Distribution Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionDistributionModeType(SectionDistributionModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentDirectionType(SegmentDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentTypeType(SegmentTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shaft Linked Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shaft Linked Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaftLinkedComponentsType(ShaftLinkedComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shafts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shafts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaftsType(ShaftsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shaft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaftType(ShaftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet3 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet3 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheet3DType(Sheet3DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet Based Structural Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet Based Structural Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetBasedStructuralElementsType(SheetBasedStructuralElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet Based Structural Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet Based Structural Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetBasedStructuralElementType(SheetBasedStructuralElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet List3 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet List3 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetList3DType(SheetList3DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetListType(SheetListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetPointsType(SheetPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheetType(SheetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Side Struts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Side Struts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSideStrutsType(SideStrutsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Side Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Side Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSideType(SideType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Generic Mass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Generic Mass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleGenericMassType(SingleGenericMassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sizing Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sizing Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizingTypeType(SizingTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skid Gear Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skid Gear Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkidGearGlobalType(SkidGearGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skid Gears Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skid Gears Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkidGearsType(SkidGearsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skid Gear Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skid Gear Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkidGearType(SkidGearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skin Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skin Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinSegmentsType(SkinSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skin Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skin Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinSegmentType(SkinSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinType(SkinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Cells Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Cells Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparCellsType(SparCellsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparCellType(SparCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Cross Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Cross Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparCrossSectionType(SparCrossSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Positions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Positions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparPositionsType(SparPositionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparPositionType(SparPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Position UI Ds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Position UI Ds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparPositionUIDsType(SparPositionUIDsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparSegmentsType(SparSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spar Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spar Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparSegmentType(SparSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Heat Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Heat Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificHeatMapType(SpecificHeatMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Performance Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Performance Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificPerformanceMapsType(SpecificPerformanceMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Performance Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Performance Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificPerformanceMapType(SpecificPerformanceMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spoilers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spoilers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpoilersType(SpoilersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spoiler Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spoiler Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpoilerType(SpoilerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Profile Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Profile Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardProfileTypeType(StandardProfileTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateParametersType(StateParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateParameterType(StateParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stiffness Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stiffness Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStiffnessType(StiffnessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Array Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Array Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringArrayBaseType(StringArrayBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringBaseType(StringBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stringer Frame Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stringer Frame Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringerFramePositionType(StringerFramePositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stringers Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stringers Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringersAssemblyType(StringersAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stringer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stringer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringerType(StringerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String UID Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String UID Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringUIDBaseType(StringUIDBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Vector Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Vector Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVectorBaseType(StringVectorBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralElementsType(StructuralElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Mount Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Mount Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralMountType(StructuralMountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Profile3 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Profile3 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralProfile3DType(StructuralProfile3DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Profiles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Profiles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralProfilesType(StructuralProfilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralProfileType(StructuralProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Wall Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Wall Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralWallElementsType(StructuralWallElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Wall Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Wall Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralWallElementType(StructuralWallElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strut Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strut Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrutType(StrutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strut With Actuator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strut With Actuator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrutWithActuatorType(StrutWithActuatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Studies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Studies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudiesType(StudiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Fleets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Fleets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFleetsType(SubFleetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Fleet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Fleet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFleetType(SubFleetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Load Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Load Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLoadType(SubLoadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetry Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetry Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetryType3(SymmetryType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systems Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systems Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemsType(SystemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tailplane Attachment Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tailplane Attachment Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTailplaneAttachmentAreaType(TailplaneAttachmentAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tailplane Attachment Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tailplane Attachment Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTailplaneAttachmentTypeType(TailplaneAttachmentTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Takeoff Performance Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Takeoff Performance Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTakeoffPerformanceParametersType(TakeoffPerformanceParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tangent Links Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tangent Links Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTangentLinksType(TangentLinksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tied Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tied Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiedInterfacesType(TiedInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tied Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tied Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiedInterfaceType(TiedInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBaseType(TimeBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toolspecific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toolspecific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolspecificType(ToolspecificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolType(ToolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyEntriesType(TopologyEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyEntryType(TopologyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Operating Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Operating Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalOperatingCostType(TotalOperatingCostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Actuator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Actuator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackActuatorType(TrackActuatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Car Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Car Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackCarType(TrackCarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Fairing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Fairing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackFairingType(TrackFairingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackStructureType(TrackStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Strut1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Strut1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackStrut1Type(TrackStrut1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Strut2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Strut2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackStrut2Type(TrackStrut2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Sub Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Sub Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackSubTypeType(TrackSubTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackTypeType(TrackTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trailing Edge Devices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trailing Edge Devices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrailingEdgeDevicesType(TrailingEdgeDevicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trailing Edge Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trailing Edge Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrailingEdgeDeviceType(TrailingEdgeDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoriesType(TrajectoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryGlobalType(TrajectoryGlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryType(TrajectoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation2 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation2 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation2DType(Transformation2DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationType(TransformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Gear Ratio Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Gear Ratio Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionGearRatioType(TransmissionGearRatioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Shaft Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Shaft Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionShaftInputsType(TransmissionShaftInputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Shaft Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Shaft Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionShaftInputType(TransmissionShaftInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Shaft Outputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Shaft Outputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionShaftOutputsType(TransmissionShaftOutputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Shaft Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Shaft Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionShaftOutputType(TransmissionShaftOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionsType(TransmissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionType(TransmissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trim Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trim Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrimParametersType(TrimParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Of Point Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Of Point Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOfPointPerformanceType(TypeOfPointPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType1(TypeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType2(TypeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType5(TypeType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType6(TypeType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType7(TypeType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UID Group Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UID Group Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDGroupDefinitionsType(UIDGroupDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UID Group Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UID Group Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDGroupDefinitionType(UIDGroupDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatesType(UpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Links Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Links Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperLinksType(UpperLinksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSegmentsType(VariableSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSegmentType(VariableSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehiclesType(VehiclesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vtp Frame Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vtp Frame Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVtpFrameDefType(VtpFrameDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vtp Interface Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vtp Interface Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVtpInterfaceDefType(VtpInterfaceDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Positions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Positions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallPositionsType(WallPositionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallPositionType(WallPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Position UI Ds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Position UI Ds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallPositionUIDsType(WallPositionUIDsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallSegmentsType(WallSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallSegmentType(WallSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Walls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Walls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallsType(WallsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWayPointTypeType(WayPointTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebType(WebType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalanceCaseType(WeightAndBalanceCaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Fuel In Tanks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Fuel In Tanks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalanceFuelInTanksType(WeightAndBalanceFuelInTanksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Fuel In Tank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Fuel In Tank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalanceFuelInTankType(WeightAndBalanceFuelInTankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Fuel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Fuel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalanceFuelType(WeightAndBalanceFuelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balancem Cargos Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balancem Cargos Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalancemCargosType(WeightAndBalancemCargosType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balancem Paxx Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balancem Paxx Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalancemPaxxType(WeightAndBalancemPaxxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Payload Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Payload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalancePayloadType(WeightAndBalancePayloadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight And Balance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight And Balance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightAndBalanceType(WeightAndBalanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWheelsType(WheelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWheelType(WheelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window Assembly Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window Assembly Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowAssemblyPositionType(WindowAssemblyPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsAssemblyType(WindowsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsType(WindowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingAeroPerformanceType(WingAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Airfoils Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Airfoils Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingAirfoilsType(WingAirfoilsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Cells Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Cells Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingCellsType(WingCellsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingCellType(WingCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingCoefficientsType(WingCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Component Segment Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Component Segment Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingComponentSegmentStructureType(WingComponentSegmentStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingElementsType(WingElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingElementType(WingElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuel Tank Border Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuel Tank Border Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuelTankBorderType(WingFuelTankBorderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuel Tank Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuel Tank Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuelTankGeometryType(WingFuelTankGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuel Tanks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuel Tanks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuelTanksType(WingFuelTanksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuel Tank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuel Tank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuelTankType(WingFuelTankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuselage Attachments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuselage Attachments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuselageAttachmentsType(WingFuselageAttachmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Fuselage Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Fuselage Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingFuselageAttachmentType(WingFuselageAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Interface Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Interface Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingInterfaceDefinitionsType(WingInterfaceDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Interface Main Frames Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Interface Main Frames Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingInterfaceMainFramesType(WingInterfaceMainFramesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Interface Support Struts Assembly Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Interface Support Struts Assembly Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingInterfaceSupportStrutsAssemblyType(WingInterfaceSupportStrutsAssemblyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Interface Support Strut Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Interface Support Strut Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingInterfaceSupportStrutType(WingInterfaceSupportStrutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Intermediate Structure Cells Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Intermediate Structure Cells Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingIntermediateStructureCellsType(WingIntermediateStructureCellsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Intermediate Structure Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Intermediate Structure Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingIntermediateStructureCellType(WingIntermediateStructureCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Rib Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Rib Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibCellType(WingRibCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Rib Cross Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Rib Cross Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibCrossSectionType(WingRibCrossSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Rib Explicit Positioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Rib Explicit Positioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibExplicitPositioningType(WingRibExplicitPositioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Rib Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Rib Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibPointType(WingRibPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Ribs Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Ribs Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibsDefinitionsType(WingRibsDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Ribs Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Ribs Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibsDefinitionType(WingRibsDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Ribs Positioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Ribs Positioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingRibsPositioningType(WingRibsPositioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wings Aero Performance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wings Aero Performance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingsAeroPerformanceType(WingsAeroPerformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wings Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wings Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingsCoefficientsType(WingsCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Sections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Sections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSectionsType(WingSectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSectionType(WingSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Segment Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Segment Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSegmentCoefficientsType(WingSegmentCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Segments Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Segments Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSegmentsCoefficientsType(WingSegmentsCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Segment Strip Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Segment Strip Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSegmentStripCoefficientsType(WingSegmentStripCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSegmentsType(WingSegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSegmentType(WingSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Shell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Shell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingShellType(WingShellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Skin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Skin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSkinType(WingSkinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Spar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Spar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingSparType(WingSparType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Stringer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Stringer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingStringerType(WingStringerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Structural Mounts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Structural Mounts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingStructuralMountsType(WingStructuralMountsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingsType(WingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingType(WingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Wing Attachment Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Wing Attachment Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingWingAttachmentElementsType(WingWingAttachmentElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Wing Attachment Spars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Wing Attachment Spars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingWingAttachmentSparsType(WingWingAttachmentSparsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Wing Attachments Spars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Wing Attachments Spars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingWingAttachmentsSparsType(WingWingAttachmentsSparsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Wing Attachments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Wing Attachments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingWingAttachmentsType(WingWingAttachmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wing Wing Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wing Wing Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWingWingAttachmentType(WingWingAttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsi Iso Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsi Iso Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsiIsoLineType(XsiIsoLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCouplings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCouplings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCouplingsType(ZCouplingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCoupling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCoupling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCouplingType(ZCouplingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CpacsSwitch
