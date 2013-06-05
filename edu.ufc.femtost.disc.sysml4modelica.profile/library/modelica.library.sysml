<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:Classes="http://www.femto-st.fr/disc/SysML4Modelica/Classes" xmlns:Components="http://www.femto-st.fr/disc/SysML4Modelica/Components" xmlns:EquationsAndAlgorithms="http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:sysML="http://www.topcased.org/2.0/sysML" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xsi:schemaLocation="http://www.femto-st.fr/disc/SysML4Modelica/Classes http://www.femto-st.fr/disc/SysML4Modelica#//classes http://www.femto-st.fr/disc/SysML4Modelica/Components http://www.femto-st.fr/disc/SysML4Modelica#//components http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms http://www.femto-st.fr/disc/SysML4Modelica#//equationsandalgorithms">
  <uml:Model xmi:id="idModel" name="Modelica" viewpoint="">
    <packagedElement xmi:type="sysML:Block" xmi:id="_d8hcMLCoEeKzo_FD3Yn8sw" name="Blocks">
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_Uz9RALCvEeKzo_FD3Yn8sw" name="Sources">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_ZZ7Wm7CvEeKzo_FD3Yn8sw" name="Constant">
          <ownedRule xmi:type="uml:Constraint" xmi:id="_gbw7MrFrEeK0T7edPe2X5A" name="Constraint1">
            <specification xmi:type="uml:LiteralString" xmi:id="_hOW1wLFrEeK0T7edPe2X5A" value="y = k"/>
          </ownedRule>
          <generalization xmi:type="uml:Generalization" xmi:id="_e9ke4LFrEeK0T7edPe2X5A" general="_FbWB0LFrEeK0T7edPe2X5A"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_79SzArFqEeK0T7edPe2X5A" name="k">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
          </ownedAttribute>
        </nestedClassifier>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_10OjS7DLEeKzo_FD3Yn8sw" name="Interfaces">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_-3AyYLDLEeKzo_FD3Yn8sw" name="RealOutput"/>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_feCZkLFpEeK0T7edPe2X5A" name="RealInput"/>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_FbWB0LFrEeK0T7edPe2X5A" name="SO" isAbstract="true">
          <generalization xmi:type="uml:Generalization" xmi:id="_ZOMhQLFrEeK0T7edPe2X5A" general="_Rl1Bu7FrEeK0T7edPe2X5A"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_JSfSg7FrEeK0T7edPe2X5A" name="y" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_JsWxy7FwEeK0T7edPe2X5A" name="SISO" isAbstract="true">
          <generalization xmi:type="uml:Generalization" xmi:id="_VmBHYLFwEeK0T7edPe2X5A" general="_Rl1Bu7FrEeK0T7edPe2X5A"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_Y5m_E7FwEeK0T7edPe2X5A" name="u" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_b_t0Y7FwEeK0T7edPe2X5A" name="y" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
        </nestedClassifier>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_NDPAQLFrEeK0T7edPe2X5A" name="Icons">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_Rl1Bu7FrEeK0T7edPe2X5A" name="Block" isAbstract="true"/>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_RLZLoLFvEeK0T7edPe2X5A" name="Math">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_X-epALFvEeK0T7edPe2X5A" name="Gain">
          <ownedRule xmi:type="uml:Constraint" xmi:id="_yV1-UrFvEeK0T7edPe2X5A" name="Constraint1">
            <specification xmi:type="uml:LiteralString" xmi:id="_y5Q0cLFvEeK0T7edPe2X5A" value="y = k * u"/>
          </ownedRule>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_aFkRUrFvEeK0T7edPe2X5A" name="k">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_nRNzQ7FvEeK0T7edPe2X5A" name="u" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_uGb-o7FvEeK0T7edPe2X5A" name="y" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_qlBJgLFzEeK0T7edPe2X5A" name="Feedback">
          <ownedRule xmi:type="uml:Constraint" xmi:id="_giqB0rF1EeK0T7edPe2X5A" name="Constraint1">
            <specification xmi:type="uml:LiteralString" xmi:id="_hmyYULF1EeK0T7edPe2X5A" value="y = u1 - u2"/>
          </ownedRule>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_7SA10LF0EeK0T7edPe2X5A" name="u1" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_Xv6Z07F1EeK0T7edPe2X5A" name="u2" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_bDDlkLF1EeK0T7edPe2X5A" name="y" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_oY168LF1EeK0T7edPe2X5A" name="Add3">
          <ownedRule xmi:type="uml:Constraint" xmi:id="__OKs4rF1EeK0T7edPe2X5A" name="Constraint1">
            <specification xmi:type="uml:LiteralString" xmi:id="__0jXcLF1EeK0T7edPe2X5A" value="y = k1 * u1 + k2 * u2 + k3 * u3"/>
          </ownedRule>
          <generalization xmi:type="uml:Generalization" xmi:id="_2So8ULF1EeK0T7edPe2X5A" general="_Rl1Bu7FrEeK0T7edPe2X5A"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_5KPbkrF1EeK0T7edPe2X5A" name="k1">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_E8gvwLF2EeK0T7edPe2X5A" value="+1"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_57DNcrF1EeK0T7edPe2X5A" name="k2">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_GLE0oLF2EeK0T7edPe2X5A" value="+1"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_6ZtfYrF1EeK0T7edPe2X5A" name="k3">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_GqUVYLF2EeK0T7edPe2X5A" value="+1"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_74M2o7F1EeK0T7edPe2X5A" name="u1" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_8T4GA7F1EeK0T7edPe2X5A" name="u2" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_89GCILF1EeK0T7edPe2X5A" name="u3" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
          <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_-SV907F1EeK0T7edPe2X5A" name="y" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
        </nestedClassifier>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_6DrzwLFvEeK0T7edPe2X5A" name="Continuous">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_A8jwELFwEeK0T7edPe2X5A" name="PI">
          <generalization xmi:type="uml:Generalization" xmi:id="_SFkC8LFxEeK0T7edPe2X5A" general="_JsWxy7FwEeK0T7edPe2X5A"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_YwBv0LFxEeK0T7edPe2X5A" name="k">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_lJsbMLFxEeK0T7edPe2X5A" value="1.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_mychsrFxEeK0T7edPe2X5A" name="T" type="_97jLULCtEeKzo_FD3Yn8sw"/>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_74yCQrFxEeK0T7edPe2X5A" name="initType" type="_2ABfILFxEeK0T7edPe2X5A">
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_VGIbgLFyEeK0T7edPe2X5A" value="Modelica.Blocks.Types.Init.NoInit"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_WcbgErFyEeK0T7edPe2X5A" name="x_start">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_aL1KALFyEeK0T7edPe2X5A" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_bFtYUrFyEeK0T7edPe2X5A" name="y_start">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_cQP40LFyEeK0T7edPe2X5A" value="0.0"/>
          </ownedAttribute>
          <ownedAttribute xmi:type="uml:Property" xmi:id="_fkROUrFyEeK0T7edPe2X5A" name="x">
            <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_jBimcLFyEeK0T7edPe2X5A" value=""/>
          </ownedAttribute>
        </nestedClassifier>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_wn_qgLFxEeK0T7edPe2X5A" name="Types">
        <nestedClassifier xmi:type="uml:DataType" xmi:id="_2ABfILFxEeK0T7edPe2X5A" name="Init"/>
      </nestedClassifier>
    </packagedElement>
    <packagedElement xmi:type="sysML:Block" xmi:id="_hmiP0LCoEeKzo_FD3Yn8sw" name="ComplexBlocks"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_lLNQcLCoEeKzo_FD3Yn8sw" name="ComplexMath"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_p3INALCoEeKzo_FD3Yn8sw" name="Constants"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_tFCTcLCoEeKzo_FD3Yn8sw" name="Electrical"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_vOprULCoEeKzo_FD3Yn8sw" name="Fluid"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_xrAZALCoEeKzo_FD3Yn8sw" name="Icons">
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_d3JRK7ChEeKV4bTJZ5Azxw" name="SignalBus"/>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_RaOmMLDdEeK0T7edPe2X5A" name="SignalSubBus"/>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_OOuh8LccEeKrB6yskAhl0w" name="Example" isAbstract="true"/>
    </packagedElement>
    <packagedElement xmi:type="sysML:Block" xmi:id="_0JAsgLCoEeKzo_FD3Yn8sw" name="Magnetic"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_18A7MLCoEeKzo_FD3Yn8sw" name="Math"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_4KryMLCoEeKzo_FD3Yn8sw" name="Mechanics">
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_GoGry7CuEeKzo_FD3Yn8sw" name="Rotational">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_Rgz6sLCuEeKzo_FD3Yn8sw" name="Components">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_MRzpwLCvEeKzo_FD3Yn8sw" name="InitializeFlange">
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_rYmHE7FpEeK0T7edPe2X5A" name="phi_start" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_w0LmA7FpEeK0T7edPe2X5A" name="w_start" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_xJnDc7FpEeK0T7edPe2X5A" name="a_start" type="_feCZkLFpEeK0T7edPe2X5A" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_68fSw7FpEeK0T7edPe2X5A" name="flange" type="_iiujkLCuEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_i70jsLGYEeK0T7edPe2X5A" name="IdealGear">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_6HgAIrGYEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_740MwLGYEeK0T7edPe2X5A" value="phi_a = flange_a.phi - phi_support"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_9CvpQrGYEeK0T7edPe2X5A" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_9rFboLGYEeK0T7edPe2X5A" value="phi_b = flange_b.phi - phi_support"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="__X6J0rGYEeK0T7edPe2X5A" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_AuUjILGZEeK0T7edPe2X5A" value="phi_a = ratio * phi_b"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_B0h9QrGZEeK0T7edPe2X5A" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_CUM70LGZEeK0T7edPe2X5A" value="0 = ratio * flange_a.tau + flange_b.tau"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_07CQYLGaEeK0T7edPe2X5A" general="_Rnm0cLGZEeK0T7edPe2X5A"/>
            <generalization xmi:type="uml:Generalization" xmi:id="_5A8V0LGaEeK0T7edPe2X5A" general="_HmbqcLGZEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_mXfZUrGYEeK0T7edPe2X5A" name="ratio">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_z_qfMrGYEeK0T7edPe2X5A" name="phi_a" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_2oxPcLGYEeK0T7edPe2X5A" name="phi_b" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_r1A_sLGdEeK0T7edPe2X5A" name="SpringDamper">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_ihWCorGiEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_kX0cELGiEeK0T7edPe2X5A" value="tau_c = c * (phi_rel - phi_rel0)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_iumbgrGiEeK0T7edPe2X5A" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_l3k-oLGiEeK0T7edPe2X5A" value="tau_d = d * w_rel"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jBsWoLGiEeK0T7edPe2X5A" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_n_S5ELGiEeK0T7edPe2X5A" value="tau = tau_c + tau_d"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jLOtILGiEeK0T7edPe2X5A" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_pgx58LGiEeK0T7edPe2X5A" value="lossPower = tau_d * w_rel"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_l3D2sLGhEeK0T7edPe2X5A" general="_5DcI0LGdEeK0T7edPe2X5A"/>
            <generalization xmi:type="uml:Generalization" xmi:id="_sIJaQLGhEeK0T7edPe2X5A" general="_SdBKwLGfEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_10nfkrGhEeK0T7edPe2X5A" name="c" type="__uOpALGhEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_28DowrGhEeK0T7edPe2X5A" name="d" type="_FDs44LGiEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_3fcpsrGhEeK0T7edPe2X5A" name="phi_rel0" type="_uEnZyLCrEeKzo_FD3Yn8sw">
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_VaGfkLGiEeK0T7edPe2X5A" value="0.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_Ywt2ELGiEeK0T7edPe2X5A" name="tau_c" visibility="protected" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_fadxQrGiEeK0T7edPe2X5A" name="tau_d" visibility="protected" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_LYnXELGjEeK0T7edPe2X5A" name="BearingFriction">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_ixmLgrGqEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_nN9CELGqEeK0T7edPe2X5A" value="tau0 = Modelica.Math.tempInterpol1(0, tau_pos, 2)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jB9iwrGqEeK0T7edPe2X5A" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_sM9SsLGqEeK0T7edPe2X5A" value="tau0_max = peak * tau0"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jKl6UrGqEeK0T7edPe2X5A" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_txGmALGqEeK0T7edPe2X5A" value="free = false"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jT0HwrGqEeK0T7edPe2X5A" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_vXoe8LGqEeK0T7edPe2X5A" value="phi = flange_a.phi - phi_support"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jcm3YrGqEeK0T7edPe2X5A" name="Constraint5">
              <specification xmi:type="uml:LiteralString" xmi:id="_xOONILGqEeK0T7edPe2X5A" value="flange_b.phi = flange_a.phi"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jma6srGqEeK0T7edPe2X5A" name="Constraint6">
              <specification xmi:type="uml:LiteralString" xmi:id="_zDnBcLGqEeK0T7edPe2X5A" value="w = der(phi)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_jzz2crGqEeK0T7edPe2X5A" name="Constraint7">
              <specification xmi:type="uml:LiteralString" xmi:id="_0hpswLGqEeK0T7edPe2X5A" value="a = der(w)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_j97bwrGqEeK0T7edPe2X5A" name="Constraint8">
              <specification xmi:type="uml:LiteralString" xmi:id="_2D_pQLGqEeK0T7edPe2X5A" value="w_relfric = w"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_kHAfQrGqEeK0T7edPe2X5A" name="Constraint9">
              <specification xmi:type="uml:LiteralString" xmi:id="_3y2-0LGqEeK0T7edPe2X5A" value="a_relfric = a"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_kPfs4rGqEeK0T7edPe2X5A" name="Constraint10">
              <specification xmi:type="uml:LiteralString" xmi:id="_8PMnQLGqEeK0T7edPe2X5A" value="flange_a.tau + flange_b.tau - tau = 0"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_kXhngLGqEeK0T7edPe2X5A" name="Constraint11">
              <specification xmi:type="uml:LiteralString" xmi:id="_-gab8LGqEeK0T7edPe2X5A" value="tau = if locked then sa * unitTorque else if startForward then Modelica.Math.tempInterpol1(w, tau_pos, 2) else if startBackward then -Modelica.Math.tempInterpol1(-w, tau_pos, 2) else if pre(mode) == Forward then Modelica.Math.tempInterpol1(w, tau_pos, 2) else -Modelica.Math.tempInterpol1(-w, tau_pos, 2)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_kgAOErGqEeK0T7edPe2X5A" name="Constraint12">
              <specification xmi:type="uml:LiteralString" xmi:id="_A7eJILGrEeK0T7edPe2X5A" value="lossPower = tau * w_relfric"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_ShBkMLGjEeK0T7edPe2X5A" general="_Rnm0cLGZEeK0T7edPe2X5A"/>
            <generalization xmi:type="uml:Generalization" xmi:id="_bZMz4LGlEeK0T7edPe2X5A" general="_gOW24LGjEeK0T7edPe2X5A"/>
            <generalization xmi:type="uml:Generalization" xmi:id="_pNS14LGlEeK0T7edPe2X5A" general="_SdBKwLGfEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_aLDo8rGpEeK0T7edPe2X5A" name="peak">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_iispULGpEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_-pCo8rGpEeK0T7edPe2X5A" name="phi" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="__d3YIrGpEeK0T7edPe2X5A" name="tau" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_AHEtMrGqEeK0T7edPe2X5A" name="w" type="_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_AfU1IrGqEeK0T7edPe2X5A" name="a" type="_5u3aYLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_MN240rGqEeK0T7edPe2X5A" name="tau_pos[:,2]">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_Qp5mULGqEeK0T7edPe2X5A" value="[0,1]"/>
            </ownedAttribute>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_vx1psLulEeKpL8MCUeA_vw" name="Inertia">
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_zovp0LulEeKpL8MCUeA_vw" name="flange_a" type="_W2P6ELDJEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_32omk7ulEeKpL8MCUeA_vw" name="flange_b" type="_iiujkLCuEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_VWcIcLCuEeKzo_FD3Yn8sw" name="Example"/>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_X3tLULCuEeKzo_FD3Yn8sw" name="Icons">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_HmbqcLGZEeK0T7edPe2X5A" name="Gear" isAbstract="true"/>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_Z__GcLCuEeKzo_FD3Yn8sw" name="Interfaces">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_iiujkLCuEeKzo_FD3Yn8sw" name="Flange_b">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_hGyVwrDJEeKzo_FD3Yn8sw" name="phi" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_jvfdYrDJEeKzo_FD3Yn8sw" name="tau" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_W2P6ELDJEeKzo_FD3Yn8sw" name="Flange_a">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_dljDorDJEeKzo_FD3Yn8sw" name="phi" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_fYirQrDJEeKzo_FD3Yn8sw" name="tau" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_uY4d8LDJEeKzo_FD3Yn8sw" name="PartialTwoFlanges" isAbstract="true">
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_1CX6c7DJEeKzo_FD3Yn8sw" name="flange_a" type="_W2P6ELDJEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_2zSec7DJEeKzo_FD3Yn8sw" name="flange_b" type="_iiujkLCuEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_G3qrkLDLEeKzo_FD3Yn8sw" name="PartialAbsoluteSensor" isAbstract="true">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_W56nMrDLEeKzo_FD3Yn8sw" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_Yo7GsLDLEeKzo_FD3Yn8sw" value=" 0 = flange.tau"/>
            </ownedRule>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_RP5qs7DLEeKzo_FD3Yn8sw" name="flange" type="_W2P6ELDJEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_Rnm0cLGZEeK0T7edPe2X5A" name="PartialElementaryTwoFlangesAndSupport2" isAbstract="true">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_m3igcrGaEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_n0AIsLGaEeK0T7edPe2X5A" value="if not useSupport then phi_support = 0; end if"/>
            </ownedRule>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_XTA4ErGZEeK0T7edPe2X5A" name="useSupport">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_bcQlYLGZEeK0T7edPe2X5A" value="false"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_dEnDQ7GZEeK0T7edPe2X5A" name="flange_a" type="_W2P6ELDJEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_hw3XA7GZEeK0T7edPe2X5A" name="flange_b" type="_iiujkLCuEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_4H1ZA7GZEeK0T7edPe2X5A" name="support" type="_phxHgLGZEeK0T7edPe2X5A" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_S5LUkLGaEeK0T7edPe2X5A" name="phi_support" visibility="protected" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_phxHgLGZEeK0T7edPe2X5A" name="Support">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_tWt_0rGZEeK0T7edPe2X5A" name="phi" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_wZAFErGZEeK0T7edPe2X5A" name="tau" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_5DcI0LGdEeK0T7edPe2X5A" name="PartialCompliantWithRelativeStates" isAbstract="true">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_09bgQrGeEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_4WH6YLGeEeK0T7edPe2X5A" value="phi_rel = flange_b.phi - flange_a.phi"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_1NvNIrGeEeK0T7edPe2X5A" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_568jILGeEeK0T7edPe2X5A" value="w_rel = der(phi_rel)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_2FJ9UrGeEeK0T7edPe2X5A" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_8DYPQLGeEeK0T7edPe2X5A" value="a_rel = der(w_rel)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_2RdT8rGeEeK0T7edPe2X5A" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_9gjX4LGeEeK0T7edPe2X5A" value="flange_b.tau = tau"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_2enmMrGeEeK0T7edPe2X5A" name="Constraint5">
              <specification xmi:type="uml:LiteralString" xmi:id="__3c90LGeEeK0T7edPe2X5A" value="flange_a.tau = -tau"/>
            </ownedRule>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_AsY3M7GeEeK0T7edPe2X5A" name="flange_a" type="_W2P6ELDJEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_EI7PgLGeEeK0T7edPe2X5A" name="flange_b" type="_iiujkLCuEeKzo_FD3Yn8sw" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_IIv7ErGeEeK0T7edPe2X5A" name="stateSelect">
              <type xmi:type="uml:Enumeration" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_XmIEgMeWEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_YIO2kLGeEeK0T7edPe2X5A" value="StateSelect.prefer"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_ZrVoErGeEeK0T7edPe2X5A" name="phi_nominal" type="_uEnZyLCrEeKzo_FD3Yn8sw">
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_fCPbULGeEeK0T7edPe2X5A" value="0.0001"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_iBA5krGeEeK0T7edPe2X5A" name="phi_rel" type="_uEnZyLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_jKvhwLGeEeK0T7edPe2X5A" name="w_rel" type="_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_kH34YLGeEeK0T7edPe2X5A" name="a_rel" type="_5u3aYLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_k32j0LGeEeK0T7edPe2X5A" name="tau" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_gOW24LGjEeK0T7edPe2X5A" name="PartialFriction" isAbstract="true">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_A8QbArGlEeK0T7edPe2X5A" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_Bfg5ELGlEeK0T7edPe2X5A" value="startForward = pre(mode) == Stuck and (sa > tau0_max / unitTorque or pre(startForward) and sa > tau0 / unitTorque) or pre(mode) == Backward and w_relfric > w_small or initial() and w_relfric > 0"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_CkjOgrGlEeK0T7edPe2X5A" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_EblooLGlEeK0T7edPe2X5A" value="startBackward = pre(mode) == Stuck and (sa &lt; -tau0_max / unitTorque or pre(startBackward) and sa &lt; -tau0 / unitTorque) or pre(mode) == Forward and w_relfric &lt; -w_small or initial() and w_relfric &lt; 0"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_E7bmUrGlEeK0T7edPe2X5A" name="Constraint3">
              <specification xmi:type="uml:LiteralString" xmi:id="_Fx4tMLGlEeK0T7edPe2X5A" value="locked = not free and not (pre(mode) == Forward or startForward or pre(mode) == Backward or startBackward)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_HMMvELGlEeK0T7edPe2X5A" name="Constraint4">
              <specification xmi:type="uml:LiteralString" xmi:id="_Jj0GsLGlEeK0T7edPe2X5A" value="a_relfric / unitAngularAcceleration = if locked then 0 else if free then sa else if startForward then sa - tau0_max / unitTorque else if startBackward then sa + tau0_max / unitTorque else if pre(mode) == Forward then sa - tau0_max / unitTorque else sa + tau0_max / unitTorque"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_NzWCMrGlEeK0T7edPe2X5A" name="Constraint5">
              <specification xmi:type="uml:LiteralString" xmi:id="_Oip_QLGlEeK0T7edPe2X5A" value="mode = if free then Free else if (pre(mode) == Forward or pre(mode) == Free or startForward) and w_relfric > 0 then Forward else if (pre(mode) == Backward or pre(mode) == Free or startBackward) and w_relfric &lt; 0 then Backward else Stuck"/>
            </ownedRule>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_km_EArGjEeK0T7edPe2X5A" name="w_small" type="_2XcLkLCrEeKzo_FD3Yn8sw">
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_obMVcLGjEeK0T7edPe2X5A" value="10000000000.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_qk-scLGjEeK0T7edPe2X5A" name="w_relfric" type="_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_tQsEwrGjEeK0T7edPe2X5A" name="a_relfric" type="_5u3aYLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_vFgRUrGjEeK0T7edPe2X5A" name="tau0" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_w0zrwrGjEeK0T7edPe2X5A" name="tau0_max" type="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_zKNc4rGjEeK0T7edPe2X5A" name="free">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_-WDqQrGjEeK0T7edPe2X5A" name="sa">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_y5hZsMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_CITM0LGkEeK0T7edPe2X5A" name="startForward">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_F7ubIrGkEeK0T7edPe2X5A" name="startBackward">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_J9uQ8rGkEeK0T7edPe2X5A" name="locked">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_R0L24rGkEeK0T7edPe2X5A" name="Unknown">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_VzEuULGkEeK0T7edPe2X5A" value="3"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_dCuL4rGkEeK0T7edPe2X5A" name="Free">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_o8sDgLGkEeK0T7edPe2X5A" value="2"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_d9LpArGkEeK0T7edPe2X5A" name="Forward">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_pc-tILGkEeK0T7edPe2X5A" value="1"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_eeEvkrGkEeK0T7edPe2X5A" name="Stuck">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_p93zsLGkEeK0T7edPe2X5A" value="0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_fbFKYrGkEeK0T7edPe2X5A" name="Backward">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_qcPKsLGkEeK0T7edPe2X5A" value="-1"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_rFJk0rGkEeK0T7edPe2X5A" name="mode">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_z_j0sMeVEeKfMrYq53FfYw"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_y9jrgrGkEeK0T7edPe2X5A" name="unitAngularAcceleration" visibility="protected" type="_5u3aYLCrEeKzo_FD3Yn8sw">
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_2KSGMLGkEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_69G8ArGkEeK0T7edPe2X5A" name="unitTorque" visibility="protected" type="_CiQ3wLCuEeKzo_FD3Yn8sw">
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_-mSCILGkEeK0T7edPe2X5A" value="1.0"/>
            </ownedAttribute>
          </nestedClassifier>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_cEGTQLCuEeKzo_FD3Yn8sw" name="Sensors">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_7VsG4LCuEeKzo_FD3Yn8sw" name="AngleSensor">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_5Y2rIrDMEeKzo_FD3Yn8sw" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_5_MSYLDMEeKzo_FD3Yn8sw" value="phi = flange.phi"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_s3uQYLDNEeKzo_FD3Yn8sw" general="_G3qrkLDLEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_t66BILDMEeKzo_FD3Yn8sw" name="phi" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="__-gFG7CuEeKzo_FD3Yn8sw" name="SpeedSensor">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_JeQBYrDNEeKzo_FD3Yn8sw" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_KudFALDNEeKzo_FD3Yn8sw" value="w = der(flange.phi)"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_t76RQLDNEeKzo_FD3Yn8sw" general="_G3qrkLDLEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_EhiPwLDNEeKzo_FD3Yn8sw" name="w" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_D4vGALCvEeKzo_FD3Yn8sw" name="AccSensor">
            <ownedRule xmi:type="uml:Constraint" xmi:id="_lGVNIrDMEeKzo_FD3Yn8sw" name="Constraint1">
              <specification xmi:type="uml:LiteralString" xmi:id="_mbNVYLDMEeKzo_FD3Yn8sw" value=" w = der(flange.phi)"/>
            </ownedRule>
            <ownedRule xmi:type="uml:Constraint" xmi:id="_n6xDorDMEeKzo_FD3Yn8sw" name="Constraint2">
              <specification xmi:type="uml:LiteralString" xmi:id="_op4MYLDMEeKzo_FD3Yn8sw" value="a = der(w)"/>
            </ownedRule>
            <generalization xmi:type="uml:Generalization" xmi:id="_sKnSwLDNEeKzo_FD3Yn8sw" general="_G3qrkLDLEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_w8R84rDLEeKzo_FD3Yn8sw" name="w" type="_2XcLkLCrEeKzo_FD3Yn8sw"/>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_PsL_w7DMEeKzo_FD3Yn8sw" name="a" type="_-3AyYLDLEeKzo_FD3Yn8sw" aggregation="composite"/>
          </nestedClassifier>
        </nestedClassifier>
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_eBqMILCuEeKzo_FD3Yn8sw" name="Sources"/>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_LRWu0LCuEeKzo_FD3Yn8sw" name="MultiBody">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_4Wm9QLDHEeKzo_FD3Yn8sw" name="Examples"/>
      </nestedClassifier>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_OHJ3S7CuEeKzo_FD3Yn8sw" name="Translational"/>
    </packagedElement>
    <packagedElement xmi:type="sysML:Block" xmi:id="_7OndQLCoEeKzo_FD3Yn8sw" name="Media"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_84PtgLCoEeKzo_FD3Yn8sw" name="SIunits">
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_LEXN8LCpEeKzo_FD3Yn8sw" name="Resistance"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_PaHtQLCpEeKzo_FD3Yn8sw" name="Current"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_S_YjwLCpEeKzo_FD3Yn8sw" name="Capacitance"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_uEnZyLCrEeKzo_FD3Yn8sw" name="Angle"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_zHA8oLCrEeKzo_FD3Yn8sw" name="Voltage"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_2XcLkLCrEeKzo_FD3Yn8sw" name="AngularVelocity"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_5u3aYLCrEeKzo_FD3Yn8sw" name="AngularAcceleration"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_97jLULCtEeKzo_FD3Yn8sw" name="Time"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_AGf_8LCuEeKzo_FD3Yn8sw" name="Inertia"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_CiQ3wLCuEeKzo_FD3Yn8sw" name="Torque"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_rXsfoLGfEeK0T7edPe2X5A" name="Temperature"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_uj1EcLGfEeK0T7edPe2X5A" name="HeatFlowRate"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_-21Y4LGfEeK0T7edPe2X5A" name="Power"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="__uOpALGhEeK0T7edPe2X5A" name="RotationalSpringConstant"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_FDs44LGiEeK0T7edPe2X5A" name="RotationalDampingConstant"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_zaXuoLcbEeKrB6yskAhl0w" name="Position"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_3RrXYLcbEeKrB6yskAhl0w" name="Mass"/>
      <nestedClassifier xmi:type="uml:DataType" xmi:id="_8CYtULcbEeKrB6yskAhl0w" name="Acceleration"/>
    </packagedElement>
    <packagedElement xmi:type="sysML:Block" xmi:id="_--b98LCoEeKzo_FD3Yn8sw" name="StateGraph"/>
    <packagedElement xmi:type="sysML:Block" xmi:id="_BAUWILCpEeKzo_FD3Yn8sw" name="Thermal">
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_HaSdK7GfEeK0T7edPe2X5A" name="FluidHeatFlow"/>
      <nestedClassifier xmi:type="sysML:Block" xmi:id="_IwI1wLGfEeK0T7edPe2X5A" name="HeatTransfer">
        <nestedClassifier xmi:type="sysML:Block" xmi:id="_PUM_sLGfEeK0T7edPe2X5A" name="Interfaces">
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_SdBKwLGfEeK0T7edPe2X5A" name="PartialElementaryConditionalHeatPortWithoutT" isAbstract="true">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_YxojcrGfEeK0T7edPe2X5A" name="useHeatPort">
              <type xmi:type="uml:DataType" href="pathmap://SysML4Modelica_PROFILES/SysML4Modelica.profile.uml#_3pg98MeVEeKfMrYq53FfYw"/>
              <defaultValue xmi:type="uml:LiteralString" xmi:id="_dqgW4LGfEeK0T7edPe2X5A" value="false"/>
            </ownedAttribute>
            <ownedAttribute xmi:type="sysML:FlowPort" xmi:id="_EpTGw7GgEeK0T7edPe2X5A" name="heatPort" type="_gSAkoLGfEeK0T7edPe2X5A" aggregation="composite"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_3vzPUrGgEeK0T7edPe2X5A" name="lossPower" type="_-21Y4LGfEeK0T7edPe2X5A"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_gSAkoLGfEeK0T7edPe2X5A" name="HeatPort_a">
            <generalization xmi:type="uml:Generalization" xmi:id="_n8fkELGfEeK0T7edPe2X5A" general="_kSbtILGfEeK0T7edPe2X5A"/>
          </nestedClassifier>
          <nestedClassifier xmi:type="sysML:Block" xmi:id="_kSbtILGfEeK0T7edPe2X5A" name="HeatPort" isAbstract="true">
            <ownedAttribute xmi:type="uml:Property" xmi:id="_yJs-8rGfEeK0T7edPe2X5A" name="T" type="_rXsfoLGfEeK0T7edPe2X5A"/>
            <ownedAttribute xmi:type="uml:Property" xmi:id="_1oHmkrGfEeK0T7edPe2X5A" name="Q_flow" type="_uj1EcLGfEeK0T7edPe2X5A"/>
          </nestedClassifier>
        </nestedClassifier>
      </nestedClassifier>
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
  <Classes:ModelicaConnector xmi:id="_7sDrYLChEeKV4bTJZ5Azxw" base_Classifier="_d3JRK7ChEeKV4bTJZ5Azxw" base_Block="_d3JRK7ChEeKV4bTJZ5Azxw"/>
  <Classes:ModelicaConnector xmi:id="_EhPUoLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_gAe4ALCoEeKzo_FD3Yn8sw" base_Classifier="_d8hcMLCoEeKzo_FD3Yn8sw" base_Block="_d8hcMLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_i3LYULCoEeKzo_FD3Yn8sw" base_Classifier="_hmiP0LCoEeKzo_FD3Yn8sw" base_Block="_hmiP0LCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_oq0K4LCoEeKzo_FD3Yn8sw" base_Classifier="_lLNQcLCoEeKzo_FD3Yn8sw" base_Block="_lLNQcLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_sU0-gLCoEeKzo_FD3Yn8sw" base_Classifier="_p3INALCoEeKzo_FD3Yn8sw" base_Block="_p3INALCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_tqOrMLCoEeKzo_FD3Yn8sw" base_Classifier="_tFCTcLCoEeKzo_FD3Yn8sw" base_Block="_tFCTcLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_v1CV4LCoEeKzo_FD3Yn8sw" base_Classifier="_vOprULCoEeKzo_FD3Yn8sw" base_Block="_vOprULCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_yv49cLCoEeKzo_FD3Yn8sw" base_Classifier="_xrAZALCoEeKzo_FD3Yn8sw" base_Block="_xrAZALCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_0v1b8LCoEeKzo_FD3Yn8sw" base_Classifier="_0JAsgLCoEeKzo_FD3Yn8sw" base_Block="_0JAsgLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_2eq8ULCoEeKzo_FD3Yn8sw" base_Classifier="_18A7MLCoEeKzo_FD3Yn8sw" base_Block="_18A7MLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_5c9SYLCoEeKzo_FD3Yn8sw" base_Classifier="_4KryMLCoEeKzo_FD3Yn8sw" base_Block="_4KryMLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_7-98ILCoEeKzo_FD3Yn8sw" base_Classifier="_7OndQLCoEeKzo_FD3Yn8sw" base_Block="_7OndQLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_97MYQLCoEeKzo_FD3Yn8sw" base_Classifier="_84PtgLCoEeKzo_FD3Yn8sw" base_Block="_84PtgLCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="__8VJkLCoEeKzo_FD3Yn8sw" base_Classifier="_--b98LCoEeKzo_FD3Yn8sw" base_Block="_--b98LCoEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_BkLRILCpEeKzo_FD3Yn8sw" base_Classifier="_BAUWILCpEeKzo_FD3Yn8sw" base_Block="_BAUWILCpEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_IEM2ULCuEeKzo_FD3Yn8sw" base_Classifier="_GoGry7CuEeKzo_FD3Yn8sw" base_Block="_GoGry7CuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_Mvh9ALCuEeKzo_FD3Yn8sw" base_Classifier="_LRWu0LCuEeKzo_FD3Yn8sw" base_Block="_LRWu0LCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_Oyc3ALCuEeKzo_FD3Yn8sw" base_Classifier="_OHJ3S7CuEeKzo_FD3Yn8sw" base_Block="_OHJ3S7CuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_Toy64LCuEeKzo_FD3Yn8sw" base_Classifier="_Rgz6sLCuEeKzo_FD3Yn8sw" base_Block="_Rgz6sLCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_W5q1wLCuEeKzo_FD3Yn8sw" base_Classifier="_VWcIcLCuEeKzo_FD3Yn8sw" base_Block="_VWcIcLCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_YdWPALCuEeKzo_FD3Yn8sw" base_Classifier="_X3tLULCuEeKzo_FD3Yn8sw" base_Block="_X3tLULCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_bDYdILCuEeKzo_FD3Yn8sw" base_Classifier="_Z__GcLCuEeKzo_FD3Yn8sw" base_Block="_Z__GcLCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_clkooLCuEeKzo_FD3Yn8sw" base_Classifier="_cEGTQLCuEeKzo_FD3Yn8sw" base_Block="_cEGTQLCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_erw5ELCuEeKzo_FD3Yn8sw" base_Classifier="_eBqMILCuEeKzo_FD3Yn8sw" base_Block="_eBqMILCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaConnector xmi:id="_j71rkLCuEeKzo_FD3Yn8sw" base_Classifier="_iiujkLCuEeKzo_FD3Yn8sw" base_Block="_iiujkLCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_9DV7gLCuEeKzo_FD3Yn8sw" base_Classifier="_7VsG4LCuEeKzo_FD3Yn8sw" base_Block="_7VsG4LCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_BeJ58LCvEeKzo_FD3Yn8sw" base_Classifier="__-gFG7CuEeKzo_FD3Yn8sw" base_Block="__-gFG7CuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_EtGiMLCvEeKzo_FD3Yn8sw" base_Classifier="_D4vGALCvEeKzo_FD3Yn8sw" base_Block="_D4vGALCvEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_OKwvcLCvEeKzo_FD3Yn8sw" base_Classifier="_MRzpwLCvEeKzo_FD3Yn8sw" base_Block="_MRzpwLCvEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_WDjQoLCvEeKzo_FD3Yn8sw" base_Classifier="_Uz9RALCvEeKzo_FD3Yn8sw" base_Block="_Uz9RALCvEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaBlock xmi:id="_aFrCQLCvEeKzo_FD3Yn8sw" base_Classifier="_ZZ7Wm7CvEeKzo_FD3Yn8sw" base_Block="_ZZ7Wm7CvEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_5f9K8LDHEeKzo_FD3Yn8sw" base_Classifier="_4Wm9QLDHEeKzo_FD3Yn8sw" base_Block="_4Wm9QLDHEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaConnector xmi:id="_Y_kXALDJEeKzo_FD3Yn8sw" base_Classifier="_W2P6ELDJEeKzo_FD3Yn8sw" base_Block="_W2P6ELDJEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_vJh3wLDJEeKzo_FD3Yn8sw" base_Classifier="_uY4d8LDJEeKzo_FD3Yn8sw" isPartial="true" base_Block="_uY4d8LDJEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="_NErncLDLEeKzo_FD3Yn8sw" base_Classifier="_G3qrkLDLEeKzo_FD3Yn8sw" isPartial="true" base_Block="_G3qrkLDLEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_jgDoULDLEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_rRyfQLDLEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaPackage xmi:id="_3EPZoLDLEeKzo_FD3Yn8sw" base_Classifier="_10OjS7DLEeKzo_FD3Yn8sw" base_Block="_10OjS7DLEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaConnector xmi:id="_BDfRALDMEeKzo_FD3Yn8sw" base_Classifier="_-3AyYLDLEeKzo_FD3Yn8sw" base_Block="_-3AyYLDLEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_scQcYLDNEeKzo_FD3Yn8sw" base_Generalization="_sKnSwLDNEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaExtends xmi:id="_tWDLILDNEeKzo_FD3Yn8sw" base_Generalization="_s3uQYLDNEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaConnector xmi:id="_SlEosLDdEeK0T7edPe2X5A" base_Classifier="_RaOmMLDdEeK0T7edPe2X5A" base_Block="_RaOmMLDdEeK0T7edPe2X5A"/>
  <Classes:ModelicaConnector xmi:id="_g0M7QLFpEeK0T7edPe2X5A" base_Classifier="_feCZkLFpEeK0T7edPe2X5A" base_Block="_feCZkLFpEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_GiLHALFrEeK0T7edPe2X5A" base_Classifier="_FbWB0LFrEeK0T7edPe2X5A" isPartial="true" base_Block="_FbWB0LFrEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_OUfMwLFrEeK0T7edPe2X5A" base_Classifier="_NDPAQLFrEeK0T7edPe2X5A" base_Block="_NDPAQLFrEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_TLKn0LFrEeK0T7edPe2X5A" base_Classifier="_Rl1Bu7FrEeK0T7edPe2X5A" isPartial="true" base_Block="_Rl1Bu7FrEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_Zv-YoLFrEeK0T7edPe2X5A" base_Generalization="_ZOMhQLFrEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_fNCeQLFrEeK0T7edPe2X5A" base_Generalization="_e9ke4LFrEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_SNndoLFvEeK0T7edPe2X5A" base_Classifier="_RLZLoLFvEeK0T7edPe2X5A" base_Block="_RLZLoLFvEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_YXBr4LFvEeK0T7edPe2X5A" base_Classifier="_X-epALFvEeK0T7edPe2X5A" base_Block="_X-epALFvEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_7A_wkLFvEeK0T7edPe2X5A" base_Classifier="_6DrzwLFvEeK0T7edPe2X5A" base_Block="_6DrzwLFvEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_CV_oMLFwEeK0T7edPe2X5A" base_Classifier="_A8jwELFwEeK0T7edPe2X5A" base_Block="_A8jwELFwEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_N_ez0LFwEeK0T7edPe2X5A" base_Classifier="_JsWxy7FwEeK0T7edPe2X5A" isPartial="true" base_Block="_JsWxy7FwEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_V-t7QLFwEeK0T7edPe2X5A" base_Generalization="_VmBHYLFwEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_SUcMcLFxEeK0T7edPe2X5A" base_Generalization="_SFkC8LFxEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_xbMCALFxEeK0T7edPe2X5A" base_Classifier="_wn_qgLFxEeK0T7edPe2X5A" base_Block="_wn_qgLFxEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_09rmcLFzEeK0T7edPe2X5A" base_Classifier="_qlBJgLFzEeK0T7edPe2X5A" base_Block="_qlBJgLFzEeK0T7edPe2X5A"/>
  <Classes:ModelicaBlock xmi:id="_v6fugLF1EeK0T7edPe2X5A" base_Classifier="_oY168LF1EeK0T7edPe2X5A" base_Block="_oY168LF1EeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_2kVwULF1EeK0T7edPe2X5A" base_Generalization="_2So8ULF1EeK0T7edPe2X5A"/>
  <Classes:ModelicaClass xmi:id="_JwEQcLGZEeK0T7edPe2X5A" base_Classifier="_HmbqcLGZEeK0T7edPe2X5A" isPartial="true" base_Block="_HmbqcLGZEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_TU6DwLGZEeK0T7edPe2X5A" base_Classifier="_Rnm0cLGZEeK0T7edPe2X5A" isPartial="true" base_Block="_Rnm0cLGZEeK0T7edPe2X5A"/>
  <Classes:ModelicaConnector xmi:id="_qz-9ULGZEeK0T7edPe2X5A" base_Classifier="_phxHgLGZEeK0T7edPe2X5A" base_Block="_phxHgLGZEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_1IrDwLGaEeK0T7edPe2X5A" base_Generalization="_07CQYLGaEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_5T68MLGaEeK0T7edPe2X5A" base_Generalization="_5A8V0LGaEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_IBtmULGbEeK0T7edPe2X5A" base_Generalization="_t76RQLDNEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaModel xmi:id="__FXEcLGcEeK0T7edPe2X5A" base_Classifier="_i70jsLGYEeK0T7edPe2X5A" base_Block="_i70jsLGYEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_v3sK8LGdEeK0T7edPe2X5A" base_Classifier="_r1A_sLGdEeK0T7edPe2X5A" base_Block="_r1A_sLGdEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_9V3AQLGdEeK0T7edPe2X5A" base_Classifier="_5DcI0LGdEeK0T7edPe2X5A" isPartial="true" base_Block="_5DcI0LGdEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_KkNbcLGfEeK0T7edPe2X5A" base_Classifier="_IwI1wLGfEeK0T7edPe2X5A" base_Block="_IwI1wLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_K2PmoLGfEeK0T7edPe2X5A" base_Classifier="_HaSdK7GfEeK0T7edPe2X5A" base_Block="_HaSdK7GfEeK0T7edPe2X5A"/>
  <Classes:ModelicaPackage xmi:id="_QSGyYLGfEeK0T7edPe2X5A" base_Classifier="_PUM_sLGfEeK0T7edPe2X5A" base_Block="_PUM_sLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_WJYHwLGfEeK0T7edPe2X5A" base_Classifier="_SdBKwLGfEeK0T7edPe2X5A" isPartial="true" base_Block="_SdBKwLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaConnector xmi:id="_h5aAQLGfEeK0T7edPe2X5A" base_Classifier="_gSAkoLGfEeK0T7edPe2X5A" base_Block="_gSAkoLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaConnector xmi:id="_lK4_ILGfEeK0T7edPe2X5A" base_Classifier="_kSbtILGfEeK0T7edPe2X5A" isPartial="true" base_Block="_kSbtILGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_oUDvgLGfEeK0T7edPe2X5A" base_Generalization="_n8fkELGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_mVk-sLGhEeK0T7edPe2X5A" base_Generalization="_l3D2sLGhEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_saRFALGhEeK0T7edPe2X5A" base_Generalization="_sIJaQLGhEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_MnBq8LGjEeK0T7edPe2X5A" base_Classifier="_LYnXELGjEeK0T7edPe2X5A" base_Block="_LYnXELGjEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_S8A3ELGjEeK0T7edPe2X5A" base_Generalization="_ShBkMLGjEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_hiNrcLGjEeK0T7edPe2X5A" base_Classifier="_gOW24LGjEeK0T7edPe2X5A" isPartial="true" base_Block="_gOW24LGjEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_buLlYLGlEeK0T7edPe2X5A" base_Generalization="_bZMz4LGlEeK0T7edPe2X5A"/>
  <Classes:ModelicaExtends xmi:id="_pfc84LGlEeK0T7edPe2X5A" base_Generalization="_pNS14LGlEeK0T7edPe2X5A"/>
  <Classes:ModelicaModel xmi:id="_Oqi7QLccEeKrB6yskAhl0w" base_Classifier="_OOuh8LccEeKrB6yskAhl0w" isPartial="true" base_Block="_OOuh8LccEeKrB6yskAhl0w"/>
  <Classes:ModelicaModel xmi:id="_xsAQULulEeKpL8MCUeA_vw" base_Classifier="_vx1psLulEeKpL8MCUeA_vw" base_Block="_vx1psLulEeKpL8MCUeA_vw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_lube8MxXEeKH2rWo0wnQfw" base_Constraint="_gbw7MrFrEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_nDTAIMxXEeKH2rWo0wnQfw" base_Property="_79SzArFqEeK0T7edPe2X5A" variability="parameter" modification="start = 1"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_i-uqIMzpEeKH2rWo0wnQfw" base_Constraint="_ixmLgrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_lyTlAMzpEeKH2rWo0wnQfw" base_Constraint="_jB9iwrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_mEbPwMzpEeKH2rWo0wnQfw" base_Constraint="_jKl6UrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_mTHMAMzpEeKH2rWo0wnQfw" base_Constraint="_jT0HwrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_miXwAMzpEeKH2rWo0wnQfw" base_Constraint="_jcm3YrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_mxP5gMzpEeKH2rWo0wnQfw" base_Constraint="_jma6srGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_nBptAMzpEeKH2rWo0wnQfw" base_Constraint="_jzz2crGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_nPetoMzpEeKH2rWo0wnQfw" base_Constraint="_j97bwrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_neW3IMzpEeKH2rWo0wnQfw" base_Constraint="_kHAfQrGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_nthUgMzpEeKH2rWo0wnQfw" base_Constraint="_kPfs4rGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_n8lrQMzpEeKH2rWo0wnQfw" base_Constraint="_kXhngLGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_oLwIoMzpEeKH2rWo0wnQfw" base_Constraint="_kgAOErGqEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_5SMFIMzpEeKH2rWo0wnQfw" base_Port="_JSfSg7FrEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_5oynQMzpEeKH2rWo0wnQfw" base_Port="_b_t0Y7FwEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_6C6-gMzpEeKH2rWo0wnQfw" base_Port="_Y5m_E7FwEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_AUzMQMzqEeKH2rWo0wnQfw" base_Constraint="_yV1-UrFvEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_ArNhIMzqEeKH2rWo0wnQfw" base_Property="_aFkRUrFvEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_A8YJoMzqEeKH2rWo0wnQfw" base_Constraint="_giqB0rF1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_BQsMwMzqEeKH2rWo0wnQfw" base_Port="_bDDlkLF1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_BgbR4MzqEeKH2rWo0wnQfw" base_Port="_uGb-o7FvEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_Bz4ZYMzqEeKH2rWo0wnQfw" base_Port="_nRNzQ7FvEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_CRosYMzqEeKH2rWo0wnQfw" base_Port="_Xv6Z07F1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_CkbFgMzqEeKH2rWo0wnQfw" base_Port="_7SA10LF0EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_DJVJYMzqEeKH2rWo0wnQfw" base_Port="_74M2o7F1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_Da-TAMzqEeKH2rWo0wnQfw" base_Port="_8T4GA7F1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_D3M8AMzqEeKH2rWo0wnQfw" base_Port="_-SV907F1EeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_EGvz4MzqEeKH2rWo0wnQfw" base_Port="_89GCILF1EeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_EW3TgMzqEeKH2rWo0wnQfw" base_Constraint="__OKs4rF1EeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_EomjwMzqEeKH2rWo0wnQfw" base_Property="_5KPbkrF1EeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_E2DJ4MzqEeKH2rWo0wnQfw" base_Property="_57DNcrF1EeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_FCQZ4MzqEeKH2rWo0wnQfw" base_Property="_6ZtfYrF1EeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="_Jn5IQMzqEeKH2rWo0wnQfw" base_Classifier="_2ABfILFxEeK0T7edPe2X5A" base_DataType="_2ABfILFxEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_QFNxAMzqEeKH2rWo0wnQfw" base_Port="_rYmHE7FpEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_QXJOgMzqEeKH2rWo0wnQfw" base_Port="_w0LmA7FpEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_QrjYQMzqEeKH2rWo0wnQfw" base_Port="_xJnDc7FpEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_Q93QQMzqEeKH2rWo0wnQfw" base_Port="_zovp0LulEeKpL8MCUeA_vw"/>
  <Components:ModelicaPort xmi:id="_RNscAMzqEeKH2rWo0wnQfw" base_Port="_32omk7ulEeKpL8MCUeA_vw"/>
  <Components:ModelicaPort xmi:id="_RiGlwMzqEeKH2rWo0wnQfw" base_Port="_68fSw7FpEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_UWcVoMzqEeKH2rWo0wnQfw" base_Constraint="_6HgAIrGYEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_Um8PwMzqEeKH2rWo0wnQfw" base_Constraint="_9CvpQrGYEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_U1Jq4MzqEeKH2rWo0wnQfw" base_Constraint="__X6J0rGYEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_VHpwIMzqEeKH2rWo0wnQfw" base_Constraint="_B0h9QrGZEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_VW0NgMzqEeKH2rWo0wnQfw" base_Property="_mXfZUrGYEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_Vtm84MzqEeKH2rWo0wnQfw" base_Property="_z_qfMrGYEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_V9P7YMzqEeKH2rWo0wnQfw" base_Property="_2oxPcLGYEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_Wtsg4MzqEeKH2rWo0wnQfw" base_Property="_aLDo8rGpEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_W_bxIMzqEeKH2rWo0wnQfw" base_Property="_-pCo8rGpEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_XQmZoMzqEeKH2rWo0wnQfw" base_Property="_AHEtMrGqEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_XgblYMzqEeKH2rWo0wnQfw" base_Property="__d3YIrGpEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_XwEj4MzqEeKH2rWo0wnQfw" base_Property="_AfU1IrGqEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_YCGIAMzqEeKH2rWo0wnQfw" base_Property="_MN240rGqEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_ZJDJAMzqEeKH2rWo0wnQfw" base_Constraint="_ihWCorGiEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_ZWl1wMzqEeKH2rWo0wnQfw" base_Constraint="_iumbgrGiEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_Ztw_oMzqEeKH2rWo0wnQfw" base_Constraint="_jBsWoLGiEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_Z7f5oMzqEeKH2rWo0wnQfw" base_Constraint="_jLOtILGiEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_aNtrAMzqEeKH2rWo0wnQfw" base_Property="_10nfkrGhEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_aeNlIMzqEeKH2rWo0wnQfw" base_Property="_28DowrGhEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_arRwwMzqEeKH2rWo0wnQfw" base_Property="_3fcpsrGhEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_a6J6QMzqEeKH2rWo0wnQfw" base_Property="_fadxQrGiEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_bKFMoMzqEeKH2rWo0wnQfw" base_Property="_Ywt2ELGiEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_d0mSIMzqEeKH2rWo0wnQfw" base_Property="_dljDorDJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_eD88wMzqEeKH2rWo0wnQfw" base_Property="_fYirQrDJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_eSWlIMzqEeKH2rWo0wnQfw" base_Property="_tWt_0rGZEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_eieEwMzqEeKH2rWo0wnQfw" base_Property="_wZAFErGZEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_e5jvEMzqEeKH2rWo0wnQfw" base_Property="_hGyVwrDJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_fLArcMzqEeKH2rWo0wnQfw" base_Property="_jvfdYrDJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_gcjL0MzqEeKH2rWo0wnQfw" base_Port="_2zSec7DJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_g6BK8MzqEeKH2rWo0wnQfw" base_Port="_1CX6c7DJEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_hg7Z8MzqEeKH2rWo0wnQfw" base_Port="_dEnDQ7GZEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_hvO7sMzqEeKH2rWo0wnQfw" base_Port="_4H1ZA7GZEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_iEsOUMzqEeKH2rWo0wnQfw" base_Constraint="_m3igcrGaEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_iUngsMzqEeKH2rWo0wnQfw" base_Property="_XTA4ErGZEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_ikKYkMzqEeKH2rWo0wnQfw" base_Property="_S5LUkLGaEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_jp-KEMzqEeKH2rWo0wnQfw" base_Port="_AsY3M7GeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_j6kK0MzqEeKH2rWo0wnQfw" base_Constraint="_09bgQrGeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_kJcUUMzqEeKH2rWo0wnQfw" base_Constraint="_1NvNIrGeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_kYVE4MzqEeKH2rWo0wnQfw" base_Constraint="_2FJ9UrGeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_kyRO4MzqEeKH2rWo0wnQfw" base_Constraint="_2RdT8rGeEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_lCSn4MzqEeKH2rWo0wnQfw" base_Constraint="_2enmMrGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_lzHn4MzqEeKH2rWo0wnQfw" base_Property="_IIv7ErGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_mSr4wMzqEeKH2rWo0wnQfw" base_Property="_ZrVoErGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_mjFsQMzqEeKH2rWo0wnQfw" base_Property="_iBA5krGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_mycW4MzqEeKH2rWo0wnQfw" base_Property="_jKvhwLGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_nCLcAMzqEeKH2rWo0wnQfw" base_Property="_kH34YLGeEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_nbQqYMzqEeKH2rWo0wnQfw" base_Property="_k32j0LGeEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_n19pYMzqEeKH2rWo0wnQfw" base_Port="_EI7PgLGeEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_ozGAAMzqEeKH2rWo0wnQfw" base_Port="_hw3XA7GZEeK0T7edPe2X5A"/>
  <Components:ModelicaPort xmi:id="_qEiZwMzqEeKH2rWo0wnQfw" base_Port="_RP5qs7DLEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_rE6RoMzqEeKH2rWo0wnQfw" base_Constraint="_A8QbArGlEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_rVN-gMzqEeKH2rWo0wnQfw" base_Constraint="_CkjOgrGlEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_rmxBgMzqEeKH2rWo0wnQfw" base_Constraint="_E7bmUrGlEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_r9XjoMzqEeKH2rWo0wnQfw" base_Constraint="_HMMvELGlEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_sWvF4MzqEeKH2rWo0wnQfw" base_Constraint="_NzWCMrGlEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_soqjYMzqEeKH2rWo0wnQfw" base_Property="_km_EArGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_s4Th4MzqEeKH2rWo0wnQfw" base_Property="_qk-scLGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_tJFv4MzqEeKH2rWo0wnQfw" base_Property="_tQsEwrGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_tWcPYMzqEeKH2rWo0wnQfw" base_Property="_vFgRUrGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_tl5AoMzqEeKH2rWo0wnQfw" base_Property="_w0zrwrGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_tzbtYMzqEeKH2rWo0wnQfw" base_Property="_zKNc4rGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_uVAJYMzqEeKH2rWo0wnQfw" base_Property="_-WDqQrGjEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_uxtTgMzqEeKH2rWo0wnQfw" base_Property="_CITM0LGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_u-lR4MzqEeKH2rWo0wnQfw" base_Property="_F7ubIrGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_vOgkQMzqEeKH2rWo0wnQfw" base_Property="_J9uQ8rGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_vat0QMzqEeKH2rWo0wnQfw" base_Property="_R0L24rGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_vn-NIMzqEeKH2rWo0wnQfw" base_Property="_dCuL4rGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_v1zNwMzqEeKH2rWo0wnQfw" base_Property="_d9LpArGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_wDuVAMzqEeKH2rWo0wnQfw" base_Property="_eeEvkrGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_wp91oMzqEeKH2rWo0wnQfw" base_Property="_fbFKYrGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_xH6V4MzqEeKH2rWo0wnQfw" base_Property="_rFJk0rGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_xZXSQMzqEeKH2rWo0wnQfw" base_Property="_y9jrgrGkEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_xpGXYMzqEeKH2rWo0wnQfw" base_Property="_69G8ArGkEeK0T7edPe2X5A"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_zqau4MzqEeKH2rWo0wnQfw" base_Constraint="_W56nMrDLEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_z73rQMzqEeKH2rWo0wnQfw" base_Constraint="_5Y2rIrDMEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_0KXaQMzqEeKH2rWo0wnQfw" base_Constraint="_lGVNIrDMEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_0XJSAMzqEeKH2rWo0wnQfw" base_Constraint="_n6xDorDMEeKzo_FD3Yn8sw"/>
  <Components:ModelicaValueProperty xmi:id="_0tFFwMzqEeKH2rWo0wnQfw" base_Property="_w8R84rDLEeKzo_FD3Yn8sw"/>
  <EquationsAndAlgorithms:ModelicaEquation xmi:id="_1UXvQMzqEeKH2rWo0wnQfw" base_Constraint="_JeQBYrDNEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_1mNGIMzqEeKH2rWo0wnQfw" base_Port="_EhiPwLDNEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_2IodwMzqEeKH2rWo0wnQfw" base_Port="_PsL_w7DMEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_2eYEQMzqEeKH2rWo0wnQfw" base_Port="_t66BILDMEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_7oD64MzqEeKH2rWo0wnQfw" base_Classifier="_zHA8oLCrEeKzo_FD3Yn8sw" base_DataType="_zHA8oLCrEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_74wCQMzqEeKH2rWo0wnQfw" base_Classifier="_FDs44LGiEeK0T7edPe2X5A" base_DataType="_FDs44LGiEeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="_8JJ1wMzqEeKH2rWo0wnQfw" base_Classifier="_zaXuoLcbEeKrB6yskAhl0w" base_DataType="_zaXuoLcbEeKrB6yskAhl0w"/>
  <Classes:ModelicaType xmi:id="_8aak4MzqEeKH2rWo0wnQfw" base_Classifier="_uEnZyLCrEeKzo_FD3Yn8sw" base_DataType="_uEnZyLCrEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_8scJAMzqEeKH2rWo0wnQfw" base_Classifier="__uOpALGhEeK0T7edPe2X5A" base_DataType="__uOpALGhEeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="_8_tDQMzqEeKH2rWo0wnQfw" base_Classifier="_S_YjwLCpEeKzo_FD3Yn8sw" base_DataType="_S_YjwLCpEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_9Nb9QMzqEeKH2rWo0wnQfw" base_Classifier="_-21Y4LGfEeK0T7edPe2X5A" base_DataType="_-21Y4LGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="_9fv1QMzqEeKH2rWo0wnQfw" base_Classifier="_PaHtQLCpEeKzo_FD3Yn8sw" base_DataType="_PaHtQLCpEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_9xS4QMzqEeKH2rWo0wnQfw" base_Classifier="_uj1EcLGfEeK0T7edPe2X5A" base_DataType="_uj1EcLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="_-EReoMzqEeKH2rWo0wnQfw" base_Classifier="_LEXN8LCpEeKzo_FD3Yn8sw" base_DataType="_LEXN8LCpEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_-TDhgMzqEeKH2rWo0wnQfw" base_Classifier="_rXsfoLGfEeK0T7edPe2X5A" base_DataType="_rXsfoLGfEeK0T7edPe2X5A"/>
  <Classes:ModelicaType xmi:id="__PnQYMzqEeKH2rWo0wnQfw" base_Classifier="_2XcLkLCrEeKzo_FD3Yn8sw" base_DataType="_2XcLkLCrEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="__ernIMzqEeKH2rWo0wnQfw" base_Classifier="_3RrXYLcbEeKrB6yskAhl0w" base_DataType="_3RrXYLcbEeKrB6yskAhl0w"/>
  <Classes:ModelicaType xmi:id="__sINQMzqEeKH2rWo0wnQfw" base_Classifier="_8CYtULcbEeKrB6yskAhl0w" base_DataType="_8CYtULcbEeKrB6yskAhl0w"/>
  <Classes:ModelicaType xmi:id="__53HQMzqEeKH2rWo0wnQfw" base_Classifier="_5u3aYLCrEeKzo_FD3Yn8sw" base_DataType="_5u3aYLCrEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_ALN9AMzrEeKH2rWo0wnQfw" base_Classifier="_97jLULCtEeKzo_FD3Yn8sw" base_DataType="_97jLULCtEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_AqBY4MzrEeKH2rWo0wnQfw" base_Classifier="_AGf_8LCuEeKzo_FD3Yn8sw" base_DataType="_AGf_8LCuEeKzo_FD3Yn8sw"/>
  <Classes:ModelicaType xmi:id="_A72vwMzrEeKH2rWo0wnQfw" base_Classifier="_CiQ3wLCuEeKzo_FD3Yn8sw" base_DataType="_CiQ3wLCuEeKzo_FD3Yn8sw"/>
  <Components:ModelicaPort xmi:id="_DlnAQMzrEeKH2rWo0wnQfw" base_Port="_EpTGw7GgEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_D9KkoMzrEeKH2rWo0wnQfw" base_Property="_YxojcrGfEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_ES0EgMzrEeKH2rWo0wnQfw" base_Property="_3vzPUrGgEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_EgWxQMzrEeKH2rWo0wnQfw" base_Property="_yJs-8rGfEeK0T7edPe2X5A"/>
  <Components:ModelicaValueProperty xmi:id="_EwwkwMzrEeKH2rWo0wnQfw" base_Property="_1oHmkrGfEeK0T7edPe2X5A"/>
</xmi:XMI>
