
Feature: Ver PDF de Estado Financiero del mes de Abril
  yo como usuario del portal de la aerocivil
  quiero visualizar el estado financiero del mes de Abril de de 2021
  para ver el estado del mes


  Scenario: Visualizacion de Archivo PDF exitosa
    Given que Ada ha ingresado a la pagina de aerocivil
    When el seleccione el pdf a descargar
    Then el debera visualizar el archivo