<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:Classes="http://www.femto-st.fr/disc/SysML4Modelica/Classes" xmlns:Components="http://www.femto-st.fr/disc/SysML4Modelica/Components" xmlns:EquationsAndAlgorithms="http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:sysML="http://www.topcased.org/2.0/sysML" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xsi:schemaLocation="http://www.femto-st.fr/disc/SysML4Modelica/Classes http://www.femto-st.fr/disc/SysML4Modelica#//classes http://www.femto-st.fr/disc/SysML4Modelica/Components http://www.femto-st.fr/disc/SysML4Modelica#//components http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms http://www.femto-st.fr/disc/SysML4Modelica#//equationsandalgorithms">
  <uml:Model xmi:id="idModel" name="Two_tanks">
    <packagedElement xmi:type="uml:Package" xmi:id="idPackage" name="Two_tanks">
      <packagedElement xmi:type="sysML:Block" xmi:id="_e389UK5xEeKQuMR9AcOvgg" name="Design">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_6wlRG65xEeKQuMR9AcOvgg" name="Interface">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_FOvSC65yEeKQuMR9AcOvgg" name="ActSignal">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_lQk20K5yEeKQuMR9AcOvgg" name="act">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_K_vAQK5yEeKQuMR9AcOvgg" name="ReadSignal">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Jk_EEq5zEeKQuMR9AcOvgg" name="val">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_QakRQK5yEeKQuMR9AcOvgg" name="LiquidFlow">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_MZ4_MK50EeKQuMR9AcOvgg" name="lflow">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
          </nestedClassifier>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_8eF7y65xEeKQuMR9AcOvgg" name="Components">
          <ownedBehavior xmi:type="uml:FunctionBehavior" xmi:id="_5WemYK54EeKQuMR9AcOvgg" name="limitValue">
            <ownedParameter xmi:type="uml:Parameter" xmi:id="_GT_lsK55EeKQuMR9AcOvgg" name="pMin">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedParameter>
            <ownedParameter xmi:type="uml:Parameter" xmi:id="_eLflUK6EEeKQuMR9AcOvgg" name="pMax">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedParameter>
            <ownedParameter xmi:type="uml:Parameter" xmi:id="_1vL5IK6EEeKQuMR9AcOvgg" name="p">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedParameter>
            <ownedParameter xmi:type="uml:Parameter" xmi:id="_6CmPEK6EEeKQuMR9AcOvgg" name="pLim">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedParameter>
            <language>Modelica</language>
            <body>pLim:=if p > pMax then pMax else if p &lt; pMin then pMin else p;</body>
          </ownedBehavior>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_YyON0K50EeKQuMR9AcOvgg" name="BaseController" isAbstract="true">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_EIvL4q51EeKQuMR9AcOvgg" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_Ii_JoK51EeKQuMR9AcOvgg" value="error = ref - cIn.val"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_NK8zQq51EeKQuMR9AcOvgg" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_OMK_sK51EeKQuMR9AcOvgg" value="cOut.act = outCtr"/>
            </ownedRule>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_harRYq50EeKQuMR9AcOvgg" name="K">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_oIOHcK50EeKQuMR9AcOvgg" value="2.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_rbWsIq50EeKQuMR9AcOvgg" name="T">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_yMpZwK50EeKQuMR9AcOvgg" value="10.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_zRPDQq50EeKQuMR9AcOvgg" name="ref">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_9BRZ8q50EeKQuMR9AcOvgg" name="error">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="__uVdIK50EeKQuMR9AcOvgg" name="outCtr">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_RstuQ651EeKQuMR9AcOvgg" name="cIn" type="_K_vAQK5yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_V6evM651EeKQuMR9AcOvgg" name="cOut" type="_FOvSC65yEeKQuMR9AcOvgg" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_d5biwK51EeKQuMR9AcOvgg" name="LiquidSource">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_ydgDwK51EeKQuMR9AcOvgg" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_zZ6osK51EeKQuMR9AcOvgg" value="qOut.lflow = if time > 150 then 3 * flowLevel else flowLevel"/>
            </ownedRule>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_g5gBg651EeKQuMR9AcOvgg" name="qOut" type="_QakRQK5yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_mRh2Iq51EeKQuMR9AcOvgg" name="flowLevel">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_sZvKgK51EeKQuMR9AcOvgg" value="0.02"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="__OpbAK51EeKQuMR9AcOvgg" name="PIcontinuousController">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_XjmXMq53EeKQuMR9AcOvgg" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_ZM8TkK53EeKQuMR9AcOvgg" value="der(x) = error / T"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_bX6WUq53EeKQuMR9AcOvgg" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_c_exEK53EeKQuMR9AcOvgg" value="outCtr = K * (error + x)"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_DdKp4K52EeKQuMR9AcOvgg" general="_YyON0K50EeKQuMR9AcOvgg"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_UdHHYq53EeKQuMR9AcOvgg" name="x">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_lZNcK653EeKQuMR9AcOvgg" name="Tank">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_Z6x0gq54EeKQuMR9AcOvgg" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_dfn0QK54EeKQuMR9AcOvgg" value="assert(minV >=  0, &quot;minV - minimum Valve level must be >= 0&quot;)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_kzcAIq54EeKQuMR9AcOvgg" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_l50ZYK54EeKQuMR9AcOvgg" value="der(h) = (qIn.lflow - qOut.lflow) / area"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_nXQnwq54EeKQuMR9AcOvgg" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_oPgeYK54EeKQuMR9AcOvgg" value="qOut.lflow = limitValue(minV, maxV, -flowGain * tActuator.act)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_vp3-Mq54EeKQuMR9AcOvgg" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_wFQSoK54EeKQuMR9AcOvgg" value="tSensor.val = h"/>
            </ownedRule>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_nqSt8653EeKQuMR9AcOvgg" name="tSensor" type="_K_vAQK5yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_rA3BIK53EeKQuMR9AcOvgg" name="tActuator" type="_FOvSC65yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_u8VYMK53EeKQuMR9AcOvgg" name="qIn" type="_QakRQK5yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_x4aHw653EeKQuMR9AcOvgg" name="qOut" type="_QakRQK5yEeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_1CUfAK53EeKQuMR9AcOvgg" name="area">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_6LmF8K53EeKQuMR9AcOvgg" value="0.5"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="__jAPgq53EeKQuMR9AcOvgg" name="flowGain">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_GXbJoK54EeKQuMR9AcOvgg" value="0.05"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_HO7ZYq54EeKQuMR9AcOvgg" name="minV">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_Pvg6YK54EeKQuMR9AcOvgg" value="0.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_K3y9gq54EeKQuMR9AcOvgg" name="maxV">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_NNK5cK54EeKQuMR9AcOvgg" value="10.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_QiZv4q54EeKQuMR9AcOvgg" name="h">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_73GLMK6HEeKQuMR9AcOvgg" name="TanksConnectedPI">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_D9Y84a6IEeKQuMR9AcOvgg" name="source" type="_d5biwK51EeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_mBt94a6IEeKQuMR9AcOvgg" name="tank1" type="_lZNcK653EeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_p6yhMa6IEeKQuMR9AcOvgg" name="tank2" type="_lZNcK653EeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_z1FnIa6IEeKQuMR9AcOvgg" name="piContinuous1" type="__OpbAK51EeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_5Pn9MK6IEeKQuMR9AcOvgg" name="piContinuous2" type="__OpbAK51EeKQuMR9AcOvgg" aggregation="composite"/>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_OEfTQK6JEeKQuMR9AcOvgg" name="Connector1" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_OEfTQa6JEeKQuMR9AcOvgg" role="_V6evM651EeKQuMR9AcOvgg" partWithPort="_z1FnIa6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_OEfTQq6JEeKQuMR9AcOvgg" role="_rA3BIK53EeKQuMR9AcOvgg" partWithPort="_mBt94a6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_bTr4cK6JEeKQuMR9AcOvgg" name="Connector2" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_bTr4ca6JEeKQuMR9AcOvgg" role="_RstuQ651EeKQuMR9AcOvgg" partWithPort="_5Pn9MK6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_bTr4cq6JEeKQuMR9AcOvgg" role="_nqSt8653EeKQuMR9AcOvgg" partWithPort="_p6yhMa6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_jnVJoK6JEeKQuMR9AcOvgg" name="Connector3" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_jnVJoa6JEeKQuMR9AcOvgg" role="_V6evM651EeKQuMR9AcOvgg" partWithPort="_5Pn9MK6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_jnVJoq6JEeKQuMR9AcOvgg" role="_rA3BIK53EeKQuMR9AcOvgg" partWithPort="_p6yhMa6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_8dpi8K6JEeKQuMR9AcOvgg" name="Connector4" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_8dpi8a6JEeKQuMR9AcOvgg" role="_g5gBg651EeKQuMR9AcOvgg" partWithPort="_D9Y84a6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_8dpi8q6JEeKQuMR9AcOvgg" role="_u8VYMK53EeKQuMR9AcOvgg" partWithPort="_mBt94a6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_IlKuYK6KEeKQuMR9AcOvgg" name="Connector5" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_IlKuYa6KEeKQuMR9AcOvgg" role="_nqSt8653EeKQuMR9AcOvgg" partWithPort="_mBt94a6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_IlKuYq6KEeKQuMR9AcOvgg" role="_RstuQ651EeKQuMR9AcOvgg" partWithPort="_z1FnIa6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
            <ownedConnector xmi:type="uml:Connector" xmi:id="_laBkYK6LEeKQuMR9AcOvgg" name="Connector6" kind="delegation">
              <end xmi:type="uml:ConnectorEnd" xmi:id="_laBkYa6LEeKQuMR9AcOvgg" role="_x4aHw653EeKQuMR9AcOvgg" partWithPort="_mBt94a6IEeKQuMR9AcOvgg"/>
              <end xmi:type="uml:ConnectorEnd" xmi:id="_laBkYq6LEeKQuMR9AcOvgg" role="_u8VYMK53EeKQuMR9AcOvgg" partWithPort="_p6yhMa6IEeKQuMR9AcOvgg"/>
            </ownedConnector>
          </nestedClassifier>
        </nestedClassifier>
      </packagedElement>
      <packagedElement xmi:type="sysML:Block" xmi:id="_ptfji65xEeKQuMR9AcOvgg" name="Requirements"/>
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
  <Classes:ModelicaPackage xmi:id="_fuYpQMoAEeKyFO3phyTcZQ" base_Classifier="_e389UK5xEeKQuMR9AcOvgg" base_Block="_e389UK5xEeKQuMR9AcOvgg"/>
  <Classes:ModelicaPackage xmi:id="_gLjGYMoAEeKyFO3phyTcZQ" base_Classifier="_ptfji65xEeKQuMR9AcOvgg" base_Block="_ptfji65xEeKQuMR9AcOvgg"/>
  <Classes:ModelicaPackage xmi:id="_g8y9IMoAEeKyFO3phyTcZQ" base_Classifier="_6wlRG65xEeKQuMR9AcOvgg" base_Block="_6wlRG65xEeKQuMR9AcOvgg"/>
  <Classes:ModelicaPackage xmi:id="_hYeMgMoAEeKyFO3phyTcZQ" base_Classifier="_8eF7y65xEeKQuMR9AcOvgg" base_Block="_8eF7y65xEeKQuMR9AcOvgg"/>
  <Classes:ModelicaConnector xmi:id="_icKeIMoAEeKyFO3phyTcZQ" base_Classifier="_FOvSC65yEeKQuMR9AcOvgg" isReplaceable="true" base_Block="_FOvSC65yEeKQuMR9AcOvgg"/>
  <Classes:ModelicaConnector xmi:id="_i7HD8MoAEeKyFO3phyTcZQ" base_Classifier="_K_vAQK5yEeKQuMR9AcOvgg" base_Block="_K_vAQK5yEeKQuMR9AcOvgg"/>
  <Classes:ModelicaConnector xmi:id="_jKSIYMoAEeKyFO3phyTcZQ" base_Classifier="_QakRQK5yEeKQuMR9AcOvgg" base_Block="_QakRQK5yEeKQuMR9AcOvgg"/>
  <Classes:ModelicaModel xmi:id="_Wdq2YMoBEeKyFO3phyTcZQ" base_Classifier="_YyON0K50EeKQuMR9AcOvgg" isPartial="true" base_Block="_YyON0K50EeKQuMR9AcOvgg"/>
  <Classes:ModelicaModel xmi:id="_XLovoMoBEeKyFO3phyTcZQ" base_Classifier="_d5biwK51EeKQuMR9AcOvgg" isReplaceable="true" base_Block="_d5biwK51EeKQuMR9AcOvgg"/>
  <Classes:ModelicaModel xmi:id="_XgwrEMoBEeKyFO3phyTcZQ" base_Classifier="_lZNcK653EeKQuMR9AcOvgg" base_Block="_lZNcK653EeKQuMR9AcOvgg"/>
  <Classes:ModelicaExtends xmi:id="_X_HbAMoBEeKyFO3phyTcZQ" modification="K = 2, T = 10" base_Generalization="_DdKp4K52EeKQuMR9AcOvgg"/>
  <Classes:ModelicaModel xmi:id="_YSTcwMoBEeKyFO3phyTcZQ" base_Classifier="__OpbAK51EeKQuMR9AcOvgg" base_Block="__OpbAK51EeKQuMR9AcOvgg"/>
  <Classes:ModelicaModel xmi:id="_Yx14cMoBEeKyFO3phyTcZQ" base_Classifier="_73GLMK6HEeKQuMR9AcOvgg" base_Block="_73GLMK6HEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_azbVsMoBEeKyFO3phyTcZQ" base_Constraint="_EIvL4q51EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_bGUcgMoBEeKyFO3phyTcZQ" base_Constraint="_NK8zQq51EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_bZ0AQMoBEeKyFO3phyTcZQ" base_Constraint="_ydgDwK51EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_b17UgMoBEeKyFO3phyTcZQ" base_Constraint="_Z6x0gq54EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_cEWyEMoBEeKyFO3phyTcZQ" base_Constraint="_kzcAIq54EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_cUSEcMoBEeKyFO3phyTcZQ" base_Constraint="_nXQnwq54EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_cm4QUMoBEeKyFO3phyTcZQ" base_Constraint="_vp3-Mq54EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_dOmXoMoBEeKyFO3phyTcZQ" base_Constraint="_bX6WUq53EeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_deqz8MoBEeKyFO3phyTcZQ" base_Constraint="_XjmXMq53EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_e3VQAMoBEeKyFO3phyTcZQ" base_Port="_RstuQ651EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_fJL1AMoBEeKyFO3phyTcZQ" base_Port="_V6evM651EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_gCwhUMoBEeKyFO3phyTcZQ" base_Port="_g5gBg651EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_gWjAAMoBEeKyFO3phyTcZQ" base_Port="_rA3BIK53EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_grFFkMoBEeKyFO3phyTcZQ" base_Port="_x4aHw653EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_hNcy0MoBEeKyFO3phyTcZQ" base_Port="_nqSt8653EeKQuMR9AcOvgg"/>
  <Components:ModelicaPort xmi:id="_hf5NsMoBEeKyFO3phyTcZQ" base_Port="_u8VYMK53EeKQuMR9AcOvgg"/>
  <Components:ModelicaValueProperty xmi:id="_iuvmcMoBEeKyFO3phyTcZQ" base_Property="_harRYq50EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_i-hH0MoBEeKyFO3phyTcZQ" base_Property="_rbWsIq50EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_jPLaAMoBEeKyFO3phyTcZQ" base_Property="_zRPDQq50EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_jdBBsMoBEeKyFO3phyTcZQ" base_Property="_9BRZ8q50EeKQuMR9AcOvgg"/>
  <Components:ModelicaValueProperty xmi:id="_jtFeAMoBEeKyFO3phyTcZQ" base_Property="__uVdIK50EeKQuMR9AcOvgg"/>
  <Components:ModelicaValueProperty xmi:id="_kRrY0MoBEeKyFO3phyTcZQ" base_Property="_mRh2Iq51EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_kwVDsMoBEeKyFO3phyTcZQ" base_Property="_1CUfAK53EeKQuMR9AcOvgg" variability="parameter" modification="unit = &quot;m2&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_k_NNMMoBEeKyFO3phyTcZQ" base_Property="__jAPgq53EeKQuMR9AcOvgg" variability="parameter" modification="unit = &quot;m2/s&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_lRgeIMoBEeKyFO3phyTcZQ" base_Property="_HO7ZYq54EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_liT6QMoBEeKyFO3phyTcZQ" base_Property="_K3y9gq54EeKQuMR9AcOvgg" variability="parameter"/>
  <Components:ModelicaValueProperty xmi:id="_lwTS8MoBEeKyFO3phyTcZQ" base_Property="_QiZv4q54EeKQuMR9AcOvgg" modification="start = 0.0, unit = &quot;m&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_mVMvwMoBEeKyFO3phyTcZQ" base_Property="_UdHHYq53EeKQuMR9AcOvgg"/>
  <Classes:ModelicaFunction xmi:id="_pV3EYMoBEeKyFO3phyTcZQ" base_Classifier="_5WemYK54EeKQuMR9AcOvgg" base_FunctionBehavior="_5WemYK54EeKQuMR9AcOvgg"/>
  <Components:ModelicaPart xmi:id="_rXu1gMoBEeKyFO3phyTcZQ" base_Property="_z1FnIa6IEeKQuMR9AcOvgg" modification="ref = 0.25"/>
  <Components:ModelicaPart xmi:id="_roZuwMoBEeKyFO3phyTcZQ" base_Property="_mBt94a6IEeKQuMR9AcOvgg" modification="area = 1"/>
  <Components:ModelicaPart xmi:id="_r62JoMoBEeKyFO3phyTcZQ" base_Property="_p6yhMa6IEeKQuMR9AcOvgg" modification="area = 1.3"/>
  <Components:ModelicaPart xmi:id="_sNSkgMoBEeKyFO3phyTcZQ" base_Property="_5Pn9MK6IEeKQuMR9AcOvgg" modification="ref = 0.4"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_shFDMMoBEeKyFO3phyTcZQ" base_Connector="_bTr4cK6JEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_s726sMoBEeKyFO3phyTcZQ" base_Connector="_jnVJoK6JEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_tPWecMoBEeKyFO3phyTcZQ" base_Connector="_laBkYK6LEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_tiZWQMoBEeKyFO3phyTcZQ" base_Connector="_IlKuYK6KEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_t68ZIMoBEeKyFO3phyTcZQ" base_Connector="_OEfTQK6JEeKQuMR9AcOvgg"/>
  <EquationsAndAlgorithms:ModelicaConnection xmi:id="_uOSL4MoBEeKyFO3phyTcZQ" base_Connector="_8dpi8K6JEeKQuMR9AcOvgg"/>
  <Components:ModelicaPart xmi:id="_upEDYMoBEeKyFO3phyTcZQ" base_Property="_D9Y84a6IEeKQuMR9AcOvgg" modification="flowLevel = 0.02"/>
  <Components:ModelicaValueProperty xmi:id="_1ot9IMoBEeKyFO3phyTcZQ" base_Property="_lQk20K5yEeKQuMR9AcOvgg"/>
  <Components:ModelicaValueProperty xmi:id="_19i9oMoBEeKyFO3phyTcZQ" base_Property="_Jk_EEq5zEeKQuMR9AcOvgg" modification="unit = &quot;m&quot;"/>
  <Components:ModelicaValueProperty xmi:id="_2ZEcAMoBEeKyFO3phyTcZQ" base_Property="_MZ4_MK50EeKQuMR9AcOvgg" modification="unit = &quot;m3/s&quot;"/>
  <Components:ModelicaFunctionParameter xmi:id="_3rJz0M3DEeKTqZwsgNs5rw" base_Parameter="_GT_lsK55EeKQuMR9AcOvgg"/>
  <Components:ModelicaFunctionParameter xmi:id="_3-UncM3DEeKTqZwsgNs5rw" base_Parameter="_eLflUK6EEeKQuMR9AcOvgg"/>
  <Components:ModelicaFunctionParameter xmi:id="_4QWLkM3DEeKTqZwsgNs5rw" base_Parameter="_1vL5IK6EEeKQuMR9AcOvgg"/>
  <Components:ModelicaFunctionParameter xmi:id="_4kkIEM3DEeKTqZwsgNs5rw" base_Parameter="_6CmPEK6EEeKQuMR9AcOvgg" causality="output"/>
</xmi:XMI>
