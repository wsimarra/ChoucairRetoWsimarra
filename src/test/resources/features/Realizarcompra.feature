#Author: TurboCycle


@Regresion
Feature: Formulario SWAGLABS
  El usuario debe poder ingresar  los datos requeridos para inicio de session.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  para cada campo a través de un globo informativo.

  @CasoExitoso
  Scenario: agrega CART formulario  Validation,
   Given Autentico en SWAGLABS con usuario "standard_user" y clave "secret_sauce"
    And Ingreso a la funcionalidad PRODUCTS
    When verificoIngresoExitoso
   Then  Exitoso
