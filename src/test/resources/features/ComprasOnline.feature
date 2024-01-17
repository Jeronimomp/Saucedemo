Feature: Como cliente de la tienda online
  Deseo poder comprar productos por internet de manera rapida.

  Scenario Outline: Compra exitosa de 2 articulos de la tienda
    Given el cliente se loguea en la pagina de compras
    When selecciona los productos a comprar
    And completa el formulario de compras "<nombre>" "<apellido>" "<codigoPostal>"
    Then puede ver el mensaje "Thank you for your order!"

    Examples:
      | nombre| apellido| codigoPostal|
      | Angel | Marzola | 200023      |
      | Camila|Lopez    |300024       |