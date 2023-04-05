/**
 */
package Cpacs.util;

import Cpacs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage
 * @generated
 */
public class CpacsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CpacsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CpacsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpacsSwitch<Adapter> modelSwitch = new CpacsSwitch<Adapter>() {
		@Override
		public Adapter caseActuatorAttachmentType(ActuatorAttachmentType object) {
			return createActuatorAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseActuatorControlSurfaceAttachmentType(ActuatorControlSurfaceAttachmentType object) {
			return createActuatorControlSurfaceAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseActuatorFuselageWingAttachmentType(ActuatorFuselageWingAttachmentType object) {
			return createActuatorFuselageWingAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseActuatorFuselageWingType(ActuatorFuselageWingType object) {
			return createActuatorFuselageWingTypeAdapter();
		}

		@Override
		public Adapter caseActuatorParentAttachmentType(ActuatorParentAttachmentType object) {
			return createActuatorParentAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseActuatorsFuselageWingType(ActuatorsFuselageWingType object) {
			return createActuatorsFuselageWingTypeAdapter();
		}

		@Override
		public Adapter caseAeroCaseAeroDataType(AeroCaseAeroDataType object) {
			return createAeroCaseAeroDataTypeAdapter();
		}

		@Override
		public Adapter caseAeroCaseCoefficientsType(AeroCaseCoefficientsType object) {
			return createAeroCaseCoefficientsTypeAdapter();
		}

		@Override
		public Adapter caseAeroCaseSpecificationType(AeroCaseSpecificationType object) {
			return createAeroCaseSpecificationTypeAdapter();
		}

		@Override
		public Adapter caseAeroCasesType(AeroCasesType object) {
			return createAeroCasesTypeAdapter();
		}

		@Override
		public Adapter caseAeroCaseType(AeroCaseType object) {
			return createAeroCaseTypeAdapter();
		}

		@Override
		public Adapter caseAeroDataComponentsType(AeroDataComponentsType object) {
			return createAeroDataComponentsTypeAdapter();
		}

		@Override
		public Adapter caseAeroDataComponentType(AeroDataComponentType object) {
			return createAeroDataComponentTypeAdapter();
		}

		@Override
		public Adapter caseAeroDataVehicleType(AeroDataVehicleType object) {
			return createAeroDataVehicleTypeAdapter();
		}

		@Override
		public Adapter caseAeroelasticDivergenceType(AeroelasticDivergenceType object) {
			return createAeroelasticDivergenceTypeAdapter();
		}

		@Override
		public Adapter caseAeroelasticStaticMaxDisplacementType(AeroelasticStaticMaxDisplacementType object) {
			return createAeroelasticStaticMaxDisplacementTypeAdapter();
		}

		@Override
		public Adapter caseAeroelasticsType(AeroelasticsType object) {
			return createAeroelasticsTypeAdapter();
		}

		@Override
		public Adapter caseAeroLimitsIncrementMapsType(AeroLimitsIncrementMapsType object) {
			return createAeroLimitsIncrementMapsTypeAdapter();
		}

		@Override
		public Adapter caseAeroLimitsIncrementMapType(AeroLimitsIncrementMapType object) {
			return createAeroLimitsIncrementMapTypeAdapter();
		}

		@Override
		public Adapter caseAeroLimitsMapType(AeroLimitsMapType object) {
			return createAeroLimitsMapTypeAdapter();
		}

		@Override
		public Adapter caseAeroMapOperationLimitType(AeroMapOperationLimitType object) {
			return createAeroMapOperationLimitTypeAdapter();
		}

		@Override
		public Adapter caseAeroMapType(AeroMapType object) {
			return createAeroMapTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceBoundaryConditionsType(AeroPerformanceBoundaryConditionsType object) {
			return createAeroPerformanceBoundaryConditionsTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceIncrementMapsType(AeroPerformanceIncrementMapsType object) {
			return createAeroPerformanceIncrementMapsTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceIncrementMapType(AeroPerformanceIncrementMapType object) {
			return createAeroPerformanceIncrementMapTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceMapRCType(AeroPerformanceMapRCType object) {
			return createAeroPerformanceMapRCTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceMapsRCType(AeroPerformanceMapsRCType object) {
			return createAeroPerformanceMapsRCTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceMapType(AeroPerformanceMapType object) {
			return createAeroPerformanceMapTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceRCType(AeroPerformanceRCType object) {
			return createAeroPerformanceRCTypeAdapter();
		}

		@Override
		public Adapter caseAeroPerformanceType(AeroPerformanceType object) {
			return createAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseAircraftAnalysesGlobalType(AircraftAnalysesGlobalType object) {
			return createAircraftAnalysesGlobalTypeAdapter();
		}

		@Override
		public Adapter caseAircraftAnalysesType(AircraftAnalysesType object) {
			return createAircraftAnalysesTypeAdapter();
		}

		@Override
		public Adapter caseAircraftControlElementsType(AircraftControlElementsType object) {
			return createAircraftControlElementsTypeAdapter();
		}

		@Override
		public Adapter caseAircraftControlElementType(AircraftControlElementType object) {
			return createAircraftControlElementTypeAdapter();
		}

		@Override
		public Adapter caseAircraftGlobalType(AircraftGlobalType object) {
			return createAircraftGlobalTypeAdapter();
		}

		@Override
		public Adapter caseAircraftModelType(AircraftModelType object) {
			return createAircraftModelTypeAdapter();
		}

		@Override
		public Adapter caseAircraftType(AircraftType object) {
			return createAircraftTypeAdapter();
		}

		@Override
		public Adapter caseAirfoilAeroPerformanceType(AirfoilAeroPerformanceType object) {
			return createAirfoilAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseAirfoilsAeroPerformanceType(AirfoilsAeroPerformanceType object) {
			return createAirfoilsAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseAirframeMaintenanceCostType(AirframeMaintenanceCostType object) {
			return createAirframeMaintenanceCostTypeAdapter();
		}

		@Override
		public Adapter caseAirlinesType(AirlinesType object) {
			return createAirlinesTypeAdapter();
		}

		@Override
		public Adapter caseAirlineType(AirlineType object) {
			return createAirlineTypeAdapter();
		}

		@Override
		public Adapter caseAirportCompatabilityGlobalType(AirportCompatabilityGlobalType object) {
			return createAirportCompatabilityGlobalTypeAdapter();
		}

		@Override
		public Adapter caseAirportsType(AirportsType object) {
			return createAirportsTypeAdapter();
		}

		@Override
		public Adapter caseAirportType(AirportType object) {
			return createAirportTypeAdapter();
		}

		@Override
		public Adapter caseAlignmentCrossBeamType(AlignmentCrossBeamType object) {
			return createAlignmentCrossBeamTypeAdapter();
		}

		@Override
		public Adapter caseAlignmentFloorPanelType(AlignmentFloorPanelType object) {
			return createAlignmentFloorPanelTypeAdapter();
		}

		@Override
		public Adapter caseAlignmentStringFrameType(AlignmentStringFrameType object) {
			return createAlignmentStringFrameTypeAdapter();
		}

		@Override
		public Adapter caseAlignmentStructMemberType(AlignmentStructMemberType object) {
			return createAlignmentStructMemberTypeAdapter();
		}

		@Override
		public Adapter caseAltitudeType(AltitudeType object) {
			return createAltitudeTypeAdapter();
		}

		@Override
		public Adapter caseAnisotropicShellPropertiesType(AnisotropicShellPropertiesType object) {
			return createAnisotropicShellPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseAnisotropicSolidPropertiesType(AnisotropicSolidPropertiesType object) {
			return createAnisotropicSolidPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseAtmosphericModelOldType(AtmosphericModelOldType object) {
			return createAtmosphericModelOldTypeAdapter();
		}

		@Override
		public Adapter caseAtmosphericModelType(AtmosphericModelType object) {
			return createAtmosphericModelTypeAdapter();
		}

		@Override
		public Adapter caseAtmosphericModelType1(AtmosphericModelType1 object) {
			return createAtmosphericModelType1Adapter();
		}

		@Override
		public Adapter caseAttachmentPinsType(AttachmentPinsType object) {
			return createAttachmentPinsTypeAdapter();
		}

		@Override
		public Adapter caseAttachmentPinType(AttachmentPinType object) {
			return createAttachmentPinTypeAdapter();
		}

		@Override
		public Adapter caseAxleAssembliesType(AxleAssembliesType object) {
			return createAxleAssembliesTypeAdapter();
		}

		@Override
		public Adapter caseAxleAssemblyType(AxleAssemblyType object) {
			return createAxleAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseAxleType(AxleType object) {
			return createAxleTypeAdapter();
		}

		@Override
		public Adapter caseBeamCrossSectionType(BeamCrossSectionType object) {
			return createBeamCrossSectionTypeAdapter();
		}

		@Override
		public Adapter caseBeamStiffnessType(BeamStiffnessType object) {
			return createBeamStiffnessTypeAdapter();
		}

		@Override
		public Adapter caseBlockedDOFType(BlockedDOFType object) {
			return createBlockedDOFTypeAdapter();
		}

		@Override
		public Adapter caseBogieType(BogieType object) {
			return createBogieTypeAdapter();
		}

		@Override
		public Adapter caseBooleanBaseType(BooleanBaseType object) {
			return createBooleanBaseTypeAdapter();
		}

		@Override
		public Adapter caseBoundingBoxType(BoundingBoxType object) {
			return createBoundingBoxTypeAdapter();
		}

		@Override
		public Adapter caseBoundingElementUIDsType(BoundingElementUIDsType object) {
			return createBoundingElementUIDsTypeAdapter();
		}

		@Override
		public Adapter caseCabinAislesType(CabinAislesType object) {
			return createCabinAislesTypeAdapter();
		}

		@Override
		public Adapter caseCabinAisleType(CabinAisleType object) {
			return createCabinAisleTypeAdapter();
		}

		@Override
		public Adapter caseCabinGeometryContoursType(CabinGeometryContoursType object) {
			return createCabinGeometryContoursTypeAdapter();
		}

		@Override
		public Adapter caseCabinGeometryContourType(CabinGeometryContourType object) {
			return createCabinGeometryContourTypeAdapter();
		}

		@Override
		public Adapter caseCabinGeometryType(CabinGeometryType object) {
			return createCabinGeometryTypeAdapter();
		}

		@Override
		public Adapter caseCabinSpacesType(CabinSpacesType object) {
			return createCabinSpacesTypeAdapter();
		}

		@Override
		public Adapter caseCabinSpaceType(CabinSpaceType object) {
			return createCabinSpaceTypeAdapter();
		}

		@Override
		public Adapter caseCalibratedAirSpeedType(CalibratedAirSpeedType object) {
			return createCalibratedAirSpeedTypeAdapter();
		}

		@Override
		public Adapter caseCapType(CapType object) {
			return createCapTypeAdapter();
		}

		@Override
		public Adapter caseCargoContainerElementsType(CargoContainerElementsType object) {
			return createCargoContainerElementsTypeAdapter();
		}

		@Override
		public Adapter caseCargoContainerElementType(CargoContainerElementType object) {
			return createCargoContainerElementTypeAdapter();
		}

		@Override
		public Adapter caseCargoContainersType(CargoContainersType object) {
			return createCargoContainersTypeAdapter();
		}

		@Override
		public Adapter caseCargoContainerType(CargoContainerType object) {
			return createCargoContainerTypeAdapter();
		}

		@Override
		public Adapter caseCargoCrossBeamsAssemblyType(CargoCrossBeamsAssemblyType object) {
			return createCargoCrossBeamsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseCargoCrossBeamStrutsAssemblyType(CargoCrossBeamStrutsAssemblyType object) {
			return createCargoCrossBeamStrutsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseCargoDoorsAssemblyType(CargoDoorsAssemblyType object) {
			return createCargoDoorsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseCeilingPanelElementsType(CeilingPanelElementsType object) {
			return createCeilingPanelElementsTypeAdapter();
		}

		@Override
		public Adapter caseCeilingPanelsType(CeilingPanelsType object) {
			return createCeilingPanelsTypeAdapter();
		}

		@Override
		public Adapter caseCellPositioningChordwiseType(CellPositioningChordwiseType object) {
			return createCellPositioningChordwiseTypeAdapter();
		}

		@Override
		public Adapter caseCellPositioningSpanwiseType(CellPositioningSpanwiseType object) {
			return createCellPositioningSpanwiseTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageAreasAssemblyType(CenterFuselageAreasAssemblyType object) {
			return createCenterFuselageAreasAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageAreaType(CenterFuselageAreaType object) {
			return createCenterFuselageAreaTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageHighWingConfigurationType(CenterFuselageHighWingConfigurationType object) {
			return createCenterFuselageHighWingConfigurationTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageKeelbeamType(CenterFuselageKeelbeamType object) {
			return createCenterFuselageKeelbeamTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageLateralPanelsType(CenterFuselageLateralPanelsType object) {
			return createCenterFuselageLateralPanelsTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageLongFloorBeamsConnectionType(
				CenterFuselageLongFloorBeamsConnectionType object) {
			return createCenterFuselageLongFloorBeamsConnectionTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageLowWingConfigurationType(CenterFuselageLowWingConfigurationType object) {
			return createCenterFuselageLowWingConfigurationTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageMainFramesType(CenterFuselageMainFramesType object) {
			return createCenterFuselageMainFramesTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselagePressureFloorType(CenterFuselagePressureFloorType object) {
			return createCenterFuselagePressureFloorTypeAdapter();
		}

		@Override
		public Adapter caseCenterFuselageSideboxType(CenterFuselageSideboxType object) {
			return createCenterFuselageSideboxTypeAdapter();
		}

		@Override
		public Adapter caseCertificationCasesType(CertificationCasesType object) {
			return createCertificationCasesTypeAdapter();
		}

		@Override
		public Adapter caseChangeLogType(ChangeLogType object) {
			return createChangeLogTypeAdapter();
		}

		@Override
		public Adapter caseChargesCostType(ChargesCostType object) {
			return createChargesCostTypeAdapter();
		}

		@Override
		public Adapter caseChordwisePartsType(ChordwisePartsType object) {
			return createChordwisePartsTypeAdapter();
		}

		@Override
		public Adapter caseChordwisePartType(ChordwisePartType object) {
			return createChordwisePartTypeAdapter();
		}

		@Override
		public Adapter caseClassDividerElementsType(ClassDividerElementsType object) {
			return createClassDividerElementsTypeAdapter();
		}

		@Override
		public Adapter caseClassDividersType(ClassDividersType object) {
			return createClassDividersTypeAdapter();
		}

		@Override
		public Adapter caseCockpitControlsType(CockpitControlsType object) {
			return createCockpitControlsTypeAdapter();
		}

		@Override
		public Adapter caseCockpitControlType(CockpitControlType object) {
			return createCockpitControlTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientReferenceType(CoefficientReferenceType object) {
			return createCoefficientReferenceTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownComponentsType(CoefficientsBreakdownComponentsType object) {
			return createCoefficientsBreakdownComponentsTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownComponentType(CoefficientsBreakdownComponentType object) {
			return createCoefficientsBreakdownComponentTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownSegmentType(CoefficientsBreakdownSegmentType object) {
			return createCoefficientsBreakdownSegmentTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownStripsType(CoefficientsBreakdownStripsType object) {
			return createCoefficientsBreakdownStripsTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownStripType(CoefficientsBreakdownStripType object) {
			return createCoefficientsBreakdownStripTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownType(CoefficientsBreakdownType object) {
			return createCoefficientsBreakdownTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownWingSegmentsType(CoefficientsBreakdownWingSegmentsType object) {
			return createCoefficientsBreakdownWingSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownWingsType(CoefficientsBreakdownWingsType object) {
			return createCoefficientsBreakdownWingsTypeAdapter();
		}

		@Override
		public Adapter caseCoefficientsBreakdownWingType(CoefficientsBreakdownWingType object) {
			return createCoefficientsBreakdownWingTypeAdapter();
		}

		@Override
		public Adapter caseCommandCaseCommandType(CommandCaseCommandType object) {
			return createCommandCaseCommandTypeAdapter();
		}

		@Override
		public Adapter caseCommandCasesType(CommandCasesType object) {
			return createCommandCasesTypeAdapter();
		}

		@Override
		public Adapter caseCommandCaseType(CommandCaseType object) {
			return createCommandCaseTypeAdapter();
		}

		@Override
		public Adapter caseCompartmentGeometryType(CompartmentGeometryType object) {
			return createCompartmentGeometryTypeAdapter();
		}

		@Override
		public Adapter caseCompartmentsType(CompartmentsType object) {
			return createCompartmentsTypeAdapter();
		}

		@Override
		public Adapter caseCompartmentType(CompartmentType object) {
			return createCompartmentTypeAdapter();
		}

		@Override
		public Adapter caseComplexBaseType(ComplexBaseType object) {
			return createComplexBaseTypeAdapter();
		}

		@Override
		public Adapter caseComponentCostType(ComponentCostType object) {
			return createComponentCostTypeAdapter();
		}

		@Override
		public Adapter caseComponentSegmentPathType(ComponentSegmentPathType object) {
			return createComponentSegmentPathTypeAdapter();
		}

		@Override
		public Adapter caseComponentSegmentStepsType(ComponentSegmentStepsType object) {
			return createComponentSegmentStepsTypeAdapter();
		}

		@Override
		public Adapter caseComponentSegmentStepType(ComponentSegmentStepType object) {
			return createComponentSegmentStepTypeAdapter();
		}

		@Override
		public Adapter caseComponentSegmentsType(ComponentSegmentsType object) {
			return createComponentSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseComponentSegmentType(ComponentSegmentType object) {
			return createComponentSegmentTypeAdapter();
		}

		@Override
		public Adapter caseCompositeLayerType(CompositeLayerType object) {
			return createCompositeLayerTypeAdapter();
		}

		@Override
		public Adapter caseCompositesType(CompositesType object) {
			return createCompositesTypeAdapter();
		}

		@Override
		public Adapter caseCompositeType(CompositeType object) {
			return createCompositeTypeAdapter();
		}

		@Override
		public Adapter caseConfigurationType(ConfigurationType object) {
			return createConfigurationTypeAdapter();
		}

		@Override
		public Adapter caseConnectivitiesType(ConnectivitiesType object) {
			return createConnectivitiesTypeAdapter();
		}

		@Override
		public Adapter caseConnectivityType(ConnectivityType object) {
			return createConnectivityTypeAdapter();
		}

		@Override
		public Adapter caseConstraintSettingsType(ConstraintSettingsType object) {
			return createConstraintSettingsTypeAdapter();
		}

		@Override
		public Adapter caseConstraintsType(ConstraintsType object) {
			return createConstraintsTypeAdapter();
		}

		@Override
		public Adapter caseContinuityAtP1Type(ContinuityAtP1Type object) {
			return createContinuityAtP1TypeAdapter();
		}

		@Override
		public Adapter caseContinuityAtP2Type(ContinuityAtP2Type object) {
			return createContinuityAtP2TypeAdapter();
		}

		@Override
		public Adapter caseContinuityType(ContinuityType object) {
			return createContinuityTypeAdapter();
		}

		@Override
		public Adapter caseContinuityType1(ContinuityType1 object) {
			return createContinuityType1Adapter();
		}

		@Override
		public Adapter caseContinuityType2(ContinuityType2 object) {
			return createContinuityType2Adapter();
		}

		@Override
		public Adapter caseContinuityType3(ContinuityType3 object) {
			return createContinuityType3Adapter();
		}

		@Override
		public Adapter caseContinuityType4(ContinuityType4 object) {
			return createContinuityType4Adapter();
		}

		@Override
		public Adapter caseContourReferenceType(ContourReferenceType object) {
			return createContourReferenceTypeAdapter();
		}

		@Override
		public Adapter caseContourType(ContourType object) {
			return createContourTypeAdapter();
		}

		@Override
		public Adapter caseControlDistributorsType(ControlDistributorsType object) {
			return createControlDistributorsTypeAdapter();
		}

		@Override
		public Adapter caseControlDistributorType(ControlDistributorType object) {
			return createControlDistributorTypeAdapter();
		}

		@Override
		public Adapter caseControlElementsType(ControlElementsType object) {
			return createControlElementsTypeAdapter();
		}

		@Override
		public Adapter caseControlElementType(ControlElementType object) {
			return createControlElementTypeAdapter();
		}

		@Override
		public Adapter caseControlFunctionsType(ControlFunctionsType object) {
			return createControlFunctionsTypeAdapter();
		}

		@Override
		public Adapter caseControlFunctionType(ControlFunctionType object) {
			return createControlFunctionTypeAdapter();
		}

		@Override
		public Adapter caseControllabilityReqsType(ControllabilityReqsType object) {
			return createControllabilityReqsTypeAdapter();
		}

		@Override
		public Adapter caseControllabilityRequirementType(ControllabilityRequirementType object) {
			return createControllabilityRequirementTypeAdapter();
		}

		@Override
		public Adapter caseControlLawModesType(ControlLawModesType object) {
			return createControlLawModesTypeAdapter();
		}

		@Override
		public Adapter caseControlLawModeType(ControlLawModeType object) {
			return createControlLawModeTypeAdapter();
		}

		@Override
		public Adapter caseControlLawsType(ControlLawsType object) {
			return createControlLawsTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceActuatorsType(ControlSurfaceActuatorsType object) {
			return createControlSurfaceActuatorsTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceActuatorType(ControlSurfaceActuatorType object) {
			return createControlSurfaceActuatorTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceAirfoilType(ControlSurfaceAirfoilType object) {
			return createControlSurfaceAirfoilTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceBorderLeadingEdgeType(ControlSurfaceBorderLeadingEdgeType object) {
			return createControlSurfaceBorderLeadingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceBorderSpoilerType(ControlSurfaceBorderSpoilerType object) {
			return createControlSurfaceBorderSpoilerTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceBorderTrailingEdgeType(ControlSurfaceBorderTrailingEdgeType object) {
			return createControlSurfaceBorderTrailingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceContoursType(ControlSurfaceContoursType object) {
			return createControlSurfaceContoursTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceDeflectionVectorsType(ControlSurfaceDeflectionVectorsType object) {
			return createControlSurfaceDeflectionVectorsTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceDeflectionVectorType(ControlSurfaceDeflectionVectorType object) {
			return createControlSurfaceDeflectionVectorTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceHingeMomentMapsType(ControlSurfaceHingeMomentMapsType object) {
			return createControlSurfaceHingeMomentMapsTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceHingeMomentMapType(ControlSurfaceHingeMomentMapType object) {
			return createControlSurfaceHingeMomentMapTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceHingePointType(ControlSurfaceHingePointType object) {
			return createControlSurfaceHingePointTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceOuterShapeLeadingEdgeType(ControlSurfaceOuterShapeLeadingEdgeType object) {
			return createControlSurfaceOuterShapeLeadingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceOuterShapeSpoilerType(ControlSurfaceOuterShapeSpoilerType object) {
			return createControlSurfaceOuterShapeSpoilerTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceOuterShapeTrailingEdgeType(ControlSurfaceOuterShapeTrailingEdgeType object) {
			return createControlSurfaceOuterShapeTrailingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfacePathType(ControlSurfacePathType object) {
			return createControlSurfacePathTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfacePerformanceMapOldType(ControlSurfacePerformanceMapOldType object) {
			return createControlSurfacePerformanceMapOldTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfacePerformanceMapsOldType(ControlSurfacePerformanceMapsOldType object) {
			return createControlSurfacePerformanceMapsOldTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceSkinCutOutBorderType(ControlSurfaceSkinCutOutBorderType object) {
			return createControlSurfaceSkinCutOutBorderTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceSkinCutOutType(ControlSurfaceSkinCutOutType object) {
			return createControlSurfaceSkinCutOutTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceStepsType(ControlSurfaceStepsType object) {
			return createControlSurfaceStepsTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceStepType(ControlSurfaceStepType object) {
			return createControlSurfaceStepTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfacesType(ControlSurfacesType object) {
			return createControlSurfacesTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceTracksType(ControlSurfaceTracksType object) {
			return createControlSurfaceTracksTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceTrackTypeType(ControlSurfaceTrackTypeType object) {
			return createControlSurfaceTrackTypeTypeAdapter();
		}

		@Override
		public Adapter caseControlSurfaceWingCutOutType(ControlSurfaceWingCutOutType object) {
			return createControlSurfaceWingCutOutTypeAdapter();
		}

		@Override
		public Adapter caseCornerRadiusType(CornerRadiusType object) {
			return createCornerRadiusTypeAdapter();
		}

		@Override
		public Adapter caseCostAirConditioningSystemsType(CostAirConditioningSystemsType object) {
			return createCostAirConditioningSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostAutomaticFlightSystemsType(CostAutomaticFlightSystemsType object) {
			return createCostAutomaticFlightSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostAuxilaryPowerUnitsType(CostAuxilaryPowerUnitsType object) {
			return createCostAuxilaryPowerUnitsTypeAdapter();
		}

		@Override
		public Adapter caseCostBleedAirSystemsType(CostBleedAirSystemsType object) {
			return createCostBleedAirSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostCommunicationSystemsType(CostCommunicationSystemsType object) {
			return createCostCommunicationSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostComponentsType(CostComponentsType object) {
			return createCostComponentsTypeAdapter();
		}

		@Override
		public Adapter caseCostDeIcingSystemsType(CostDeIcingSystemsType object) {
			return createCostDeIcingSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostElectricalSystemsType(CostElectricalSystemsType object) {
			return createCostElectricalSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostEnginePylonsType(CostEnginePylonsType object) {
			return createCostEnginePylonsTypeAdapter();
		}

		@Override
		public Adapter caseCostEquippedEnginesType(CostEquippedEnginesType object) {
			return createCostEquippedEnginesTypeAdapter();
		}

		@Override
		public Adapter caseCostFireProtectionSystemsType(CostFireProtectionSystemsType object) {
			return createCostFireProtectionSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostFixedEmergencyOxygenSystemsType(CostFixedEmergencyOxygenSystemsType object) {
			return createCostFixedEmergencyOxygenSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostFlightControlSystemsType(CostFlightControlSystemsType object) {
			return createCostFlightControlSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostFuelSystemsType(CostFuelSystemsType object) {
			return createCostFuelSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostFurnishingElementsType(CostFurnishingElementsType object) {
			return createCostFurnishingElementsTypeAdapter();
		}

		@Override
		public Adapter caseCostFurnishingsType(CostFurnishingsType object) {
			return createCostFurnishingsTypeAdapter();
		}

		@Override
		public Adapter caseCostFuselagesType(CostFuselagesType object) {
			return createCostFuselagesTypeAdapter();
		}

		@Override
		public Adapter caseCostHydraulicSystemsType(CostHydraulicSystemsType object) {
			return createCostHydraulicSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostInstrumentSystemsType(CostInstrumentSystemsType object) {
			return createCostInstrumentSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostLandingGearType(CostLandingGearType object) {
			return createCostLandingGearTypeAdapter();
		}

		@Override
		public Adapter caseCostLightingSystemsType(CostLightingSystemsType object) {
			return createCostLightingSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostNacellesType(CostNacellesType object) {
			return createCostNacellesTypeAdapter();
		}

		@Override
		public Adapter caseCostNavigationSystemsType(CostNavigationSystemsType object) {
			return createCostNavigationSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostPowerUnitsType(CostPowerUnitsType object) {
			return createCostPowerUnitsTypeAdapter();
		}

		@Override
		public Adapter caseCostSystemsType(CostSystemsType object) {
			return createCostSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostWaterInstallationSystemsType(CostWaterInstallationSystemsType object) {
			return createCostWaterInstallationSystemsTypeAdapter();
		}

		@Override
		public Adapter caseCostWingsType(CostWingsType object) {
			return createCostWingsTypeAdapter();
		}

		@Override
		public Adapter caseCpacsType(CpacsType object) {
			return createCpacsTypeAdapter();
		}

		@Override
		public Adapter caseCrashLoadCasesType(CrashLoadCasesType object) {
			return createCrashLoadCasesTypeAdapter();
		}

		@Override
		public Adapter caseCrashLoadcaseType(CrashLoadcaseType object) {
			return createCrashLoadcaseTypeAdapter();
		}

		@Override
		public Adapter caseCrewCostType(CrewCostType object) {
			return createCrewCostTypeAdapter();
		}

		@Override
		public Adapter caseCrossBeamAssemblyPositionType(CrossBeamAssemblyPositionType object) {
			return createCrossBeamAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter caseCrossBeamStrutAssemblyPositionType(CrossBeamStrutAssemblyPositionType object) {
			return createCrossBeamStrutAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter caseCruiseRollersType(CruiseRollersType object) {
			return createCruiseRollersTypeAdapter();
		}

		@Override
		public Adapter caseCruiseRollerType(CruiseRollerType object) {
			return createCruiseRollerTypeAdapter();
		}

		@Override
		public Adapter caseCst2DType(Cst2DType object) {
			return createCst2DTypeAdapter();
		}

		@Override
		public Adapter caseCurveParamPointMapType(CurveParamPointMapType object) {
			return createCurveParamPointMapTypeAdapter();
		}

		@Override
		public Adapter caseCurvePointListXYZType(CurvePointListXYZType object) {
			return createCurvePointListXYZTypeAdapter();
		}

		@Override
		public Adapter caseCurvePointType(CurvePointType object) {
			return createCurvePointTypeAdapter();
		}

		@Override
		public Adapter caseCurveProfilesType(CurveProfilesType object) {
			return createCurveProfilesTypeAdapter();
		}

		@Override
		public Adapter caseCutLoadPointsType(CutLoadPointsType object) {
			return createCutLoadPointsTypeAdapter();
		}

		@Override
		public Adapter caseCutOutControlPointsType(CutOutControlPointsType object) {
			return createCutOutControlPointsTypeAdapter();
		}

		@Override
		public Adapter caseCutOutControlPointType(CutOutControlPointType object) {
			return createCutOutControlPointTypeAdapter();
		}

		@Override
		public Adapter caseCutOutProfilesType(CutOutProfilesType object) {
			return createCutOutProfilesTypeAdapter();
		}

		@Override
		public Adapter caseCutOutProfileType(CutOutProfileType object) {
			return createCutOutProfileTypeAdapter();
		}

		@Override
		public Adapter caseCutOutType(CutOutType object) {
			return createCutOutTypeAdapter();
		}

		@Override
		public Adapter caseCutoutTypeType(CutoutTypeType object) {
			return createCutoutTypeTypeAdapter();
		}

		@Override
		public Adapter caseDampingDerivativesRatesArrayType(DampingDerivativesRatesArrayType object) {
			return createDampingDerivativesRatesArrayTypeAdapter();
		}

		@Override
		public Adapter caseDampingDerivativesRatesType(DampingDerivativesRatesType object) {
			return createDampingDerivativesRatesTypeAdapter();
		}

		@Override
		public Adapter caseDampingDerivativesType(DampingDerivativesType object) {
			return createDampingDerivativesTypeAdapter();
		}

		@Override
		public Adapter caseDamTolBehaviourType(DamTolBehaviourType object) {
			return createDamTolBehaviourTypeAdapter();
		}

		@Override
		public Adapter caseDamTolFormanType(DamTolFormanType object) {
			return createDamTolFormanTypeAdapter();
		}

		@Override
		public Adapter caseDamTolWalkerType(DamTolWalkerType object) {
			return createDamTolWalkerTypeAdapter();
		}

		@Override
		public Adapter caseDateBaseType(DateBaseType object) {
			return createDateBaseTypeAdapter();
		}

		@Override
		public Adapter caseDateTimeBaseType(DateTimeBaseType object) {
			return createDateTimeBaseTypeAdapter();
		}

		@Override
		public Adapter caseDeckComponent2DBaseType(DeckComponent2DBaseType object) {
			return createDeckComponent2DBaseTypeAdapter();
		}

		@Override
		public Adapter caseDeckComponentBaseType(DeckComponentBaseType object) {
			return createDeckComponentBaseTypeAdapter();
		}

		@Override
		public Adapter caseDeckDoorsType(DeckDoorsType object) {
			return createDeckDoorsTypeAdapter();
		}

		@Override
		public Adapter caseDeckDoorType(DeckDoorType object) {
			return createDeckDoorTypeAdapter();
		}

		@Override
		public Adapter caseDeckElementBaseType(DeckElementBaseType object) {
			return createDeckElementBaseTypeAdapter();
		}

		@Override
		public Adapter caseDeckElementGeometryType(DeckElementGeometryType object) {
			return createDeckElementGeometryTypeAdapter();
		}

		@Override
		public Adapter caseDeckElementMassType(DeckElementMassType object) {
			return createDeckElementMassTypeAdapter();
		}

		@Override
		public Adapter caseDeckElementsType(DeckElementsType object) {
			return createDeckElementsTypeAdapter();
		}

		@Override
		public Adapter caseDeckStructuralMountsType(DeckStructuralMountsType object) {
			return createDeckStructuralMountsTypeAdapter();
		}

		@Override
		public Adapter caseDeckStructuralMountType(DeckStructuralMountType object) {
			return createDeckStructuralMountTypeAdapter();
		}

		@Override
		public Adapter caseDecksType(DecksType object) {
			return createDecksTypeAdapter();
		}

		@Override
		public Adapter caseDeckType(DeckType object) {
			return createDeckTypeAdapter();
		}

		@Override
		public Adapter caseDeckTypeType(DeckTypeType object) {
			return createDeckTypeTypeAdapter();
		}

		@Override
		public Adapter caseDeltaTemperatureType(DeltaTemperatureType object) {
			return createDeltaTemperatureTypeAdapter();
		}

		@Override
		public Adapter caseDesignMassesType(DesignMassesType object) {
			return createDesignMassesTypeAdapter();
		}

		@Override
		public Adapter caseDesignParametersType(DesignParametersType object) {
			return createDesignParametersTypeAdapter();
		}

		@Override
		public Adapter caseDesignParameterType(DesignParameterType object) {
			return createDesignParameterTypeAdapter();
		}

		@Override
		public Adapter caseDesignSpaceType(DesignSpaceType object) {
			return createDesignSpaceTypeAdapter();
		}

		@Override
		public Adapter caseDesignStudiesType(DesignStudiesType object) {
			return createDesignStudiesTypeAdapter();
		}

		@Override
		public Adapter caseDesignVolumeType(DesignVolumeType object) {
			return createDesignVolumeTypeAdapter();
		}

		@Override
		public Adapter caseDirectOperatingCostType(DirectOperatingCostType object) {
			return createDirectOperatingCostTypeAdapter();
		}

		@Override
		public Adapter caseDivergenceCasesType(DivergenceCasesType object) {
			return createDivergenceCasesTypeAdapter();
		}

		@Override
		public Adapter caseDivergenceCaseType(DivergenceCaseType object) {
			return createDivergenceCaseTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseDoorAssemblyPositionType(DoorAssemblyPositionType object) {
			return createDoorAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter caseDoorCutOutType(DoorCutOutType object) {
			return createDoorCutOutTypeAdapter();
		}

		@Override
		public Adapter caseDoorOpeningLegacyType(DoorOpeningLegacyType object) {
			return createDoorOpeningLegacyTypeAdapter();
		}

		@Override
		public Adapter caseDoorOpeningType(DoorOpeningType object) {
			return createDoorOpeningTypeAdapter();
		}

		@Override
		public Adapter caseDoorsType(DoorsType object) {
			return createDoorsTypeAdapter();
		}

		@Override
		public Adapter caseDoorSurroundStructurePositionType(DoorSurroundStructurePositionType object) {
			return createDoorSurroundStructurePositionTypeAdapter();
		}

		@Override
		public Adapter caseDoorSurroundStructuresAssemblyType(DoorSurroundStructuresAssemblyType object) {
			return createDoorSurroundStructuresAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseDoorTypeType(DoorTypeType object) {
			return createDoorTypeTypeAdapter();
		}

		@Override
		public Adapter caseDoorTypeType1(DoorTypeType1 object) {
			return createDoorTypeType1Adapter();
		}

		@Override
		public Adapter caseDoubleArrayBaseType(DoubleArrayBaseType object) {
			return createDoubleArrayBaseTypeAdapter();
		}

		@Override
		public Adapter caseDoubleBaseType(DoubleBaseType object) {
			return createDoubleBaseTypeAdapter();
		}

		@Override
		public Adapter caseDoubleConstraintBaseType(DoubleConstraintBaseType object) {
			return createDoubleConstraintBaseTypeAdapter();
		}

		@Override
		public Adapter caseDoubleVectorBaseType(DoubleVectorBaseType object) {
			return createDoubleVectorBaseTypeAdapter();
		}

		@Override
		public Adapter caseDoubleVectorConstraintBaseType(DoubleVectorConstraintBaseType object) {
			return createDoubleVectorConstraintBaseTypeAdapter();
		}

		@Override
		public Adapter caseDragContributionsType(DragContributionsType object) {
			return createDragContributionsTypeAdapter();
		}

		@Override
		public Adapter caseDriveSystemsType(DriveSystemsType object) {
			return createDriveSystemsTypeAdapter();
		}

		@Override
		public Adapter caseDriveSystemType(DriveSystemType object) {
			return createDriveSystemTypeAdapter();
		}

		@Override
		public Adapter caseDurationType(DurationType object) {
			return createDurationTypeAdapter();
		}

		@Override
		public Adapter caseDynamicAircraftModelAnalysisType(DynamicAircraftModelAnalysisType object) {
			return createDynamicAircraftModelAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseEmissivityMapType(EmissivityMapType object) {
			return createEmissivityMapTypeAdapter();
		}

		@Override
		public Adapter caseEndTimeUTCType(EndTimeUTCType object) {
			return createEndTimeUTCTypeAdapter();
		}

		@Override
		public Adapter caseEngineAnalysisType(EngineAnalysisType object) {
			return createEngineAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseEngineConceptType(EngineConceptType object) {
			return createEngineConceptTypeAdapter();
		}

		@Override
		public Adapter caseEngineFanType(EngineFanType object) {
			return createEngineFanTypeAdapter();
		}

		@Override
		public Adapter caseEngineGeometryType(EngineGeometryType object) {
			return createEngineGeometryTypeAdapter();
		}

		@Override
		public Adapter caseEngineGlobalType(EngineGlobalType object) {
			return createEngineGlobalTypeAdapter();
		}

		@Override
		public Adapter caseEngineMountsType(EngineMountsType object) {
			return createEngineMountsTypeAdapter();
		}

		@Override
		public Adapter caseEngineMountType(EngineMountType object) {
			return createEngineMountTypeAdapter();
		}

		@Override
		public Adapter caseEngineNacelleType(EngineNacelleType object) {
			return createEngineNacelleTypeAdapter();
		}

		@Override
		public Adapter caseEnginePerformanceMapsType(EnginePerformanceMapsType object) {
			return createEnginePerformanceMapsTypeAdapter();
		}

		@Override
		public Adapter caseEnginePerformanceMapType(EnginePerformanceMapType object) {
			return createEnginePerformanceMapTypeAdapter();
		}

		@Override
		public Adapter caseEnginePositionsType(EnginePositionsType object) {
			return createEnginePositionsTypeAdapter();
		}

		@Override
		public Adapter caseEnginePositionType(EnginePositionType object) {
			return createEnginePositionTypeAdapter();
		}

		@Override
		public Adapter caseEnginePylonsType(EnginePylonsType object) {
			return createEnginePylonsTypeAdapter();
		}

		@Override
		public Adapter caseEnginePylonType(EnginePylonType object) {
			return createEnginePylonTypeAdapter();
		}

		@Override
		public Adapter caseEngineSpinnerType(EngineSpinnerType object) {
			return createEngineSpinnerTypeAdapter();
		}

		@Override
		public Adapter caseEnginesType(EnginesType object) {
			return createEnginesTypeAdapter();
		}

		@Override
		public Adapter caseEngineType(EngineType object) {
			return createEngineTypeAdapter();
		}

		@Override
		public Adapter caseEnvironmentType(EnvironmentType object) {
			return createEnvironmentTypeAdapter();
		}

		@Override
		public Adapter caseEtaIsoLineType(EtaIsoLineType object) {
			return createEtaIsoLineTypeAdapter();
		}

		@Override
		public Adapter caseEtaXsiPointType(EtaXsiPointType object) {
			return createEtaXsiPointTypeAdapter();
		}

		@Override
		public Adapter caseEtaXsiRelHeightPointType(EtaXsiRelHeightPointType object) {
			return createEtaXsiRelHeightPointTypeAdapter();
		}

		@Override
		public Adapter caseFatigueBehaviourType(FatigueBehaviourType object) {
			return createFatigueBehaviourTypeAdapter();
		}

		@Override
		public Adapter caseFatigueStressBasedBrownMillerType(FatigueStressBasedBrownMillerType object) {
			return createFatigueStressBasedBrownMillerTypeAdapter();
		}

		@Override
		public Adapter caseFleetType(FleetType object) {
			return createFleetTypeAdapter();
		}

		@Override
		public Adapter caseFlightAnalysisType(FlightAnalysisType object) {
			return createFlightAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseFlightDynamicsAnalysisType(FlightDynamicsAnalysisType object) {
			return createFlightDynamicsAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseFlightDynamicsLinearModelType(FlightDynamicsLinearModelType object) {
			return createFlightDynamicsLinearModelTypeAdapter();
		}

		@Override
		public Adapter caseFlightDynamicsTrimResultType(FlightDynamicsTrimResultType object) {
			return createFlightDynamicsTrimResultTypeAdapter();
		}

		@Override
		public Adapter caseFlightEnvelopeSpeedType(FlightEnvelopeSpeedType object) {
			return createFlightEnvelopeSpeedTypeAdapter();
		}

		@Override
		public Adapter caseFlightEnvelopesType(FlightEnvelopesType object) {
			return createFlightEnvelopesTypeAdapter();
		}

		@Override
		public Adapter caseFlightEnvelopeType(FlightEnvelopeType object) {
			return createFlightEnvelopeTypeAdapter();
		}

		@Override
		public Adapter caseFlightLoadCasesType(FlightLoadCasesType object) {
			return createFlightLoadCasesTypeAdapter();
		}

		@Override
		public Adapter caseFlightLoadConditionsType(FlightLoadConditionsType object) {
			return createFlightLoadConditionsTypeAdapter();
		}

		@Override
		public Adapter caseFlightLoadDataType(FlightLoadDataType object) {
			return createFlightLoadDataTypeAdapter();
		}

		@Override
		public Adapter caseFlightPathAngleType(FlightPathAngleType object) {
			return createFlightPathAngleTypeAdapter();
		}

		@Override
		public Adapter caseFlightPathType(FlightPathType object) {
			return createFlightPathTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceCasesType(FlightPerformanceCasesType object) {
			return createFlightPerformanceCasesTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceCaseType(FlightPerformanceCaseType object) {
			return createFlightPerformanceCaseTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceLandingType(FlightPerformanceLandingType object) {
			return createFlightPerformanceLandingTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceLevelType(FlightPerformanceLevelType object) {
			return createFlightPerformanceLevelTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceRequirementsType(FlightPerformanceRequirementsType object) {
			return createFlightPerformanceRequirementsTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceRequirementType(FlightPerformanceRequirementType object) {
			return createFlightPerformanceRequirementTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceTakeoffType(FlightPerformanceTakeoffType object) {
			return createFlightPerformanceTakeoffTypeAdapter();
		}

		@Override
		public Adapter caseFlightPerformanceTurnType(FlightPerformanceTurnType object) {
			return createFlightPerformanceTurnTypeAdapter();
		}

		@Override
		public Adapter caseFlightPointsType(FlightPointsType object) {
			return createFlightPointsTypeAdapter();
		}

		@Override
		public Adapter caseFlightPointType(FlightPointType object) {
			return createFlightPointTypeAdapter();
		}

		@Override
		public Adapter caseFlightsType(FlightsType object) {
			return createFlightsTypeAdapter();
		}

		@Override
		public Adapter caseFlightSystemsType(FlightSystemsType object) {
			return createFlightSystemsTypeAdapter();
		}

		@Override
		public Adapter caseFlightType(FlightType object) {
			return createFlightTypeAdapter();
		}

		@Override
		public Adapter caseFloorPanelsType(FloorPanelsType object) {
			return createFloorPanelsTypeAdapter();
		}

		@Override
		public Adapter caseFloorPanelType(FloorPanelType object) {
			return createFloorPanelTypeAdapter();
		}

		@Override
		public Adapter caseFlyingQualitiesCasesType(FlyingQualitiesCasesType object) {
			return createFlyingQualitiesCasesTypeAdapter();
		}

		@Override
		public Adapter caseFlyingQualitiesCaseType(FlyingQualitiesCaseType object) {
			return createFlyingQualitiesCaseTypeAdapter();
		}

		@Override
		public Adapter caseFqCharParametersType(FqCharParametersType object) {
			return createFqCharParametersTypeAdapter();
		}

		@Override
		public Adapter caseFqEiglatType(FqEiglatType object) {
			return createFqEiglatTypeAdapter();
		}

		@Override
		public Adapter caseFqLateralType(FqLateralType object) {
			return createFqLateralTypeAdapter();
		}

		@Override
		public Adapter caseFqLongitudinalType(FqLongitudinalType object) {
			return createFqLongitudinalTypeAdapter();
		}

		@Override
		public Adapter caseFqPhugoidType(FqPhugoidType object) {
			return createFqPhugoidTypeAdapter();
		}

		@Override
		public Adapter caseFqRatingsType(FqRatingsType object) {
			return createFqRatingsTypeAdapter();
		}

		@Override
		public Adapter caseFqRollPerfType(FqRollPerfType object) {
			return createFqRollPerfTypeAdapter();
		}

		@Override
		public Adapter caseFqRoloscType(FqRoloscType object) {
			return createFqRoloscTypeAdapter();
		}

		@Override
		public Adapter caseFqShortPeriodType(FqShortPeriodType object) {
			return createFqShortPeriodTypeAdapter();
		}

		@Override
		public Adapter caseFqTreffType(FqTreffType object) {
			return createFqTreffTypeAdapter();
		}

		@Override
		public Adapter caseFramesAssemblyType(FramesAssemblyType object) {
			return createFramesAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseFrameType(FrameType object) {
			return createFrameTypeAdapter();
		}

		@Override
		public Adapter caseFreePathType(FreePathType object) {
			return createFreePathTypeAdapter();
		}

		@Override
		public Adapter caseFuelConsumedType(FuelConsumedType object) {
			return createFuelConsumedTypeAdapter();
		}

		@Override
		public Adapter caseFuelFractionType(FuelFractionType object) {
			return createFuelFractionTypeAdapter();
		}

		@Override
		public Adapter caseFuelInTankType(FuelInTankType object) {
			return createFuelInTankTypeAdapter();
		}

		@Override
		public Adapter caseFuelMassFractionType(FuelMassFractionType object) {
			return createFuelMassFractionTypeAdapter();
		}

		@Override
		public Adapter caseFuelPlanningTypeType(FuelPlanningTypeType object) {
			return createFuelPlanningTypeTypeAdapter();
		}

		@Override
		public Adapter caseFuelRemainingType(FuelRemainingType object) {
			return createFuelRemainingTypeAdapter();
		}

		@Override
		public Adapter caseFuelsType(FuelsType object) {
			return createFuelsTypeAdapter();
		}

		@Override
		public Adapter caseFuelTankVolumeType(FuelTankVolumeType object) {
			return createFuelTankVolumeTypeAdapter();
		}

		@Override
		public Adapter caseFuelType(FuelType object) {
			return createFuelTypeAdapter();
		}

		@Override
		public Adapter caseFuselageAeroPerformanceType(FuselageAeroPerformanceType object) {
			return createFuselageAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseFuselageCutOutsType(FuselageCutOutsType object) {
			return createFuselageCutOutsTypeAdapter();
		}

		@Override
		public Adapter caseFuselageCutOutType(FuselageCutOutType object) {
			return createFuselageCutOutTypeAdapter();
		}

		@Override
		public Adapter caseFuselageElementsType(FuselageElementsType object) {
			return createFuselageElementsTypeAdapter();
		}

		@Override
		public Adapter caseFuselageElementType(FuselageElementType object) {
			return createFuselageElementTypeAdapter();
		}

		@Override
		public Adapter caseFuselageFuelTanksType(FuselageFuelTanksType object) {
			return createFuselageFuelTanksTypeAdapter();
		}

		@Override
		public Adapter caseFuselageFuelTankType(FuselageFuelTankType object) {
			return createFuselageFuelTankTypeAdapter();
		}

		@Override
		public Adapter caseFuselageProfilesType(FuselageProfilesType object) {
			return createFuselageProfilesTypeAdapter();
		}

		@Override
		public Adapter caseFuselagesAeroPerformanceType(FuselagesAeroPerformanceType object) {
			return createFuselagesAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseFuselageSectionsType(FuselageSectionsType object) {
			return createFuselageSectionsTypeAdapter();
		}

		@Override
		public Adapter caseFuselageSectionType(FuselageSectionType object) {
			return createFuselageSectionTypeAdapter();
		}

		@Override
		public Adapter caseFuselageSegmentsType(FuselageSegmentsType object) {
			return createFuselageSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseFuselageSegmentType(FuselageSegmentType object) {
			return createFuselageSegmentTypeAdapter();
		}

		@Override
		public Adapter caseFuselageStructureType(FuselageStructureType object) {
			return createFuselageStructureTypeAdapter();
		}

		@Override
		public Adapter caseFuselagesType(FuselagesType object) {
			return createFuselagesTypeAdapter();
		}

		@Override
		public Adapter caseFuselageType(FuselageType object) {
			return createFuselageTypeAdapter();
		}

		@Override
		public Adapter caseGalleyElementsType(GalleyElementsType object) {
			return createGalleyElementsTypeAdapter();
		}

		@Override
		public Adapter caseGalleyElementType(GalleyElementType object) {
			return createGalleyElementTypeAdapter();
		}

		@Override
		public Adapter caseGalleysType(GalleysType object) {
			return createGalleysTypeAdapter();
		}

		@Override
		public Adapter caseGearDeflectionVectorsType(GearDeflectionVectorsType object) {
			return createGearDeflectionVectorsTypeAdapter();
		}

		@Override
		public Adapter caseGearDeflectionVectorType(GearDeflectionVectorType object) {
			return createGearDeflectionVectorTypeAdapter();
		}

		@Override
		public Adapter caseGeneralStructuralMemberPositionType(GeneralStructuralMemberPositionType object) {
			return createGeneralStructuralMemberPositionTypeAdapter();
		}

		@Override
		public Adapter caseGeneralStructuralMembersAssemblyType(GeneralStructuralMembersAssemblyType object) {
			return createGeneralStructuralMembersAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseGeneralStructuralMemberType(GeneralStructuralMemberType object) {
			return createGeneralStructuralMemberTypeAdapter();
		}

		@Override
		public Adapter caseGenericCostType(GenericCostType object) {
			return createGenericCostTypeAdapter();
		}

		@Override
		public Adapter caseGenericFloorElementsType(GenericFloorElementsType object) {
			return createGenericFloorElementsTypeAdapter();
		}

		@Override
		public Adapter caseGenericFloorModulesType(GenericFloorModulesType object) {
			return createGenericFloorModulesTypeAdapter();
		}

		@Override
		public Adapter caseGenericGeometricComponentType(GenericGeometricComponentType object) {
			return createGenericGeometricComponentTypeAdapter();
		}

		@Override
		public Adapter caseGenericGeometryComponentsType(GenericGeometryComponentsType object) {
			return createGenericGeometryComponentsTypeAdapter();
		}

		@Override
		public Adapter caseGenericGeometryComponentType(GenericGeometryComponentType object) {
			return createGenericGeometryComponentTypeAdapter();
		}

		@Override
		public Adapter caseGenericMassType(GenericMassType object) {
			return createGenericMassTypeAdapter();
		}

		@Override
		public Adapter caseGenericSystemsType(GenericSystemsType object) {
			return createGenericSystemsTypeAdapter();
		}

		@Override
		public Adapter caseGenericSystemType(GenericSystemType object) {
			return createGenericSystemTypeAdapter();
		}

		@Override
		public Adapter caseGeographicPointConstraintType(GeographicPointConstraintType object) {
			return createGeographicPointConstraintTypeAdapter();
		}

		@Override
		public Adapter caseGeographicPointType(GeographicPointType object) {
			return createGeographicPointTypeAdapter();
		}

		@Override
		public Adapter caseGlobalAeroPerformanceType(GlobalAeroPerformanceType object) {
			return createGlobalAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseGlobalBeamPropertiesType(GlobalBeamPropertiesType object) {
			return createGlobalBeamPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseGlobalFlightPointType(GlobalFlightPointType object) {
			return createGlobalFlightPointTypeAdapter();
		}

		@Override
		public Adapter caseGlobalPerformanceCasesType(GlobalPerformanceCasesType object) {
			return createGlobalPerformanceCasesTypeAdapter();
		}

		@Override
		public Adapter caseGroundLoadCasesType(GroundLoadCasesType object) {
			return createGroundLoadCasesTypeAdapter();
		}

		@Override
		public Adapter caseGuideCurveProfileGeometryType(GuideCurveProfileGeometryType object) {
			return createGuideCurveProfileGeometryTypeAdapter();
		}

		@Override
		public Adapter caseGuideCurveProfilesType(GuideCurveProfilesType object) {
			return createGuideCurveProfilesTypeAdapter();
		}

		@Override
		public Adapter caseGuideCurvesType(GuideCurvesType object) {
			return createGuideCurvesTypeAdapter();
		}

		@Override
		public Adapter caseGuideCurveType(GuideCurveType object) {
			return createGuideCurveTypeAdapter();
		}

		@Override
		public Adapter caseGustShapeType(GustShapeType object) {
			return createGustShapeTypeAdapter();
		}

		@Override
		public Adapter caseHeaderType(HeaderType object) {
			return createHeaderTypeAdapter();
		}

		@Override
		public Adapter caseHeadingType(HeadingType object) {
			return createHeadingTypeAdapter();
		}

		@Override
		public Adapter caseHingeMomentsMapType(HingeMomentsMapType object) {
			return createHingeMomentsMapTypeAdapter();
		}

		@Override
		public Adapter caseHtpFwdInterfaceDefType(HtpFwdInterfaceDefType object) {
			return createHtpFwdInterfaceDefTypeAdapter();
		}

		@Override
		public Adapter caseHtpInterfaceDefType(HtpInterfaceDefType object) {
			return createHtpInterfaceDefTypeAdapter();
		}

		@Override
		public Adapter caseHtpStructElemDefType(HtpStructElemDefType object) {
			return createHtpStructElemDefTypeAdapter();
		}

		@Override
		public Adapter caseImpactSurfaceDefinitionType(ImpactSurfaceDefinitionType object) {
			return createImpactSurfaceDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseIndirectOperatingCostType(IndirectOperatingCostType object) {
			return createIndirectOperatingCostTypeAdapter();
		}

		@Override
		public Adapter caseIntegerBaseType(IntegerBaseType object) {
			return createIntegerBaseTypeAdapter();
		}

		@Override
		public Adapter caseInterConnectionStrutAttachmentType(InterConnectionStrutAttachmentType object) {
			return createInterConnectionStrutAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseInterconnectionStrutsType(InterconnectionStrutsType object) {
			return createInterconnectionStrutsTypeAdapter();
		}

		@Override
		public Adapter caseInterconnectionStrutType(InterconnectionStrutType object) {
			return createInterconnectionStrutTypeAdapter();
		}

		@Override
		public Adapter caseIntercostalPositionType(IntercostalPositionType object) {
			return createIntercostalPositionTypeAdapter();
		}

		@Override
		public Adapter caseIntercostalsAssemblyType(IntercostalsAssemblyType object) {
			return createIntercostalsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseInterfaceDefinitionsType(InterfaceDefinitionsType object) {
			return createInterfaceDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseInternalPressuresType(InternalPressuresType object) {
			return createInternalPressuresTypeAdapter();
		}

		@Override
		public Adapter caseInternalPressureType(InternalPressureType object) {
			return createInternalPressureTypeAdapter();
		}

		@Override
		public Adapter caseInterpolationType(InterpolationType object) {
			return createInterpolationTypeAdapter();
		}

		@Override
		public Adapter caseInterpolationType1(InterpolationType1 object) {
			return createInterpolationType1Adapter();
		}

		@Override
		public Adapter caseInterpolationType2(InterpolationType2 object) {
			return createInterpolationType2Adapter();
		}

		@Override
		public Adapter caseIsotropicPropertiesType(IsotropicPropertiesType object) {
			return createIsotropicPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearBaseType(LandingGearBaseType object) {
			return createLandingGearBaseTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearBrakingStateType(LandingGearBrakingStateType object) {
			return createLandingGearBrakingStateTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearComponentAssemblyType(LandingGearComponentAssemblyType object) {
			return createLandingGearComponentAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearControlFunctionsType(LandingGearControlFunctionsType object) {
			return createLandingGearControlFunctionsTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearControlType(LandingGearControlType object) {
			return createLandingGearControlTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearExtensionFunctionStepType(LandingGearExtensionFunctionStepType object) {
			return createLandingGearExtensionFunctionStepTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearExtensionFunctionType(LandingGearExtensionFunctionType object) {
			return createLandingGearExtensionFunctionTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceDefinitionsType(LandingGearInterfaceDefinitionsType object) {
			return createLandingGearInterfaceDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceKeelbeamType(LandingGearInterfaceKeelbeamType object) {
			return createLandingGearInterfaceKeelbeamTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceLateralPanelsType(LandingGearInterfaceLateralPanelsType object) {
			return createLandingGearInterfaceLateralPanelsTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceLongFloorBeamsConnectionType(
				LandingGearInterfaceLongFloorBeamsConnectionType object) {
			return createLandingGearInterfaceLongFloorBeamsConnectionTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceMainFramesType(LandingGearInterfaceMainFramesType object) {
			return createLandingGearInterfaceMainFramesTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfacePressureFloorType(LandingGearInterfacePressureFloorType object) {
			return createLandingGearInterfacePressureFloorTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearInterfaceSideboxType(LandingGearInterfaceSideboxType object) {
			return createLandingGearInterfaceSideboxTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearPositionSafetyMarginsType(LandingGearPositionSafetyMarginsType object) {
			return createLandingGearPositionSafetyMarginsTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearSteeringFunctionStepType(LandingGearSteeringFunctionStepType object) {
			return createLandingGearSteeringFunctionStepTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearSteeringFunctionType(LandingGearSteeringFunctionType object) {
			return createLandingGearSteeringFunctionTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearStrutAttachmentType(LandingGearStrutAttachmentType object) {
			return createLandingGearStrutAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearsType(LandingGearsType object) {
			return createLandingGearsTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearSupportBeamPositionType(LandingGearSupportBeamPositionType object) {
			return createLandingGearSupportBeamPositionTypeAdapter();
		}

		@Override
		public Adapter caseLandingGearType(LandingGearType object) {
			return createLandingGearTypeAdapter();
		}

		@Override
		public Adapter caseLateralCapType(LateralCapType object) {
			return createLateralCapTypeAdapter();
		}

		@Override
		public Adapter caseLatitudeType(LatitudeType object) {
			return createLatitudeTypeAdapter();
		}

		@Override
		public Adapter caseLavatoriesType(LavatoriesType object) {
			return createLavatoriesTypeAdapter();
		}

		@Override
		public Adapter caseLavatoryElementsType(LavatoryElementsType object) {
			return createLavatoryElementsTypeAdapter();
		}

		@Override
		public Adapter caseLeadingEdgeDevicesType(LeadingEdgeDevicesType object) {
			return createLeadingEdgeDevicesTypeAdapter();
		}

		@Override
		public Adapter caseLeadingEdgeDeviceType(LeadingEdgeDeviceType object) {
			return createLeadingEdgeDeviceTypeAdapter();
		}

		@Override
		public Adapter caseLeadingEdgeHollowType(LeadingEdgeHollowType object) {
			return createLeadingEdgeHollowTypeAdapter();
		}

		@Override
		public Adapter caseLeadingEdgeShapeType(LeadingEdgeShapeType object) {
			return createLeadingEdgeShapeTypeAdapter();
		}

		@Override
		public Adapter caseLinerType(LinerType object) {
			return createLinerTypeAdapter();
		}

		@Override
		public Adapter caseLinkToFileType(LinkToFileType object) {
			return createLinkToFileTypeAdapter();
		}

		@Override
		public Adapter caseLoadAnalysisType(LoadAnalysisType object) {
			return createLoadAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseLoadApplicationPointSetsType(LoadApplicationPointSetsType object) {
			return createLoadApplicationPointSetsTypeAdapter();
		}

		@Override
		public Adapter caseLoadApplicationPointSetType(LoadApplicationPointSetType object) {
			return createLoadApplicationPointSetTypeAdapter();
		}

		@Override
		public Adapter caseLoadApplicationPointsType(LoadApplicationPointsType object) {
			return createLoadApplicationPointsTypeAdapter();
		}

		@Override
		public Adapter caseLoadBreakdownType(LoadBreakdownType object) {
			return createLoadBreakdownTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseAccelerationsType(LoadCaseAccelerationsType object) {
			return createLoadCaseAccelerationsTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseGustType(LoadCaseGustType object) {
			return createLoadCaseGustTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseLoadFactorsType(LoadCaseLoadFactorsType object) {
			return createLoadCaseLoadFactorsTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseSpecificationType(LoadCaseSpecificationType object) {
			return createLoadCaseSpecificationTypeAdapter();
		}

		@Override
		public Adapter caseLoadCasesType(LoadCasesType object) {
			return createLoadCasesTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseSuperpositionType(LoadCaseSuperpositionType object) {
			return createLoadCaseSuperpositionTypeAdapter();
		}

		@Override
		public Adapter caseLoadCaseType(LoadCaseType object) {
			return createLoadCaseTypeAdapter();
		}

		@Override
		public Adapter caseLoadEnvelopesType(LoadEnvelopesType object) {
			return createLoadEnvelopesTypeAdapter();
		}

		@Override
		public Adapter caseLoadEnvelopeType(LoadEnvelopeType object) {
			return createLoadEnvelopeTypeAdapter();
		}

		@Override
		public Adapter caseLoadReferenceLineType(LoadReferenceLineType object) {
			return createLoadReferenceLineTypeAdapter();
		}

		@Override
		public Adapter caseLoadReferencePointType(LoadReferencePointType object) {
			return createLoadReferencePointTypeAdapter();
		}

		@Override
		public Adapter caseLoadSetsType(LoadSetsType object) {
			return createLoadSetsTypeAdapter();
		}

		@Override
		public Adapter caseLoadSetType(LoadSetType object) {
			return createLoadSetTypeAdapter();
		}

		@Override
		public Adapter caseLogEntryType(LogEntryType object) {
			return createLogEntryTypeAdapter();
		}

		@Override
		public Adapter caseLongFloorBeamPositionType(LongFloorBeamPositionType object) {
			return createLongFloorBeamPositionTypeAdapter();
		}

		@Override
		public Adapter caseLongFloorBeamsAssemblyType(LongFloorBeamsAssemblyType object) {
			return createLongFloorBeamsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseLongFloorBeamType(LongFloorBeamType object) {
			return createLongFloorBeamTypeAdapter();
		}

		@Override
		public Adapter caseLongitudeType(LongitudeType object) {
			return createLongitudeTypeAdapter();
		}

		@Override
		public Adapter caseLowerHeightFractionType(LowerHeightFractionType object) {
			return createLowerHeightFractionTypeAdapter();
		}

		@Override
		public Adapter caseLuggageCompartmentElementsType(LuggageCompartmentElementsType object) {
			return createLuggageCompartmentElementsTypeAdapter();
		}

		@Override
		public Adapter caseLuggageCompartmentsType(LuggageCompartmentsType object) {
			return createLuggageCompartmentsTypeAdapter();
		}

		@Override
		public Adapter caseMachNumberType(MachNumberType object) {
			return createMachNumberTypeAdapter();
		}

		@Override
		public Adapter caseMAdditionalCenterTanksType(MAdditionalCenterTanksType object) {
			return createMAdditionalCenterTanksTypeAdapter();
		}

		@Override
		public Adapter caseMainActuatorType(MainActuatorType object) {
			return createMainActuatorTypeAdapter();
		}

		@Override
		public Adapter caseMainGearsType(MainGearsType object) {
			return createMainGearsTypeAdapter();
		}

		@Override
		public Adapter caseMainStrutInterfaceDefinitionsType(MainStrutInterfaceDefinitionsType object) {
			return createMainStrutInterfaceDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseMainStrutWingFuselageAttachmentType(MainStrutWingFuselageAttachmentType object) {
			return createMainStrutWingFuselageAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseMaintenanceCostType(MaintenanceCostType object) {
			return createMaintenanceCostTypeAdapter();
		}

		@Override
		public Adapter caseMAirConditioningType(MAirConditioningType object) {
			return createMAirConditioningTypeAdapter();
		}

		@Override
		public Adapter caseMassBreakdownType(MassBreakdownType object) {
			return createMassBreakdownTypeAdapter();
		}

		@Override
		public Adapter caseMassFractionType(MassFractionType object) {
			return createMassFractionTypeAdapter();
		}

		@Override
		public Adapter caseMassInertiaType(MassInertiaType object) {
			return createMassInertiaTypeAdapter();
		}

		@Override
		public Adapter caseMassInertiaVectorType(MassInertiaVectorType object) {
			return createMassInertiaVectorTypeAdapter();
		}

		@Override
		public Adapter caseMaterialDefinitionForProfileBasedPointType(
				MaterialDefinitionForProfileBasedPointType object) {
			return createMaterialDefinitionForProfileBasedPointTypeAdapter();
		}

		@Override
		public Adapter caseMaterialDefinitionForProfileBasedType(MaterialDefinitionForProfileBasedType object) {
			return createMaterialDefinitionForProfileBasedTypeAdapter();
		}

		@Override
		public Adapter caseMaterialDefinitionType(MaterialDefinitionType object) {
			return createMaterialDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseMaterialsType(MaterialsType object) {
			return createMaterialsTypeAdapter();
		}

		@Override
		public Adapter caseMaterialType(MaterialType object) {
			return createMaterialTypeAdapter();
		}

		@Override
		public Adapter caseMAutomaticFlightSystemType(MAutomaticFlightSystemType object) {
			return createMAutomaticFlightSystemTypeAdapter();
		}

		@Override
		public Adapter caseMAuxillaryPowerUnitType(MAuxillaryPowerUnitType object) {
			return createMAuxillaryPowerUnitTypeAdapter();
		}

		@Override
		public Adapter caseMBellyFairingsType(MBellyFairingsType object) {
			return createMBellyFairingsTypeAdapter();
		}

		@Override
		public Adapter caseMBleedAirSystemType(MBleedAirSystemType object) {
			return createMBleedAirSystemTypeAdapter();
		}

		@Override
		public Adapter caseMBulkCargosType(MBulkCargosType object) {
			return createMBulkCargosTypeAdapter();
		}

		@Override
		public Adapter caseMBulkCargoType(MBulkCargoType object) {
			return createMBulkCargoTypeAdapter();
		}

		@Override
		public Adapter caseMBulkheadsType(MBulkheadsType object) {
			return createMBulkheadsTypeAdapter();
		}

		@Override
		public Adapter caseMCabinFloorsType(MCabinFloorsType object) {
			return createMCabinFloorsTypeAdapter();
		}

		@Override
		public Adapter caseMCabinLightingsType(MCabinLightingsType object) {
			return createMCabinLightingsTypeAdapter();
		}

		@Override
		public Adapter caseMCargoFloorsType(MCargoFloorsType object) {
			return createMCargoFloorsTypeAdapter();
		}

		@Override
		public Adapter caseMCargoLiningsType(MCargoLiningsType object) {
			return createMCargoLiningsTypeAdapter();
		}

		@Override
		public Adapter caseMCargoLoadingsType(MCargoLoadingsType object) {
			return createMCargoLoadingsTypeAdapter();
		}

		@Override
		public Adapter caseMCargoType(MCargoType object) {
			return createMCargoTypeAdapter();
		}

		@Override
		public Adapter caseMCarriagesType(MCarriagesType object) {
			return createMCarriagesTypeAdapter();
		}

		@Override
		public Adapter caseMCarryOnsType(MCarryOnsType object) {
			return createMCarryOnsTypeAdapter();
		}

		@Override
		public Adapter caseMCarryOnType(MCarryOnType object) {
			return createMCarryOnTypeAdapter();
		}

		@Override
		public Adapter caseMCateringsType(MCateringsType object) {
			return createMCateringsTypeAdapter();
		}

		@Override
		public Adapter caseMCellsType(MCellsType object) {
			return createMCellsTypeAdapter();
		}

		@Override
		public Adapter caseMCockpitLightingsType(MCockpitLightingsType object) {
			return createMCockpitLightingsTypeAdapter();
		}

		@Override
		public Adapter caseMCommunicationType(MCommunicationType object) {
			return createMCommunicationTypeAdapter();
		}

		@Override
		public Adapter caseMComponentSegmentsType(MComponentSegmentsType object) {
			return createMComponentSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseMComponentSegmentType(MComponentSegmentType object) {
			return createMComponentSegmentTypeAdapter();
		}

		@Override
		public Adapter caseMControlSurfaceSupportsType(MControlSurfaceSupportsType object) {
			return createMControlSurfaceSupportsTypeAdapter();
		}

		@Override
		public Adapter caseMControlSurfaceSupportType(MControlSurfaceSupportType object) {
			return createMControlSurfaceSupportTypeAdapter();
		}

		@Override
		public Adapter caseMCrewMembersType(MCrewMembersType object) {
			return createMCrewMembersTypeAdapter();
		}

		@Override
		public Adapter caseMCrewSeatsType(MCrewSeatsType object) {
			return createMCrewSeatsTypeAdapter();
		}

		@Override
		public Adapter caseMDeIcingType(MDeIcingType object) {
			return createMDeIcingTypeAdapter();
		}

		@Override
		public Adapter caseMDocumentsToolsType(MDocumentsToolsType object) {
			return createMDocumentsToolsTypeAdapter();
		}

		@Override
		public Adapter caseMDoorsType(MDoorsType object) {
			return createMDoorsTypeAdapter();
		}

		@Override
		public Adapter caseMElectricalDistributionType(MElectricalDistributionType object) {
			return createMElectricalDistributionTypeAdapter();
		}

		@Override
		public Adapter caseMElectricalGenerationType(MElectricalGenerationType object) {
			return createMElectricalGenerationTypeAdapter();
		}

		@Override
		public Adapter caseMEmergencyEquipmentsType(MEmergencyEquipmentsType object) {
			return createMEmergencyEquipmentsTypeAdapter();
		}

		@Override
		public Adapter caseMEmergencyOxygenSystemsType(MEmergencyOxygenSystemsType object) {
			return createMEmergencyOxygenSystemsTypeAdapter();
		}

		@Override
		public Adapter caseMEmptyULDsType(MEmptyULDsType object) {
			return createMEmptyULDsTypeAdapter();
		}

		@Override
		public Adapter caseMEmptyULDType(MEmptyULDType object) {
			return createMEmptyULDTypeAdapter();
		}

		@Override
		public Adapter caseMEngineAPUOilsType(MEngineAPUOilsType object) {
			return createMEngineAPUOilsTypeAdapter();
		}

		@Override
		public Adapter caseMEngineControlType(MEngineControlType object) {
			return createMEngineControlTypeAdapter();
		}

		@Override
		public Adapter caseMEquippedEnginesType(MEquippedEnginesType object) {
			return createMEquippedEnginesTypeAdapter();
		}

		@Override
		public Adapter caseMExtLightingsType(MExtLightingsType object) {
			return createMExtLightingsTypeAdapter();
		}

		@Override
		public Adapter caseMFireProtectionType(MFireProtectionType object) {
			return createMFireProtectionTypeAdapter();
		}

		@Override
		public Adapter caseMFixedGalleysType(MFixedGalleysType object) {
			return createMFixedGalleysTypeAdapter();
		}

		@Override
		public Adapter caseMFixedLeadingEdgesType(MFixedLeadingEdgesType object) {
			return createMFixedLeadingEdgesTypeAdapter();
		}

		@Override
		public Adapter caseMFixedLeadingEdgeType(MFixedLeadingEdgeType object) {
			return createMFixedLeadingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseMFixedTrailingEdgesType(MFixedTrailingEdgesType object) {
			return createMFixedTrailingEdgesTypeAdapter();
		}

		@Override
		public Adapter caseMFixedTrailingEdgeType(MFixedTrailingEdgeType object) {
			return createMFixedTrailingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseMFlightControlsType(MFlightControlsType object) {
			return createMFlightControlsTypeAdapter();
		}

		@Override
		public Adapter caseMFloorCoveringsType(MFloorCoveringsType object) {
			return createMFloorCoveringsTypeAdapter();
		}

		@Override
		public Adapter caseMFramesType(MFramesType object) {
			return createMFramesTypeAdapter();
		}

		@Override
		public Adapter caseMFreshWaterSystemsType(MFreshWaterSystemsType object) {
			return createMFreshWaterSystemsTypeAdapter();
		}

		@Override
		public Adapter caseMFuelSystemType(MFuelSystemType object) {
			return createMFuelSystemTypeAdapter();
		}

		@Override
		public Adapter caseMFuelType(MFuelType object) {
			return createMFuelTypeAdapter();
		}

		@Override
		public Adapter caseMFurnishingType(MFurnishingType object) {
			return createMFurnishingTypeAdapter();
		}

		@Override
		public Adapter caseMFuselagesStructureType(MFuselagesStructureType object) {
			return createMFuselagesStructureTypeAdapter();
		}

		@Override
		public Adapter caseMFuselageStructureType(MFuselageStructureType object) {
			return createMFuselageStructureTypeAdapter();
		}

		@Override
		public Adapter caseMHydraulicDistributionType(MHydraulicDistributionType object) {
			return createMHydraulicDistributionTypeAdapter();
		}

		@Override
		public Adapter caseMHydraulicGenerationType(MHydraulicGenerationType object) {
			return createMHydraulicGenerationTypeAdapter();
		}

		@Override
		public Adapter caseMIFESystemsType(MIFESystemsType object) {
			return createMIFESystemsTypeAdapter();
		}

		@Override
		public Adapter caseMInstrumentPanelType(MInstrumentPanelType object) {
			return createMInstrumentPanelTypeAdapter();
		}

		@Override
		public Adapter caseMInsulationsType(MInsulationsType object) {
			return createMInsulationsTypeAdapter();
		}

		@Override
		public Adapter caseMIntegratedModularAvionicsType(MIntegratedModularAvionicsType object) {
			return createMIntegratedModularAvionicsTypeAdapter();
		}

		@Override
		public Adapter caseMInterGasSystemType(MInterGasSystemType object) {
			return createMInterGasSystemTypeAdapter();
		}

		@Override
		public Adapter caseMissionDefinitionsType(MissionDefinitionsType object) {
			return createMissionDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseMissionEndRunwayType(MissionEndRunwayType object) {
			return createMissionEndRunwayTypeAdapter();
		}

		@Override
		public Adapter caseMissionPerformanceMapDefinitionType(MissionPerformanceMapDefinitionType object) {
			return createMissionPerformanceMapDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentBlockConstraintsType(MissionSegmentBlockConstraintsType object) {
			return createMissionSegmentBlockConstraintsTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentBlocksType(MissionSegmentBlocksType object) {
			return createMissionSegmentBlocksTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentBlockType(MissionSegmentBlockType object) {
			return createMissionSegmentBlockTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentEndConditionType(MissionSegmentEndConditionType object) {
			return createMissionSegmentEndConditionTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentsType(MissionSegmentsType object) {
			return createMissionSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseMissionSegmentType(MissionSegmentType object) {
			return createMissionSegmentTypeAdapter();
		}

		@Override
		public Adapter caseMissionStartConditionType(MissionStartConditionType object) {
			return createMissionStartConditionTypeAdapter();
		}

		@Override
		public Adapter caseMissionStartRunwayType(MissionStartRunwayType object) {
			return createMissionStartRunwayTypeAdapter();
		}

		@Override
		public Adapter caseMissionsType(MissionsType object) {
			return createMissionsTypeAdapter();
		}

		@Override
		public Adapter caseMissionType(MissionType object) {
			return createMissionTypeAdapter();
		}

		@Override
		public Adapter caseMLandingGearsType(MLandingGearsType object) {
			return createMLandingGearsTypeAdapter();
		}

		@Override
		public Adapter caseMLandingGearSupportsType(MLandingGearSupportsType object) {
			return createMLandingGearSupportsTypeAdapter();
		}

		@Override
		public Adapter caseMLavatoriesType(MLavatoriesType object) {
			return createMLavatoriesTypeAdapter();
		}

		@Override
		public Adapter caseMLiningsType(MLiningsType object) {
			return createMLiningsTypeAdapter();
		}

		@Override
		public Adapter caseMMainGearsType(MMainGearsType object) {
			return createMMainGearsTypeAdapter();
		}

		@Override
		public Adapter caseMManufacturerEmptyType(MManufacturerEmptyType object) {
			return createMManufacturerEmptyTypeAdapter();
		}

		@Override
		public Adapter caseMMillitarySystemsType(MMillitarySystemsType object) {
			return createMMillitarySystemsTypeAdapter();
		}

		@Override
		public Adapter caseMMoveableLeadingEdgesType(MMoveableLeadingEdgesType object) {
			return createMMoveableLeadingEdgesTypeAdapter();
		}

		@Override
		public Adapter caseMMoveableLeadingEdgeType(MMoveableLeadingEdgeType object) {
			return createMMoveableLeadingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseMMoveablesType(MMoveablesType object) {
			return createMMoveablesTypeAdapter();
		}

		@Override
		public Adapter caseMMoveableTrailingEdgeType(MMoveableTrailingEdgeType object) {
			return createMMoveableTrailingEdgeTypeAdapter();
		}

		@Override
		public Adapter caseMNavigationType(MNavigationType object) {
			return createMNavigationTypeAdapter();
		}

		@Override
		public Adapter caseMNoseGearsType(MNoseGearsType object) {
			return createMNoseGearsTypeAdapter();
		}

		@Override
		public Adapter caseMonetaryValuesAnalysisType(MonetaryValuesAnalysisType object) {
			return createMonetaryValuesAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseMOperatorItemsType(MOperatorItemsType object) {
			return createMOperatorItemsTypeAdapter();
		}

		@Override
		public Adapter caseMOverheadBinsType(MOverheadBinsType object) {
			return createMOverheadBinsTypeAdapter();
		}

		@Override
		public Adapter caseMPartStowDoorsType(MPartStowDoorsType object) {
			return createMPartStowDoorsTypeAdapter();
		}

		@Override
		public Adapter caseMPassengersType(MPassengersType object) {
			return createMPassengersTypeAdapter();
		}

		@Override
		public Adapter caseMPassengerType(MPassengerType object) {
			return createMPassengerTypeAdapter();
		}

		@Override
		public Adapter caseMPaxType(MPaxType object) {
			return createMPaxTypeAdapter();
		}

		@Override
		public Adapter caseMPayloadType(MPayloadType object) {
			return createMPayloadTypeAdapter();
		}

		@Override
		public Adapter caseMPowerUnitsType(MPowerUnitsType object) {
			return createMPowerUnitsTypeAdapter();
		}

		@Override
		public Adapter caseMPylonAttachmentsType(MPylonAttachmentsType object) {
			return createMPylonAttachmentsTypeAdapter();
		}

		@Override
		public Adapter caseMPylonsType(MPylonsType object) {
			return createMPylonsTypeAdapter();
		}

		@Override
		public Adapter caseMRemovableCrewRestsType(MRemovableCrewRestsType object) {
			return createMRemovableCrewRestsTypeAdapter();
		}

		@Override
		public Adapter caseMRibsType(MRibsType object) {
			return createMRibsTypeAdapter();
		}

		@Override
		public Adapter caseMRibType(MRibType object) {
			return createMRibTypeAdapter();
		}

		@Override
		public Adapter caseMSeatsType(MSeatsType object) {
			return createMSeatsTypeAdapter();
		}

		@Override
		public Adapter caseMShellsType(MShellsType object) {
			return createMShellsTypeAdapter();
		}

		@Override
		public Adapter caseMShellType(MShellType object) {
			return createMShellTypeAdapter();
		}

		@Override
		public Adapter caseMSkinPanelsType(MSkinPanelsType object) {
			return createMSkinPanelsTypeAdapter();
		}

		@Override
		public Adapter caseMSkinsType(MSkinsType object) {
			return createMSkinsTypeAdapter();
		}

		@Override
		public Adapter caseMSparCellsType(MSparCellsType object) {
			return createMSparCellsTypeAdapter();
		}

		@Override
		public Adapter caseMSparSkinsType(MSparSkinsType object) {
			return createMSparSkinsTypeAdapter();
		}

		@Override
		public Adapter caseMSparsType(MSparsType object) {
			return createMSparsTypeAdapter();
		}

		@Override
		public Adapter caseMSparType(MSparType object) {
			return createMSparTypeAdapter();
		}

		@Override
		public Adapter caseMSpecialStructuresType(MSpecialStructuresType object) {
			return createMSpecialStructuresTypeAdapter();
		}

		@Override
		public Adapter caseMSpoilersType(MSpoilersType object) {
			return createMSpoilersTypeAdapter();
		}

		@Override
		public Adapter caseMStringersType(MStringersType object) {
			return createMStringersTypeAdapter();
		}

		@Override
		public Adapter caseMStructureType(MStructureType object) {
			return createMStructureTypeAdapter();
		}

		@Override
		public Adapter caseMSystemsType(MSystemsType object) {
			return createMSystemsTypeAdapter();
		}

		@Override
		public Adapter caseMToiletFluidsType(MToiletFluidsType object) {
			return createMToiletFluidsTypeAdapter();
		}

		@Override
		public Adapter caseMTrailingEdgeDevicesType(MTrailingEdgeDevicesType object) {
			return createMTrailingEdgeDevicesTypeAdapter();
		}

		@Override
		public Adapter caseMTrailingEdgeDeviceType(MTrailingEdgeDeviceType object) {
			return createMTrailingEdgeDeviceTypeAdapter();
		}

		@Override
		public Adapter caseMULDContentsType(MULDContentsType object) {
			return createMULDContentsTypeAdapter();
		}

		@Override
		public Adapter caseMULDContentType(MULDContentType object) {
			return createMULDContentTypeAdapter();
		}

		@Override
		public Adapter caseMUnusableFuelsType(MUnusableFuelsType object) {
			return createMUnusableFuelsTypeAdapter();
		}

		@Override
		public Adapter caseMVacuumWasteSystemsType(MVacuumWasteSystemsType object) {
			return createMVacuumWasteSystemsTypeAdapter();
		}

		@Override
		public Adapter caseMWallsType(MWallsType object) {
			return createMWallsTypeAdapter();
		}

		@Override
		public Adapter caseMWasteWaterSystemsType(MWasteWaterSystemsType object) {
			return createMWasteWaterSystemsTypeAdapter();
		}

		@Override
		public Adapter caseMWaterReservoirsType(MWaterReservoirsType object) {
			return createMWaterReservoirsTypeAdapter();
		}

		@Override
		public Adapter caseMWindowsType(MWindowsType object) {
			return createMWindowsTypeAdapter();
		}

		@Override
		public Adapter caseMWingBoxType(MWingBoxType object) {
			return createMWingBoxTypeAdapter();
		}

		@Override
		public Adapter caseMWingsStructureType(MWingsStructureType object) {
			return createMWingsStructureTypeAdapter();
		}

		@Override
		public Adapter caseMWingStructureType(MWingStructureType object) {
			return createMWingStructureTypeAdapter();
		}

		@Override
		public Adapter caseNacelleCenterCowlType(NacelleCenterCowlType object) {
			return createNacelleCenterCowlTypeAdapter();
		}

		@Override
		public Adapter caseNacelleCowlType(NacelleCowlType object) {
			return createNacelleCowlTypeAdapter();
		}

		@Override
		public Adapter caseNacelleGuideCurvesType(NacelleGuideCurvesType object) {
			return createNacelleGuideCurvesTypeAdapter();
		}

		@Override
		public Adapter caseNacelleGuideCurveType(NacelleGuideCurveType object) {
			return createNacelleGuideCurveTypeAdapter();
		}

		@Override
		public Adapter caseNacelleProfilesType(NacelleProfilesType object) {
			return createNacelleProfilesTypeAdapter();
		}

		@Override
		public Adapter caseNacelleSectionsType(NacelleSectionsType object) {
			return createNacelleSectionsTypeAdapter();
		}

		@Override
		public Adapter caseNacelleSectionType(NacelleSectionType object) {
			return createNacelleSectionTypeAdapter();
		}

		@Override
		public Adapter caseNameType(NameType object) {
			return createNameTypeAdapter();
		}

		@Override
		public Adapter caseNameType1(NameType1 object) {
			return createNameType1Adapter();
		}

		@Override
		public Adapter caseNoiseAnalysisType(NoiseAnalysisType object) {
			return createNoiseAnalysisTypeAdapter();
		}

		@Override
		public Adapter caseNoseGearsType(NoseGearsType object) {
			return createNoseGearsTypeAdapter();
		}

		@Override
		public Adapter caseOEMType(OEMType object) {
			return createOEMTypeAdapter();
		}

		@Override
		public Adapter caseOperationalCasesType(OperationalCasesType object) {
			return createOperationalCasesTypeAdapter();
		}

		@Override
		public Adapter caseOperationalCaseType(OperationalCaseType object) {
			return createOperationalCaseTypeAdapter();
		}

		@Override
		public Adapter caseOperationLimitIncrementsType(OperationLimitIncrementsType object) {
			return createOperationLimitIncrementsTypeAdapter();
		}

		@Override
		public Adapter caseOrthotropicShellPropertiesType(OrthotropicShellPropertiesType object) {
			return createOrthotropicShellPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseOrthotropicSolidPropertiesType(OrthotropicSolidPropertiesType object) {
			return createOrthotropicSolidPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseOuterCutOutProfileType(OuterCutOutProfileType object) {
			return createOuterCutOutProfileTypeAdapter();
		}

		@Override
		public Adapter caseParametersType(ParametersType object) {
			return createParametersTypeAdapter();
		}

		@Override
		public Adapter caseParameterType(ParameterType object) {
			return createParameterTypeAdapter();
		}

		@Override
		public Adapter casePaxCrossBeamsAssemblyType(PaxCrossBeamsAssemblyType object) {
			return createPaxCrossBeamsAssemblyTypeAdapter();
		}

		@Override
		public Adapter casePaxCrossBeamStrutsAssemblyType(PaxCrossBeamStrutsAssemblyType object) {
			return createPaxCrossBeamStrutsAssemblyTypeAdapter();
		}

		@Override
		public Adapter casePaxDoorsAssemblyType(PaxDoorsAssemblyType object) {
			return createPaxDoorsAssemblyTypeAdapter();
		}

		@Override
		public Adapter casePayloadGlobalType(PayloadGlobalType object) {
			return createPayloadGlobalTypeAdapter();
		}

		@Override
		public Adapter casePerformanceMapSelectionType(PerformanceMapSelectionType object) {
			return createPerformanceMapSelectionTypeAdapter();
		}

		@Override
		public Adapter casePerformanceRequirementConfigurationsType(PerformanceRequirementConfigurationsType object) {
			return createPerformanceRequirementConfigurationsTypeAdapter();
		}

		@Override
		public Adapter casePerformanceRequirementsType(PerformanceRequirementsType object) {
			return createPerformanceRequirementsTypeAdapter();
		}

		@Override
		public Adapter casePerformanceTargetsGlobalType(PerformanceTargetsGlobalType object) {
			return createPerformanceTargetsGlobalTypeAdapter();
		}

		@Override
		public Adapter casePhiType(PhiType object) {
			return createPhiTypeAdapter();
		}

		@Override
		public Adapter casePintleStrutsType(PintleStrutsType object) {
			return createPintleStrutsTypeAdapter();
		}

		@Override
		public Adapter casePistonType(PistonType object) {
			return createPistonTypeAdapter();
		}

		@Override
		public Adapter casePlasticityCurvePointsType(PlasticityCurvePointsType object) {
			return createPlasticityCurvePointsTypeAdapter();
		}

		@Override
		public Adapter casePlasticityCurvePointType(PlasticityCurvePointType object) {
			return createPlasticityCurvePointTypeAdapter();
		}

		@Override
		public Adapter casePlasticityCurvesType(PlasticityCurvesType object) {
			return createPlasticityCurvesTypeAdapter();
		}

		@Override
		public Adapter casePlasticityCurveType(PlasticityCurveType object) {
			return createPlasticityCurveTypeAdapter();
		}

		@Override
		public Adapter casePointAbsRelType(PointAbsRelType object) {
			return createPointAbsRelTypeAdapter();
		}

		@Override
		public Adapter casePointConstraintType(PointConstraintType object) {
			return createPointConstraintTypeAdapter();
		}

		@Override
		public Adapter casePointListRelXYZVectorType(PointListRelXYZVectorType object) {
			return createPointListRelXYZVectorTypeAdapter();
		}

		@Override
		public Adapter casePointListType(PointListType object) {
			return createPointListTypeAdapter();
		}

		@Override
		public Adapter casePointListXYType(PointListXYType object) {
			return createPointListXYTypeAdapter();
		}

		@Override
		public Adapter casePointListXYVectorType(PointListXYVectorType object) {
			return createPointListXYVectorTypeAdapter();
		}

		@Override
		public Adapter casePointListXYZVectorType(PointListXYZVectorType object) {
			return createPointListXYZVectorTypeAdapter();
		}

		@Override
		public Adapter casePointPerformanceConstraintsType(PointPerformanceConstraintsType object) {
			return createPointPerformanceConstraintsTypeAdapter();
		}

		@Override
		public Adapter casePointPerformanceDefinitionsType(PointPerformanceDefinitionsType object) {
			return createPointPerformanceDefinitionsTypeAdapter();
		}

		@Override
		public Adapter casePointPerformanceDefinitionType(PointPerformanceDefinitionType object) {
			return createPointPerformanceDefinitionTypeAdapter();
		}

		@Override
		public Adapter casePointPerformanceRequirementsType(PointPerformanceRequirementsType object) {
			return createPointPerformanceRequirementsTypeAdapter();
		}

		@Override
		public Adapter casePointType(PointType object) {
			return createPointTypeAdapter();
		}

		@Override
		public Adapter casePointXType(PointXType object) {
			return createPointXTypeAdapter();
		}

		@Override
		public Adapter casePointXYType(PointXYType object) {
			return createPointXYTypeAdapter();
		}

		@Override
		public Adapter casePointXYZType(PointXYZType object) {
			return createPointXYZTypeAdapter();
		}

		@Override
		public Adapter casePointXZType(PointXZType object) {
			return createPointXZTypeAdapter();
		}

		@Override
		public Adapter casePointYType(PointYType object) {
			return createPointYTypeAdapter();
		}

		@Override
		public Adapter casePointYZType(PointYZType object) {
			return createPointYZTypeAdapter();
		}

		@Override
		public Adapter casePointZType(PointZType object) {
			return createPointZTypeAdapter();
		}

		@Override
		public Adapter casePosExcl0DoubleBaseType(PosExcl0DoubleBaseType object) {
			return createPosExcl0DoubleBaseTypeAdapter();
		}

		@Override
		public Adapter casePosExcl0IntBaseType(PosExcl0IntBaseType object) {
			return createPosExcl0IntBaseTypeAdapter();
		}

		@Override
		public Adapter casePosIntVectorBaseType(PosIntVectorBaseType object) {
			return createPosIntVectorBaseTypeAdapter();
		}

		@Override
		public Adapter casePositioningsType(PositioningsType object) {
			return createPositioningsTypeAdapter();
		}

		@Override
		public Adapter casePositioningType(PositioningType object) {
			return createPositioningTypeAdapter();
		}

		@Override
		public Adapter casePowerConsumedType(PowerConsumedType object) {
			return createPowerConsumedTypeAdapter();
		}

		@Override
		public Adapter casePowerFractionType(PowerFractionType object) {
			return createPowerFractionTypeAdapter();
		}

		@Override
		public Adapter casePowerRemainingType(PowerRemainingType object) {
			return createPowerRemainingTypeAdapter();
		}

		@Override
		public Adapter casePressureBulkheadAssemblyPositionType(PressureBulkheadAssemblyPositionType object) {
			return createPressureBulkheadAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter casePressureBulkheadAssemblyType(PressureBulkheadAssemblyType object) {
			return createPressureBulkheadAssemblyTypeAdapter();
		}

		@Override
		public Adapter casePressureBulkheadsType(PressureBulkheadsType object) {
			return createPressureBulkheadsTypeAdapter();
		}

		@Override
		public Adapter casePressureBulkheadType(PressureBulkheadType object) {
			return createPressureBulkheadTypeAdapter();
		}

		@Override
		public Adapter casePrioritySettingType(PrioritySettingType object) {
			return createPrioritySettingTypeAdapter();
		}

		@Override
		public Adapter caseProfileBasedStructuralElementsType(ProfileBasedStructuralElementsType object) {
			return createProfileBasedStructuralElementsTypeAdapter();
		}

		@Override
		public Adapter caseProfileBasedStructuralElementType(ProfileBasedStructuralElementType object) {
			return createProfileBasedStructuralElementTypeAdapter();
		}

		@Override
		public Adapter caseProfileGeometry2DType(ProfileGeometry2DType object) {
			return createProfileGeometry2DTypeAdapter();
		}

		@Override
		public Adapter caseProfileGeometryType(ProfileGeometryType object) {
			return createProfileGeometryTypeAdapter();
		}

		@Override
		public Adapter caseProfilesType(ProfilesType object) {
			return createProfilesTypeAdapter();
		}

		@Override
		public Adapter casePylonAttachmentsType(PylonAttachmentsType object) {
			return createPylonAttachmentsTypeAdapter();
		}

		@Override
		public Adapter casePylonAttachmentType(PylonAttachmentType object) {
			return createPylonAttachmentTypeAdapter();
		}

		@Override
		public Adapter casePylonBoxType(PylonBoxType object) {
			return createPylonBoxTypeAdapter();
		}

		@Override
		public Adapter casePylonPinsType(PylonPinsType object) {
			return createPylonPinsTypeAdapter();
		}

		@Override
		public Adapter casePylonPinType(PylonPinType object) {
			return createPylonPinTypeAdapter();
		}

		@Override
		public Adapter casePylonRibsDefinitionsType(PylonRibsDefinitionsType object) {
			return createPylonRibsDefinitionsTypeAdapter();
		}

		@Override
		public Adapter casePylonRibsDefinitionType(PylonRibsDefinitionType object) {
			return createPylonRibsDefinitionTypeAdapter();
		}

		@Override
		public Adapter casePylonRibsPositioningType(PylonRibsPositioningType object) {
			return createPylonRibsPositioningTypeAdapter();
		}

		@Override
		public Adapter casePylonShacklesType(PylonShacklesType object) {
			return createPylonShacklesTypeAdapter();
		}

		@Override
		public Adapter casePylonShackleType(PylonShackleType object) {
			return createPylonShackleTypeAdapter();
		}

		@Override
		public Adapter casePylonShellType(PylonShellType object) {
			return createPylonShellTypeAdapter();
		}

		@Override
		public Adapter casePylonStructureType(PylonStructureType object) {
			return createPylonStructureTypeAdapter();
		}

		@Override
		public Adapter casePylonStrutsType(PylonStrutsType object) {
			return createPylonStrutsTypeAdapter();
		}

		@Override
		public Adapter caseRadiativeForcingType(RadiativeForcingType object) {
			return createRadiativeForcingTypeAdapter();
		}

		@Override
		public Adapter caseRangeType(RangeType object) {
			return createRangeTypeAdapter();
		}

		@Override
		public Adapter caseRateOfClimbType(RateOfClimbType object) {
			return createRateOfClimbTypeAdapter();
		}

		@Override
		public Adapter caseRectangleProfileType(RectangleProfileType object) {
			return createRectangleProfileTypeAdapter();
		}

		@Override
		public Adapter caseRecurringCostType(RecurringCostType object) {
			return createRecurringCostTypeAdapter();
		}

		@Override
		public Adapter caseReferenceType(ReferenceType object) {
			return createReferenceTypeAdapter();
		}

		@Override
		public Adapter caseRelativeStrutPositionType(RelativeStrutPositionType object) {
			return createRelativeStrutPositionTypeAdapter();
		}

		@Override
		public Adapter caseReleasedStoresType(ReleasedStoresType object) {
			return createReleasedStoresTypeAdapter();
		}

		@Override
		public Adapter caseReleasedStoreType(ReleasedStoreType object) {
			return createReleasedStoreTypeAdapter();
		}

		@Override
		public Adapter caseRemainingContributionsType(RemainingContributionsType object) {
			return createRemainingContributionsTypeAdapter();
		}

		@Override
		public Adapter caseRemainingContributionType(RemainingContributionType object) {
			return createRemainingContributionTypeAdapter();
		}

		@Override
		public Adapter caseRequirementClassificationType(RequirementClassificationType object) {
			return createRequirementClassificationTypeAdapter();
		}

		@Override
		public Adapter caseRequirementType(RequirementType object) {
			return createRequirementTypeAdapter();
		}

		@Override
		public Adapter caseRibCrossingBehaviourType(RibCrossingBehaviourType object) {
			return createRibCrossingBehaviourTypeAdapter();
		}

		@Override
		public Adapter caseRibCrossingBehaviourType1(RibCrossingBehaviourType1 object) {
			return createRibCrossingBehaviourType1Adapter();
		}

		@Override
		public Adapter caseRibIdentificationType(RibIdentificationType object) {
			return createRibIdentificationTypeAdapter();
		}

		@Override
		public Adapter caseRibRotationType(RibRotationType object) {
			return createRibRotationTypeAdapter();
		}

		@Override
		public Adapter caseRivetJointAreaAssemblyPositionType(RivetJointAreaAssemblyPositionType object) {
			return createRivetJointAreaAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter caseRivetJointAreasAssemblyType(RivetJointAreasAssemblyType object) {
			return createRivetJointAreasAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseRivetsType(RivetsType object) {
			return createRivetsTypeAdapter();
		}

		@Override
		public Adapter caseRivetType(RivetType object) {
			return createRivetTypeAdapter();
		}

		@Override
		public Adapter caseRotationCurveType(RotationCurveType object) {
			return createRotationCurveTypeAdapter();
		}

		@Override
		public Adapter caseRotDirectionType(RotDirectionType object) {
			return createRotDirectionTypeAdapter();
		}

		@Override
		public Adapter caseRotorAirfoilsType(RotorAirfoilsType object) {
			return createRotorAirfoilsTypeAdapter();
		}

		@Override
		public Adapter caseRotorBladeAttachmentsType(RotorBladeAttachmentsType object) {
			return createRotorBladeAttachmentsTypeAdapter();
		}

		@Override
		public Adapter caseRotorBladeAttachmentType(RotorBladeAttachmentType object) {
			return createRotorBladeAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseRotorBladesType(RotorBladesType object) {
			return createRotorBladesTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftAnalysesType(RotorcraftAnalysesType object) {
			return createRotorcraftAnalysesTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftGlobalType(RotorcraftGlobalType object) {
			return createRotorcraftGlobalTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftMassBreakdownType(RotorcraftMassBreakdownType object) {
			return createRotorcraftMassBreakdownTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftMassEMType(RotorcraftMassEMType object) {
			return createRotorcraftMassEMTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftMassGroupLevel1Type(RotorcraftMassGroupLevel1Type object) {
			return createRotorcraftMassGroupLevel1TypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftMassGroupLevel2Type(RotorcraftMassGroupLevel2Type object) {
			return createRotorcraftMassGroupLevel2TypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftMassOEMType(RotorcraftMassOEMType object) {
			return createRotorcraftMassOEMTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftModelType(RotorcraftModelType object) {
			return createRotorcraftModelTypeAdapter();
		}

		@Override
		public Adapter caseRotorcraftType(RotorcraftType object) {
			return createRotorcraftTypeAdapter();
		}

		@Override
		public Adapter caseRotorHubHingesType(RotorHubHingesType object) {
			return createRotorHubHingesTypeAdapter();
		}

		@Override
		public Adapter caseRotorHubHingeType(RotorHubHingeType object) {
			return createRotorHubHingeTypeAdapter();
		}

		@Override
		public Adapter caseRotorHubType(RotorHubType object) {
			return createRotorHubTypeAdapter();
		}

		@Override
		public Adapter caseRotorsType(RotorsType object) {
			return createRotorsTypeAdapter();
		}

		@Override
		public Adapter caseRotorType(RotorType object) {
			return createRotorTypeAdapter();
		}

		@Override
		public Adapter caseRunwayILSType(RunwayILSType object) {
			return createRunwayILSTypeAdapter();
		}

		@Override
		public Adapter caseRunwayStartPositionType(RunwayStartPositionType object) {
			return createRunwayStartPositionTypeAdapter();
		}

		@Override
		public Adapter caseRunwaysType(RunwaysType object) {
			return createRunwaysTypeAdapter();
		}

		@Override
		public Adapter caseRunwayType(RunwayType object) {
			return createRunwayTypeAdapter();
		}

		@Override
		public Adapter caseRunwayType1(RunwayType1 object) {
			return createRunwayType1Adapter();
		}

		@Override
		public Adapter caseSeatElementsType(SeatElementsType object) {
			return createSeatElementsTypeAdapter();
		}

		@Override
		public Adapter caseSeatElementType(SeatElementType object) {
			return createSeatElementTypeAdapter();
		}

		@Override
		public Adapter caseSeatModulesType(SeatModulesType object) {
			return createSeatModulesTypeAdapter();
		}

		@Override
		public Adapter caseSegmentDirectionType(SegmentDirectionType object) {
			return createSegmentDirectionTypeAdapter();
		}

		@Override
		public Adapter caseSegmentTypeType(SegmentTypeType object) {
			return createSegmentTypeTypeAdapter();
		}

		@Override
		public Adapter caseShaftLinkedComponentsType(ShaftLinkedComponentsType object) {
			return createShaftLinkedComponentsTypeAdapter();
		}

		@Override
		public Adapter caseShaftsType(ShaftsType object) {
			return createShaftsTypeAdapter();
		}

		@Override
		public Adapter caseShaftType(ShaftType object) {
			return createShaftTypeAdapter();
		}

		@Override
		public Adapter caseSheet3DType(Sheet3DType object) {
			return createSheet3DTypeAdapter();
		}

		@Override
		public Adapter caseSheetBasedStructuralElementsType(SheetBasedStructuralElementsType object) {
			return createSheetBasedStructuralElementsTypeAdapter();
		}

		@Override
		public Adapter caseSheetBasedStructuralElementType(SheetBasedStructuralElementType object) {
			return createSheetBasedStructuralElementTypeAdapter();
		}

		@Override
		public Adapter caseSheetList3DType(SheetList3DType object) {
			return createSheetList3DTypeAdapter();
		}

		@Override
		public Adapter caseSheetListType(SheetListType object) {
			return createSheetListTypeAdapter();
		}

		@Override
		public Adapter caseSheetPointsType(SheetPointsType object) {
			return createSheetPointsTypeAdapter();
		}

		@Override
		public Adapter caseSheetType(SheetType object) {
			return createSheetTypeAdapter();
		}

		@Override
		public Adapter caseSideStrutsType(SideStrutsType object) {
			return createSideStrutsTypeAdapter();
		}

		@Override
		public Adapter caseSideType(SideType object) {
			return createSideTypeAdapter();
		}

		@Override
		public Adapter caseSidewallPanelElementsType(SidewallPanelElementsType object) {
			return createSidewallPanelElementsTypeAdapter();
		}

		@Override
		public Adapter caseSidewallPanelsType(SidewallPanelsType object) {
			return createSidewallPanelsTypeAdapter();
		}

		@Override
		public Adapter caseSingleGenericMassType(SingleGenericMassType object) {
			return createSingleGenericMassTypeAdapter();
		}

		@Override
		public Adapter caseSkidGearsType(SkidGearsType object) {
			return createSkidGearsTypeAdapter();
		}

		@Override
		public Adapter caseSkinSegmentsType(SkinSegmentsType object) {
			return createSkinSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseSkinSegmentType(SkinSegmentType object) {
			return createSkinSegmentTypeAdapter();
		}

		@Override
		public Adapter caseSkinType(SkinType object) {
			return createSkinTypeAdapter();
		}

		@Override
		public Adapter caseSparCellsType(SparCellsType object) {
			return createSparCellsTypeAdapter();
		}

		@Override
		public Adapter caseSparCellType(SparCellType object) {
			return createSparCellTypeAdapter();
		}

		@Override
		public Adapter caseSparCrossSectionType(SparCrossSectionType object) {
			return createSparCrossSectionTypeAdapter();
		}

		@Override
		public Adapter caseSparPositionsType(SparPositionsType object) {
			return createSparPositionsTypeAdapter();
		}

		@Override
		public Adapter caseSparPositionType(SparPositionType object) {
			return createSparPositionTypeAdapter();
		}

		@Override
		public Adapter caseSparPositionUIDsType(SparPositionUIDsType object) {
			return createSparPositionUIDsTypeAdapter();
		}

		@Override
		public Adapter caseSparSegmentsType(SparSegmentsType object) {
			return createSparSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseSparSegmentType(SparSegmentType object) {
			return createSparSegmentTypeAdapter();
		}

		@Override
		public Adapter caseSpecificConfigurationSegmentsType(SpecificConfigurationSegmentsType object) {
			return createSpecificConfigurationSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseSpecificConfigurationSegmentType(SpecificConfigurationSegmentType object) {
			return createSpecificConfigurationSegmentTypeAdapter();
		}

		@Override
		public Adapter caseSpecificConfigurationUIDsType(SpecificConfigurationUIDsType object) {
			return createSpecificConfigurationUIDsTypeAdapter();
		}

		@Override
		public Adapter caseSpecificConfigurationUIDType(SpecificConfigurationUIDType object) {
			return createSpecificConfigurationUIDTypeAdapter();
		}

		@Override
		public Adapter caseSpecificExcessPowerType(SpecificExcessPowerType object) {
			return createSpecificExcessPowerTypeAdapter();
		}

		@Override
		public Adapter caseSpecificHeatMapType(SpecificHeatMapType object) {
			return createSpecificHeatMapTypeAdapter();
		}

		@Override
		public Adapter caseSpecificPerformanceMapsType(SpecificPerformanceMapsType object) {
			return createSpecificPerformanceMapsTypeAdapter();
		}

		@Override
		public Adapter caseSpecificPerformanceMapType(SpecificPerformanceMapType object) {
			return createSpecificPerformanceMapTypeAdapter();
		}

		@Override
		public Adapter caseSpeedDesignatorsType(SpeedDesignatorsType object) {
			return createSpeedDesignatorsTypeAdapter();
		}

		@Override
		public Adapter caseSpoilersType(SpoilersType object) {
			return createSpoilersTypeAdapter();
		}

		@Override
		public Adapter caseSpoilerType(SpoilerType object) {
			return createSpoilerTypeAdapter();
		}

		@Override
		public Adapter caseStandardProfileSheetIDType(StandardProfileSheetIDType object) {
			return createStandardProfileSheetIDTypeAdapter();
		}

		@Override
		public Adapter caseStandardProfileType(StandardProfileType object) {
			return createStandardProfileTypeAdapter();
		}

		@Override
		public Adapter caseStandardProfileTypeType(StandardProfileTypeType object) {
			return createStandardProfileTypeTypeAdapter();
		}

		@Override
		public Adapter caseStateParametersType(StateParametersType object) {
			return createStateParametersTypeAdapter();
		}

		@Override
		public Adapter caseStateParameterType(StateParameterType object) {
			return createStateParameterTypeAdapter();
		}

		@Override
		public Adapter caseStiffnessType(StiffnessType object) {
			return createStiffnessTypeAdapter();
		}

		@Override
		public Adapter caseStringArrayBaseType(StringArrayBaseType object) {
			return createStringArrayBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringBaseType(StringBaseType object) {
			return createStringBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringerFramePositionType(StringerFramePositionType object) {
			return createStringerFramePositionTypeAdapter();
		}

		@Override
		public Adapter caseStringerFramePositionUIDsType(StringerFramePositionUIDsType object) {
			return createStringerFramePositionUIDsTypeAdapter();
		}

		@Override
		public Adapter caseStringersAssemblyType(StringersAssemblyType object) {
			return createStringersAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseStringerType(StringerType object) {
			return createStringerTypeAdapter();
		}

		@Override
		public Adapter caseStringUIDBaseType(StringUIDBaseType object) {
			return createStringUIDBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringVectorBaseType(StringVectorBaseType object) {
			return createStringVectorBaseTypeAdapter();
		}

		@Override
		public Adapter caseStructuralElementsType(StructuralElementsType object) {
			return createStructuralElementsTypeAdapter();
		}

		@Override
		public Adapter caseStructuralMountType(StructuralMountType object) {
			return createStructuralMountTypeAdapter();
		}

		@Override
		public Adapter caseStructuralProfile3DType(StructuralProfile3DType object) {
			return createStructuralProfile3DTypeAdapter();
		}

		@Override
		public Adapter caseStructuralProfilesType(StructuralProfilesType object) {
			return createStructuralProfilesTypeAdapter();
		}

		@Override
		public Adapter caseStructuralProfileType(StructuralProfileType object) {
			return createStructuralProfileTypeAdapter();
		}

		@Override
		public Adapter caseStructuralWallElementsType(StructuralWallElementsType object) {
			return createStructuralWallElementsTypeAdapter();
		}

		@Override
		public Adapter caseStructuralWallElementType(StructuralWallElementType object) {
			return createStructuralWallElementTypeAdapter();
		}

		@Override
		public Adapter caseStrutAssemblyType(StrutAssemblyType object) {
			return createStrutAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseStrutPropertiesType(StrutPropertiesType object) {
			return createStrutPropertiesTypeAdapter();
		}

		@Override
		public Adapter caseStrutType(StrutType object) {
			return createStrutTypeAdapter();
		}

		@Override
		public Adapter caseStudiesType(StudiesType object) {
			return createStudiesTypeAdapter();
		}

		@Override
		public Adapter caseSubFleetsType(SubFleetsType object) {
			return createSubFleetsTypeAdapter();
		}

		@Override
		public Adapter caseSubFleetType(SubFleetType object) {
			return createSubFleetTypeAdapter();
		}

		@Override
		public Adapter caseSubLoadType(SubLoadType object) {
			return createSubLoadTypeAdapter();
		}

		@Override
		public Adapter caseSuperEllipseProfileType(SuperEllipseProfileType object) {
			return createSuperEllipseProfileTypeAdapter();
		}

		@Override
		public Adapter caseSupportBeamType(SupportBeamType object) {
			return createSupportBeamTypeAdapter();
		}

		@Override
		public Adapter caseSystemsType(SystemsType object) {
			return createSystemsTypeAdapter();
		}

		@Override
		public Adapter caseTailplaneAttachmentAreaType(TailplaneAttachmentAreaType object) {
			return createTailplaneAttachmentAreaTypeAdapter();
		}

		@Override
		public Adapter caseTailplaneAttachmentTypeType(TailplaneAttachmentTypeType object) {
			return createTailplaneAttachmentTypeTypeAdapter();
		}

		@Override
		public Adapter caseTakeoffPerformanceParametersType(TakeoffPerformanceParametersType object) {
			return createTakeoffPerformanceParametersTypeAdapter();
		}

		@Override
		public Adapter caseTangentLinksType(TangentLinksType object) {
			return createTangentLinksTypeAdapter();
		}

		@Override
		public Adapter caseTiedInterfacesType(TiedInterfacesType object) {
			return createTiedInterfacesTypeAdapter();
		}

		@Override
		public Adapter caseTiedInterfaceType(TiedInterfaceType object) {
			return createTiedInterfaceTypeAdapter();
		}

		@Override
		public Adapter caseTimeBaseType(TimeBaseType object) {
			return createTimeBaseTypeAdapter();
		}

		@Override
		public Adapter caseTimeConstraintBaseType(TimeConstraintBaseType object) {
			return createTimeConstraintBaseTypeAdapter();
		}

		@Override
		public Adapter caseToolspecificType(ToolspecificType object) {
			return createToolspecificTypeAdapter();
		}

		@Override
		public Adapter caseToolType(ToolType object) {
			return createToolTypeAdapter();
		}

		@Override
		public Adapter caseTopologyEntriesType(TopologyEntriesType object) {
			return createTopologyEntriesTypeAdapter();
		}

		@Override
		public Adapter caseTopologyEntryType(TopologyEntryType object) {
			return createTopologyEntryTypeAdapter();
		}

		@Override
		public Adapter caseTotalOperatingCostType(TotalOperatingCostType object) {
			return createTotalOperatingCostTypeAdapter();
		}

		@Override
		public Adapter caseTrackActuatorType(TrackActuatorType object) {
			return createTrackActuatorTypeAdapter();
		}

		@Override
		public Adapter caseTrackJointCoordinatesType(TrackJointCoordinatesType object) {
			return createTrackJointCoordinatesTypeAdapter();
		}

		@Override
		public Adapter caseTrackJointPositionsType(TrackJointPositionsType object) {
			return createTrackJointPositionsTypeAdapter();
		}

		@Override
		public Adapter caseTrackJointPositionType(TrackJointPositionType object) {
			return createTrackJointPositionTypeAdapter();
		}

		@Override
		public Adapter caseTrackSecondaryStructureType(TrackSecondaryStructureType object) {
			return createTrackSecondaryStructureTypeAdapter();
		}

		@Override
		public Adapter caseTrackStructureType(TrackStructureType object) {
			return createTrackStructureTypeAdapter();
		}

		@Override
		public Adapter caseTrackStrutsType(TrackStrutsType object) {
			return createTrackStrutsTypeAdapter();
		}

		@Override
		public Adapter caseTrackStrutType(TrackStrutType object) {
			return createTrackStrutTypeAdapter();
		}

		@Override
		public Adapter caseTrackSubTypeType(TrackSubTypeType object) {
			return createTrackSubTypeTypeAdapter();
		}

		@Override
		public Adapter caseTrackTypeType(TrackTypeType object) {
			return createTrackTypeTypeAdapter();
		}

		@Override
		public Adapter caseTrailingEdgeDevicesType(TrailingEdgeDevicesType object) {
			return createTrailingEdgeDevicesTypeAdapter();
		}

		@Override
		public Adapter caseTrailingEdgeDeviceType(TrailingEdgeDeviceType object) {
			return createTrailingEdgeDeviceTypeAdapter();
		}

		@Override
		public Adapter caseTrajectoriesType(TrajectoriesType object) {
			return createTrajectoriesTypeAdapter();
		}

		@Override
		public Adapter caseTrajectoryGlobalType(TrajectoryGlobalType object) {
			return createTrajectoryGlobalTypeAdapter();
		}

		@Override
		public Adapter caseTrajectoryType(TrajectoryType object) {
			return createTrajectoryTypeAdapter();
		}

		@Override
		public Adapter caseTransformation2DType(Transformation2DType object) {
			return createTransformation2DTypeAdapter();
		}

		@Override
		public Adapter caseTransformationType(TransformationType object) {
			return createTransformationTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionGearRatioType(TransmissionGearRatioType object) {
			return createTransmissionGearRatioTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionShaftInputsType(TransmissionShaftInputsType object) {
			return createTransmissionShaftInputsTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionShaftInputType(TransmissionShaftInputType object) {
			return createTransmissionShaftInputTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionShaftOutputsType(TransmissionShaftOutputsType object) {
			return createTransmissionShaftOutputsTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionShaftOutputType(TransmissionShaftOutputType object) {
			return createTransmissionShaftOutputTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionsType(TransmissionsType object) {
			return createTransmissionsTypeAdapter();
		}

		@Override
		public Adapter caseTransmissionType(TransmissionType object) {
			return createTransmissionTypeAdapter();
		}

		@Override
		public Adapter caseTrimCaseType(TrimCaseType object) {
			return createTrimCaseTypeAdapter();
		}

		@Override
		public Adapter caseTrimRequirementsType(TrimRequirementsType object) {
			return createTrimRequirementsTypeAdapter();
		}

		@Override
		public Adapter caseTrimRequirementType(TrimRequirementType object) {
			return createTrimRequirementTypeAdapter();
		}

		@Override
		public Adapter caseTrimType(TrimType object) {
			return createTrimTypeAdapter();
		}

		@Override
		public Adapter caseTurnAngleType(TurnAngleType object) {
			return createTurnAngleTypeAdapter();
		}

		@Override
		public Adapter caseTypeOfPointPerformanceType(TypeOfPointPerformanceType object) {
			return createTypeOfPointPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseTypeType(TypeType object) {
			return createTypeTypeAdapter();
		}

		@Override
		public Adapter caseTypeType4(TypeType4 object) {
			return createTypeType4Adapter();
		}

		@Override
		public Adapter caseUIDGroupDefinitionsType(UIDGroupDefinitionsType object) {
			return createUIDGroupDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseUIDGroupDefinitionType(UIDGroupDefinitionType object) {
			return createUIDGroupDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseUIDSequenceType(UIDSequenceType object) {
			return createUIDSequenceTypeAdapter();
		}

		@Override
		public Adapter caseUpperLinksType(UpperLinksType object) {
			return createUpperLinksTypeAdapter();
		}

		@Override
		public Adapter caseVariableConditionsType(VariableConditionsType object) {
			return createVariableConditionsTypeAdapter();
		}

		@Override
		public Adapter caseVariableSegmentsType(VariableSegmentsType object) {
			return createVariableSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseVariableSegmentType(VariableSegmentType object) {
			return createVariableSegmentTypeAdapter();
		}

		@Override
		public Adapter caseVehicleConfigurationsType(VehicleConfigurationsType object) {
			return createVehicleConfigurationsTypeAdapter();
		}

		@Override
		public Adapter caseVehicleConfigurationType(VehicleConfigurationType object) {
			return createVehicleConfigurationTypeAdapter();
		}

		@Override
		public Adapter caseVehiclesType(VehiclesType object) {
			return createVehiclesTypeAdapter();
		}

		@Override
		public Adapter caseVersionInfosType(VersionInfosType object) {
			return createVersionInfosTypeAdapter();
		}

		@Override
		public Adapter caseVersionInfoType(VersionInfoType object) {
			return createVersionInfoTypeAdapter();
		}

		@Override
		public Adapter caseVtpFrameDefType(VtpFrameDefType object) {
			return createVtpFrameDefTypeAdapter();
		}

		@Override
		public Adapter caseVtpInterfaceDefType(VtpInterfaceDefType object) {
			return createVtpInterfaceDefTypeAdapter();
		}

		@Override
		public Adapter caseWallPositionsType(WallPositionsType object) {
			return createWallPositionsTypeAdapter();
		}

		@Override
		public Adapter caseWallPositionType(WallPositionType object) {
			return createWallPositionTypeAdapter();
		}

		@Override
		public Adapter caseWallPositionUIDsType(WallPositionUIDsType object) {
			return createWallPositionUIDsTypeAdapter();
		}

		@Override
		public Adapter caseWallSegmentsType(WallSegmentsType object) {
			return createWallSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseWallSegmentType(WallSegmentType object) {
			return createWallSegmentTypeAdapter();
		}

		@Override
		public Adapter caseWallsType(WallsType object) {
			return createWallsTypeAdapter();
		}

		@Override
		public Adapter caseWayPointTypeType(WayPointTypeType object) {
			return createWayPointTypeTypeAdapter();
		}

		@Override
		public Adapter caseWebType(WebType object) {
			return createWebTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalanceCaseType(WeightAndBalanceCaseType object) {
			return createWeightAndBalanceCaseTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalanceFuelInTanksType(WeightAndBalanceFuelInTanksType object) {
			return createWeightAndBalanceFuelInTanksTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalanceFuelInTankType(WeightAndBalanceFuelInTankType object) {
			return createWeightAndBalanceFuelInTankTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalanceFuelType(WeightAndBalanceFuelType object) {
			return createWeightAndBalanceFuelTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalancemCargosType(WeightAndBalancemCargosType object) {
			return createWeightAndBalancemCargosTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalancemPaxxType(WeightAndBalancemPaxxType object) {
			return createWeightAndBalancemPaxxTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalancePayloadType(WeightAndBalancePayloadType object) {
			return createWeightAndBalancePayloadTypeAdapter();
		}

		@Override
		public Adapter caseWeightAndBalanceType(WeightAndBalanceType object) {
			return createWeightAndBalanceTypeAdapter();
		}

		@Override
		public Adapter caseWheelType(WheelType object) {
			return createWheelTypeAdapter();
		}

		@Override
		public Adapter caseWindowAssemblyPositionType(WindowAssemblyPositionType object) {
			return createWindowAssemblyPositionTypeAdapter();
		}

		@Override
		public Adapter caseWindowsAssemblyType(WindowsAssemblyType object) {
			return createWindowsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseWindowsType(WindowsType object) {
			return createWindowsTypeAdapter();
		}

		@Override
		public Adapter caseWingAeroPerformanceType(WingAeroPerformanceType object) {
			return createWingAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseWingAirfoilsType(WingAirfoilsType object) {
			return createWingAirfoilsTypeAdapter();
		}

		@Override
		public Adapter caseWingAttachmentPositioningType(WingAttachmentPositioningType object) {
			return createWingAttachmentPositioningTypeAdapter();
		}

		@Override
		public Adapter caseWingCellsType(WingCellsType object) {
			return createWingCellsTypeAdapter();
		}

		@Override
		public Adapter caseWingCellType(WingCellType object) {
			return createWingCellTypeAdapter();
		}

		@Override
		public Adapter caseWingComponentSegmentStructureType(WingComponentSegmentStructureType object) {
			return createWingComponentSegmentStructureTypeAdapter();
		}

		@Override
		public Adapter caseWingElementsType(WingElementsType object) {
			return createWingElementsTypeAdapter();
		}

		@Override
		public Adapter caseWingElementType(WingElementType object) {
			return createWingElementTypeAdapter();
		}

		@Override
		public Adapter caseWingFuelTankBorderType(WingFuelTankBorderType object) {
			return createWingFuelTankBorderTypeAdapter();
		}

		@Override
		public Adapter caseWingFuelTankGeometryType(WingFuelTankGeometryType object) {
			return createWingFuelTankGeometryTypeAdapter();
		}

		@Override
		public Adapter caseWingFuelTanksType(WingFuelTanksType object) {
			return createWingFuelTanksTypeAdapter();
		}

		@Override
		public Adapter caseWingFuelTankType(WingFuelTankType object) {
			return createWingFuelTankTypeAdapter();
		}

		@Override
		public Adapter caseWingFuselageAttachmentsType(WingFuselageAttachmentsType object) {
			return createWingFuselageAttachmentsTypeAdapter();
		}

		@Override
		public Adapter caseWingFuselageAttachmentType(WingFuselageAttachmentType object) {
			return createWingFuselageAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseWingInterfaceDefinitionsType(WingInterfaceDefinitionsType object) {
			return createWingInterfaceDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseWingInterfaceMainFramesType(WingInterfaceMainFramesType object) {
			return createWingInterfaceMainFramesTypeAdapter();
		}

		@Override
		public Adapter caseWingInterfaceSupportStrutsAssemblyType(WingInterfaceSupportStrutsAssemblyType object) {
			return createWingInterfaceSupportStrutsAssemblyTypeAdapter();
		}

		@Override
		public Adapter caseWingInterfaceSupportStrutType(WingInterfaceSupportStrutType object) {
			return createWingInterfaceSupportStrutTypeAdapter();
		}

		@Override
		public Adapter caseWingIntermediateStructureCellsType(WingIntermediateStructureCellsType object) {
			return createWingIntermediateStructureCellsTypeAdapter();
		}

		@Override
		public Adapter caseWingIntermediateStructureCellType(WingIntermediateStructureCellType object) {
			return createWingIntermediateStructureCellTypeAdapter();
		}

		@Override
		public Adapter caseWingRibCellType(WingRibCellType object) {
			return createWingRibCellTypeAdapter();
		}

		@Override
		public Adapter caseWingRibCrossSectionType(WingRibCrossSectionType object) {
			return createWingRibCrossSectionTypeAdapter();
		}

		@Override
		public Adapter caseWingRibExplicitPositioningType(WingRibExplicitPositioningType object) {
			return createWingRibExplicitPositioningTypeAdapter();
		}

		@Override
		public Adapter caseWingRibPointType(WingRibPointType object) {
			return createWingRibPointTypeAdapter();
		}

		@Override
		public Adapter caseWingRibsDefinitionsType(WingRibsDefinitionsType object) {
			return createWingRibsDefinitionsTypeAdapter();
		}

		@Override
		public Adapter caseWingRibsDefinitionType(WingRibsDefinitionType object) {
			return createWingRibsDefinitionTypeAdapter();
		}

		@Override
		public Adapter caseWingRibsPositioningType(WingRibsPositioningType object) {
			return createWingRibsPositioningTypeAdapter();
		}

		@Override
		public Adapter caseWingsAeroPerformanceType(WingsAeroPerformanceType object) {
			return createWingsAeroPerformanceTypeAdapter();
		}

		@Override
		public Adapter caseWingSectionsType(WingSectionsType object) {
			return createWingSectionsTypeAdapter();
		}

		@Override
		public Adapter caseWingSectionType(WingSectionType object) {
			return createWingSectionTypeAdapter();
		}

		@Override
		public Adapter caseWingSegmentsType(WingSegmentsType object) {
			return createWingSegmentsTypeAdapter();
		}

		@Override
		public Adapter caseWingSegmentType(WingSegmentType object) {
			return createWingSegmentTypeAdapter();
		}

		@Override
		public Adapter caseWingShellType(WingShellType object) {
			return createWingShellTypeAdapter();
		}

		@Override
		public Adapter caseWingSkinType(WingSkinType object) {
			return createWingSkinTypeAdapter();
		}

		@Override
		public Adapter caseWingSparType(WingSparType object) {
			return createWingSparTypeAdapter();
		}

		@Override
		public Adapter caseWingStringerType(WingStringerType object) {
			return createWingStringerTypeAdapter();
		}

		@Override
		public Adapter caseWingStructuralMountsType(WingStructuralMountsType object) {
			return createWingStructuralMountsTypeAdapter();
		}

		@Override
		public Adapter caseWingsType(WingsType object) {
			return createWingsTypeAdapter();
		}

		@Override
		public Adapter caseWingType(WingType object) {
			return createWingTypeAdapter();
		}

		@Override
		public Adapter caseWingWingAttachmentElementsType(WingWingAttachmentElementsType object) {
			return createWingWingAttachmentElementsTypeAdapter();
		}

		@Override
		public Adapter caseWingWingAttachmentSparsType(WingWingAttachmentSparsType object) {
			return createWingWingAttachmentSparsTypeAdapter();
		}

		@Override
		public Adapter caseWingWingAttachmentsSparsType(WingWingAttachmentsSparsType object) {
			return createWingWingAttachmentsSparsTypeAdapter();
		}

		@Override
		public Adapter caseWingWingAttachmentsType(WingWingAttachmentsType object) {
			return createWingWingAttachmentsTypeAdapter();
		}

		@Override
		public Adapter caseWingWingAttachmentType(WingWingAttachmentType object) {
			return createWingWingAttachmentTypeAdapter();
		}

		@Override
		public Adapter caseXsiIsoLineType(XsiIsoLineType object) {
			return createXsiIsoLineTypeAdapter();
		}

		@Override
		public Adapter caseZCouplingsType(ZCouplingsType object) {
			return createZCouplingsTypeAdapter();
		}

		@Override
		public Adapter caseZCouplingType(ZCouplingType object) {
			return createZCouplingTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorAttachmentType <em>Actuator Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorAttachmentType
	 * @generated
	 */
	public Adapter createActuatorAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorControlSurfaceAttachmentType <em>Actuator Control Surface Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorControlSurfaceAttachmentType
	 * @generated
	 */
	public Adapter createActuatorControlSurfaceAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorFuselageWingAttachmentType <em>Actuator Fuselage Wing Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorFuselageWingAttachmentType
	 * @generated
	 */
	public Adapter createActuatorFuselageWingAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorFuselageWingType <em>Actuator Fuselage Wing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorFuselageWingType
	 * @generated
	 */
	public Adapter createActuatorFuselageWingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorParentAttachmentType <em>Actuator Parent Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorParentAttachmentType
	 * @generated
	 */
	public Adapter createActuatorParentAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ActuatorsFuselageWingType <em>Actuators Fuselage Wing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ActuatorsFuselageWingType
	 * @generated
	 */
	public Adapter createActuatorsFuselageWingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroCaseAeroDataType <em>Aero Case Aero Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroCaseAeroDataType
	 * @generated
	 */
	public Adapter createAeroCaseAeroDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroCaseCoefficientsType <em>Aero Case Coefficients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroCaseCoefficientsType
	 * @generated
	 */
	public Adapter createAeroCaseCoefficientsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroCaseSpecificationType <em>Aero Case Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroCaseSpecificationType
	 * @generated
	 */
	public Adapter createAeroCaseSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroCasesType <em>Aero Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroCasesType
	 * @generated
	 */
	public Adapter createAeroCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroCaseType <em>Aero Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroCaseType
	 * @generated
	 */
	public Adapter createAeroCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroDataComponentsType <em>Aero Data Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroDataComponentsType
	 * @generated
	 */
	public Adapter createAeroDataComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroDataComponentType <em>Aero Data Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroDataComponentType
	 * @generated
	 */
	public Adapter createAeroDataComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroDataVehicleType <em>Aero Data Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroDataVehicleType
	 * @generated
	 */
	public Adapter createAeroDataVehicleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroelasticDivergenceType <em>Aeroelastic Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroelasticDivergenceType
	 * @generated
	 */
	public Adapter createAeroelasticDivergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroelasticStaticMaxDisplacementType <em>Aeroelastic Static Max Displacement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroelasticStaticMaxDisplacementType
	 * @generated
	 */
	public Adapter createAeroelasticStaticMaxDisplacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroelasticsType <em>Aeroelastics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroelasticsType
	 * @generated
	 */
	public Adapter createAeroelasticsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroLimitsIncrementMapsType <em>Aero Limits Increment Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroLimitsIncrementMapsType
	 * @generated
	 */
	public Adapter createAeroLimitsIncrementMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroLimitsIncrementMapType <em>Aero Limits Increment Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroLimitsIncrementMapType
	 * @generated
	 */
	public Adapter createAeroLimitsIncrementMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroLimitsMapType <em>Aero Limits Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroLimitsMapType
	 * @generated
	 */
	public Adapter createAeroLimitsMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroMapOperationLimitType <em>Aero Map Operation Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroMapOperationLimitType
	 * @generated
	 */
	public Adapter createAeroMapOperationLimitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroMapType <em>Aero Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroMapType
	 * @generated
	 */
	public Adapter createAeroMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceBoundaryConditionsType <em>Aero Performance Boundary Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceBoundaryConditionsType
	 * @generated
	 */
	public Adapter createAeroPerformanceBoundaryConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceIncrementMapsType <em>Aero Performance Increment Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceIncrementMapsType
	 * @generated
	 */
	public Adapter createAeroPerformanceIncrementMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceIncrementMapType <em>Aero Performance Increment Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceIncrementMapType
	 * @generated
	 */
	public Adapter createAeroPerformanceIncrementMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceMapRCType <em>Aero Performance Map RC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceMapRCType
	 * @generated
	 */
	public Adapter createAeroPerformanceMapRCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceMapsRCType <em>Aero Performance Maps RC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceMapsRCType
	 * @generated
	 */
	public Adapter createAeroPerformanceMapsRCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceMapType <em>Aero Performance Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceMapType
	 * @generated
	 */
	public Adapter createAeroPerformanceMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceRCType <em>Aero Performance RC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceRCType
	 * @generated
	 */
	public Adapter createAeroPerformanceRCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AeroPerformanceType <em>Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AeroPerformanceType
	 * @generated
	 */
	public Adapter createAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftAnalysesGlobalType <em>Aircraft Analyses Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftAnalysesGlobalType
	 * @generated
	 */
	public Adapter createAircraftAnalysesGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftAnalysesType <em>Aircraft Analyses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftAnalysesType
	 * @generated
	 */
	public Adapter createAircraftAnalysesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftControlElementsType <em>Aircraft Control Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftControlElementsType
	 * @generated
	 */
	public Adapter createAircraftControlElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftControlElementType <em>Aircraft Control Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftControlElementType
	 * @generated
	 */
	public Adapter createAircraftControlElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftGlobalType <em>Aircraft Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftGlobalType
	 * @generated
	 */
	public Adapter createAircraftGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftModelType <em>Aircraft Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftModelType
	 * @generated
	 */
	public Adapter createAircraftModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AircraftType
	 * @generated
	 */
	public Adapter createAircraftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirfoilAeroPerformanceType <em>Airfoil Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirfoilAeroPerformanceType
	 * @generated
	 */
	public Adapter createAirfoilAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirfoilsAeroPerformanceType <em>Airfoils Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirfoilsAeroPerformanceType
	 * @generated
	 */
	public Adapter createAirfoilsAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirframeMaintenanceCostType <em>Airframe Maintenance Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirframeMaintenanceCostType
	 * @generated
	 */
	public Adapter createAirframeMaintenanceCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirlinesType <em>Airlines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirlinesType
	 * @generated
	 */
	public Adapter createAirlinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirlineType <em>Airline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirlineType
	 * @generated
	 */
	public Adapter createAirlineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirportCompatabilityGlobalType <em>Airport Compatability Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirportCompatabilityGlobalType
	 * @generated
	 */
	public Adapter createAirportCompatabilityGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirportsType <em>Airports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirportsType
	 * @generated
	 */
	public Adapter createAirportsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AirportType <em>Airport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AirportType
	 * @generated
	 */
	public Adapter createAirportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AlignmentCrossBeamType <em>Alignment Cross Beam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AlignmentCrossBeamType
	 * @generated
	 */
	public Adapter createAlignmentCrossBeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AlignmentFloorPanelType <em>Alignment Floor Panel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AlignmentFloorPanelType
	 * @generated
	 */
	public Adapter createAlignmentFloorPanelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AlignmentStringFrameType <em>Alignment String Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AlignmentStringFrameType
	 * @generated
	 */
	public Adapter createAlignmentStringFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AlignmentStructMemberType <em>Alignment Struct Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AlignmentStructMemberType
	 * @generated
	 */
	public Adapter createAlignmentStructMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AltitudeType <em>Altitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AltitudeType
	 * @generated
	 */
	public Adapter createAltitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AnisotropicShellPropertiesType <em>Anisotropic Shell Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AnisotropicShellPropertiesType
	 * @generated
	 */
	public Adapter createAnisotropicShellPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AnisotropicSolidPropertiesType <em>Anisotropic Solid Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AnisotropicSolidPropertiesType
	 * @generated
	 */
	public Adapter createAnisotropicSolidPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AtmosphericModelOldType <em>Atmospheric Model Old Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AtmosphericModelOldType
	 * @generated
	 */
	public Adapter createAtmosphericModelOldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AtmosphericModelType <em>Atmospheric Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AtmosphericModelType
	 * @generated
	 */
	public Adapter createAtmosphericModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AtmosphericModelType1 <em>Atmospheric Model Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AtmosphericModelType1
	 * @generated
	 */
	public Adapter createAtmosphericModelType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AttachmentPinsType <em>Attachment Pins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AttachmentPinsType
	 * @generated
	 */
	public Adapter createAttachmentPinsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AttachmentPinType <em>Attachment Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AttachmentPinType
	 * @generated
	 */
	public Adapter createAttachmentPinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AxleAssembliesType <em>Axle Assemblies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AxleAssembliesType
	 * @generated
	 */
	public Adapter createAxleAssembliesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AxleAssemblyType <em>Axle Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AxleAssemblyType
	 * @generated
	 */
	public Adapter createAxleAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.AxleType <em>Axle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.AxleType
	 * @generated
	 */
	public Adapter createAxleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BeamCrossSectionType <em>Beam Cross Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BeamCrossSectionType
	 * @generated
	 */
	public Adapter createBeamCrossSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BeamStiffnessType <em>Beam Stiffness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BeamStiffnessType
	 * @generated
	 */
	public Adapter createBeamStiffnessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BlockedDOFType <em>Blocked DOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BlockedDOFType
	 * @generated
	 */
	public Adapter createBlockedDOFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BogieType <em>Bogie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BogieType
	 * @generated
	 */
	public Adapter createBogieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BooleanBaseType <em>Boolean Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BooleanBaseType
	 * @generated
	 */
	public Adapter createBooleanBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BoundingBoxType <em>Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BoundingBoxType
	 * @generated
	 */
	public Adapter createBoundingBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.BoundingElementUIDsType <em>Bounding Element UI Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.BoundingElementUIDsType
	 * @generated
	 */
	public Adapter createBoundingElementUIDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinAislesType <em>Cabin Aisles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinAislesType
	 * @generated
	 */
	public Adapter createCabinAislesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinAisleType <em>Cabin Aisle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinAisleType
	 * @generated
	 */
	public Adapter createCabinAisleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinGeometryContoursType <em>Cabin Geometry Contours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinGeometryContoursType
	 * @generated
	 */
	public Adapter createCabinGeometryContoursTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinGeometryContourType <em>Cabin Geometry Contour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinGeometryContourType
	 * @generated
	 */
	public Adapter createCabinGeometryContourTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinGeometryType <em>Cabin Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinGeometryType
	 * @generated
	 */
	public Adapter createCabinGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinSpacesType <em>Cabin Spaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinSpacesType
	 * @generated
	 */
	public Adapter createCabinSpacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CabinSpaceType <em>Cabin Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CabinSpaceType
	 * @generated
	 */
	public Adapter createCabinSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CalibratedAirSpeedType <em>Calibrated Air Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CalibratedAirSpeedType
	 * @generated
	 */
	public Adapter createCalibratedAirSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CapType <em>Cap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CapType
	 * @generated
	 */
	public Adapter createCapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoContainerElementsType <em>Cargo Container Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoContainerElementsType
	 * @generated
	 */
	public Adapter createCargoContainerElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoContainerElementType <em>Cargo Container Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoContainerElementType
	 * @generated
	 */
	public Adapter createCargoContainerElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoContainersType <em>Cargo Containers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoContainersType
	 * @generated
	 */
	public Adapter createCargoContainersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoContainerType <em>Cargo Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoContainerType
	 * @generated
	 */
	public Adapter createCargoContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoCrossBeamsAssemblyType <em>Cargo Cross Beams Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoCrossBeamsAssemblyType
	 * @generated
	 */
	public Adapter createCargoCrossBeamsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoCrossBeamStrutsAssemblyType <em>Cargo Cross Beam Struts Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoCrossBeamStrutsAssemblyType
	 * @generated
	 */
	public Adapter createCargoCrossBeamStrutsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CargoDoorsAssemblyType <em>Cargo Doors Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CargoDoorsAssemblyType
	 * @generated
	 */
	public Adapter createCargoDoorsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CeilingPanelElementsType <em>Ceiling Panel Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CeilingPanelElementsType
	 * @generated
	 */
	public Adapter createCeilingPanelElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CeilingPanelsType <em>Ceiling Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CeilingPanelsType
	 * @generated
	 */
	public Adapter createCeilingPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CellPositioningChordwiseType <em>Cell Positioning Chordwise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CellPositioningChordwiseType
	 * @generated
	 */
	public Adapter createCellPositioningChordwiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CellPositioningSpanwiseType <em>Cell Positioning Spanwise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CellPositioningSpanwiseType
	 * @generated
	 */
	public Adapter createCellPositioningSpanwiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageAreasAssemblyType <em>Center Fuselage Areas Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageAreasAssemblyType
	 * @generated
	 */
	public Adapter createCenterFuselageAreasAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageAreaType <em>Center Fuselage Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageAreaType
	 * @generated
	 */
	public Adapter createCenterFuselageAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageHighWingConfigurationType <em>Center Fuselage High Wing Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageHighWingConfigurationType
	 * @generated
	 */
	public Adapter createCenterFuselageHighWingConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageKeelbeamType <em>Center Fuselage Keelbeam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageKeelbeamType
	 * @generated
	 */
	public Adapter createCenterFuselageKeelbeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageLateralPanelsType <em>Center Fuselage Lateral Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageLateralPanelsType
	 * @generated
	 */
	public Adapter createCenterFuselageLateralPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageLongFloorBeamsConnectionType <em>Center Fuselage Long Floor Beams Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageLongFloorBeamsConnectionType
	 * @generated
	 */
	public Adapter createCenterFuselageLongFloorBeamsConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageLowWingConfigurationType <em>Center Fuselage Low Wing Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageLowWingConfigurationType
	 * @generated
	 */
	public Adapter createCenterFuselageLowWingConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageMainFramesType <em>Center Fuselage Main Frames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageMainFramesType
	 * @generated
	 */
	public Adapter createCenterFuselageMainFramesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselagePressureFloorType <em>Center Fuselage Pressure Floor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselagePressureFloorType
	 * @generated
	 */
	public Adapter createCenterFuselagePressureFloorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CenterFuselageSideboxType <em>Center Fuselage Sidebox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CenterFuselageSideboxType
	 * @generated
	 */
	public Adapter createCenterFuselageSideboxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CertificationCasesType <em>Certification Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CertificationCasesType
	 * @generated
	 */
	public Adapter createCertificationCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ChangeLogType <em>Change Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ChangeLogType
	 * @generated
	 */
	public Adapter createChangeLogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ChargesCostType <em>Charges Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ChargesCostType
	 * @generated
	 */
	public Adapter createChargesCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ChordwisePartsType <em>Chordwise Parts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ChordwisePartsType
	 * @generated
	 */
	public Adapter createChordwisePartsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ChordwisePartType <em>Chordwise Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ChordwisePartType
	 * @generated
	 */
	public Adapter createChordwisePartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ClassDividerElementsType <em>Class Divider Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ClassDividerElementsType
	 * @generated
	 */
	public Adapter createClassDividerElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ClassDividersType <em>Class Dividers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ClassDividersType
	 * @generated
	 */
	public Adapter createClassDividersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CockpitControlsType <em>Cockpit Controls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CockpitControlsType
	 * @generated
	 */
	public Adapter createCockpitControlsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CockpitControlType <em>Cockpit Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CockpitControlType
	 * @generated
	 */
	public Adapter createCockpitControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientReferenceType <em>Coefficient Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientReferenceType
	 * @generated
	 */
	public Adapter createCoefficientReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownComponentsType <em>Coefficients Breakdown Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownComponentsType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownComponentType <em>Coefficients Breakdown Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownComponentType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownSegmentType <em>Coefficients Breakdown Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownSegmentType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownStripsType <em>Coefficients Breakdown Strips Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownStripsType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownStripsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownStripType <em>Coefficients Breakdown Strip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownStripType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownStripTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownType <em>Coefficients Breakdown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownWingSegmentsType <em>Coefficients Breakdown Wing Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownWingSegmentsType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownWingSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownWingsType <em>Coefficients Breakdown Wings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownWingsType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownWingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CoefficientsBreakdownWingType <em>Coefficients Breakdown Wing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CoefficientsBreakdownWingType
	 * @generated
	 */
	public Adapter createCoefficientsBreakdownWingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CommandCaseCommandType <em>Command Case Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CommandCaseCommandType
	 * @generated
	 */
	public Adapter createCommandCaseCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CommandCasesType <em>Command Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CommandCasesType
	 * @generated
	 */
	public Adapter createCommandCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CommandCaseType <em>Command Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CommandCaseType
	 * @generated
	 */
	public Adapter createCommandCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompartmentGeometryType <em>Compartment Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompartmentGeometryType
	 * @generated
	 */
	public Adapter createCompartmentGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompartmentsType <em>Compartments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompartmentsType
	 * @generated
	 */
	public Adapter createCompartmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompartmentType
	 * @generated
	 */
	public Adapter createCompartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComplexBaseType <em>Complex Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComplexBaseType
	 * @generated
	 */
	public Adapter createComplexBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentCostType <em>Component Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentCostType
	 * @generated
	 */
	public Adapter createComponentCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentSegmentPathType <em>Component Segment Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentSegmentPathType
	 * @generated
	 */
	public Adapter createComponentSegmentPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentSegmentStepsType <em>Component Segment Steps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentSegmentStepsType
	 * @generated
	 */
	public Adapter createComponentSegmentStepsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentSegmentStepType <em>Component Segment Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentSegmentStepType
	 * @generated
	 */
	public Adapter createComponentSegmentStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentSegmentsType <em>Component Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentSegmentsType
	 * @generated
	 */
	public Adapter createComponentSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ComponentSegmentType <em>Component Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ComponentSegmentType
	 * @generated
	 */
	public Adapter createComponentSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompositeLayerType <em>Composite Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompositeLayerType
	 * @generated
	 */
	public Adapter createCompositeLayerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompositesType <em>Composites Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompositesType
	 * @generated
	 */
	public Adapter createCompositesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CompositeType
	 * @generated
	 */
	public Adapter createCompositeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ConfigurationType
	 * @generated
	 */
	public Adapter createConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ConnectivitiesType <em>Connectivities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ConnectivitiesType
	 * @generated
	 */
	public Adapter createConnectivitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ConnectivityType <em>Connectivity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ConnectivityType
	 * @generated
	 */
	public Adapter createConnectivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ConstraintSettingsType <em>Constraint Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ConstraintSettingsType
	 * @generated
	 */
	public Adapter createConstraintSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityAtP1Type <em>Continuity At P1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityAtP1Type
	 * @generated
	 */
	public Adapter createContinuityAtP1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityAtP2Type <em>Continuity At P2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityAtP2Type
	 * @generated
	 */
	public Adapter createContinuityAtP2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityType <em>Continuity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityType
	 * @generated
	 */
	public Adapter createContinuityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityType1 <em>Continuity Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityType1
	 * @generated
	 */
	public Adapter createContinuityType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityType2 <em>Continuity Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityType2
	 * @generated
	 */
	public Adapter createContinuityType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityType3 <em>Continuity Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityType3
	 * @generated
	 */
	public Adapter createContinuityType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContinuityType4 <em>Continuity Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContinuityType4
	 * @generated
	 */
	public Adapter createContinuityType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContourReferenceType <em>Contour Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContourReferenceType
	 * @generated
	 */
	public Adapter createContourReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ContourType <em>Contour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ContourType
	 * @generated
	 */
	public Adapter createContourTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlDistributorsType <em>Control Distributors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlDistributorsType
	 * @generated
	 */
	public Adapter createControlDistributorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlDistributorType <em>Control Distributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlDistributorType
	 * @generated
	 */
	public Adapter createControlDistributorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlElementsType <em>Control Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlElementsType
	 * @generated
	 */
	public Adapter createControlElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlElementType <em>Control Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlElementType
	 * @generated
	 */
	public Adapter createControlElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlFunctionsType <em>Control Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlFunctionsType
	 * @generated
	 */
	public Adapter createControlFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlFunctionType <em>Control Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlFunctionType
	 * @generated
	 */
	public Adapter createControlFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControllabilityReqsType <em>Controllability Reqs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControllabilityReqsType
	 * @generated
	 */
	public Adapter createControllabilityReqsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControllabilityRequirementType <em>Controllability Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControllabilityRequirementType
	 * @generated
	 */
	public Adapter createControllabilityRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlLawModesType <em>Control Law Modes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlLawModesType
	 * @generated
	 */
	public Adapter createControlLawModesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlLawModeType <em>Control Law Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlLawModeType
	 * @generated
	 */
	public Adapter createControlLawModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlLawsType <em>Control Laws Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlLawsType
	 * @generated
	 */
	public Adapter createControlLawsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceActuatorsType <em>Control Surface Actuators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceActuatorsType
	 * @generated
	 */
	public Adapter createControlSurfaceActuatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceActuatorType <em>Control Surface Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceActuatorType
	 * @generated
	 */
	public Adapter createControlSurfaceActuatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceAirfoilType <em>Control Surface Airfoil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceAirfoilType
	 * @generated
	 */
	public Adapter createControlSurfaceAirfoilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType <em>Control Surface Border Leading Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceBorderLeadingEdgeType
	 * @generated
	 */
	public Adapter createControlSurfaceBorderLeadingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceBorderSpoilerType <em>Control Surface Border Spoiler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceBorderSpoilerType
	 * @generated
	 */
	public Adapter createControlSurfaceBorderSpoilerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType <em>Control Surface Border Trailing Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceBorderTrailingEdgeType
	 * @generated
	 */
	public Adapter createControlSurfaceBorderTrailingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceContoursType <em>Control Surface Contours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceContoursType
	 * @generated
	 */
	public Adapter createControlSurfaceContoursTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceDeflectionVectorsType <em>Control Surface Deflection Vectors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceDeflectionVectorsType
	 * @generated
	 */
	public Adapter createControlSurfaceDeflectionVectorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceDeflectionVectorType <em>Control Surface Deflection Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceDeflectionVectorType
	 * @generated
	 */
	public Adapter createControlSurfaceDeflectionVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceHingeMomentMapsType <em>Control Surface Hinge Moment Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceHingeMomentMapsType
	 * @generated
	 */
	public Adapter createControlSurfaceHingeMomentMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceHingeMomentMapType <em>Control Surface Hinge Moment Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceHingeMomentMapType
	 * @generated
	 */
	public Adapter createControlSurfaceHingeMomentMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceHingePointType <em>Control Surface Hinge Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceHingePointType
	 * @generated
	 */
	public Adapter createControlSurfaceHingePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType <em>Control Surface Outer Shape Leading Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceOuterShapeLeadingEdgeType
	 * @generated
	 */
	public Adapter createControlSurfaceOuterShapeLeadingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceOuterShapeSpoilerType <em>Control Surface Outer Shape Spoiler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceOuterShapeSpoilerType
	 * @generated
	 */
	public Adapter createControlSurfaceOuterShapeSpoilerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceOuterShapeTrailingEdgeType <em>Control Surface Outer Shape Trailing Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceOuterShapeTrailingEdgeType
	 * @generated
	 */
	public Adapter createControlSurfaceOuterShapeTrailingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfacePathType <em>Control Surface Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfacePathType
	 * @generated
	 */
	public Adapter createControlSurfacePathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfacePerformanceMapOldType <em>Control Surface Performance Map Old Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfacePerformanceMapOldType
	 * @generated
	 */
	public Adapter createControlSurfacePerformanceMapOldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfacePerformanceMapsOldType <em>Control Surface Performance Maps Old Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfacePerformanceMapsOldType
	 * @generated
	 */
	public Adapter createControlSurfacePerformanceMapsOldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceSkinCutOutBorderType <em>Control Surface Skin Cut Out Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceSkinCutOutBorderType
	 * @generated
	 */
	public Adapter createControlSurfaceSkinCutOutBorderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceSkinCutOutType <em>Control Surface Skin Cut Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceSkinCutOutType
	 * @generated
	 */
	public Adapter createControlSurfaceSkinCutOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceStepsType <em>Control Surface Steps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceStepsType
	 * @generated
	 */
	public Adapter createControlSurfaceStepsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceStepType <em>Control Surface Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceStepType
	 * @generated
	 */
	public Adapter createControlSurfaceStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfacesType <em>Control Surfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfacesType
	 * @generated
	 */
	public Adapter createControlSurfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceTracksType <em>Control Surface Tracks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceTracksType
	 * @generated
	 */
	public Adapter createControlSurfaceTracksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceTrackTypeType <em>Control Surface Track Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceTrackTypeType
	 * @generated
	 */
	public Adapter createControlSurfaceTrackTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ControlSurfaceWingCutOutType <em>Control Surface Wing Cut Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ControlSurfaceWingCutOutType
	 * @generated
	 */
	public Adapter createControlSurfaceWingCutOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CornerRadiusType <em>Corner Radius Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CornerRadiusType
	 * @generated
	 */
	public Adapter createCornerRadiusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostAirConditioningSystemsType <em>Cost Air Conditioning Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostAirConditioningSystemsType
	 * @generated
	 */
	public Adapter createCostAirConditioningSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostAutomaticFlightSystemsType <em>Cost Automatic Flight Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostAutomaticFlightSystemsType
	 * @generated
	 */
	public Adapter createCostAutomaticFlightSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostAuxilaryPowerUnitsType <em>Cost Auxilary Power Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostAuxilaryPowerUnitsType
	 * @generated
	 */
	public Adapter createCostAuxilaryPowerUnitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostBleedAirSystemsType <em>Cost Bleed Air Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostBleedAirSystemsType
	 * @generated
	 */
	public Adapter createCostBleedAirSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostCommunicationSystemsType <em>Cost Communication Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostCommunicationSystemsType
	 * @generated
	 */
	public Adapter createCostCommunicationSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostComponentsType <em>Cost Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostComponentsType
	 * @generated
	 */
	public Adapter createCostComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostDeIcingSystemsType <em>Cost De Icing Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostDeIcingSystemsType
	 * @generated
	 */
	public Adapter createCostDeIcingSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostElectricalSystemsType <em>Cost Electrical Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostElectricalSystemsType
	 * @generated
	 */
	public Adapter createCostElectricalSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostEnginePylonsType <em>Cost Engine Pylons Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostEnginePylonsType
	 * @generated
	 */
	public Adapter createCostEnginePylonsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostEquippedEnginesType <em>Cost Equipped Engines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostEquippedEnginesType
	 * @generated
	 */
	public Adapter createCostEquippedEnginesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFireProtectionSystemsType <em>Cost Fire Protection Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFireProtectionSystemsType
	 * @generated
	 */
	public Adapter createCostFireProtectionSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFixedEmergencyOxygenSystemsType <em>Cost Fixed Emergency Oxygen Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFixedEmergencyOxygenSystemsType
	 * @generated
	 */
	public Adapter createCostFixedEmergencyOxygenSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFlightControlSystemsType <em>Cost Flight Control Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFlightControlSystemsType
	 * @generated
	 */
	public Adapter createCostFlightControlSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFuelSystemsType <em>Cost Fuel Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFuelSystemsType
	 * @generated
	 */
	public Adapter createCostFuelSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFurnishingElementsType <em>Cost Furnishing Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFurnishingElementsType
	 * @generated
	 */
	public Adapter createCostFurnishingElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFurnishingsType <em>Cost Furnishings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFurnishingsType
	 * @generated
	 */
	public Adapter createCostFurnishingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostFuselagesType <em>Cost Fuselages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostFuselagesType
	 * @generated
	 */
	public Adapter createCostFuselagesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostHydraulicSystemsType <em>Cost Hydraulic Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostHydraulicSystemsType
	 * @generated
	 */
	public Adapter createCostHydraulicSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostInstrumentSystemsType <em>Cost Instrument Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostInstrumentSystemsType
	 * @generated
	 */
	public Adapter createCostInstrumentSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostLandingGearType <em>Cost Landing Gear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostLandingGearType
	 * @generated
	 */
	public Adapter createCostLandingGearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostLightingSystemsType <em>Cost Lighting Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostLightingSystemsType
	 * @generated
	 */
	public Adapter createCostLightingSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostNacellesType <em>Cost Nacelles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostNacellesType
	 * @generated
	 */
	public Adapter createCostNacellesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostNavigationSystemsType <em>Cost Navigation Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostNavigationSystemsType
	 * @generated
	 */
	public Adapter createCostNavigationSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostPowerUnitsType <em>Cost Power Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostPowerUnitsType
	 * @generated
	 */
	public Adapter createCostPowerUnitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostSystemsType <em>Cost Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostSystemsType
	 * @generated
	 */
	public Adapter createCostSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostWaterInstallationSystemsType <em>Cost Water Installation Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostWaterInstallationSystemsType
	 * @generated
	 */
	public Adapter createCostWaterInstallationSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CostWingsType <em>Cost Wings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CostWingsType
	 * @generated
	 */
	public Adapter createCostWingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CpacsType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CpacsType
	 * @generated
	 */
	public Adapter createCpacsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CrashLoadCasesType <em>Crash Load Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CrashLoadCasesType
	 * @generated
	 */
	public Adapter createCrashLoadCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CrashLoadcaseType <em>Crash Loadcase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CrashLoadcaseType
	 * @generated
	 */
	public Adapter createCrashLoadcaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CrewCostType <em>Crew Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CrewCostType
	 * @generated
	 */
	public Adapter createCrewCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CrossBeamAssemblyPositionType <em>Cross Beam Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CrossBeamAssemblyPositionType
	 * @generated
	 */
	public Adapter createCrossBeamAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CrossBeamStrutAssemblyPositionType <em>Cross Beam Strut Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CrossBeamStrutAssemblyPositionType
	 * @generated
	 */
	public Adapter createCrossBeamStrutAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CruiseRollersType <em>Cruise Rollers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CruiseRollersType
	 * @generated
	 */
	public Adapter createCruiseRollersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CruiseRollerType <em>Cruise Roller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CruiseRollerType
	 * @generated
	 */
	public Adapter createCruiseRollerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.Cst2DType <em>Cst2 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.Cst2DType
	 * @generated
	 */
	public Adapter createCst2DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CurveParamPointMapType <em>Curve Param Point Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CurveParamPointMapType
	 * @generated
	 */
	public Adapter createCurveParamPointMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CurvePointListXYZType <em>Curve Point List XYZ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CurvePointListXYZType
	 * @generated
	 */
	public Adapter createCurvePointListXYZTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CurvePointType <em>Curve Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CurvePointType
	 * @generated
	 */
	public Adapter createCurvePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CurveProfilesType <em>Curve Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CurveProfilesType
	 * @generated
	 */
	public Adapter createCurveProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutLoadPointsType <em>Cut Load Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutLoadPointsType
	 * @generated
	 */
	public Adapter createCutLoadPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutOutControlPointsType <em>Cut Out Control Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutOutControlPointsType
	 * @generated
	 */
	public Adapter createCutOutControlPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutOutControlPointType <em>Cut Out Control Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutOutControlPointType
	 * @generated
	 */
	public Adapter createCutOutControlPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutOutProfilesType <em>Cut Out Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutOutProfilesType
	 * @generated
	 */
	public Adapter createCutOutProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutOutProfileType <em>Cut Out Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutOutProfileType
	 * @generated
	 */
	public Adapter createCutOutProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutOutType <em>Cut Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutOutType
	 * @generated
	 */
	public Adapter createCutOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.CutoutTypeType <em>Cutout Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.CutoutTypeType
	 * @generated
	 */
	public Adapter createCutoutTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DampingDerivativesRatesArrayType <em>Damping Derivatives Rates Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DampingDerivativesRatesArrayType
	 * @generated
	 */
	public Adapter createDampingDerivativesRatesArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DampingDerivativesRatesType <em>Damping Derivatives Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DampingDerivativesRatesType
	 * @generated
	 */
	public Adapter createDampingDerivativesRatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DampingDerivativesType <em>Damping Derivatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DampingDerivativesType
	 * @generated
	 */
	public Adapter createDampingDerivativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DamTolBehaviourType <em>Dam Tol Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DamTolBehaviourType
	 * @generated
	 */
	public Adapter createDamTolBehaviourTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DamTolFormanType <em>Dam Tol Forman Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DamTolFormanType
	 * @generated
	 */
	public Adapter createDamTolFormanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DamTolWalkerType <em>Dam Tol Walker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DamTolWalkerType
	 * @generated
	 */
	public Adapter createDamTolWalkerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DateBaseType <em>Date Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DateBaseType
	 * @generated
	 */
	public Adapter createDateBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DateTimeBaseType <em>Date Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DateTimeBaseType
	 * @generated
	 */
	public Adapter createDateTimeBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckComponent2DBaseType <em>Deck Component2 DBase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckComponent2DBaseType
	 * @generated
	 */
	public Adapter createDeckComponent2DBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckComponentBaseType <em>Deck Component Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckComponentBaseType
	 * @generated
	 */
	public Adapter createDeckComponentBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckDoorsType <em>Deck Doors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckDoorsType
	 * @generated
	 */
	public Adapter createDeckDoorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckDoorType <em>Deck Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckDoorType
	 * @generated
	 */
	public Adapter createDeckDoorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckElementBaseType <em>Deck Element Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckElementBaseType
	 * @generated
	 */
	public Adapter createDeckElementBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckElementGeometryType <em>Deck Element Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckElementGeometryType
	 * @generated
	 */
	public Adapter createDeckElementGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckElementMassType <em>Deck Element Mass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckElementMassType
	 * @generated
	 */
	public Adapter createDeckElementMassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckElementsType <em>Deck Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckElementsType
	 * @generated
	 */
	public Adapter createDeckElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckStructuralMountsType <em>Deck Structural Mounts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckStructuralMountsType
	 * @generated
	 */
	public Adapter createDeckStructuralMountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckStructuralMountType <em>Deck Structural Mount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckStructuralMountType
	 * @generated
	 */
	public Adapter createDeckStructuralMountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DecksType <em>Decks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DecksType
	 * @generated
	 */
	public Adapter createDecksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckType <em>Deck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckType
	 * @generated
	 */
	public Adapter createDeckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeckTypeType <em>Deck Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeckTypeType
	 * @generated
	 */
	public Adapter createDeckTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DeltaTemperatureType <em>Delta Temperature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DeltaTemperatureType
	 * @generated
	 */
	public Adapter createDeltaTemperatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignMassesType <em>Design Masses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignMassesType
	 * @generated
	 */
	public Adapter createDesignMassesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignParametersType <em>Design Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignParametersType
	 * @generated
	 */
	public Adapter createDesignParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignParameterType <em>Design Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignParameterType
	 * @generated
	 */
	public Adapter createDesignParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignSpaceType <em>Design Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignSpaceType
	 * @generated
	 */
	public Adapter createDesignSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignStudiesType <em>Design Studies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignStudiesType
	 * @generated
	 */
	public Adapter createDesignStudiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DesignVolumeType <em>Design Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DesignVolumeType
	 * @generated
	 */
	public Adapter createDesignVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DirectOperatingCostType <em>Direct Operating Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DirectOperatingCostType
	 * @generated
	 */
	public Adapter createDirectOperatingCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DivergenceCasesType <em>Divergence Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DivergenceCasesType
	 * @generated
	 */
	public Adapter createDivergenceCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DivergenceCaseType <em>Divergence Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DivergenceCaseType
	 * @generated
	 */
	public Adapter createDivergenceCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorAssemblyPositionType <em>Door Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorAssemblyPositionType
	 * @generated
	 */
	public Adapter createDoorAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorCutOutType <em>Door Cut Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorCutOutType
	 * @generated
	 */
	public Adapter createDoorCutOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorOpeningLegacyType <em>Door Opening Legacy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorOpeningLegacyType
	 * @generated
	 */
	public Adapter createDoorOpeningLegacyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorOpeningType <em>Door Opening Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorOpeningType
	 * @generated
	 */
	public Adapter createDoorOpeningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorsType <em>Doors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorsType
	 * @generated
	 */
	public Adapter createDoorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorSurroundStructurePositionType <em>Door Surround Structure Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorSurroundStructurePositionType
	 * @generated
	 */
	public Adapter createDoorSurroundStructurePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorSurroundStructuresAssemblyType <em>Door Surround Structures Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorSurroundStructuresAssemblyType
	 * @generated
	 */
	public Adapter createDoorSurroundStructuresAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorTypeType <em>Door Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorTypeType
	 * @generated
	 */
	public Adapter createDoorTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoorTypeType1 <em>Door Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoorTypeType1
	 * @generated
	 */
	public Adapter createDoorTypeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoubleArrayBaseType <em>Double Array Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoubleArrayBaseType
	 * @generated
	 */
	public Adapter createDoubleArrayBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoubleBaseType <em>Double Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoubleBaseType
	 * @generated
	 */
	public Adapter createDoubleBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoubleConstraintBaseType <em>Double Constraint Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoubleConstraintBaseType
	 * @generated
	 */
	public Adapter createDoubleConstraintBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoubleVectorBaseType <em>Double Vector Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoubleVectorBaseType
	 * @generated
	 */
	public Adapter createDoubleVectorBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DoubleVectorConstraintBaseType <em>Double Vector Constraint Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DoubleVectorConstraintBaseType
	 * @generated
	 */
	public Adapter createDoubleVectorConstraintBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DragContributionsType <em>Drag Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DragContributionsType
	 * @generated
	 */
	public Adapter createDragContributionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DriveSystemsType <em>Drive Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DriveSystemsType
	 * @generated
	 */
	public Adapter createDriveSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DriveSystemType <em>Drive System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DriveSystemType
	 * @generated
	 */
	public Adapter createDriveSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DurationType <em>Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DurationType
	 * @generated
	 */
	public Adapter createDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.DynamicAircraftModelAnalysisType <em>Dynamic Aircraft Model Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.DynamicAircraftModelAnalysisType
	 * @generated
	 */
	public Adapter createDynamicAircraftModelAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EmissivityMapType <em>Emissivity Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EmissivityMapType
	 * @generated
	 */
	public Adapter createEmissivityMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EndTimeUTCType <em>End Time UTC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EndTimeUTCType
	 * @generated
	 */
	public Adapter createEndTimeUTCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineAnalysisType <em>Engine Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineAnalysisType
	 * @generated
	 */
	public Adapter createEngineAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineConceptType <em>Engine Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineConceptType
	 * @generated
	 */
	public Adapter createEngineConceptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineFanType <em>Engine Fan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineFanType
	 * @generated
	 */
	public Adapter createEngineFanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineGeometryType <em>Engine Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineGeometryType
	 * @generated
	 */
	public Adapter createEngineGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineGlobalType <em>Engine Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineGlobalType
	 * @generated
	 */
	public Adapter createEngineGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineMountsType <em>Engine Mounts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineMountsType
	 * @generated
	 */
	public Adapter createEngineMountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineMountType <em>Engine Mount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineMountType
	 * @generated
	 */
	public Adapter createEngineMountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineNacelleType <em>Engine Nacelle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineNacelleType
	 * @generated
	 */
	public Adapter createEngineNacelleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePerformanceMapsType <em>Engine Performance Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePerformanceMapsType
	 * @generated
	 */
	public Adapter createEnginePerformanceMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePerformanceMapType <em>Engine Performance Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePerformanceMapType
	 * @generated
	 */
	public Adapter createEnginePerformanceMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePositionsType <em>Engine Positions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePositionsType
	 * @generated
	 */
	public Adapter createEnginePositionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePositionType <em>Engine Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePositionType
	 * @generated
	 */
	public Adapter createEnginePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePylonsType <em>Engine Pylons Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePylonsType
	 * @generated
	 */
	public Adapter createEnginePylonsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginePylonType <em>Engine Pylon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginePylonType
	 * @generated
	 */
	public Adapter createEnginePylonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineSpinnerType <em>Engine Spinner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineSpinnerType
	 * @generated
	 */
	public Adapter createEngineSpinnerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnginesType <em>Engines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnginesType
	 * @generated
	 */
	public Adapter createEnginesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EngineType <em>Engine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EngineType
	 * @generated
	 */
	public Adapter createEngineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EnvironmentType
	 * @generated
	 */
	public Adapter createEnvironmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EtaIsoLineType <em>Eta Iso Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EtaIsoLineType
	 * @generated
	 */
	public Adapter createEtaIsoLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EtaXsiPointType <em>Eta Xsi Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EtaXsiPointType
	 * @generated
	 */
	public Adapter createEtaXsiPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.EtaXsiRelHeightPointType <em>Eta Xsi Rel Height Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.EtaXsiRelHeightPointType
	 * @generated
	 */
	public Adapter createEtaXsiRelHeightPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FatigueBehaviourType <em>Fatigue Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FatigueBehaviourType
	 * @generated
	 */
	public Adapter createFatigueBehaviourTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FatigueStressBasedBrownMillerType <em>Fatigue Stress Based Brown Miller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FatigueStressBasedBrownMillerType
	 * @generated
	 */
	public Adapter createFatigueStressBasedBrownMillerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FleetType <em>Fleet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FleetType
	 * @generated
	 */
	public Adapter createFleetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightAnalysisType <em>Flight Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightAnalysisType
	 * @generated
	 */
	public Adapter createFlightAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightDynamicsAnalysisType <em>Flight Dynamics Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightDynamicsAnalysisType
	 * @generated
	 */
	public Adapter createFlightDynamicsAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightDynamicsLinearModelType <em>Flight Dynamics Linear Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightDynamicsLinearModelType
	 * @generated
	 */
	public Adapter createFlightDynamicsLinearModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightDynamicsTrimResultType <em>Flight Dynamics Trim Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightDynamicsTrimResultType
	 * @generated
	 */
	public Adapter createFlightDynamicsTrimResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightEnvelopeSpeedType <em>Flight Envelope Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightEnvelopeSpeedType
	 * @generated
	 */
	public Adapter createFlightEnvelopeSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightEnvelopesType <em>Flight Envelopes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightEnvelopesType
	 * @generated
	 */
	public Adapter createFlightEnvelopesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightEnvelopeType <em>Flight Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightEnvelopeType
	 * @generated
	 */
	public Adapter createFlightEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightLoadCasesType <em>Flight Load Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightLoadCasesType
	 * @generated
	 */
	public Adapter createFlightLoadCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightLoadConditionsType <em>Flight Load Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightLoadConditionsType
	 * @generated
	 */
	public Adapter createFlightLoadConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightLoadDataType <em>Flight Load Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightLoadDataType
	 * @generated
	 */
	public Adapter createFlightLoadDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPathAngleType <em>Flight Path Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPathAngleType
	 * @generated
	 */
	public Adapter createFlightPathAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPathType <em>Flight Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPathType
	 * @generated
	 */
	public Adapter createFlightPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceCasesType <em>Flight Performance Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceCasesType
	 * @generated
	 */
	public Adapter createFlightPerformanceCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceCaseType <em>Flight Performance Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceCaseType
	 * @generated
	 */
	public Adapter createFlightPerformanceCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceLandingType <em>Flight Performance Landing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceLandingType
	 * @generated
	 */
	public Adapter createFlightPerformanceLandingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceLevelType <em>Flight Performance Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceLevelType
	 * @generated
	 */
	public Adapter createFlightPerformanceLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceRequirementsType <em>Flight Performance Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceRequirementsType
	 * @generated
	 */
	public Adapter createFlightPerformanceRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceRequirementType <em>Flight Performance Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceRequirementType
	 * @generated
	 */
	public Adapter createFlightPerformanceRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceTakeoffType <em>Flight Performance Takeoff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceTakeoffType
	 * @generated
	 */
	public Adapter createFlightPerformanceTakeoffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPerformanceTurnType <em>Flight Performance Turn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPerformanceTurnType
	 * @generated
	 */
	public Adapter createFlightPerformanceTurnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPointsType <em>Flight Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPointsType
	 * @generated
	 */
	public Adapter createFlightPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightPointType <em>Flight Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightPointType
	 * @generated
	 */
	public Adapter createFlightPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightsType <em>Flights Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightsType
	 * @generated
	 */
	public Adapter createFlightsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightSystemsType <em>Flight Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightSystemsType
	 * @generated
	 */
	public Adapter createFlightSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlightType <em>Flight Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlightType
	 * @generated
	 */
	public Adapter createFlightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FloorPanelsType <em>Floor Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FloorPanelsType
	 * @generated
	 */
	public Adapter createFloorPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FloorPanelType <em>Floor Panel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FloorPanelType
	 * @generated
	 */
	public Adapter createFloorPanelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlyingQualitiesCasesType <em>Flying Qualities Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlyingQualitiesCasesType
	 * @generated
	 */
	public Adapter createFlyingQualitiesCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FlyingQualitiesCaseType <em>Flying Qualities Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FlyingQualitiesCaseType
	 * @generated
	 */
	public Adapter createFlyingQualitiesCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqCharParametersType <em>Fq Char Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqCharParametersType
	 * @generated
	 */
	public Adapter createFqCharParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqEiglatType <em>Fq Eiglat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqEiglatType
	 * @generated
	 */
	public Adapter createFqEiglatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqLateralType <em>Fq Lateral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqLateralType
	 * @generated
	 */
	public Adapter createFqLateralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqLongitudinalType <em>Fq Longitudinal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqLongitudinalType
	 * @generated
	 */
	public Adapter createFqLongitudinalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqPhugoidType <em>Fq Phugoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqPhugoidType
	 * @generated
	 */
	public Adapter createFqPhugoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqRatingsType <em>Fq Ratings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqRatingsType
	 * @generated
	 */
	public Adapter createFqRatingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqRollPerfType <em>Fq Roll Perf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqRollPerfType
	 * @generated
	 */
	public Adapter createFqRollPerfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqRoloscType <em>Fq Rolosc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqRoloscType
	 * @generated
	 */
	public Adapter createFqRoloscTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqShortPeriodType <em>Fq Short Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqShortPeriodType
	 * @generated
	 */
	public Adapter createFqShortPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FqTreffType <em>Fq Treff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FqTreffType
	 * @generated
	 */
	public Adapter createFqTreffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FramesAssemblyType <em>Frames Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FramesAssemblyType
	 * @generated
	 */
	public Adapter createFramesAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FrameType
	 * @generated
	 */
	public Adapter createFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FreePathType <em>Free Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FreePathType
	 * @generated
	 */
	public Adapter createFreePathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelConsumedType <em>Fuel Consumed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelConsumedType
	 * @generated
	 */
	public Adapter createFuelConsumedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelFractionType <em>Fuel Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelFractionType
	 * @generated
	 */
	public Adapter createFuelFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelInTankType <em>Fuel In Tank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelInTankType
	 * @generated
	 */
	public Adapter createFuelInTankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelMassFractionType <em>Fuel Mass Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelMassFractionType
	 * @generated
	 */
	public Adapter createFuelMassFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelPlanningTypeType <em>Fuel Planning Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelPlanningTypeType
	 * @generated
	 */
	public Adapter createFuelPlanningTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelRemainingType <em>Fuel Remaining Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelRemainingType
	 * @generated
	 */
	public Adapter createFuelRemainingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelsType <em>Fuels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelsType
	 * @generated
	 */
	public Adapter createFuelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelTankVolumeType <em>Fuel Tank Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelTankVolumeType
	 * @generated
	 */
	public Adapter createFuelTankVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuelType
	 * @generated
	 */
	public Adapter createFuelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageAeroPerformanceType <em>Fuselage Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageAeroPerformanceType
	 * @generated
	 */
	public Adapter createFuselageAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageCutOutsType <em>Fuselage Cut Outs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageCutOutsType
	 * @generated
	 */
	public Adapter createFuselageCutOutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageCutOutType <em>Fuselage Cut Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageCutOutType
	 * @generated
	 */
	public Adapter createFuselageCutOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageElementsType <em>Fuselage Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageElementsType
	 * @generated
	 */
	public Adapter createFuselageElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageElementType <em>Fuselage Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageElementType
	 * @generated
	 */
	public Adapter createFuselageElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageFuelTanksType <em>Fuselage Fuel Tanks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageFuelTanksType
	 * @generated
	 */
	public Adapter createFuselageFuelTanksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageFuelTankType <em>Fuselage Fuel Tank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageFuelTankType
	 * @generated
	 */
	public Adapter createFuselageFuelTankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageProfilesType <em>Fuselage Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageProfilesType
	 * @generated
	 */
	public Adapter createFuselageProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselagesAeroPerformanceType <em>Fuselages Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselagesAeroPerformanceType
	 * @generated
	 */
	public Adapter createFuselagesAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageSectionsType <em>Fuselage Sections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageSectionsType
	 * @generated
	 */
	public Adapter createFuselageSectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageSectionType <em>Fuselage Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageSectionType
	 * @generated
	 */
	public Adapter createFuselageSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageSegmentsType <em>Fuselage Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageSegmentsType
	 * @generated
	 */
	public Adapter createFuselageSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageSegmentType <em>Fuselage Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageSegmentType
	 * @generated
	 */
	public Adapter createFuselageSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageStructureType <em>Fuselage Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageStructureType
	 * @generated
	 */
	public Adapter createFuselageStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselagesType <em>Fuselages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselagesType
	 * @generated
	 */
	public Adapter createFuselagesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.FuselageType <em>Fuselage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.FuselageType
	 * @generated
	 */
	public Adapter createFuselageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GalleyElementsType <em>Galley Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GalleyElementsType
	 * @generated
	 */
	public Adapter createGalleyElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GalleyElementType <em>Galley Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GalleyElementType
	 * @generated
	 */
	public Adapter createGalleyElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GalleysType <em>Galleys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GalleysType
	 * @generated
	 */
	public Adapter createGalleysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GearDeflectionVectorsType <em>Gear Deflection Vectors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GearDeflectionVectorsType
	 * @generated
	 */
	public Adapter createGearDeflectionVectorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GearDeflectionVectorType <em>Gear Deflection Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GearDeflectionVectorType
	 * @generated
	 */
	public Adapter createGearDeflectionVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GeneralStructuralMemberPositionType <em>General Structural Member Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GeneralStructuralMemberPositionType
	 * @generated
	 */
	public Adapter createGeneralStructuralMemberPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GeneralStructuralMembersAssemblyType <em>General Structural Members Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GeneralStructuralMembersAssemblyType
	 * @generated
	 */
	public Adapter createGeneralStructuralMembersAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GeneralStructuralMemberType <em>General Structural Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GeneralStructuralMemberType
	 * @generated
	 */
	public Adapter createGeneralStructuralMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericCostType <em>Generic Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericCostType
	 * @generated
	 */
	public Adapter createGenericCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericFloorElementsType <em>Generic Floor Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericFloorElementsType
	 * @generated
	 */
	public Adapter createGenericFloorElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericFloorModulesType <em>Generic Floor Modules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericFloorModulesType
	 * @generated
	 */
	public Adapter createGenericFloorModulesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericGeometricComponentType <em>Generic Geometric Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericGeometricComponentType
	 * @generated
	 */
	public Adapter createGenericGeometricComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericGeometryComponentsType <em>Generic Geometry Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericGeometryComponentsType
	 * @generated
	 */
	public Adapter createGenericGeometryComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericGeometryComponentType <em>Generic Geometry Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericGeometryComponentType
	 * @generated
	 */
	public Adapter createGenericGeometryComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericMassType <em>Generic Mass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericMassType
	 * @generated
	 */
	public Adapter createGenericMassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericSystemsType <em>Generic Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericSystemsType
	 * @generated
	 */
	public Adapter createGenericSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GenericSystemType <em>Generic System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GenericSystemType
	 * @generated
	 */
	public Adapter createGenericSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GeographicPointConstraintType <em>Geographic Point Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GeographicPointConstraintType
	 * @generated
	 */
	public Adapter createGeographicPointConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GeographicPointType <em>Geographic Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GeographicPointType
	 * @generated
	 */
	public Adapter createGeographicPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GlobalAeroPerformanceType <em>Global Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GlobalAeroPerformanceType
	 * @generated
	 */
	public Adapter createGlobalAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GlobalBeamPropertiesType <em>Global Beam Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GlobalBeamPropertiesType
	 * @generated
	 */
	public Adapter createGlobalBeamPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GlobalFlightPointType <em>Global Flight Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GlobalFlightPointType
	 * @generated
	 */
	public Adapter createGlobalFlightPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GlobalPerformanceCasesType <em>Global Performance Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GlobalPerformanceCasesType
	 * @generated
	 */
	public Adapter createGlobalPerformanceCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GroundLoadCasesType <em>Ground Load Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GroundLoadCasesType
	 * @generated
	 */
	public Adapter createGroundLoadCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GuideCurveProfileGeometryType <em>Guide Curve Profile Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GuideCurveProfileGeometryType
	 * @generated
	 */
	public Adapter createGuideCurveProfileGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GuideCurveProfilesType <em>Guide Curve Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GuideCurveProfilesType
	 * @generated
	 */
	public Adapter createGuideCurveProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GuideCurvesType <em>Guide Curves Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GuideCurvesType
	 * @generated
	 */
	public Adapter createGuideCurvesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GuideCurveType <em>Guide Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GuideCurveType
	 * @generated
	 */
	public Adapter createGuideCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.GustShapeType <em>Gust Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.GustShapeType
	 * @generated
	 */
	public Adapter createGustShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HeadingType <em>Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HeadingType
	 * @generated
	 */
	public Adapter createHeadingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HingeMomentsMapType <em>Hinge Moments Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HingeMomentsMapType
	 * @generated
	 */
	public Adapter createHingeMomentsMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HtpFwdInterfaceDefType <em>Htp Fwd Interface Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HtpFwdInterfaceDefType
	 * @generated
	 */
	public Adapter createHtpFwdInterfaceDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HtpInterfaceDefType <em>Htp Interface Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HtpInterfaceDefType
	 * @generated
	 */
	public Adapter createHtpInterfaceDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.HtpStructElemDefType <em>Htp Struct Elem Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.HtpStructElemDefType
	 * @generated
	 */
	public Adapter createHtpStructElemDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ImpactSurfaceDefinitionType <em>Impact Surface Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ImpactSurfaceDefinitionType
	 * @generated
	 */
	public Adapter createImpactSurfaceDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.IndirectOperatingCostType <em>Indirect Operating Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.IndirectOperatingCostType
	 * @generated
	 */
	public Adapter createIndirectOperatingCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.IntegerBaseType <em>Integer Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.IntegerBaseType
	 * @generated
	 */
	public Adapter createIntegerBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterConnectionStrutAttachmentType <em>Inter Connection Strut Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterConnectionStrutAttachmentType
	 * @generated
	 */
	public Adapter createInterConnectionStrutAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterconnectionStrutsType <em>Interconnection Struts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterconnectionStrutsType
	 * @generated
	 */
	public Adapter createInterconnectionStrutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterconnectionStrutType <em>Interconnection Strut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterconnectionStrutType
	 * @generated
	 */
	public Adapter createInterconnectionStrutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.IntercostalPositionType <em>Intercostal Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.IntercostalPositionType
	 * @generated
	 */
	public Adapter createIntercostalPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.IntercostalsAssemblyType <em>Intercostals Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.IntercostalsAssemblyType
	 * @generated
	 */
	public Adapter createIntercostalsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterfaceDefinitionsType <em>Interface Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterfaceDefinitionsType
	 * @generated
	 */
	public Adapter createInterfaceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InternalPressuresType <em>Internal Pressures Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InternalPressuresType
	 * @generated
	 */
	public Adapter createInternalPressuresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InternalPressureType <em>Internal Pressure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InternalPressureType
	 * @generated
	 */
	public Adapter createInternalPressureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterpolationType <em>Interpolation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterpolationType
	 * @generated
	 */
	public Adapter createInterpolationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterpolationType1 <em>Interpolation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterpolationType1
	 * @generated
	 */
	public Adapter createInterpolationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.InterpolationType2 <em>Interpolation Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.InterpolationType2
	 * @generated
	 */
	public Adapter createInterpolationType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.IsotropicPropertiesType <em>Isotropic Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.IsotropicPropertiesType
	 * @generated
	 */
	public Adapter createIsotropicPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearBaseType <em>Landing Gear Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearBaseType
	 * @generated
	 */
	public Adapter createLandingGearBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearBrakingStateType <em>Landing Gear Braking State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearBrakingStateType
	 * @generated
	 */
	public Adapter createLandingGearBrakingStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearComponentAssemblyType <em>Landing Gear Component Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearComponentAssemblyType
	 * @generated
	 */
	public Adapter createLandingGearComponentAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearControlFunctionsType <em>Landing Gear Control Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearControlFunctionsType
	 * @generated
	 */
	public Adapter createLandingGearControlFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearControlType <em>Landing Gear Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearControlType
	 * @generated
	 */
	public Adapter createLandingGearControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearExtensionFunctionStepType <em>Landing Gear Extension Function Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearExtensionFunctionStepType
	 * @generated
	 */
	public Adapter createLandingGearExtensionFunctionStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearExtensionFunctionType <em>Landing Gear Extension Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearExtensionFunctionType
	 * @generated
	 */
	public Adapter createLandingGearExtensionFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceDefinitionsType <em>Landing Gear Interface Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceDefinitionsType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceKeelbeamType <em>Landing Gear Interface Keelbeam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceKeelbeamType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceKeelbeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceLateralPanelsType <em>Landing Gear Interface Lateral Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceLateralPanelsType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceLateralPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType <em>Landing Gear Interface Long Floor Beams Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceLongFloorBeamsConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceMainFramesType <em>Landing Gear Interface Main Frames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceMainFramesType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceMainFramesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfacePressureFloorType <em>Landing Gear Interface Pressure Floor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfacePressureFloorType
	 * @generated
	 */
	public Adapter createLandingGearInterfacePressureFloorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearInterfaceSideboxType <em>Landing Gear Interface Sidebox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearInterfaceSideboxType
	 * @generated
	 */
	public Adapter createLandingGearInterfaceSideboxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearPositionSafetyMarginsType <em>Landing Gear Position Safety Margins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearPositionSafetyMarginsType
	 * @generated
	 */
	public Adapter createLandingGearPositionSafetyMarginsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearSteeringFunctionStepType <em>Landing Gear Steering Function Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearSteeringFunctionStepType
	 * @generated
	 */
	public Adapter createLandingGearSteeringFunctionStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearSteeringFunctionType <em>Landing Gear Steering Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearSteeringFunctionType
	 * @generated
	 */
	public Adapter createLandingGearSteeringFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearStrutAttachmentType <em>Landing Gear Strut Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearStrutAttachmentType
	 * @generated
	 */
	public Adapter createLandingGearStrutAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearsType <em>Landing Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearsType
	 * @generated
	 */
	public Adapter createLandingGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearSupportBeamPositionType <em>Landing Gear Support Beam Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearSupportBeamPositionType
	 * @generated
	 */
	public Adapter createLandingGearSupportBeamPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LandingGearType <em>Landing Gear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LandingGearType
	 * @generated
	 */
	public Adapter createLandingGearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LateralCapType <em>Lateral Cap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LateralCapType
	 * @generated
	 */
	public Adapter createLateralCapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LatitudeType <em>Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LatitudeType
	 * @generated
	 */
	public Adapter createLatitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LavatoriesType <em>Lavatories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LavatoriesType
	 * @generated
	 */
	public Adapter createLavatoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LavatoryElementsType <em>Lavatory Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LavatoryElementsType
	 * @generated
	 */
	public Adapter createLavatoryElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LeadingEdgeDevicesType <em>Leading Edge Devices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LeadingEdgeDevicesType
	 * @generated
	 */
	public Adapter createLeadingEdgeDevicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LeadingEdgeDeviceType <em>Leading Edge Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LeadingEdgeDeviceType
	 * @generated
	 */
	public Adapter createLeadingEdgeDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LeadingEdgeHollowType <em>Leading Edge Hollow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LeadingEdgeHollowType
	 * @generated
	 */
	public Adapter createLeadingEdgeHollowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LeadingEdgeShapeType <em>Leading Edge Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LeadingEdgeShapeType
	 * @generated
	 */
	public Adapter createLeadingEdgeShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LinerType <em>Liner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LinerType
	 * @generated
	 */
	public Adapter createLinerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LinkToFileType <em>Link To File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LinkToFileType
	 * @generated
	 */
	public Adapter createLinkToFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadAnalysisType <em>Load Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadAnalysisType
	 * @generated
	 */
	public Adapter createLoadAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadApplicationPointSetsType <em>Load Application Point Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadApplicationPointSetsType
	 * @generated
	 */
	public Adapter createLoadApplicationPointSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadApplicationPointSetType <em>Load Application Point Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadApplicationPointSetType
	 * @generated
	 */
	public Adapter createLoadApplicationPointSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadApplicationPointsType <em>Load Application Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadApplicationPointsType
	 * @generated
	 */
	public Adapter createLoadApplicationPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadBreakdownType <em>Load Breakdown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadBreakdownType
	 * @generated
	 */
	public Adapter createLoadBreakdownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseAccelerationsType <em>Load Case Accelerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseAccelerationsType
	 * @generated
	 */
	public Adapter createLoadCaseAccelerationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseGustType <em>Load Case Gust Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseGustType
	 * @generated
	 */
	public Adapter createLoadCaseGustTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseLoadFactorsType <em>Load Case Load Factors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseLoadFactorsType
	 * @generated
	 */
	public Adapter createLoadCaseLoadFactorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseSpecificationType <em>Load Case Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseSpecificationType
	 * @generated
	 */
	public Adapter createLoadCaseSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCasesType <em>Load Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCasesType
	 * @generated
	 */
	public Adapter createLoadCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseSuperpositionType <em>Load Case Superposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseSuperpositionType
	 * @generated
	 */
	public Adapter createLoadCaseSuperpositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadCaseType <em>Load Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadCaseType
	 * @generated
	 */
	public Adapter createLoadCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadEnvelopesType <em>Load Envelopes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadEnvelopesType
	 * @generated
	 */
	public Adapter createLoadEnvelopesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadEnvelopeType <em>Load Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadEnvelopeType
	 * @generated
	 */
	public Adapter createLoadEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadReferenceLineType <em>Load Reference Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadReferenceLineType
	 * @generated
	 */
	public Adapter createLoadReferenceLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadReferencePointType <em>Load Reference Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadReferencePointType
	 * @generated
	 */
	public Adapter createLoadReferencePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadSetsType <em>Load Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadSetsType
	 * @generated
	 */
	public Adapter createLoadSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LoadSetType <em>Load Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LoadSetType
	 * @generated
	 */
	public Adapter createLoadSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LogEntryType <em>Log Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LogEntryType
	 * @generated
	 */
	public Adapter createLogEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LongFloorBeamPositionType <em>Long Floor Beam Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LongFloorBeamPositionType
	 * @generated
	 */
	public Adapter createLongFloorBeamPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LongFloorBeamsAssemblyType <em>Long Floor Beams Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LongFloorBeamsAssemblyType
	 * @generated
	 */
	public Adapter createLongFloorBeamsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LongFloorBeamType <em>Long Floor Beam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LongFloorBeamType
	 * @generated
	 */
	public Adapter createLongFloorBeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LongitudeType <em>Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LongitudeType
	 * @generated
	 */
	public Adapter createLongitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LowerHeightFractionType <em>Lower Height Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LowerHeightFractionType
	 * @generated
	 */
	public Adapter createLowerHeightFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LuggageCompartmentElementsType <em>Luggage Compartment Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LuggageCompartmentElementsType
	 * @generated
	 */
	public Adapter createLuggageCompartmentElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.LuggageCompartmentsType <em>Luggage Compartments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.LuggageCompartmentsType
	 * @generated
	 */
	public Adapter createLuggageCompartmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MachNumberType <em>Mach Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MachNumberType
	 * @generated
	 */
	public Adapter createMachNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MAdditionalCenterTanksType <em>MAdditional Center Tanks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MAdditionalCenterTanksType
	 * @generated
	 */
	public Adapter createMAdditionalCenterTanksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MainActuatorType <em>Main Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MainActuatorType
	 * @generated
	 */
	public Adapter createMainActuatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MainGearsType <em>Main Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MainGearsType
	 * @generated
	 */
	public Adapter createMainGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MainStrutInterfaceDefinitionsType <em>Main Strut Interface Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MainStrutInterfaceDefinitionsType
	 * @generated
	 */
	public Adapter createMainStrutInterfaceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MainStrutWingFuselageAttachmentType <em>Main Strut Wing Fuselage Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MainStrutWingFuselageAttachmentType
	 * @generated
	 */
	public Adapter createMainStrutWingFuselageAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaintenanceCostType <em>Maintenance Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaintenanceCostType
	 * @generated
	 */
	public Adapter createMaintenanceCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MAirConditioningType <em>MAir Conditioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MAirConditioningType
	 * @generated
	 */
	public Adapter createMAirConditioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MassBreakdownType <em>Mass Breakdown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MassBreakdownType
	 * @generated
	 */
	public Adapter createMassBreakdownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MassFractionType <em>Mass Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MassFractionType
	 * @generated
	 */
	public Adapter createMassFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MassInertiaType <em>Mass Inertia Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MassInertiaType
	 * @generated
	 */
	public Adapter createMassInertiaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MassInertiaVectorType <em>Mass Inertia Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MassInertiaVectorType
	 * @generated
	 */
	public Adapter createMassInertiaVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaterialDefinitionForProfileBasedPointType <em>Material Definition For Profile Based Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaterialDefinitionForProfileBasedPointType
	 * @generated
	 */
	public Adapter createMaterialDefinitionForProfileBasedPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaterialDefinitionForProfileBasedType <em>Material Definition For Profile Based Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaterialDefinitionForProfileBasedType
	 * @generated
	 */
	public Adapter createMaterialDefinitionForProfileBasedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaterialDefinitionType <em>Material Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaterialDefinitionType
	 * @generated
	 */
	public Adapter createMaterialDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaterialsType <em>Materials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaterialsType
	 * @generated
	 */
	public Adapter createMaterialsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MaterialType <em>Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MaterialType
	 * @generated
	 */
	public Adapter createMaterialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MAutomaticFlightSystemType <em>MAutomatic Flight System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MAutomaticFlightSystemType
	 * @generated
	 */
	public Adapter createMAutomaticFlightSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MAuxillaryPowerUnitType <em>MAuxillary Power Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MAuxillaryPowerUnitType
	 * @generated
	 */
	public Adapter createMAuxillaryPowerUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MBellyFairingsType <em>MBelly Fairings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MBellyFairingsType
	 * @generated
	 */
	public Adapter createMBellyFairingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MBleedAirSystemType <em>MBleed Air System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MBleedAirSystemType
	 * @generated
	 */
	public Adapter createMBleedAirSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MBulkCargosType <em>MBulk Cargos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MBulkCargosType
	 * @generated
	 */
	public Adapter createMBulkCargosTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MBulkCargoType <em>MBulk Cargo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MBulkCargoType
	 * @generated
	 */
	public Adapter createMBulkCargoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MBulkheadsType <em>MBulkheads Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MBulkheadsType
	 * @generated
	 */
	public Adapter createMBulkheadsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCabinFloorsType <em>MCabin Floors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCabinFloorsType
	 * @generated
	 */
	public Adapter createMCabinFloorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCabinLightingsType <em>MCabin Lightings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCabinLightingsType
	 * @generated
	 */
	public Adapter createMCabinLightingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCargoFloorsType <em>MCargo Floors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCargoFloorsType
	 * @generated
	 */
	public Adapter createMCargoFloorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCargoLiningsType <em>MCargo Linings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCargoLiningsType
	 * @generated
	 */
	public Adapter createMCargoLiningsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCargoLoadingsType <em>MCargo Loadings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCargoLoadingsType
	 * @generated
	 */
	public Adapter createMCargoLoadingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCargoType <em>MCargo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCargoType
	 * @generated
	 */
	public Adapter createMCargoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCarriagesType <em>MCarriages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCarriagesType
	 * @generated
	 */
	public Adapter createMCarriagesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCarryOnsType <em>MCarry Ons Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCarryOnsType
	 * @generated
	 */
	public Adapter createMCarryOnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCarryOnType <em>MCarry On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCarryOnType
	 * @generated
	 */
	public Adapter createMCarryOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCateringsType <em>MCaterings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCateringsType
	 * @generated
	 */
	public Adapter createMCateringsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCellsType <em>MCells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCellsType
	 * @generated
	 */
	public Adapter createMCellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCockpitLightingsType <em>MCockpit Lightings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCockpitLightingsType
	 * @generated
	 */
	public Adapter createMCockpitLightingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCommunicationType <em>MCommunication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCommunicationType
	 * @generated
	 */
	public Adapter createMCommunicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MComponentSegmentsType <em>MComponent Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MComponentSegmentsType
	 * @generated
	 */
	public Adapter createMComponentSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MComponentSegmentType <em>MComponent Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MComponentSegmentType
	 * @generated
	 */
	public Adapter createMComponentSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MControlSurfaceSupportsType <em>MControl Surface Supports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MControlSurfaceSupportsType
	 * @generated
	 */
	public Adapter createMControlSurfaceSupportsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MControlSurfaceSupportType <em>MControl Surface Support Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MControlSurfaceSupportType
	 * @generated
	 */
	public Adapter createMControlSurfaceSupportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCrewMembersType <em>MCrew Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCrewMembersType
	 * @generated
	 */
	public Adapter createMCrewMembersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MCrewSeatsType <em>MCrew Seats Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MCrewSeatsType
	 * @generated
	 */
	public Adapter createMCrewSeatsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MDeIcingType <em>MDe Icing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MDeIcingType
	 * @generated
	 */
	public Adapter createMDeIcingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MDocumentsToolsType <em>MDocuments Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MDocumentsToolsType
	 * @generated
	 */
	public Adapter createMDocumentsToolsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MDoorsType <em>MDoors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MDoorsType
	 * @generated
	 */
	public Adapter createMDoorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MElectricalDistributionType <em>MElectrical Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MElectricalDistributionType
	 * @generated
	 */
	public Adapter createMElectricalDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MElectricalGenerationType <em>MElectrical Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MElectricalGenerationType
	 * @generated
	 */
	public Adapter createMElectricalGenerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEmergencyEquipmentsType <em>MEmergency Equipments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEmergencyEquipmentsType
	 * @generated
	 */
	public Adapter createMEmergencyEquipmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEmergencyOxygenSystemsType <em>MEmergency Oxygen Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEmergencyOxygenSystemsType
	 * @generated
	 */
	public Adapter createMEmergencyOxygenSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEmptyULDsType <em>MEmpty UL Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEmptyULDsType
	 * @generated
	 */
	public Adapter createMEmptyULDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEmptyULDType <em>MEmpty ULD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEmptyULDType
	 * @generated
	 */
	public Adapter createMEmptyULDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEngineAPUOilsType <em>MEngine APU Oils Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEngineAPUOilsType
	 * @generated
	 */
	public Adapter createMEngineAPUOilsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEngineControlType <em>MEngine Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEngineControlType
	 * @generated
	 */
	public Adapter createMEngineControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MEquippedEnginesType <em>MEquipped Engines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MEquippedEnginesType
	 * @generated
	 */
	public Adapter createMEquippedEnginesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MExtLightingsType <em>MExt Lightings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MExtLightingsType
	 * @generated
	 */
	public Adapter createMExtLightingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFireProtectionType <em>MFire Protection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFireProtectionType
	 * @generated
	 */
	public Adapter createMFireProtectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFixedGalleysType <em>MFixed Galleys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFixedGalleysType
	 * @generated
	 */
	public Adapter createMFixedGalleysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFixedLeadingEdgesType <em>MFixed Leading Edges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFixedLeadingEdgesType
	 * @generated
	 */
	public Adapter createMFixedLeadingEdgesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFixedLeadingEdgeType <em>MFixed Leading Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFixedLeadingEdgeType
	 * @generated
	 */
	public Adapter createMFixedLeadingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFixedTrailingEdgesType <em>MFixed Trailing Edges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFixedTrailingEdgesType
	 * @generated
	 */
	public Adapter createMFixedTrailingEdgesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFixedTrailingEdgeType <em>MFixed Trailing Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFixedTrailingEdgeType
	 * @generated
	 */
	public Adapter createMFixedTrailingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFlightControlsType <em>MFlight Controls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFlightControlsType
	 * @generated
	 */
	public Adapter createMFlightControlsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFloorCoveringsType <em>MFloor Coverings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFloorCoveringsType
	 * @generated
	 */
	public Adapter createMFloorCoveringsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFramesType <em>MFrames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFramesType
	 * @generated
	 */
	public Adapter createMFramesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFreshWaterSystemsType <em>MFresh Water Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFreshWaterSystemsType
	 * @generated
	 */
	public Adapter createMFreshWaterSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFuelSystemType <em>MFuel System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFuelSystemType
	 * @generated
	 */
	public Adapter createMFuelSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFuelType <em>MFuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFuelType
	 * @generated
	 */
	public Adapter createMFuelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFurnishingType <em>MFurnishing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFurnishingType
	 * @generated
	 */
	public Adapter createMFurnishingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFuselagesStructureType <em>MFuselages Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFuselagesStructureType
	 * @generated
	 */
	public Adapter createMFuselagesStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MFuselageStructureType <em>MFuselage Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MFuselageStructureType
	 * @generated
	 */
	public Adapter createMFuselageStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MHydraulicDistributionType <em>MHydraulic Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MHydraulicDistributionType
	 * @generated
	 */
	public Adapter createMHydraulicDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MHydraulicGenerationType <em>MHydraulic Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MHydraulicGenerationType
	 * @generated
	 */
	public Adapter createMHydraulicGenerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MIFESystemsType <em>MIFE Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MIFESystemsType
	 * @generated
	 */
	public Adapter createMIFESystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MInstrumentPanelType <em>MInstrument Panel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MInstrumentPanelType
	 * @generated
	 */
	public Adapter createMInstrumentPanelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MInsulationsType <em>MInsulations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MInsulationsType
	 * @generated
	 */
	public Adapter createMInsulationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MIntegratedModularAvionicsType <em>MIntegrated Modular Avionics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MIntegratedModularAvionicsType
	 * @generated
	 */
	public Adapter createMIntegratedModularAvionicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MInterGasSystemType <em>MInter Gas System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MInterGasSystemType
	 * @generated
	 */
	public Adapter createMInterGasSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionDefinitionsType <em>Mission Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionDefinitionsType
	 * @generated
	 */
	public Adapter createMissionDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionEndRunwayType <em>Mission End Runway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionEndRunwayType
	 * @generated
	 */
	public Adapter createMissionEndRunwayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionPerformanceMapDefinitionType <em>Mission Performance Map Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionPerformanceMapDefinitionType
	 * @generated
	 */
	public Adapter createMissionPerformanceMapDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentBlockConstraintsType <em>Mission Segment Block Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentBlockConstraintsType
	 * @generated
	 */
	public Adapter createMissionSegmentBlockConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentBlocksType <em>Mission Segment Blocks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentBlocksType
	 * @generated
	 */
	public Adapter createMissionSegmentBlocksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentBlockType <em>Mission Segment Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentBlockType
	 * @generated
	 */
	public Adapter createMissionSegmentBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentEndConditionType <em>Mission Segment End Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentEndConditionType
	 * @generated
	 */
	public Adapter createMissionSegmentEndConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentsType <em>Mission Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentsType
	 * @generated
	 */
	public Adapter createMissionSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionSegmentType <em>Mission Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionSegmentType
	 * @generated
	 */
	public Adapter createMissionSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionStartConditionType <em>Mission Start Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionStartConditionType
	 * @generated
	 */
	public Adapter createMissionStartConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionStartRunwayType <em>Mission Start Runway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionStartRunwayType
	 * @generated
	 */
	public Adapter createMissionStartRunwayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionsType <em>Missions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionsType
	 * @generated
	 */
	public Adapter createMissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MissionType <em>Mission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MissionType
	 * @generated
	 */
	public Adapter createMissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MLandingGearsType <em>MLanding Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MLandingGearsType
	 * @generated
	 */
	public Adapter createMLandingGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MLandingGearSupportsType <em>MLanding Gear Supports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MLandingGearSupportsType
	 * @generated
	 */
	public Adapter createMLandingGearSupportsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MLavatoriesType <em>MLavatories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MLavatoriesType
	 * @generated
	 */
	public Adapter createMLavatoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MLiningsType <em>MLinings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MLiningsType
	 * @generated
	 */
	public Adapter createMLiningsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMainGearsType <em>MMain Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMainGearsType
	 * @generated
	 */
	public Adapter createMMainGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MManufacturerEmptyType <em>MManufacturer Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MManufacturerEmptyType
	 * @generated
	 */
	public Adapter createMManufacturerEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMillitarySystemsType <em>MMillitary Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMillitarySystemsType
	 * @generated
	 */
	public Adapter createMMillitarySystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMoveableLeadingEdgesType <em>MMoveable Leading Edges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMoveableLeadingEdgesType
	 * @generated
	 */
	public Adapter createMMoveableLeadingEdgesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMoveableLeadingEdgeType <em>MMoveable Leading Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMoveableLeadingEdgeType
	 * @generated
	 */
	public Adapter createMMoveableLeadingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMoveablesType <em>MMoveables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMoveablesType
	 * @generated
	 */
	public Adapter createMMoveablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MMoveableTrailingEdgeType <em>MMoveable Trailing Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MMoveableTrailingEdgeType
	 * @generated
	 */
	public Adapter createMMoveableTrailingEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MNavigationType <em>MNavigation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MNavigationType
	 * @generated
	 */
	public Adapter createMNavigationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MNoseGearsType <em>MNose Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MNoseGearsType
	 * @generated
	 */
	public Adapter createMNoseGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MonetaryValuesAnalysisType <em>Monetary Values Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MonetaryValuesAnalysisType
	 * @generated
	 */
	public Adapter createMonetaryValuesAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MOperatorItemsType <em>MOperator Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MOperatorItemsType
	 * @generated
	 */
	public Adapter createMOperatorItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MOverheadBinsType <em>MOverhead Bins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MOverheadBinsType
	 * @generated
	 */
	public Adapter createMOverheadBinsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPartStowDoorsType <em>MPart Stow Doors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPartStowDoorsType
	 * @generated
	 */
	public Adapter createMPartStowDoorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPassengersType <em>MPassengers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPassengersType
	 * @generated
	 */
	public Adapter createMPassengersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPassengerType <em>MPassenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPassengerType
	 * @generated
	 */
	public Adapter createMPassengerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPaxType <em>MPax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPaxType
	 * @generated
	 */
	public Adapter createMPaxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPayloadType <em>MPayload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPayloadType
	 * @generated
	 */
	public Adapter createMPayloadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPowerUnitsType <em>MPower Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPowerUnitsType
	 * @generated
	 */
	public Adapter createMPowerUnitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPylonAttachmentsType <em>MPylon Attachments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPylonAttachmentsType
	 * @generated
	 */
	public Adapter createMPylonAttachmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MPylonsType <em>MPylons Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MPylonsType
	 * @generated
	 */
	public Adapter createMPylonsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MRemovableCrewRestsType <em>MRemovable Crew Rests Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MRemovableCrewRestsType
	 * @generated
	 */
	public Adapter createMRemovableCrewRestsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MRibsType <em>MRibs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MRibsType
	 * @generated
	 */
	public Adapter createMRibsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MRibType <em>MRib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MRibType
	 * @generated
	 */
	public Adapter createMRibTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSeatsType <em>MSeats Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSeatsType
	 * @generated
	 */
	public Adapter createMSeatsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MShellsType <em>MShells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MShellsType
	 * @generated
	 */
	public Adapter createMShellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MShellType <em>MShell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MShellType
	 * @generated
	 */
	public Adapter createMShellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSkinPanelsType <em>MSkin Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSkinPanelsType
	 * @generated
	 */
	public Adapter createMSkinPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSkinsType <em>MSkins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSkinsType
	 * @generated
	 */
	public Adapter createMSkinsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSparCellsType <em>MSpar Cells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSparCellsType
	 * @generated
	 */
	public Adapter createMSparCellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSparSkinsType <em>MSpar Skins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSparSkinsType
	 * @generated
	 */
	public Adapter createMSparSkinsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSparsType <em>MSpars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSparsType
	 * @generated
	 */
	public Adapter createMSparsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSparType <em>MSpar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSparType
	 * @generated
	 */
	public Adapter createMSparTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSpecialStructuresType <em>MSpecial Structures Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSpecialStructuresType
	 * @generated
	 */
	public Adapter createMSpecialStructuresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSpoilersType <em>MSpoilers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSpoilersType
	 * @generated
	 */
	public Adapter createMSpoilersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MStringersType <em>MStringers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MStringersType
	 * @generated
	 */
	public Adapter createMStringersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MStructureType <em>MStructure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MStructureType
	 * @generated
	 */
	public Adapter createMStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MSystemsType <em>MSystems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MSystemsType
	 * @generated
	 */
	public Adapter createMSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MToiletFluidsType <em>MToilet Fluids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MToiletFluidsType
	 * @generated
	 */
	public Adapter createMToiletFluidsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MTrailingEdgeDevicesType <em>MTrailing Edge Devices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MTrailingEdgeDevicesType
	 * @generated
	 */
	public Adapter createMTrailingEdgeDevicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MTrailingEdgeDeviceType <em>MTrailing Edge Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MTrailingEdgeDeviceType
	 * @generated
	 */
	public Adapter createMTrailingEdgeDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MULDContentsType <em>MULD Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MULDContentsType
	 * @generated
	 */
	public Adapter createMULDContentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MULDContentType <em>MULD Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MULDContentType
	 * @generated
	 */
	public Adapter createMULDContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MUnusableFuelsType <em>MUnusable Fuels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MUnusableFuelsType
	 * @generated
	 */
	public Adapter createMUnusableFuelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MVacuumWasteSystemsType <em>MVacuum Waste Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MVacuumWasteSystemsType
	 * @generated
	 */
	public Adapter createMVacuumWasteSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWallsType <em>MWalls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWallsType
	 * @generated
	 */
	public Adapter createMWallsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWasteWaterSystemsType <em>MWaste Water Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWasteWaterSystemsType
	 * @generated
	 */
	public Adapter createMWasteWaterSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWaterReservoirsType <em>MWater Reservoirs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWaterReservoirsType
	 * @generated
	 */
	public Adapter createMWaterReservoirsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWindowsType <em>MWindows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWindowsType
	 * @generated
	 */
	public Adapter createMWindowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWingBoxType <em>MWing Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWingBoxType
	 * @generated
	 */
	public Adapter createMWingBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWingsStructureType <em>MWings Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWingsStructureType
	 * @generated
	 */
	public Adapter createMWingsStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.MWingStructureType <em>MWing Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.MWingStructureType
	 * @generated
	 */
	public Adapter createMWingStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleCenterCowlType <em>Nacelle Center Cowl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleCenterCowlType
	 * @generated
	 */
	public Adapter createNacelleCenterCowlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleCowlType <em>Nacelle Cowl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleCowlType
	 * @generated
	 */
	public Adapter createNacelleCowlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleGuideCurvesType <em>Nacelle Guide Curves Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleGuideCurvesType
	 * @generated
	 */
	public Adapter createNacelleGuideCurvesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleGuideCurveType <em>Nacelle Guide Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleGuideCurveType
	 * @generated
	 */
	public Adapter createNacelleGuideCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleProfilesType <em>Nacelle Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleProfilesType
	 * @generated
	 */
	public Adapter createNacelleProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleSectionsType <em>Nacelle Sections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleSectionsType
	 * @generated
	 */
	public Adapter createNacelleSectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NacelleSectionType <em>Nacelle Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NacelleSectionType
	 * @generated
	 */
	public Adapter createNacelleSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NameType1
	 * @generated
	 */
	public Adapter createNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NoiseAnalysisType <em>Noise Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NoiseAnalysisType
	 * @generated
	 */
	public Adapter createNoiseAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.NoseGearsType <em>Nose Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.NoseGearsType
	 * @generated
	 */
	public Adapter createNoseGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OEMType <em>OEM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OEMType
	 * @generated
	 */
	public Adapter createOEMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OperationalCasesType <em>Operational Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OperationalCasesType
	 * @generated
	 */
	public Adapter createOperationalCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OperationalCaseType <em>Operational Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OperationalCaseType
	 * @generated
	 */
	public Adapter createOperationalCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OperationLimitIncrementsType <em>Operation Limit Increments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OperationLimitIncrementsType
	 * @generated
	 */
	public Adapter createOperationLimitIncrementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OrthotropicShellPropertiesType <em>Orthotropic Shell Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OrthotropicShellPropertiesType
	 * @generated
	 */
	public Adapter createOrthotropicShellPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OrthotropicSolidPropertiesType <em>Orthotropic Solid Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OrthotropicSolidPropertiesType
	 * @generated
	 */
	public Adapter createOrthotropicSolidPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.OuterCutOutProfileType <em>Outer Cut Out Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.OuterCutOutProfileType
	 * @generated
	 */
	public Adapter createOuterCutOutProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PaxCrossBeamsAssemblyType <em>Pax Cross Beams Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PaxCrossBeamsAssemblyType
	 * @generated
	 */
	public Adapter createPaxCrossBeamsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PaxCrossBeamStrutsAssemblyType <em>Pax Cross Beam Struts Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PaxCrossBeamStrutsAssemblyType
	 * @generated
	 */
	public Adapter createPaxCrossBeamStrutsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PaxDoorsAssemblyType <em>Pax Doors Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PaxDoorsAssemblyType
	 * @generated
	 */
	public Adapter createPaxDoorsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PayloadGlobalType <em>Payload Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PayloadGlobalType
	 * @generated
	 */
	public Adapter createPayloadGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PerformanceMapSelectionType <em>Performance Map Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PerformanceMapSelectionType
	 * @generated
	 */
	public Adapter createPerformanceMapSelectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PerformanceRequirementConfigurationsType <em>Performance Requirement Configurations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PerformanceRequirementConfigurationsType
	 * @generated
	 */
	public Adapter createPerformanceRequirementConfigurationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PerformanceRequirementsType <em>Performance Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PerformanceRequirementsType
	 * @generated
	 */
	public Adapter createPerformanceRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PerformanceTargetsGlobalType <em>Performance Targets Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PerformanceTargetsGlobalType
	 * @generated
	 */
	public Adapter createPerformanceTargetsGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PhiType <em>Phi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PhiType
	 * @generated
	 */
	public Adapter createPhiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PintleStrutsType <em>Pintle Struts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PintleStrutsType
	 * @generated
	 */
	public Adapter createPintleStrutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PistonType <em>Piston Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PistonType
	 * @generated
	 */
	public Adapter createPistonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PlasticityCurvePointsType <em>Plasticity Curve Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PlasticityCurvePointsType
	 * @generated
	 */
	public Adapter createPlasticityCurvePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PlasticityCurvePointType <em>Plasticity Curve Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PlasticityCurvePointType
	 * @generated
	 */
	public Adapter createPlasticityCurvePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PlasticityCurvesType <em>Plasticity Curves Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PlasticityCurvesType
	 * @generated
	 */
	public Adapter createPlasticityCurvesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PlasticityCurveType <em>Plasticity Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PlasticityCurveType
	 * @generated
	 */
	public Adapter createPlasticityCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointAbsRelType <em>Point Abs Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointAbsRelType
	 * @generated
	 */
	public Adapter createPointAbsRelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointConstraintType <em>Point Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointConstraintType
	 * @generated
	 */
	public Adapter createPointConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointListRelXYZVectorType <em>Point List Rel XYZ Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointListRelXYZVectorType
	 * @generated
	 */
	public Adapter createPointListRelXYZVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointListType <em>Point List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointListType
	 * @generated
	 */
	public Adapter createPointListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointListXYType <em>Point List XY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointListXYType
	 * @generated
	 */
	public Adapter createPointListXYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointListXYVectorType <em>Point List XY Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointListXYVectorType
	 * @generated
	 */
	public Adapter createPointListXYVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointListXYZVectorType <em>Point List XYZ Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointListXYZVectorType
	 * @generated
	 */
	public Adapter createPointListXYZVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointPerformanceConstraintsType <em>Point Performance Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointPerformanceConstraintsType
	 * @generated
	 */
	public Adapter createPointPerformanceConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointPerformanceDefinitionsType <em>Point Performance Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointPerformanceDefinitionsType
	 * @generated
	 */
	public Adapter createPointPerformanceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointPerformanceDefinitionType <em>Point Performance Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointPerformanceDefinitionType
	 * @generated
	 */
	public Adapter createPointPerformanceDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointPerformanceRequirementsType <em>Point Performance Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointPerformanceRequirementsType
	 * @generated
	 */
	public Adapter createPointPerformanceRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointXType <em>Point XType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointXType
	 * @generated
	 */
	public Adapter createPointXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointXYType <em>Point XY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointXYType
	 * @generated
	 */
	public Adapter createPointXYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointXYZType <em>Point XYZ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointXYZType
	 * @generated
	 */
	public Adapter createPointXYZTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointXZType <em>Point XZ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointXZType
	 * @generated
	 */
	public Adapter createPointXZTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointYType <em>Point YType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointYType
	 * @generated
	 */
	public Adapter createPointYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointYZType <em>Point YZ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointYZType
	 * @generated
	 */
	public Adapter createPointYZTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PointZType <em>Point ZType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PointZType
	 * @generated
	 */
	public Adapter createPointZTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PosExcl0DoubleBaseType <em>Pos Excl0 Double Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PosExcl0DoubleBaseType
	 * @generated
	 */
	public Adapter createPosExcl0DoubleBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PosExcl0IntBaseType <em>Pos Excl0 Int Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PosExcl0IntBaseType
	 * @generated
	 */
	public Adapter createPosExcl0IntBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PosIntVectorBaseType <em>Pos Int Vector Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PosIntVectorBaseType
	 * @generated
	 */
	public Adapter createPosIntVectorBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PositioningsType <em>Positionings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PositioningsType
	 * @generated
	 */
	public Adapter createPositioningsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PositioningType <em>Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PositioningType
	 * @generated
	 */
	public Adapter createPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PowerConsumedType <em>Power Consumed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PowerConsumedType
	 * @generated
	 */
	public Adapter createPowerConsumedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PowerFractionType <em>Power Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PowerFractionType
	 * @generated
	 */
	public Adapter createPowerFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PowerRemainingType <em>Power Remaining Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PowerRemainingType
	 * @generated
	 */
	public Adapter createPowerRemainingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PressureBulkheadAssemblyPositionType <em>Pressure Bulkhead Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PressureBulkheadAssemblyPositionType
	 * @generated
	 */
	public Adapter createPressureBulkheadAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PressureBulkheadAssemblyType <em>Pressure Bulkhead Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PressureBulkheadAssemblyType
	 * @generated
	 */
	public Adapter createPressureBulkheadAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PressureBulkheadsType <em>Pressure Bulkheads Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PressureBulkheadsType
	 * @generated
	 */
	public Adapter createPressureBulkheadsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PressureBulkheadType <em>Pressure Bulkhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PressureBulkheadType
	 * @generated
	 */
	public Adapter createPressureBulkheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PrioritySettingType <em>Priority Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PrioritySettingType
	 * @generated
	 */
	public Adapter createPrioritySettingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ProfileBasedStructuralElementsType <em>Profile Based Structural Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ProfileBasedStructuralElementsType
	 * @generated
	 */
	public Adapter createProfileBasedStructuralElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ProfileBasedStructuralElementType <em>Profile Based Structural Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ProfileBasedStructuralElementType
	 * @generated
	 */
	public Adapter createProfileBasedStructuralElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ProfileGeometry2DType <em>Profile Geometry2 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ProfileGeometry2DType
	 * @generated
	 */
	public Adapter createProfileGeometry2DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ProfileGeometryType <em>Profile Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ProfileGeometryType
	 * @generated
	 */
	public Adapter createProfileGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ProfilesType <em>Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ProfilesType
	 * @generated
	 */
	public Adapter createProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonAttachmentsType <em>Pylon Attachments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonAttachmentsType
	 * @generated
	 */
	public Adapter createPylonAttachmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonAttachmentType <em>Pylon Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonAttachmentType
	 * @generated
	 */
	public Adapter createPylonAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonBoxType <em>Pylon Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonBoxType
	 * @generated
	 */
	public Adapter createPylonBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonPinsType <em>Pylon Pins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonPinsType
	 * @generated
	 */
	public Adapter createPylonPinsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonPinType <em>Pylon Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonPinType
	 * @generated
	 */
	public Adapter createPylonPinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonRibsDefinitionsType <em>Pylon Ribs Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonRibsDefinitionsType
	 * @generated
	 */
	public Adapter createPylonRibsDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonRibsDefinitionType <em>Pylon Ribs Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonRibsDefinitionType
	 * @generated
	 */
	public Adapter createPylonRibsDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonRibsPositioningType <em>Pylon Ribs Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonRibsPositioningType
	 * @generated
	 */
	public Adapter createPylonRibsPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonShacklesType <em>Pylon Shackles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonShacklesType
	 * @generated
	 */
	public Adapter createPylonShacklesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonShackleType <em>Pylon Shackle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonShackleType
	 * @generated
	 */
	public Adapter createPylonShackleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonShellType <em>Pylon Shell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonShellType
	 * @generated
	 */
	public Adapter createPylonShellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonStructureType <em>Pylon Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonStructureType
	 * @generated
	 */
	public Adapter createPylonStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.PylonStrutsType <em>Pylon Struts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.PylonStrutsType
	 * @generated
	 */
	public Adapter createPylonStrutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RadiativeForcingType <em>Radiative Forcing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RadiativeForcingType
	 * @generated
	 */
	public Adapter createRadiativeForcingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RateOfClimbType <em>Rate Of Climb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RateOfClimbType
	 * @generated
	 */
	public Adapter createRateOfClimbTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RectangleProfileType <em>Rectangle Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RectangleProfileType
	 * @generated
	 */
	public Adapter createRectangleProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RecurringCostType <em>Recurring Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RecurringCostType
	 * @generated
	 */
	public Adapter createRecurringCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RelativeStrutPositionType <em>Relative Strut Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RelativeStrutPositionType
	 * @generated
	 */
	public Adapter createRelativeStrutPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ReleasedStoresType <em>Released Stores Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ReleasedStoresType
	 * @generated
	 */
	public Adapter createReleasedStoresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ReleasedStoreType <em>Released Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ReleasedStoreType
	 * @generated
	 */
	public Adapter createReleasedStoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RemainingContributionsType <em>Remaining Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RemainingContributionsType
	 * @generated
	 */
	public Adapter createRemainingContributionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RemainingContributionType <em>Remaining Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RemainingContributionType
	 * @generated
	 */
	public Adapter createRemainingContributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RequirementClassificationType <em>Requirement Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RequirementClassificationType
	 * @generated
	 */
	public Adapter createRequirementClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RequirementType
	 * @generated
	 */
	public Adapter createRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RibCrossingBehaviourType <em>Rib Crossing Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RibCrossingBehaviourType
	 * @generated
	 */
	public Adapter createRibCrossingBehaviourTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RibCrossingBehaviourType1 <em>Rib Crossing Behaviour Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RibCrossingBehaviourType1
	 * @generated
	 */
	public Adapter createRibCrossingBehaviourType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RibIdentificationType <em>Rib Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RibIdentificationType
	 * @generated
	 */
	public Adapter createRibIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RibRotationType <em>Rib Rotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RibRotationType
	 * @generated
	 */
	public Adapter createRibRotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RivetJointAreaAssemblyPositionType <em>Rivet Joint Area Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RivetJointAreaAssemblyPositionType
	 * @generated
	 */
	public Adapter createRivetJointAreaAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RivetJointAreasAssemblyType <em>Rivet Joint Areas Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RivetJointAreasAssemblyType
	 * @generated
	 */
	public Adapter createRivetJointAreasAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RivetsType <em>Rivets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RivetsType
	 * @generated
	 */
	public Adapter createRivetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RivetType <em>Rivet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RivetType
	 * @generated
	 */
	public Adapter createRivetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotationCurveType <em>Rotation Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotationCurveType
	 * @generated
	 */
	public Adapter createRotationCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotDirectionType <em>Rot Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotDirectionType
	 * @generated
	 */
	public Adapter createRotDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorAirfoilsType <em>Rotor Airfoils Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorAirfoilsType
	 * @generated
	 */
	public Adapter createRotorAirfoilsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorBladeAttachmentsType <em>Rotor Blade Attachments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorBladeAttachmentsType
	 * @generated
	 */
	public Adapter createRotorBladeAttachmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorBladeAttachmentType <em>Rotor Blade Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorBladeAttachmentType
	 * @generated
	 */
	public Adapter createRotorBladeAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorBladesType <em>Rotor Blades Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorBladesType
	 * @generated
	 */
	public Adapter createRotorBladesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftAnalysesType <em>Rotorcraft Analyses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftAnalysesType
	 * @generated
	 */
	public Adapter createRotorcraftAnalysesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftGlobalType <em>Rotorcraft Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftGlobalType
	 * @generated
	 */
	public Adapter createRotorcraftGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftMassBreakdownType <em>Rotorcraft Mass Breakdown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftMassBreakdownType
	 * @generated
	 */
	public Adapter createRotorcraftMassBreakdownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftMassEMType <em>Rotorcraft Mass EM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftMassEMType
	 * @generated
	 */
	public Adapter createRotorcraftMassEMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftMassGroupLevel1Type <em>Rotorcraft Mass Group Level1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftMassGroupLevel1Type
	 * @generated
	 */
	public Adapter createRotorcraftMassGroupLevel1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftMassGroupLevel2Type <em>Rotorcraft Mass Group Level2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftMassGroupLevel2Type
	 * @generated
	 */
	public Adapter createRotorcraftMassGroupLevel2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftMassOEMType <em>Rotorcraft Mass OEM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftMassOEMType
	 * @generated
	 */
	public Adapter createRotorcraftMassOEMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftModelType <em>Rotorcraft Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftModelType
	 * @generated
	 */
	public Adapter createRotorcraftModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorcraftType <em>Rotorcraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorcraftType
	 * @generated
	 */
	public Adapter createRotorcraftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorHubHingesType <em>Rotor Hub Hinges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorHubHingesType
	 * @generated
	 */
	public Adapter createRotorHubHingesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorHubHingeType <em>Rotor Hub Hinge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorHubHingeType
	 * @generated
	 */
	public Adapter createRotorHubHingeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorHubType <em>Rotor Hub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorHubType
	 * @generated
	 */
	public Adapter createRotorHubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorsType <em>Rotors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorsType
	 * @generated
	 */
	public Adapter createRotorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RotorType <em>Rotor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RotorType
	 * @generated
	 */
	public Adapter createRotorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RunwayILSType <em>Runway ILS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RunwayILSType
	 * @generated
	 */
	public Adapter createRunwayILSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RunwayStartPositionType <em>Runway Start Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RunwayStartPositionType
	 * @generated
	 */
	public Adapter createRunwayStartPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RunwaysType <em>Runways Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RunwaysType
	 * @generated
	 */
	public Adapter createRunwaysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RunwayType <em>Runway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RunwayType
	 * @generated
	 */
	public Adapter createRunwayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.RunwayType1 <em>Runway Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.RunwayType1
	 * @generated
	 */
	public Adapter createRunwayType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SeatElementsType <em>Seat Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SeatElementsType
	 * @generated
	 */
	public Adapter createSeatElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SeatElementType <em>Seat Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SeatElementType
	 * @generated
	 */
	public Adapter createSeatElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SeatModulesType <em>Seat Modules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SeatModulesType
	 * @generated
	 */
	public Adapter createSeatModulesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SegmentDirectionType <em>Segment Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SegmentDirectionType
	 * @generated
	 */
	public Adapter createSegmentDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SegmentTypeType <em>Segment Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SegmentTypeType
	 * @generated
	 */
	public Adapter createSegmentTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ShaftLinkedComponentsType <em>Shaft Linked Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ShaftLinkedComponentsType
	 * @generated
	 */
	public Adapter createShaftLinkedComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ShaftsType <em>Shafts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ShaftsType
	 * @generated
	 */
	public Adapter createShaftsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ShaftType <em>Shaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ShaftType
	 * @generated
	 */
	public Adapter createShaftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.Sheet3DType <em>Sheet3 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.Sheet3DType
	 * @generated
	 */
	public Adapter createSheet3DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetBasedStructuralElementsType <em>Sheet Based Structural Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetBasedStructuralElementsType
	 * @generated
	 */
	public Adapter createSheetBasedStructuralElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetBasedStructuralElementType <em>Sheet Based Structural Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetBasedStructuralElementType
	 * @generated
	 */
	public Adapter createSheetBasedStructuralElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetList3DType <em>Sheet List3 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetList3DType
	 * @generated
	 */
	public Adapter createSheetList3DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetListType <em>Sheet List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetListType
	 * @generated
	 */
	public Adapter createSheetListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetPointsType <em>Sheet Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetPointsType
	 * @generated
	 */
	public Adapter createSheetPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SheetType <em>Sheet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SheetType
	 * @generated
	 */
	public Adapter createSheetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SideStrutsType <em>Side Struts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SideStrutsType
	 * @generated
	 */
	public Adapter createSideStrutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SideType <em>Side Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SideType
	 * @generated
	 */
	public Adapter createSideTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SidewallPanelElementsType <em>Sidewall Panel Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SidewallPanelElementsType
	 * @generated
	 */
	public Adapter createSidewallPanelElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SidewallPanelsType <em>Sidewall Panels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SidewallPanelsType
	 * @generated
	 */
	public Adapter createSidewallPanelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SingleGenericMassType <em>Single Generic Mass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SingleGenericMassType
	 * @generated
	 */
	public Adapter createSingleGenericMassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SkidGearsType <em>Skid Gears Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SkidGearsType
	 * @generated
	 */
	public Adapter createSkidGearsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SkinSegmentsType <em>Skin Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SkinSegmentsType
	 * @generated
	 */
	public Adapter createSkinSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SkinSegmentType <em>Skin Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SkinSegmentType
	 * @generated
	 */
	public Adapter createSkinSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SkinType <em>Skin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SkinType
	 * @generated
	 */
	public Adapter createSkinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparCellsType <em>Spar Cells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparCellsType
	 * @generated
	 */
	public Adapter createSparCellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparCellType <em>Spar Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparCellType
	 * @generated
	 */
	public Adapter createSparCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparCrossSectionType <em>Spar Cross Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparCrossSectionType
	 * @generated
	 */
	public Adapter createSparCrossSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparPositionsType <em>Spar Positions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparPositionsType
	 * @generated
	 */
	public Adapter createSparPositionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparPositionType <em>Spar Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparPositionType
	 * @generated
	 */
	public Adapter createSparPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparPositionUIDsType <em>Spar Position UI Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparPositionUIDsType
	 * @generated
	 */
	public Adapter createSparPositionUIDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparSegmentsType <em>Spar Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparSegmentsType
	 * @generated
	 */
	public Adapter createSparSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SparSegmentType <em>Spar Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SparSegmentType
	 * @generated
	 */
	public Adapter createSparSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificConfigurationSegmentsType <em>Specific Configuration Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificConfigurationSegmentsType
	 * @generated
	 */
	public Adapter createSpecificConfigurationSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificConfigurationSegmentType <em>Specific Configuration Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificConfigurationSegmentType
	 * @generated
	 */
	public Adapter createSpecificConfigurationSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificConfigurationUIDsType <em>Specific Configuration UI Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificConfigurationUIDsType
	 * @generated
	 */
	public Adapter createSpecificConfigurationUIDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificConfigurationUIDType <em>Specific Configuration UID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificConfigurationUIDType
	 * @generated
	 */
	public Adapter createSpecificConfigurationUIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificExcessPowerType <em>Specific Excess Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificExcessPowerType
	 * @generated
	 */
	public Adapter createSpecificExcessPowerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificHeatMapType <em>Specific Heat Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificHeatMapType
	 * @generated
	 */
	public Adapter createSpecificHeatMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificPerformanceMapsType <em>Specific Performance Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificPerformanceMapsType
	 * @generated
	 */
	public Adapter createSpecificPerformanceMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpecificPerformanceMapType <em>Specific Performance Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpecificPerformanceMapType
	 * @generated
	 */
	public Adapter createSpecificPerformanceMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpeedDesignatorsType <em>Speed Designators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpeedDesignatorsType
	 * @generated
	 */
	public Adapter createSpeedDesignatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpoilersType <em>Spoilers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpoilersType
	 * @generated
	 */
	public Adapter createSpoilersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SpoilerType <em>Spoiler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SpoilerType
	 * @generated
	 */
	public Adapter createSpoilerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StandardProfileSheetIDType <em>Standard Profile Sheet ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StandardProfileSheetIDType
	 * @generated
	 */
	public Adapter createStandardProfileSheetIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StandardProfileType <em>Standard Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StandardProfileType
	 * @generated
	 */
	public Adapter createStandardProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StandardProfileTypeType <em>Standard Profile Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StandardProfileTypeType
	 * @generated
	 */
	public Adapter createStandardProfileTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StateParametersType <em>State Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StateParametersType
	 * @generated
	 */
	public Adapter createStateParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StateParameterType <em>State Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StateParameterType
	 * @generated
	 */
	public Adapter createStateParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StiffnessType <em>Stiffness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StiffnessType
	 * @generated
	 */
	public Adapter createStiffnessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringArrayBaseType <em>String Array Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringArrayBaseType
	 * @generated
	 */
	public Adapter createStringArrayBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringBaseType <em>String Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringBaseType
	 * @generated
	 */
	public Adapter createStringBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringerFramePositionType <em>Stringer Frame Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringerFramePositionType
	 * @generated
	 */
	public Adapter createStringerFramePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringerFramePositionUIDsType <em>Stringer Frame Position UI Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringerFramePositionUIDsType
	 * @generated
	 */
	public Adapter createStringerFramePositionUIDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringersAssemblyType <em>Stringers Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringersAssemblyType
	 * @generated
	 */
	public Adapter createStringersAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringerType <em>Stringer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringerType
	 * @generated
	 */
	public Adapter createStringerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringUIDBaseType <em>String UID Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringUIDBaseType
	 * @generated
	 */
	public Adapter createStringUIDBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StringVectorBaseType <em>String Vector Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StringVectorBaseType
	 * @generated
	 */
	public Adapter createStringVectorBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralElementsType <em>Structural Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralElementsType
	 * @generated
	 */
	public Adapter createStructuralElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralMountType <em>Structural Mount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralMountType
	 * @generated
	 */
	public Adapter createStructuralMountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralProfile3DType <em>Structural Profile3 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralProfile3DType
	 * @generated
	 */
	public Adapter createStructuralProfile3DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralProfilesType <em>Structural Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralProfilesType
	 * @generated
	 */
	public Adapter createStructuralProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralProfileType <em>Structural Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralProfileType
	 * @generated
	 */
	public Adapter createStructuralProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralWallElementsType <em>Structural Wall Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralWallElementsType
	 * @generated
	 */
	public Adapter createStructuralWallElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StructuralWallElementType <em>Structural Wall Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StructuralWallElementType
	 * @generated
	 */
	public Adapter createStructuralWallElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StrutAssemblyType <em>Strut Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StrutAssemblyType
	 * @generated
	 */
	public Adapter createStrutAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StrutPropertiesType <em>Strut Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StrutPropertiesType
	 * @generated
	 */
	public Adapter createStrutPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StrutType <em>Strut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StrutType
	 * @generated
	 */
	public Adapter createStrutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.StudiesType <em>Studies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.StudiesType
	 * @generated
	 */
	public Adapter createStudiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SubFleetsType <em>Sub Fleets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SubFleetsType
	 * @generated
	 */
	public Adapter createSubFleetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SubFleetType <em>Sub Fleet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SubFleetType
	 * @generated
	 */
	public Adapter createSubFleetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SubLoadType <em>Sub Load Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SubLoadType
	 * @generated
	 */
	public Adapter createSubLoadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SuperEllipseProfileType <em>Super Ellipse Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SuperEllipseProfileType
	 * @generated
	 */
	public Adapter createSuperEllipseProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SupportBeamType <em>Support Beam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SupportBeamType
	 * @generated
	 */
	public Adapter createSupportBeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.SystemsType <em>Systems Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.SystemsType
	 * @generated
	 */
	public Adapter createSystemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TailplaneAttachmentAreaType <em>Tailplane Attachment Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TailplaneAttachmentAreaType
	 * @generated
	 */
	public Adapter createTailplaneAttachmentAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TailplaneAttachmentTypeType <em>Tailplane Attachment Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TailplaneAttachmentTypeType
	 * @generated
	 */
	public Adapter createTailplaneAttachmentTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TakeoffPerformanceParametersType <em>Takeoff Performance Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TakeoffPerformanceParametersType
	 * @generated
	 */
	public Adapter createTakeoffPerformanceParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TangentLinksType <em>Tangent Links Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TangentLinksType
	 * @generated
	 */
	public Adapter createTangentLinksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TiedInterfacesType <em>Tied Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TiedInterfacesType
	 * @generated
	 */
	public Adapter createTiedInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TiedInterfaceType <em>Tied Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TiedInterfaceType
	 * @generated
	 */
	public Adapter createTiedInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TimeBaseType <em>Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TimeBaseType
	 * @generated
	 */
	public Adapter createTimeBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TimeConstraintBaseType <em>Time Constraint Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TimeConstraintBaseType
	 * @generated
	 */
	public Adapter createTimeConstraintBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ToolspecificType <em>Toolspecific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ToolspecificType
	 * @generated
	 */
	public Adapter createToolspecificTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ToolType
	 * @generated
	 */
	public Adapter createToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TopologyEntriesType <em>Topology Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TopologyEntriesType
	 * @generated
	 */
	public Adapter createTopologyEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TopologyEntryType <em>Topology Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TopologyEntryType
	 * @generated
	 */
	public Adapter createTopologyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TotalOperatingCostType <em>Total Operating Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TotalOperatingCostType
	 * @generated
	 */
	public Adapter createTotalOperatingCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackActuatorType <em>Track Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackActuatorType
	 * @generated
	 */
	public Adapter createTrackActuatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackJointCoordinatesType <em>Track Joint Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackJointCoordinatesType
	 * @generated
	 */
	public Adapter createTrackJointCoordinatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackJointPositionsType <em>Track Joint Positions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackJointPositionsType
	 * @generated
	 */
	public Adapter createTrackJointPositionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackJointPositionType <em>Track Joint Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackJointPositionType
	 * @generated
	 */
	public Adapter createTrackJointPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackSecondaryStructureType <em>Track Secondary Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackSecondaryStructureType
	 * @generated
	 */
	public Adapter createTrackSecondaryStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackStructureType <em>Track Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackStructureType
	 * @generated
	 */
	public Adapter createTrackStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackStrutsType <em>Track Struts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackStrutsType
	 * @generated
	 */
	public Adapter createTrackStrutsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackStrutType <em>Track Strut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackStrutType
	 * @generated
	 */
	public Adapter createTrackStrutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackSubTypeType <em>Track Sub Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackSubTypeType
	 * @generated
	 */
	public Adapter createTrackSubTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrackTypeType <em>Track Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrackTypeType
	 * @generated
	 */
	public Adapter createTrackTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrailingEdgeDevicesType <em>Trailing Edge Devices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrailingEdgeDevicesType
	 * @generated
	 */
	public Adapter createTrailingEdgeDevicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrailingEdgeDeviceType <em>Trailing Edge Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrailingEdgeDeviceType
	 * @generated
	 */
	public Adapter createTrailingEdgeDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrajectoriesType <em>Trajectories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrajectoriesType
	 * @generated
	 */
	public Adapter createTrajectoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrajectoryGlobalType <em>Trajectory Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrajectoryGlobalType
	 * @generated
	 */
	public Adapter createTrajectoryGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrajectoryType <em>Trajectory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrajectoryType
	 * @generated
	 */
	public Adapter createTrajectoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.Transformation2DType <em>Transformation2 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.Transformation2DType
	 * @generated
	 */
	public Adapter createTransformation2DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransformationType <em>Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransformationType
	 * @generated
	 */
	public Adapter createTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionGearRatioType <em>Transmission Gear Ratio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionGearRatioType
	 * @generated
	 */
	public Adapter createTransmissionGearRatioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionShaftInputsType <em>Transmission Shaft Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionShaftInputsType
	 * @generated
	 */
	public Adapter createTransmissionShaftInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionShaftInputType <em>Transmission Shaft Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionShaftInputType
	 * @generated
	 */
	public Adapter createTransmissionShaftInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionShaftOutputsType <em>Transmission Shaft Outputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionShaftOutputsType
	 * @generated
	 */
	public Adapter createTransmissionShaftOutputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionShaftOutputType <em>Transmission Shaft Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionShaftOutputType
	 * @generated
	 */
	public Adapter createTransmissionShaftOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionsType <em>Transmissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionsType
	 * @generated
	 */
	public Adapter createTransmissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TransmissionType <em>Transmission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TransmissionType
	 * @generated
	 */
	public Adapter createTransmissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrimCaseType <em>Trim Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrimCaseType
	 * @generated
	 */
	public Adapter createTrimCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrimRequirementsType <em>Trim Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrimRequirementsType
	 * @generated
	 */
	public Adapter createTrimRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrimRequirementType <em>Trim Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrimRequirementType
	 * @generated
	 */
	public Adapter createTrimRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TrimType <em>Trim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TrimType
	 * @generated
	 */
	public Adapter createTrimTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TurnAngleType <em>Turn Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TurnAngleType
	 * @generated
	 */
	public Adapter createTurnAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TypeOfPointPerformanceType <em>Type Of Point Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TypeOfPointPerformanceType
	 * @generated
	 */
	public Adapter createTypeOfPointPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.TypeType4 <em>Type Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.TypeType4
	 * @generated
	 */
	public Adapter createTypeType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.UIDGroupDefinitionsType <em>UID Group Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.UIDGroupDefinitionsType
	 * @generated
	 */
	public Adapter createUIDGroupDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.UIDGroupDefinitionType <em>UID Group Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.UIDGroupDefinitionType
	 * @generated
	 */
	public Adapter createUIDGroupDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.UIDSequenceType <em>UID Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.UIDSequenceType
	 * @generated
	 */
	public Adapter createUIDSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.UpperLinksType <em>Upper Links Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.UpperLinksType
	 * @generated
	 */
	public Adapter createUpperLinksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VariableConditionsType <em>Variable Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VariableConditionsType
	 * @generated
	 */
	public Adapter createVariableConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VariableSegmentsType <em>Variable Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VariableSegmentsType
	 * @generated
	 */
	public Adapter createVariableSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VariableSegmentType <em>Variable Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VariableSegmentType
	 * @generated
	 */
	public Adapter createVariableSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VehicleConfigurationsType <em>Vehicle Configurations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VehicleConfigurationsType
	 * @generated
	 */
	public Adapter createVehicleConfigurationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VehicleConfigurationType <em>Vehicle Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VehicleConfigurationType
	 * @generated
	 */
	public Adapter createVehicleConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VehiclesType <em>Vehicles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VehiclesType
	 * @generated
	 */
	public Adapter createVehiclesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VersionInfosType <em>Version Infos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VersionInfosType
	 * @generated
	 */
	public Adapter createVersionInfosTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VersionInfoType <em>Version Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VersionInfoType
	 * @generated
	 */
	public Adapter createVersionInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VtpFrameDefType <em>Vtp Frame Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VtpFrameDefType
	 * @generated
	 */
	public Adapter createVtpFrameDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.VtpInterfaceDefType <em>Vtp Interface Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.VtpInterfaceDefType
	 * @generated
	 */
	public Adapter createVtpInterfaceDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallPositionsType <em>Wall Positions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallPositionsType
	 * @generated
	 */
	public Adapter createWallPositionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallPositionType <em>Wall Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallPositionType
	 * @generated
	 */
	public Adapter createWallPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallPositionUIDsType <em>Wall Position UI Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallPositionUIDsType
	 * @generated
	 */
	public Adapter createWallPositionUIDsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallSegmentsType <em>Wall Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallSegmentsType
	 * @generated
	 */
	public Adapter createWallSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallSegmentType <em>Wall Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallSegmentType
	 * @generated
	 */
	public Adapter createWallSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WallsType <em>Walls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WallsType
	 * @generated
	 */
	public Adapter createWallsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WayPointTypeType <em>Way Point Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WayPointTypeType
	 * @generated
	 */
	public Adapter createWayPointTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WebType <em>Web Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WebType
	 * @generated
	 */
	public Adapter createWebTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalanceCaseType <em>Weight And Balance Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalanceCaseType
	 * @generated
	 */
	public Adapter createWeightAndBalanceCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalanceFuelInTanksType <em>Weight And Balance Fuel In Tanks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalanceFuelInTanksType
	 * @generated
	 */
	public Adapter createWeightAndBalanceFuelInTanksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalanceFuelInTankType <em>Weight And Balance Fuel In Tank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalanceFuelInTankType
	 * @generated
	 */
	public Adapter createWeightAndBalanceFuelInTankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalanceFuelType <em>Weight And Balance Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalanceFuelType
	 * @generated
	 */
	public Adapter createWeightAndBalanceFuelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalancemCargosType <em>Weight And Balancem Cargos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalancemCargosType
	 * @generated
	 */
	public Adapter createWeightAndBalancemCargosTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalancemPaxxType <em>Weight And Balancem Paxx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalancemPaxxType
	 * @generated
	 */
	public Adapter createWeightAndBalancemPaxxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalancePayloadType <em>Weight And Balance Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalancePayloadType
	 * @generated
	 */
	public Adapter createWeightAndBalancePayloadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WeightAndBalanceType <em>Weight And Balance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WeightAndBalanceType
	 * @generated
	 */
	public Adapter createWeightAndBalanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WheelType <em>Wheel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WheelType
	 * @generated
	 */
	public Adapter createWheelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WindowAssemblyPositionType <em>Window Assembly Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WindowAssemblyPositionType
	 * @generated
	 */
	public Adapter createWindowAssemblyPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WindowsAssemblyType <em>Windows Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WindowsAssemblyType
	 * @generated
	 */
	public Adapter createWindowsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WindowsType <em>Windows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WindowsType
	 * @generated
	 */
	public Adapter createWindowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingAeroPerformanceType <em>Wing Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingAeroPerformanceType
	 * @generated
	 */
	public Adapter createWingAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingAirfoilsType <em>Wing Airfoils Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingAirfoilsType
	 * @generated
	 */
	public Adapter createWingAirfoilsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingAttachmentPositioningType <em>Wing Attachment Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingAttachmentPositioningType
	 * @generated
	 */
	public Adapter createWingAttachmentPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingCellsType <em>Wing Cells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingCellsType
	 * @generated
	 */
	public Adapter createWingCellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingCellType <em>Wing Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingCellType
	 * @generated
	 */
	public Adapter createWingCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingComponentSegmentStructureType <em>Wing Component Segment Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingComponentSegmentStructureType
	 * @generated
	 */
	public Adapter createWingComponentSegmentStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingElementsType <em>Wing Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingElementsType
	 * @generated
	 */
	public Adapter createWingElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingElementType <em>Wing Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingElementType
	 * @generated
	 */
	public Adapter createWingElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuelTankBorderType <em>Wing Fuel Tank Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuelTankBorderType
	 * @generated
	 */
	public Adapter createWingFuelTankBorderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuelTankGeometryType <em>Wing Fuel Tank Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuelTankGeometryType
	 * @generated
	 */
	public Adapter createWingFuelTankGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuelTanksType <em>Wing Fuel Tanks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuelTanksType
	 * @generated
	 */
	public Adapter createWingFuelTanksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuelTankType <em>Wing Fuel Tank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuelTankType
	 * @generated
	 */
	public Adapter createWingFuelTankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuselageAttachmentsType <em>Wing Fuselage Attachments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuselageAttachmentsType
	 * @generated
	 */
	public Adapter createWingFuselageAttachmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingFuselageAttachmentType <em>Wing Fuselage Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingFuselageAttachmentType
	 * @generated
	 */
	public Adapter createWingFuselageAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingInterfaceDefinitionsType <em>Wing Interface Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingInterfaceDefinitionsType
	 * @generated
	 */
	public Adapter createWingInterfaceDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingInterfaceMainFramesType <em>Wing Interface Main Frames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingInterfaceMainFramesType
	 * @generated
	 */
	public Adapter createWingInterfaceMainFramesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingInterfaceSupportStrutsAssemblyType <em>Wing Interface Support Struts Assembly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingInterfaceSupportStrutsAssemblyType
	 * @generated
	 */
	public Adapter createWingInterfaceSupportStrutsAssemblyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingInterfaceSupportStrutType <em>Wing Interface Support Strut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingInterfaceSupportStrutType
	 * @generated
	 */
	public Adapter createWingInterfaceSupportStrutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingIntermediateStructureCellsType <em>Wing Intermediate Structure Cells Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingIntermediateStructureCellsType
	 * @generated
	 */
	public Adapter createWingIntermediateStructureCellsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingIntermediateStructureCellType <em>Wing Intermediate Structure Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingIntermediateStructureCellType
	 * @generated
	 */
	public Adapter createWingIntermediateStructureCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibCellType <em>Wing Rib Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibCellType
	 * @generated
	 */
	public Adapter createWingRibCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibCrossSectionType <em>Wing Rib Cross Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibCrossSectionType
	 * @generated
	 */
	public Adapter createWingRibCrossSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibExplicitPositioningType <em>Wing Rib Explicit Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibExplicitPositioningType
	 * @generated
	 */
	public Adapter createWingRibExplicitPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibPointType <em>Wing Rib Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibPointType
	 * @generated
	 */
	public Adapter createWingRibPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibsDefinitionsType <em>Wing Ribs Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibsDefinitionsType
	 * @generated
	 */
	public Adapter createWingRibsDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibsDefinitionType <em>Wing Ribs Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibsDefinitionType
	 * @generated
	 */
	public Adapter createWingRibsDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingRibsPositioningType <em>Wing Ribs Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingRibsPositioningType
	 * @generated
	 */
	public Adapter createWingRibsPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingsAeroPerformanceType <em>Wings Aero Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingsAeroPerformanceType
	 * @generated
	 */
	public Adapter createWingsAeroPerformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSectionsType <em>Wing Sections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSectionsType
	 * @generated
	 */
	public Adapter createWingSectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSectionType <em>Wing Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSectionType
	 * @generated
	 */
	public Adapter createWingSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSegmentsType <em>Wing Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSegmentsType
	 * @generated
	 */
	public Adapter createWingSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSegmentType <em>Wing Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSegmentType
	 * @generated
	 */
	public Adapter createWingSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingShellType <em>Wing Shell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingShellType
	 * @generated
	 */
	public Adapter createWingShellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSkinType <em>Wing Skin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSkinType
	 * @generated
	 */
	public Adapter createWingSkinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingSparType <em>Wing Spar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingSparType
	 * @generated
	 */
	public Adapter createWingSparTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingStringerType <em>Wing Stringer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingStringerType
	 * @generated
	 */
	public Adapter createWingStringerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingStructuralMountsType <em>Wing Structural Mounts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingStructuralMountsType
	 * @generated
	 */
	public Adapter createWingStructuralMountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingsType <em>Wings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingsType
	 * @generated
	 */
	public Adapter createWingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingType <em>Wing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingType
	 * @generated
	 */
	public Adapter createWingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingWingAttachmentElementsType <em>Wing Wing Attachment Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingWingAttachmentElementsType
	 * @generated
	 */
	public Adapter createWingWingAttachmentElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingWingAttachmentSparsType <em>Wing Wing Attachment Spars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingWingAttachmentSparsType
	 * @generated
	 */
	public Adapter createWingWingAttachmentSparsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingWingAttachmentsSparsType <em>Wing Wing Attachments Spars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingWingAttachmentsSparsType
	 * @generated
	 */
	public Adapter createWingWingAttachmentsSparsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingWingAttachmentsType <em>Wing Wing Attachments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingWingAttachmentsType
	 * @generated
	 */
	public Adapter createWingWingAttachmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.WingWingAttachmentType <em>Wing Wing Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.WingWingAttachmentType
	 * @generated
	 */
	public Adapter createWingWingAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.XsiIsoLineType <em>Xsi Iso Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.XsiIsoLineType
	 * @generated
	 */
	public Adapter createXsiIsoLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ZCouplingsType <em>ZCouplings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ZCouplingsType
	 * @generated
	 */
	public Adapter createZCouplingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Cpacs.ZCouplingType <em>ZCoupling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Cpacs.ZCouplingType
	 * @generated
	 */
	public Adapter createZCouplingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CpacsAdapterFactory
