#Author: TurboCycle


@Regresion
Feature: Formulario SWAGLABS
  El usuario debe poder ingresar  los datos requeridos para inicio de session.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  para cada campo a través de un globo informativo.
/*"standard_user" y clave "secret_sauce"*/
  @CasoExitoso
  Scenario: Comprar articulo,
    Given Autentico en SWAGLABS con usuario "standard_user" y clave "secret_sauce"
    When Ingreso a la funcionalidad compra
    And agregar articulo al car
    And ingresar datos de comprador
    |First Name|Last Name|Zip/Postal Code|
    |WILMER    |SIMARRA C|13001          |
    Then  Compra exitosa

  @CasoAlterno
  Scenario: Comprar articulo,
    Given Autentico en SWAGLABS con usuario "problem_user" y clave "secret_sauce"
    When Ingreso a la funcionalidad compra
    And agregar articulo al car
    And ingresar datos de comprador
      |First Name|Last Name|Zip/Postal Code|
      |          |SIMARRA  |               |
    Then  Compra exitosa