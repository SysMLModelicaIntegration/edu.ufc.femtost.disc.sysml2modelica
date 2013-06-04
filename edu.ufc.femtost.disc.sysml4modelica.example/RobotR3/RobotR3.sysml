<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:Classes="http://www.femto-st.fr/disc/SysML4Modelica/Classes" xmlns:Components="http://www.femto-st.fr/disc/SysML4Modelica/Components" xmlns:EquationsAndAlgorithms="http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:sysML="http://www.topcased.org/2.0/sysML" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xsi:schemaLocation="http://www.femto-st.fr/disc/SysML4Modelica/Classes http://www.femto-st.fr/disc/SysML4Modelica#//classes http://www.femto-st.fr/disc/SysML4Modelica/Components http://www.femto-st.fr/disc/SysML4Modelica#//components http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms http://www.femto-st.fr/disc/SysML4Modelica#//equationsandalgorithms">
  <uml:Model xmi:id="idModel" name="RobotR3">
    <packagedElement xmi:type="uml:Package" xmi:id="idPackage" name="RobotR3">
      <packagedElement xmi:type="sysML:Block" xmi:id="_qcbMELCgEeKV4bTJZ5Azxw" name="RobotR3">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_wkSiMLCgEeKV4bTJZ5Azxw" name="Components">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_JHyGILChEeKV4bTJZ5Azxw" name="AxisControlBus">
            <generalization xmi:type="uml:Generalization" xmi:id="_eFhNELDdEeK0T7edPe2X5A">
              <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_RaOmMLDdEeK0T7edPe2X5A"/>
            </generalization>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_3O9bsLCmEeKzo_FD3Yn8sw" name="motion_ref">
              <type xmi:type="uml:DataType" href="../../org.omg.sysml4modelica.library/library/sysml4modelica.library.sysml#_dVPKAJhPEeKZMJ2_m9jhLg"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_FjjisrCnEeKzo_FD3Yn8sw" name="angle_ref">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uEnZyLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_TioTYrCsEeKzo_FD3Yn8sw" name="angle">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uEnZyLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_VgypMrCsEeKzo_FD3Yn8sw" name="speed_ref">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_X67JULCsEeKzo_FD3Yn8sw" name="speed">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_qRMWArCsEeKzo_FD3Yn8sw" name="acceleration_ref">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_5u3aYLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_rBi04rCsEeKzo_FD3Yn8sw" name="acceleration">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_5u3aYLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_r1KqMLCsEeKzo_FD3Yn8sw" name="current_ref">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_PaHtQLCpEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_sc4xgrCsEeKzo_FD3Yn8sw" name="current">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_PaHtQLCpEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_tIesMrCsEeKzo_FD3Yn8sw" name="motorAngle">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uEnZyLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_t9lvQrCsEeKzo_FD3Yn8sw" name="motorSpeed">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_-SbPsLCsEeKzo_FD3Yn8sw" name="AxisType1">
            <generalization xmi:type="uml:Generalization" xmi:id="_GZDYk7CtEeKzo_FD3Yn8sw" general="_BkWTe7CtEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_ZkboUrCtEeKzo_FD3Yn8sw" name="c">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_hWq1kLCtEeKzo_FD3Yn8sw" value="43.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_iKvW0rCtEeKzo_FD3Yn8sw" name="cd">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_odUvMLCtEeKzo_FD3Yn8sw" value="0.005"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_BkWTe7CtEeKzo_FD3Yn8sw" name="AxisType2">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_u_FMALCtEeKzo_FD3Yn8sw" name="kp">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_39DMkLCtEeKzo_FD3Yn8sw" value="10.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_v0fKArCtEeKzo_FD3Yn8sw" name="ks">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_4cceULCtEeKzo_FD3Yn8sw" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_o-TqcrCvEeKzo_FD3Yn8sw" name="Ts">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_s6elELCvEeKzo_FD3Yn8sw" value="0.01"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_tV25grCvEeKzo_FD3Yn8sw" name="k">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_uwKUULCvEeKzo_FD3Yn8sw" value="1.1616"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_zFxCoLCvEeKzo_FD3Yn8sw" name="w">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_3Pxk8LCvEeKzo_FD3Yn8sw" value="4590.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_4zc-MrCvEeKzo_FD3Yn8sw" name="D">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_79pCQLCvEeKzo_FD3Yn8sw" value="0.6"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_-e6FILCvEeKzo_FD3Yn8sw" name="J">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_AGf_8LCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_FPsccLCwEeKzo_FD3Yn8sw" value="0.0013"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_3_o5orDFEeKzo_FD3Yn8sw" name="ratio">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_8Qo0wLDFEeKzo_FD3Yn8sw" value="-105.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_-fAw0rDFEeKzo_FD3Yn8sw" name="Rv0">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_CiQ3wLCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_CQUfQLDGEeKzo_FD3Yn8sw" value="0.4"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_DaQi0rDGEeKzo_FD3Yn8sw" name="Rv1">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_FOm1ULDGEeKzo_FD3Yn8sw" value="0.13 / 160"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_K-E5kLDGEeKzo_FD3Yn8sw" name="peak">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_O3HnsLDGEeKzo_FD3Yn8sw" value="1"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_YwTTU7DGEeKzo_FD3Yn8sw" name="flange" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_iiujkLCuEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_6Ap5srDGEeKzo_FD3Yn8sw" name="gear" type="_zwTV8LDGEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_fSh0wrDHEeKzo_FD3Yn8sw" name="motor" type="_cQ0-ULDHEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_qBt7ULDHEeKzo_FD3Yn8sw" name="controller" type="_mZoaULDHEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_PBmHcrDIEeKzo_FD3Yn8sw" name="axisControlBus" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_WWOysLDIEeKzo_FD3Yn8sw" name="angleSensor" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_7VsG4LCuEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Zq-g8LDIEeKzo_FD3Yn8sw" name="speedSensor" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#__-gFG7CuEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_hFt0MrDIEeKzo_FD3Yn8sw" name="accSensor" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_D4vGALCvEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_nPhEALDIEeKzo_FD3Yn8sw" name="initializeFlange" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_MRzpwLCvEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_qnPNwrDIEeKzo_FD3Yn8sw" name="const" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_ZZ7Wm7CvEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_pXAqELDKEeKzo_FD3Yn8sw" name="Connector1" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_pXAqEbDKEeKzo_FD3Yn8sw" role="_YwTTU7DGEeKzo_FD3Yn8sw"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_pXAqErDKEeKzo_FD3Yn8sw" partWithPort="_6Ap5srDGEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_PoIUQLDOEeKzo_FD3Yn8sw" name="Connector2" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PoIUQbDOEeKzo_FD3Yn8sw" partWithPort="_6Ap5srDGEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PoIUQrDOEeKzo_FD3Yn8sw" partWithPort="_hFt0MrDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_RP5qs7DLEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_RCWPgLDOEeKzo_FD3Yn8sw" name="Connector3" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_RCWPgbDOEeKzo_FD3Yn8sw" partWithPort="_6Ap5srDGEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_RCWPgrDOEeKzo_FD3Yn8sw" partWithPort="_Zq-g8LDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_RP5qs7DLEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_TCPDoLDOEeKzo_FD3Yn8sw" name="Connector4" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_TCPDobDOEeKzo_FD3Yn8sw" partWithPort="_6Ap5srDGEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_TCPDorDOEeKzo_FD3Yn8sw" partWithPort="_WWOysLDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_RP5qs7DLEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_1cYJULDeEeK0T7edPe2X5A" name="Connector5" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_1cYJUbDeEeK0T7edPe2X5A" partWithPort="_6Ap5srDGEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_1CX6c7DJEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_1cYJUrDeEeK0T7edPe2X5A" role="_KCFeg7DeEeK0T7edPe2X5A" partWithPort="_fSh0wrDHEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_kvX08LDoEeK0T7edPe2X5A" name="Connector6" kind="delegation">
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_kvX08bDoEeK0T7edPe2X5A" role="_1tEhorDnEeK0T7edPe2X5A" propertyPath="_fSh0wrDHEeKzo_FD3Yn8sw"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_kvX08rDoEeK0T7edPe2X5A" role="_PBmHcrDIEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_nC59YLFiEeK0T7edPe2X5A" name="Connector7" kind="delegation">
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_nC59YbFiEeK0T7edPe2X5A" role="_X67JULCsEeKzo_FD3Yn8sw" propertyPath="_PBmHcrDIEeKzo_FD3Yn8sw"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_nC59YrFiEeK0T7edPe2X5A" partWithPort="_Zq-g8LDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_EhiPwLDNEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_BeEbULFoEeK0T7edPe2X5A" name="Connector8" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_BeEbUbFoEeK0T7edPe2X5A" partWithPort="_WWOysLDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_t66BILDMEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_BeEbUrFoEeK0T7edPe2X5A" role="_TioTYrCsEeKzo_FD3Yn8sw" propertyPath="_PBmHcrDIEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_XG6MALFoEeK0T7edPe2X5A" name="Connector9" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_XG6MAbFoEeK0T7edPe2X5A" partWithPort="_hFt0MrDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_PsL_w7DMEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_XG6MArFoEeK0T7edPe2X5A" role="_rBi04rCsEeKzo_FD3Yn8sw" propertyPath="_PBmHcrDIEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_A6xEgLFpEeK0T7edPe2X5A" name="Connector10" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_A6xEgbFpEeK0T7edPe2X5A" role="_PBmHcrDIEeKzo_FD3Yn8sw"/>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_A6xEgrFpEeK0T7edPe2X5A" role="_sESk4rFoEeK0T7edPe2X5A" propertyPath="_qBt7ULDHEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_bdSrgLFqEeK0T7edPe2X5A" name="Connector11" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_bdSrgbFqEeK0T7edPe2X5A" partWithPort="_nPhEALDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_68fSw7FpEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_bdSrgrFqEeK0T7edPe2X5A" role="_YwTTU7DGEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_txDWwLFqEeK0T7edPe2X5A" name="Connector12" kind="delegation">
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_txDWwbFqEeK0T7edPe2X5A" role="_FjjisrCnEeKzo_FD3Yn8sw" propertyPath="_PBmHcrDIEeKzo_FD3Yn8sw"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_txDWwrFqEeK0T7edPe2X5A" partWithPort="_nPhEALDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_rYmHE7FpEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_uX4tQLFqEeK0T7edPe2X5A" name="Connector13" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_uX4tQbFqEeK0T7edPe2X5A" partWithPort="_nPhEALDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_w0LmA7FpEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_uX4tQrFqEeK0T7edPe2X5A" role="_VgypMrCsEeKzo_FD3Yn8sw" propertyPath="_PBmHcrDIEeKzo_FD3Yn8sw"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_ssftALFrEeK0T7edPe2X5A" name="Connector14" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_ssftAbFrEeK0T7edPe2X5A" partWithPort="_qnPNwrDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_JSfSg7FrEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_ssftArFrEeK0T7edPe2X5A" partWithPort="_nPhEALDIEeKzo_FD3Yn8sw">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_xJnDc7FpEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_zwTV8LDGEeKzo_FD3Yn8sw" name="GearType2">
            <generalization xmi:type="uml:Generalization" xmi:id="_LpPZoLDKEeKzo_FD3Yn8sw">
              <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uY4d8LDJEeKzo_FD3Yn8sw"/>
            </generalization>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_SFkO4LGxEeK316ztRocnAA" name="i">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_XBU-QLGxEeK316ztRocnAA" value="-99"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_X3MPQrGxEeK316ztRocnAA" name="Rv0">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_CiQ3wLCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_cBiv0LGxEeK316ztRocnAA" value="21.8"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_c6_gUrGxEeK316ztRocnAA" name="peak">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_jGc9ALGxEeK316ztRocnAA" value="26.7 / 21.8"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_l96SUrGxEeK316ztRocnAA" name="Rv1">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_qnzOkLGxEeK316ztRocnAA" value="9.8"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_wMvd0LGxEeK316ztRocnAA" name="unitAngularVelocity">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_zm3bULGxEeK316ztRocnAA" value="1"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_0WCOcLGxEeK316ztRocnAA" name="unitTorque">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_CiQ3wLCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_3VY7gLGxEeK316ztRocnAA" value="1"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_IEDRMLGyEeKc4o4DciZSBQ" name="gear" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_i70jsLGYEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Os_UELGyEeKc4o4DciZSBQ" name="bearingFriction" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_LYnXELGjEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_BqDz0bGzEeKgG5qcPzyCcg" name="gear2" type="_zwTV8LDGEeKzo_FD3Yn8sw"/>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_HeCkoLGzEeKgG5qcPzyCcg" name="Connector1" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_HeCkobGzEeKgG5qcPzyCcg" partWithPort="_IEDRMLGyEeKc4o4DciZSBQ">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_hw3XA7GZEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_HeCkorGzEeKgG5qcPzyCcg" partWithPort="_Os_UELGyEeKc4o4DciZSBQ">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_dEnDQ7GZEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_JabY0LGzEeKgG5qcPzyCcg" name="Connector2" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_JabY0bGzEeKgG5qcPzyCcg" partWithPort="_Os_UELGyEeKc4o4DciZSBQ">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_hw3XA7GZEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_JabY0rGzEeKgG5qcPzyCcg" partWithPort="_BqDz0bGzEeKgG5qcPzyCcg">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_PAu6ALGzEeKgG5qcPzyCcg" name="Connector3" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PAu6AbGzEeKgG5qcPzyCcg" partWithPort="_IEDRMLGyEeKc4o4DciZSBQ">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_dEnDQ7GZEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PAu6ArGzEeKgG5qcPzyCcg" partWithPort="_BqDz0bGzEeKgG5qcPzyCcg">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_1CX6c7DJEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_cQ0-ULDHEeKzo_FD3Yn8sw" name="Motor">
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_KCFeg7DeEeK0T7edPe2X5A" name="flange_motor" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_iiujkLCuEeKzo_FD3Yn8sw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_1tEhorDnEeK0T7edPe2X5A" name="axisControlBus" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_mZoaULDHEeKzo_FD3Yn8sw" name="Controller">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_sESk4rFoEeK0T7edPe2X5A" name="axisControlBus" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_rX_Q0LFuEeK0T7edPe2X5A" name="kp">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_5W2_cLFuEeK0T7edPe2X5A" value="10.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_sI8zsrFuEeK0T7edPe2X5A" name="ks">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_8yLPwLFuEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_s6WbcrFuEeK0T7edPe2X5A" name="Ts">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_ChHIgLFvEeK0T7edPe2X5A" value="0.01"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_tpqYgrFuEeK0T7edPe2X5A" name="ratio">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_HoBX8LFvEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_v-wnorFuEeK0T7edPe2X5A" name="gain1" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_X-epALFvEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_wxzOIrFuEeK0T7edPe2X5A" name="PI" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_A8jwELFwEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_xsbDUrFuEeK0T7edPe2X5A" name="feedback1" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_qlBJgLFzEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_zKwCgrFuEeK0T7edPe2X5A" name="P" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_X-epALFvEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_zxui8LFuEeK0T7edPe2X5A" name="add3" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_oY168LF1EeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_0kBikrFuEeK0T7edPe2X5A" name="gain2" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_X-epALFvEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_AebTgLF5EeK0T7edPe2X5A" name="Connector1" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_AebTgbF5EeK0T7edPe2X5A" partWithPort="_v-wnorFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uGb-o7FvEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_AebTgrF5EeK0T7edPe2X5A" partWithPort="_xsbDUrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_7SA10LF0EeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_DlNeQLF5EeK0T7edPe2X5A" name="Connector2" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_DlNeQbF5EeK0T7edPe2X5A" partWithPort="_xsbDUrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_bDDlkLF1EeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_DlNeQrF5EeK0T7edPe2X5A" partWithPort="_zKwCgrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_nRNzQ7FvEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_GPbBwLF5EeK0T7edPe2X5A" name="Connector3" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_GPbBwbF5EeK0T7edPe2X5A" partWithPort="_zKwCgrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uGb-o7FvEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_GPbBwrF5EeK0T7edPe2X5A" partWithPort="_zxui8LFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_8T4GA7F1EeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_KCRoULF5EeK0T7edPe2X5A" name="Connector4" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_KCRoUbF5EeK0T7edPe2X5A" partWithPort="_0kBikrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uGb-o7FvEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_KCRoUrF5EeK0T7edPe2X5A" partWithPort="_zxui8LFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_74M2o7F1EeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_Md59QLF5EeK0T7edPe2X5A" name="Connector5" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_Md59QbF5EeK0T7edPe2X5A" partWithPort="_zxui8LFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_-SV907F1EeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_Md59QrF5EeK0T7edPe2X5A" partWithPort="_wxzOIrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_Y5m_E7FwEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_aqca0LGBEeK0T7edPe2X5A" name="Connector6" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_aqca0bGBEeK0T7edPe2X5A" partWithPort="_0kBikrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_nRNzQ7FvEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_aqca0rGBEeK0T7edPe2X5A" role="_VgypMrCsEeKzo_FD3Yn8sw" propertyPath="_sESk4rFoEeK0T7edPe2X5A"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_k_s-cLGBEeK0T7edPe2X5A" name="Connector7" kind="delegation">
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_k_s-cbGBEeK0T7edPe2X5A" role="_FjjisrCnEeKzo_FD3Yn8sw" propertyPath="_sESk4rFoEeK0T7edPe2X5A"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_k_s-crGBEeK0T7edPe2X5A" partWithPort="_v-wnorFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_nRNzQ7FvEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_u7pDILGBEeK0T7edPe2X5A" name="Connector8" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_u7pDIbGBEeK0T7edPe2X5A" partWithPort="_xsbDUrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_Xv6Z07F1EeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_u7pDIrGBEeK0T7edPe2X5A" role="_tIesMrCsEeKzo_FD3Yn8sw" propertyPath="_sESk4rFoEeK0T7edPe2X5A"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_zC3XMLGBEeK0T7edPe2X5A" name="Connector9" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_zC3XMbGBEeK0T7edPe2X5A" partWithPort="_zxui8LFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_89GCILF1EeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_zC3XMrGBEeK0T7edPe2X5A" role="_t9lvQrCsEeKzo_FD3Yn8sw" propertyPath="_sESk4rFoEeK0T7edPe2X5A"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_6Jc_YLGBEeK0T7edPe2X5A" name="Connector10" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_6Jc_YbGBEeK0T7edPe2X5A" partWithPort="_wxzOIrFuEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_b_t0Y7FwEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="sysML:NestedConnectorEnd" xmi:id="_6Jc_YrGBEeK0T7edPe2X5A" role="_r1KqMLCsEeKzo_FD3Yn8sw" propertyPath="_sESk4rFoEeK0T7edPe2X5A"/>
            </ownedConnector>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_EyxJcLFsEeK0T7edPe2X5A" name="ControlBus">
            <generalization xmi:type="uml:Generalization" xmi:id="_Okwn8LFsEeK0T7edPe2X5A">
              <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_d3JRK7ChEeKV4bTJZ5Azxw"/>
            </generalization>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_CJST0rFuEeK0T7edPe2X5A" name="axisControlBus1" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_MahTELFuEeK0T7edPe2X5A" name="axisControlBus2" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_N0_F8rFuEeK0T7edPe2X5A" name="axisControlBus3" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_O_hmcrFuEeK0T7edPe2X5A" name="axisControlBus4" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_QE4E8rFuEeK0T7edPe2X5A" name="axisControlBus5" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Q4ghUrFuEeK0T7edPe2X5A" name="axisControlBus6" type="_JHyGILChEeKV4bTJZ5Azxw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_3nd-QLGWEeK0T7edPe2X5A" name="GearType1">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_M_PqwLGwEeK316ztRocnAA" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_P-mX0LGwEeK316ztRocnAA" value="spring.w_rel = 0"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_WJLqwrGwEeK316ztRocnAA" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_WpUjYLGwEeK316ztRocnAA" value="a_rel = 0"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_67f60LGWEeK0T7edPe2X5A">
              <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_uY4d8LDJEeKzo_FD3Yn8sw"/>
            </generalization>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_ErWEQLGXEeK0T7edPe2X5A" name="i">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_ct4QMLGXEeK0T7edPe2X5A" value="-105"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_FSjOMrGXEeK0T7edPe2X5A" name="c">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_nrP8sLGXEeK0T7edPe2X5A" value="43.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_F4soMrGXEeK0T7edPe2X5A" name="d">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_vRyQQLGXEeK0T7edPe2X5A" value="0.005"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_GkSi4rGXEeK0T7edPe2X5A" name="Rv0">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_CiQ3wLCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_0UR5wLGXEeK0T7edPe2X5A" value="0.4"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_HmZgIrGXEeK0T7edPe2X5A" name="Rv1">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="__CwOoLGXEeK0T7edPe2X5A" value="0.13 / 160"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_IyanUrGXEeK0T7edPe2X5A" name="peak">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_HU5rALGYEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_JosIArGXEeK0T7edPe2X5A" name="a_rel">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_5u3aYLCrEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_NqLLALGYEeK0T7edPe2X5A" value="der(spring.w_rel)"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_LaxwsLGXEeK0T7edPe2X5A" name="unitAngularVelocity">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_TqFfALGYEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_NP6GUrGXEeK0T7edPe2X5A" name="unitTorque">
              <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_CiQ3wLCuEeKzo_FD3Yn8sw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_XMDJ4LGYEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Oq_kQLGXEeK0T7edPe2X5A" name="gear" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_i70jsLGYEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Pnr2ArGXEeK0T7edPe2X5A" name="spring" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_r1A_sLGdEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_QpfRQrGXEeK0T7edPe2X5A" name="bearingFriction" aggregation="composite">
              <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_LYnXELGjEeK0T7edPe2X5A"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_bkxmMbGvEeKX9dy6PtDLxA" name="gearType1" type="_3nd-QLGWEeK0T7edPe2X5A"/>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_M01uYLGsEeK0T7edPe2X5A" name="Connector1" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_M01uYbGsEeK0T7edPe2X5A" partWithPort="_QpfRQrGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_hw3XA7GZEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_M01uYrGsEeK0T7edPe2X5A" partWithPort="_Pnr2ArGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_AsY3M7GeEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_PbWdoLGsEeK0T7edPe2X5A" name="Connector2" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PbWdobGsEeK0T7edPe2X5A" partWithPort="_Pnr2ArGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_EI7PgLGeEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_PbWdorGsEeK0T7edPe2X5A" partWithPort="_Oq_kQLGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_dEnDQ7GZEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_kfjI0LGvEeKX9dy6PtDLxA" name="Connector3" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_kfjI0bGvEeKX9dy6PtDLxA" partWithPort="_QpfRQrGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_dEnDQ7GZEeK0T7edPe2X5A"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_kfjI0rGvEeKX9dy6PtDLxA" partWithPort="_bkxmMbGvEeKX9dy6PtDLxA">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_1CX6c7DJEeKzo_FD3Yn8sw"/>
              </end>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_oJTdwLGvEeKX9dy6PtDLxA" name="Connector4" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_oJTdwbGvEeKX9dy6PtDLxA" partWithPort="_bkxmMbGvEeKX9dy6PtDLxA">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2zSec7DJEeKzo_FD3Yn8sw"/>
              </end>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_oJTdwrGvEeKX9dy6PtDLxA" partWithPort="_Oq_kQLGXEeK0T7edPe2X5A">
                <role xmi:type="sysML:FlowPort"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_hw3XA7GZEeK0T7edPe2X5A"/>
              </end>
            </ownedConnector>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_2XyNgLumEeKpL8MCUeA_vw" name="PathPlanning1"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_3id1S7CgEeKV4bTJZ5Azxw" name="fullRobot">
          <generalization xmi:type="uml:Generalization" xmi:id="_duusILccEeKrB6yskAhl0w">
            <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_OOuh8LccEeKrB6yskAhl0w"/>
          </generalization>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_le7SArccEeKrB6yskAhl0w" name="mLoad">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_3RrXYLcbEeKrB6yskAhl0w"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="__LPfMLccEeKrB6yskAhl0w" value="15.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_mHjYQrccEeKrB6yskAhl0w" name="rLoad[3]">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_zaXuoLcbEeKrB6yskAhl0w"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_A5zSwLcdEeKrB6yskAhl0w" value="{0.1,0.25,0.1}"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_nhRkQrccEeKrB6yskAhl0w" name="g">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_8CYtULcbEeKrB6yskAhl0w"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_B6Ec8LcdEeKrB6yskAhl0w" value="9.81"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_pP-hwrccEeKrB6yskAhl0w" name="refStartTime">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_CnwCULcdEeKrB6yskAhl0w" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_qHUZcrccEeKrB6yskAhl0w" name="refSwingTime">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_DRaqYLcdEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_EP6S8rcdEeKrB6yskAhl0w" name="startAngle1">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_YNZ8ILcdEeKrB6yskAhl0w" value="-60.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_E-kvwrcdEeKrB6yskAhl0w" name="startAngle2">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Y3XfILcdEeKrB6yskAhl0w" value="20.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_F9hrUrcdEeKrB6yskAhl0w" name="startAngle3">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Zdm_wLcdEeKrB6yskAhl0w" value="90.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_GmJKgrcdEeKrB6yskAhl0w" name="startAngle4">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_aQ8hMLcdEeKrB6yskAhl0w" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_HPMukrcdEeKrB6yskAhl0w" name="startAngle5">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_bBwTELcdEeKrB6yskAhl0w" value="-110.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_H1wYQrcdEeKrB6yskAhl0w" name="startAngle6">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_bsAJ8LcdEeKrB6yskAhl0w" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_enMIsrcdEeKrB6yskAhl0w" name="endAngle2">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_0enH8LcdEeKrB6yskAhl0w" value="-70.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_fYS1grcdEeKrB6yskAhl0w" name="endAngle3">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_3TFasLcdEeKrB6yskAhl0w" value="-35.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_gEoXErcdEeKrB6yskAhl0w" name="endAngle4">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_4EUqYLcdEeKrB6yskAhl0w" value="45.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_g2B-0rcdEeKrB6yskAhl0w" name="endAngle5">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_5D4C4LcdEeKrB6yskAhl0w" value="110.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_ltwiwrcdEeKrB6yskAhl0w" name="endAngle1">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_2Qt-wLcdEeKrB6yskAhl0w" value="60.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_m0I8ArcdEeKrB6yskAhl0w" name="endAngle6">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_539LMLcdEeKrB6yskAhl0w" value="45.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_7CymorcdEeKrB6yskAhl0w" name="refSpeedMax[6]">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_7NnhILceEeKrB6yskAhl0w" value="{3,1.5,5,3.1,3.1,4.1}"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_9jg28LcdEeKrB6yskAhl0w" name="refAccMax[6]">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_5u3aYLCrEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_8eZzkLceEeKrB6yskAhl0w" value="{15,15,15,60,60,60}"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_-RVmQrcdEeKrB6yskAhl0w" name="kp1">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9CHkoLceEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_-2Y0ELcdEeKrB6yskAhl0w" name="ks1">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9xSXwLceEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="__asbArcdEeKrB6yskAhl0w" name="Ts1">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_FFaFoLcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="__7bwkrcdEeKrB6yskAhl0w" name="kp2">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="__6op4LceEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Ae_JkLceEeKrB6yskAhl0w" name="ks2">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_AgIjoLcfEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_BFYbMrceEeKrB6yskAhl0w" name="Ts2">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_FbbY8LcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Bs9_orceEeKrB6yskAhl0w" name="kp3">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_A9JPwLcfEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_DkJjsrceEeKrB6yskAhl0w" name="ks3">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_BbNEwLcfEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_ELR1ILceEeKrB6yskAhl0w" name="Ts3">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_F2EtkLcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_EweM4rceEeKrB6yskAhl0w" name="kp4">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_B53WsLcfEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_FVFV0rceEeKrB6yskAhl0w" name="ks4">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_CbL7ELcfEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_F1hwcLceEeKrB6yskAhl0w" name="Ts4">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_GeGW4LcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_GqWforceEeKrB6yskAhl0w" name="kp5">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_C4pTILcfEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_HRCFIrceEeKrB6yskAhl0w" name="ks5">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_DVXEULcfEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_HxUuwrceEeKrB6yskAhl0w" name="Ts5">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_G4SYgLcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_IdNkYLceEeKrB6yskAhl0w" name="kp6">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_DyhhcLcfEeKrB6yskAhl0w" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_JF-0krceEeKrB6yskAhl0w" name="ks6">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_EONX4LcfEeKrB6yskAhl0w" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_JxIqYrceEeKrB6yskAhl0w" name="Ts6">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_HVJ6sLcfEeKrB6yskAhl0w" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_ZZtsULcfEeKrB6yskAhl0w" name="axis1" type="_-SbPsLCsEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_dpHE8LcfEeKrB6yskAhl0w" name="axis2" type="_-SbPsLCsEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_gb9AArcfEeKrB6yskAhl0w" name="axis3" type="_-SbPsLCsEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_ivaQYLcfEeKrB6yskAhl0w" name="axis4" type="_BkWTe7CtEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_lHxO4LcfEeKrB6yskAhl0w" name="axis5" type="_BkWTe7CtEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_ngvRYLcfEeKrB6yskAhl0w" name="axis6" type="_BkWTe7CtEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_6ZsUYLcfEeKrB6yskAhl0w" name="controlBus" visibility="protected" type="_EyxJcLFsEeK0T7edPe2X5A"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_6OAOcLCgEeKV4bTJZ5Azxw" name="oneAxis">
          <generalization xmi:type="uml:Generalization" xmi:id="_sxODQLujEeKpL8MCUeA_vw">
            <general xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_OOuh8LccEeKrB6yskAhl0w"/>
          </generalization>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_wZi00LujEeKpL8MCUeA_vw" name="mLoad">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_3RrXYLcbEeKrB6yskAhl0w"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_xQ1zwLukEeKpL8MCUeA_vw" value="15"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="__UiNcLujEeKpL8MCUeA_vw" name="kp">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_z8ndgLukEeKpL8MCUeA_vw" value="5.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_AIs1ULukEeKpL8MCUeA_vw" name="ks">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_1-gcwLukEeKpL8MCUeA_vw" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_A50JMLukEeKpL8MCUeA_vw" name="Ts">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_A0-QALulEeKpL8MCUeA_vw" value="0.05"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Btyj0rukEeKpL8MCUeA_vw" name="startAngle">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_5xsagLukEeKpL8MCUeA_vw" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Cp94MrukEeKpL8MCUeA_vw" name="endAngle">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_F2dM4LulEeKpL8MCUeA_vw" value="120.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Di5rULukEeKpL8MCUeA_vw" name="swingTime">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_97jLULCtEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_SgmkQLulEeKpL8MCUeA_vw" value="0.5"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_Ejp9sLukEeKpL8MCUeA_vw" name="refSpeedMax">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_V-VPYLulEeKpL8MCUeA_vw" value="3.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_FkUJcrukEeKpL8MCUeA_vw" name="refAccMax">
            <type xmi:type="uml:DataType"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_5u3aYLCrEeKzo_FD3Yn8sw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_W8s8ILulEeKpL8MCUeA_vw" value="10.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_PjtKwLukEeKpL8MCUeA_vw" name="axis" type="_-SbPsLCsEeKzo_FD3Yn8sw" aggregation="composite"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_QZx3IrukEeKpL8MCUeA_vw" name="load" aggregation="composite">
            <type xmi:type="sysML:Block"  href="pathmap://SysML4Modelica_LIBRARIES/modelica.library.sysml#_vx1psLulEeKpL8MCUeA_vw"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_XZ6SArukEeKpL8MCUeA_vw" name="controlBus" visibility="protected" type="_EyxJcLFsEeK0T7edPe2X5A" aggregation="composite"/>
        </nestedClassifier>
      </packagedElement>
    </packagedElement>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="idProfileApplication">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="idProfileAnnotation" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="pathmap://SysMLActivityExtensionsProfile.uml#ProfileContentId"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysMLActivityExtensionsProfile.uml#ActivityProfileId"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_b5D9gMoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_b5D9gcoAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#/"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_XkGiwB07Ed-QQ4mYkrb7Gg"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_eOuNUMoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_eOuNUcoAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#//classes"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_Z9wxsMbPEeKThuE6BjWoqQ"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_eWd0EMoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_eWd0EcoAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#//types"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_l0KigMbQEeKThuE6BjWoqQ"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_eZvKgMoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_eZvKgcoAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#//components"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_osBgcMbQEeKThuE6BjWoqQ"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_edwH0MoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_edwH0coAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#//equationsandalgorithms"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_u4nlkMbQEeKThuE6BjWoqQ"/>
    </profileApplication>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_eiEAEMoAEeKyFO3phyTcZQ">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_eiEAEcoAEeKyFO3phyTcZQ" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="http://www.femto-st.fr/disc/SysML4Modelica#//other"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_1LWu8MbQEeKThuE6BjWoqQ"/>
    </profileApplication>
  </uml:Model>
  <Classes:ModelicaModel xmi:id="_eXQKALCgEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaPackage xmi:id="_sidrgLCgEeKV4bTJZ5Azxw" base_Block="_qcbMELCgEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaPackage xmi:id="_x1rRkLCgEeKV4bTJZ5Azxw" base_Block="_wkSiMLCgEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaModel xmi:id="_3wJr8LCgEeKV4bTJZ5Azxw" base_Block="_3id1S7CgEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaModel xmi:id="__d73ALCgEeKV4bTJZ5Azxw" base_Block="_6OAOcLCgEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaConnector xmi:id="_KKb18LChEeKV4bTJZ5Azxw" isExpandable="true" base_Block="_JHyGILChEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaExtends xmi:id="_xD29oLChEeKV4bTJZ5Azxw"/>
  <Components:ModelicaValueProperty xmi:id="_4RKfkLCmEeKzo_FD3Yn8sw" base_Property="_3O9bsLCmEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_ksUNoLCrEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_qzJpALCrEeKzo_FD3Yn8sw" base_Property="_FjjisrCnEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_U2iyULCsEeKzo_FD3Yn8sw" base_Property="_TioTYrCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_V_SjELCsEeKzo_FD3Yn8sw" base_Property="_VgypMrCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_a3tqkLCsEeKzo_FD3Yn8sw" base_Property="_X67JULCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_1HXOULCsEeKzo_FD3Yn8sw" base_Property="_qRMWArCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_1XSgsLCsEeKzo_FD3Yn8sw" base_Property="_rBi04rCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_1nDbALCsEeKzo_FD3Yn8sw" base_Property="_r1KqMLCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_12FVgLCsEeKzo_FD3Yn8sw" base_Property="_sc4xgrCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_2D69MLCsEeKzo_FD3Yn8sw" base_Property="_tIesMrCsEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_2S8QoLCsEeKzo_FD3Yn8sw" base_Property="_t9lvQrCsEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_-mqaULCsEeKzo_FD3Yn8sw" base_Block="_-SbPsLCsEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_HHUMwLCtEeKzo_FD3Yn8sw" base_Block="_BkWTe7CtEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_HuceMLCtEeKzo_FD3Yn8sw" modification="redeclare GearType1 gear(c = c, d = cd)" base_Generalization="_GZDYk7CtEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_cSysALCtEeKzo_FD3Yn8sw" base_Property="_ZkboUrCtEeKzo_FD3Yn8sw" variability="parameter" modification="unit = &quot;N.m/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_kSkmALCtEeKzo_FD3Yn8sw" base_Property="_iKvW0rCtEeKzo_FD3Yn8sw" variability="parameter" modification="unit = &quot;N.m/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_zyl-ULCtEeKzo_FD3Yn8sw" base_Property="_u_FMALCtEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_0BU94LCtEeKzo_FD3Yn8sw" base_Property="_v0fKArCtEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_q-G_ALCvEeKzo_FD3Yn8sw" base_Property="_o-TqcrCvEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_w0HwILCvEeKzo_FD3Yn8sw" base_Property="_tV25grCvEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_zyZfILCvEeKzo_FD3Yn8sw" base_Property="_zFxCoLCvEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_5750ALCvEeKzo_FD3Yn8sw" base_Property="_4zc-MrCvEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_AfTPkLCwEeKzo_FD3Yn8sw" base_Property="_-e6FILCvEeKzo_FD3Yn8sw" variability="parameter" modification="min = 0"/>
  <Components:ModelicaValueProperty xmi:id="_6mHMoLDFEeKzo_FD3Yn8sw" base_Property="_3_o5orDFEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_A0rnsLDGEeKzo_FD3Yn8sw" base_Property="_-fAw0rDFEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_HKO0gLDGEeKzo_FD3Yn8sw" base_Property="_DaQi0rDGEeKzo_FD3Yn8sw" variability="parameter" modification="unit = &quot;N.m.s/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_NokJ4LDGEeKzo_FD3Yn8sw" base_Property="_K-E5kLDGEeKzo_FD3Yn8sw" variability="parameter"/>
  <Components:ModelicaPort xmi:id="_iiC6MLDGEeKzo_FD3Yn8sw" base_Port="_YwTTU7DGEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_2KuxALDGEeKzo_FD3Yn8sw" base_Block="_zwTV8LDGEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_8_-KgLDGEeKzo_FD3Yn8sw" base_Property="_6Ap5srDGEeKzo_FD3Yn8sw" modification="Rv0 = Rv0, Rv1 = Rv1, peak = peak, i = ratio" isReplaceable="true"/>
  <Classes:ModelicaModel xmi:id="_eOPtQLDHEeKzo_FD3Yn8sw" base_Block="_cQ0-ULDHEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_iFNXwLDHEeKzo_FD3Yn8sw" base_Property="_fSh0wrDHEeKzo_FD3Yn8sw" modification="J = J, k = k, w = w, D = D"/>
  <Classes:ModelicaModel xmi:id="_nWLiILDHEeKzo_FD3Yn8sw" base_Block="_mZoaULDHEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_qjyGkLDHEeKzo_FD3Yn8sw" base_Property="_qBt7ULDHEeKzo_FD3Yn8sw" modification="kp = kp, ks = ks, Ts = Ts, ratio = ratio"/>
  <Classes:ModelicaConnector xmi:id="_D4rSQLDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_TjHK0LDIEeKzo_FD3Yn8sw" base_Property="_PBmHcrDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_Wn7msLDIEeKzo_FD3Yn8sw" base_Property="_WWOysLDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_dv7kILDIEeKzo_FD3Yn8sw" base_Property="_Zq-g8LDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_iyKu8LDIEeKzo_FD3Yn8sw" base_Property="_hFt0MrDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_pwMRALDIEeKzo_FD3Yn8sw" base_Property="_nPhEALDIEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPart xmi:id="_q0x6gLDIEeKzo_FD3Yn8sw" base_Property="_qnPNwrDIEeKzo_FD3Yn8sw" modification="k = 0"/>
  <Classes:ModelicaExtends xmi:id="_L6zDsLDKEeKzo_FD3Yn8sw" base_Generalization="_LpPZoLDKEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_qKCpgLDKEeKzo_FD3Yn8sw" base_Connector="_pXAqELDKEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_Qc9qgLDOEeKzo_FD3Yn8sw" base_Connector="_PoIUQLDOEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_SRsXgLDOEeKzo_FD3Yn8sw" base_Connector="_RCWPgLDOEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_UNk1YLDOEeKzo_FD3Yn8sw" base_Connector="_TCPDoLDOEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_l22bYLDdEeK0T7edPe2X5A" base_Generalization="_eFhNELDdEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_ptsUoLDeEeK0T7edPe2X5A" base_Port="_KCFeg7DeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_12Qo8LDeEeK0T7edPe2X5A" base_Connector="_1cYJULDeEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_5oP9wLDnEeK0T7edPe2X5A" base_Property="_1tEhorDnEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_m5TV4LDoEeK0T7edPe2X5A" base_Connector="_kvX08LDoEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_RtaxgLDpEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_n-vTgLFiEeK0T7edPe2X5A" base_Connector="_nC59YLFiEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_GlQXkLFoEeK0T7edPe2X5A" base_Connector="_BeEbULFoEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_XdhVMLFoEeK0T7edPe2X5A" base_Connector="_XG6MALFoEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_vXRYkLFoEeK0T7edPe2X5A" base_Property="_sESk4rFoEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_-mbqYLFoEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_CamfkLFpEeK0T7edPe2X5A" base_Connector="_A6xEgLFpEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_dRzWELFqEeK0T7edPe2X5A" base_Connector="_bdSrgLFqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_uwcXMLFqEeK0T7edPe2X5A" base_Connector="_txDWwLFqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_vAXCgLFqEeK0T7edPe2X5A" base_Connector="_uX4tQLFqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_t1Z10LFrEeK0T7edPe2X5A" base_Connector="_ssftALFrEeK0T7edPe2X5A"/>
  <Classes:ModelicaConnector xmi:id="_H4EtgLFsEeK0T7edPe2X5A" isExpandable="true" base_Block="_EyxJcLFsEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_PFNCkLFsEeK0T7edPe2X5A" base_Generalization="_Okwn8LFsEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_G0gFwLFuEeK0T7edPe2X5A" base_Property="_CJST0rFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_Mqu5ULFuEeK0T7edPe2X5A" base_Property="_MahTELFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_OqGwELFuEeK0T7edPe2X5A" base_Property="_N0_F8rFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_PLu2cLFuEeK0T7edPe2X5A" base_Property="_O_hmcrFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_VzM5sLFuEeK0T7edPe2X5A" base_Property="_QE4E8rFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_drJtYLFuEeK0T7edPe2X5A" base_Property="_Q4ghUrFuEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_3w68YLFuEeK0T7edPe2X5A" base_Property="_rX_Q0LFuEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_6atCELFuEeK0T7edPe2X5A" base_Property="_sI8zsrFuEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_AlKZMLFvEeK0T7edPe2X5A" base_Property="_s6WbcrFuEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_FaqvkLFvEeK0T7edPe2X5A" base_Property="_tpqYgrFuEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaPart xmi:id="_jWMOgLF3EeK0T7edPe2X5A" base_Property="_v-wnorFuEeK0T7edPe2X5A" modification="k = ratio"/>
  <Components:ModelicaPart xmi:id="_nUepALF3EeK0T7edPe2X5A" base_Property="_wxzOIrFuEeK0T7edPe2X5A" modification="k = ks, T = Ts"/>
  <Components:ModelicaPart xmi:id="_zC2UoLF3EeK0T7edPe2X5A" base_Property="_xsbDUrFuEeK0T7edPe2X5A"/>
  <Components:ModelicaPart xmi:id="_4R82wLF3EeK0T7edPe2X5A" base_Property="_zKwCgrFuEeK0T7edPe2X5A" modification="k = kp"/>
  <Components:ModelicaPart xmi:id="_9FNxcLF3EeK0T7edPe2X5A" base_Property="_zxui8LFuEeK0T7edPe2X5A" modification="k3 = -1"/>
  <Components:ModelicaPart xmi:id="_A6RXcLF4EeK0T7edPe2X5A" base_Property="_0kBikrFuEeK0T7edPe2X5A" modification="k = ratio"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_BQkiILF5EeK0T7edPe2X5A" base_Connector="_AebTgLF5EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_D1umgLF5EeK0T7edPe2X5A" base_Connector="_DlNeQLF5EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_GtVFwLF5EeK0T7edPe2X5A" base_Connector="_GPbBwLF5EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_Ka-cMLF5EeK0T7edPe2X5A" base_Connector="_KCRoULF5EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_OAGv0LF5EeK0T7edPe2X5A" base_Connector="_Md59QLF5EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_ce9FYLGBEeK0T7edPe2X5A" base_Connector="_aqca0LGBEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_nL_24LGBEeK0T7edPe2X5A" base_Connector="_k_s-cLGBEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_wXmDwLGBEeK0T7edPe2X5A" base_Connector="_u7pDILGBEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_0pFHELGBEeK0T7edPe2X5A" base_Connector="_zC3XMLGBEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_8UR4MLGBEeK0T7edPe2X5A" base_Connector="_6Jc_YLGBEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_55GpsLGWEeK0T7edPe2X5A" base_Block="_3nd-QLGWEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_ZsSHcLGXEeK0T7edPe2X5A" base_Property="_ErWEQLGXEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_koc6ELGXEeK0T7edPe2X5A" base_Property="_FSjOMrGXEeK0T7edPe2X5A" variability="parameter" modification="unit = &quot;N.m/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_qgxYULGXEeK0T7edPe2X5A" base_Property="_F4soMrGXEeK0T7edPe2X5A" variability="parameter" modification="unit = &quot;N.m.s/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_yGo9gLGXEeK0T7edPe2X5A" base_Property="_GkSi4rGXEeK0T7edPe2X5A" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_526b4LGXEeK0T7edPe2X5A" base_Property="_HmZgIrGXEeK0T7edPe2X5A" variability="parameter" modification="unit = &quot;N.m.s/rad&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_DcDKILGYEeK0T7edPe2X5A" base_Property="_IyanUrGXEeK0T7edPe2X5A" variability="parameter" modification=""/>
  <Components:ModelicaValueProperty xmi:id="_LlyRYLGYEeK0T7edPe2X5A" base_Property="_JosIArGXEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_Rgi_oLGYEeK0T7edPe2X5A" base_Property="_LaxwsLGXEeK0T7edPe2X5A" variability="constant"/>
  <Components:ModelicaValueProperty xmi:id="_V2NYULGYEeK0T7edPe2X5A" base_Property="_NP6GUrGXEeK0T7edPe2X5A" variability="constant"/>
  <Components:ModelicaPart xmi:id="_2_cegLGiEeK0T7edPe2X5A" base_Property="_Oq_kQLGXEeK0T7edPe2X5A" modification="ratio = i, useSupport = false"/>
  <Components:ModelicaPart xmi:id="_9wLygLGiEeK0T7edPe2X5A" base_Property="_Pnr2ArGXEeK0T7edPe2X5A" modification="c = c, d = d"/>
  <Components:ModelicaPart xmi:id="_ILFxgLGrEeK0T7edPe2X5A" base_Property="_QpfRQrGXEeK0T7edPe2X5A" modification="tau_pos = [0,Rv0 / unitTorque;1,(Rv0 + Rv1 * unitAngularVelocity) / unitTorque], useSupport = false"/>
  <Classes:ModelicaExtends xmi:id="_UNkr8LGrEeK0T7edPe2X5A" base_Generalization="_67f60LGWEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_OBK-oLGsEeK0T7edPe2X5A" base_Connector="_M01uYLGsEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_QAjccLGsEeK0T7edPe2X5A" base_Connector="_PbWdoLGsEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_XlZRcLGtEeKX9dy6PtDLxA"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_l0W_oLGvEeKX9dy6PtDLxA" base_Connector="_kfjI0LGvEeKX9dy6PtDLxA"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_o4wkwLGvEeKX9dy6PtDLxA" base_Connector="_oJTdwLGvEeKX9dy6PtDLxA"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_N5JHMLGwEeK316ztRocnAA" base_Constraint="_M_PqwLGwEeK316ztRocnAA" isInitial="true"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_XEQL4LGwEeK316ztRocnAA" base_Constraint="_WJLqwrGwEeK316ztRocnAA" isInitial="true"/>
  <Components:ModelicaValueProperty xmi:id="_UDde8LGxEeK316ztRocnAA" base_Property="_SFkO4LGxEeK316ztRocnAA" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_aS-VMLGxEeK316ztRocnAA" base_Property="_X3MPQrGxEeK316ztRocnAA" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_frAJ0LGxEeK316ztRocnAA" base_Property="_c6_gUrGxEeK316ztRocnAA" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_n0pKcLGxEeK316ztRocnAA" base_Property="_l96SUrGxEeK316ztRocnAA" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_yfcgQLGxEeK316ztRocnAA" base_Property="_wMvd0LGxEeK316ztRocnAA" variability="constant"/>
  <Components:ModelicaValueProperty xmi:id="_2UEocLGxEeK316ztRocnAA" base_Property="_0WCOcLGxEeK316ztRocnAA" variability="constant"/>
  <Components:ModelicaPart xmi:id="_Kn3RwLGyEeKc4o4DciZSBQ" base_Property="_IEDRMLGyEeKc4o4DciZSBQ" modification="ratio = i, useSupport = false"/>
  <Components:ModelicaPart xmi:id="_RJqx4LGyEeKc4o4DciZSBQ" base_Property="_Os_UELGyEeKc4o4DciZSBQ" modification="tau_pos = [0,Rv0 / unitTorque;1,(Rv0 + Rv1 * unitAngularVelocity) / unitTorque], peak = peak, useSupport = false"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_IVFhYLGzEeKgG5qcPzyCcg" base_Connector="_HeCkoLGzEeKgG5qcPzyCcg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_MEDGcLGzEeKgG5qcPzyCcg" base_Connector="_JabY0LGzEeKgG5qcPzyCcg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_QH_dALGzEeKgG5qcPzyCcg" base_Connector="_PAu6ALGzEeKgG5qcPzyCcg"/>
  <Classes:ModelicaExtends xmi:id="_d_GDYLccEeKrB6yskAhl0w" base_Generalization="_duusILccEeKrB6yskAhl0w"/>
  <Components:ModelicaValueProperty xmi:id="_tBTeULccEeKrB6yskAhl0w" base_Property="_le7SArccEeKrB6yskAhl0w" variability="parameter" modification="min = 0"/>
  <Components:ModelicaValueProperty xmi:id="_uH2PoLccEeKrB6yskAhl0w" base_Property="_mHjYQrccEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_vUea0LccEeKrB6yskAhl0w" base_Property="_nhRkQrccEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_wGBzkLccEeKrB6yskAhl0w" base_Property="_pP-hwrccEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_xG4zoLccEeKrB6yskAhl0w" base_Property="_qHUZcrccEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_OyXlELcdEeKrB6yskAhl0w" base_Property="_EP6S8rcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_PB_8gLcdEeKrB6yskAhl0w" base_Property="_E-kvwrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_PRns4LcdEeKrB6yskAhl0w" base_Property="_F9hrUrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_PhYnMLcdEeKrB6yskAhl0w" base_Property="_GmJKgrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_PupAELcdEeKrB6yskAhl0w" base_Property="_HPMukrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_P8xisLcdEeKrB6yskAhl0w" base_Property="_H1wYQrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_n73ZELcdEeKrB6yskAhl0w" base_Property="_enMIsrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_qAlp4LcdEeKrB6yskAhl0w" base_Property="_fYS1grcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_q0E8ULcdEeKrB6yskAhl0w" base_Property="_gEoXErcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_rkSRQLcdEeKrB6yskAhl0w" base_Property="_g2B-0rcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_sdkpsLcdEeKrB6yskAhl0w" base_Property="_ltwiwrcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_tbLhcLcdEeKrB6yskAhl0w" base_Property="_m0I8ArcdEeKrB6yskAhl0w" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_s8XpELceEeKrB6yskAhl0w" base_Property="_7CymorcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_tQ5HkLceEeKrB6yskAhl0w" base_Property="_9jg28LcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_tgXuALceEeKrB6yskAhl0w" base_Property="_-RVmQrcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_tvQekLceEeKrB6yskAhl0w" base_Property="_-2Y0ELcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_t9PQMLceEeKrB6yskAhl0w" base_Property="__7bwkrcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_uMkFoLceEeKrB6yskAhl0w" base_Property="_Ae_JkLceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_uasoQLceEeKrB6yskAhl0w" base_Property="_Bs9_orceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_uno4ELceEeKrB6yskAhl0w" base_Property="_DkJjsrceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_uzsXELceEeKrB6yskAhl0w" base_Property="_EweM4rceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_vSpj8LceEeKrB6yskAhl0w" base_Property="_FVFV0rceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_vh-ZYLceEeKrB6yskAhl0w" base_Property="_GqWforceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_vu6pMLceEeKrB6yskAhl0w" base_Property="_HRCFIrceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_wEf3oLceEeKrB6yskAhl0w" base_Property="_IdNkYLceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_wUHoALceEeKrB6yskAhl0w" base_Property="_JF-0krceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_whptsLceEeKrB6yskAhl0w" base_Property="__asbArcdEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_wv8oYLceEeKrB6yskAhl0w" base_Property="_BFYbMrceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_w-h28LceEeKrB6yskAhl0w" base_Property="_ELR1ILceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_xNaAcLceEeKrB6yskAhl0w" base_Property="_F1hwcLceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_xazjQLceEeKrB6yskAhl0w" base_Property="_HxUuwrceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_xnJ9MLceEeKrB6yskAhl0w" base_Property="_JxIqYrceEeKrB6yskAhl0w" variability="parameter"/>
  <Components:ModelicaPart xmi:id="_bKWjgLcfEeKrB6yskAhl0w" base_Property="_ZZtsULcfEeKrB6yskAhl0w" modification="w = 4590, ratio = -105, c = 43, cd = 0.005, Rv0 = 0.4, Rv1 = 0.13 / 160, kp = kp1, ks = ks1, Ts = Ts1"/>
  <Components:ModelicaPart xmi:id="_gNOAcLcfEeKrB6yskAhl0w" base_Property="_dpHE8LcfEeKrB6yskAhl0w" modification="w = 5500, ratio = 210, c = 8, cd = 0.01, Rv1 = 0.1 / 130, Rv0 = 0.5, kp = kp2, ks = ks2, Ts = Ts2"/>
  <Components:ModelicaPart xmi:id="_gs60MLcfEeKrB6yskAhl0w" base_Property="_gb9AArcfEeKrB6yskAhl0w" modification="w = 5500, ratio = 60, c = 58, cd = 0.04, Rv0 = 0.7, Rv1 = 0.2 / 130, kp = kp3, ks = ks3, Ts = Ts3"/>
  <Components:ModelicaPart xmi:id="_kfTgsLcfEeKrB6yskAhl0w" base_Property="_ivaQYLcfEeKrB6yskAhl0w" modification="k = 0.2365, w = 6250, D = 0.55, J = 0.00016, ratio = -99, Rv0 = 21.8, Rv1 = 9.8, peak = 26.7 / 21.8, kp = kp4, ks = ks4, Ts = Ts4"/>
  <Components:ModelicaPart xmi:id="_lQ2SYLcfEeKrB6yskAhl0w" base_Property="_lHxO4LcfEeKrB6yskAhl0w" modification="k = 0.2608, w = 6250, D = 0.55, J = 0.00018, ratio = 79.2, Rv0 = 30.1, Rv1 = 0.03, peak = 39.6 / 30.1, kp = kp5, ks = ks5, Ts = Ts5"/>
  <Components:ModelicaPart xmi:id="_p7VrkLcfEeKrB6yskAhl0w" base_Property="_ngvRYLcfEeKrB6yskAhl0w" modification="k = 0.0842, w = 7400, D = 0.27, J = 0.000043, ratio = -99, Rv0 = 10.9, Rv1 = 3.92, peak = 16.8 / 10.9, kp = kp6, ks = ks6, Ts = Ts6"/>
  <Components:ModelicaPart xmi:id="_-whxwLcfEeKrB6yskAhl0w" base_Property="_6ZsUYLcfEeKrB6yskAhl0w"/>
  <Classes:ModelicaExtends xmi:id="_txIBELujEeKpL8MCUeA_vw" base_Generalization="_sxODQLujEeKpL8MCUeA_vw"/>
  <Components:ModelicaValueProperty xmi:id="_r2cnoLukEeKpL8MCUeA_vw" base_Property="_wZi00LujEeKpL8MCUeA_vw" variability="parameter" modification="min = 0"/>
  <Components:ModelicaValueProperty xmi:id="_sqhI4LukEeKpL8MCUeA_vw" base_Property="__UiNcLujEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_tK2OwLukEeKpL8MCUeA_vw" base_Property="_AIs1ULukEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_tl1hoLukEeKpL8MCUeA_vw" base_Property="_Btyj0rukEeKpL8MCUeA_vw" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_t3YkoLukEeKpL8MCUeA_vw" base_Property="_Cp94MrukEeKpL8MCUeA_vw" variability="parameter" modification="unit = &quot;deg&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_uFTr4LukEeKpL8MCUeA_vw" base_Property="_A50JMLukEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_TERSALulEeKpL8MCUeA_vw" base_Property="_Di5rULukEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_UtddYLulEeKpL8MCUeA_vw" base_Property="_Ejp9sLukEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_XiqI4LulEeKpL8MCUeA_vw" base_Property="_FkUJcrukEeKpL8MCUeA_vw" variability="parameter"/>
  <Components:ModelicaPart xmi:id="_KfTK0LumEeKpL8MCUeA_vw" base_Property="_PjtKwLukEeKpL8MCUeA_vw" modification="w = 5500, ratio = 210, c = 8, cd = 0.01, Rv0 = 0.5, Rv1 = 0.1 / 130, kp = kp, ks = ks, Ts = Ts"/>
  <Components:ModelicaPart xmi:id="_PYlN8LumEeKpL8MCUeA_vw" base_Property="_XZ6SArukEeKpL8MCUeA_vw" modification=""/>
  <Components:ModelicaPart xmi:id="_SmSgELumEeKpL8MCUeA_vw" base_Property="_QZx3IrukEeKpL8MCUeA_vw" modification="J = 1.3 * mLoad"/>
  <Classes:ModelicaModel xmi:id="_68-IkLupEeKpL8MCUeA_vw" base_Block="_2XyNgLumEeKpL8MCUeA_vw"/>
</xmi:XMI>
