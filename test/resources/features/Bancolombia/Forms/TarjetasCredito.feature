#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: El usuario debe poder solicitar la tarjeta deseada al presionar el botón solicitar aquí, para 
  poder diligenciar el formulario de solicitud de una tarjeta de crédito de Bancolombia.

  @EscenarioExitoso
  Scenario: Diligenciar formulario de Solicitud de Tarjeta crédito
    Given Ingresar a la opción  Tarjetas de Crédito
    And Imprimir en Consola la información de las tarjetas de credito 
    When Diligenciar Datos Formulario Obligatorios
    |nombres   |apellidos     |tipoDocumento        |nroDocumento|fechaNacimiento|ingresosMensuales|ciudadDpto  |
    |Lina Paola|Granada Norena|Cédula de Extranjería|1128567890  |1999-05-01     |2500000          |Cali - Valle|
    Then Verificar resultado Formulario

# @EscenarioReto2
  #Scenario : Verificar la funcionalidad de búsqueda de oficinas físicas del Banco cercanas a una ubicacion especifica
   #Given Ingresar a la opción Visitanos
   #When I check for the <value> in step
   #Then I verify the <status> in step


