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
Feature: Búsqueda de oficinas por medio de la opción Visitanos 
  El usuario debe poder realizar la consulta de la ubicación geográfica de las oficinas físicas del Banco
  más cercanas a una dirección específica, desplegando la lista de oficinas y permitiendo visualizar en el 
  mapa de la página la oficina seleccionada

  @ConsultaOficina
  Scenario: Verificar búsqueda de oficina ingresando dirección específica
    Given Ingresar opción Visitanos para  búsqueda de oficinas
    When Buscar la oficina
    |dirección										|
    |Cl. 14 #52a-25, Medellín, Antioquia, Colombia|
    Then Verificar ubicación oficina en el mapa de la página
    
   # @ConsultaOficina1
  #Scenario Outline: Verificar búsqueda de oficina ingresando dirección específica
   # Given Ingresar opción Visitanos para  búsqueda de oficinas
    #When Buscar la oficina <direccion>                  
    #Then Verificar ubicación oficina en el mapa de la página
    
    #Examples:
    #|dirección										|
    #|Cl. 14 #52a-25, Medellín, Antioquia, Colombia|
   #|Medellín, Antioquia, Colombia|
