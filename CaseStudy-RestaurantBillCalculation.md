## Restaurant Bill Calculation System
You are required to develop a Bill Calculation System for a restaurant. The system must differentiate between dine-in, takeaway, and delivery orders, each incorporating unique charges.

## Formula for Bill:

subTotal = billAmount + (billAmount × taxRate)
- billAmount: This represents the initial amount before any taxes or additional fees are applied.
- taxRate: This is the percentage of tax applied to the billAmount. It is represented as a decimal (e.g., a tax rate of 10% is represented as 0.1).

Example
- billAmount: RM100
- taxRate (10% of the billAmount): = RM10
- subTotal = RM110

## Formula for DineInBill

TotalBill = subTotal + (billAmount × serviceCharge)
- serviceCharge: The billAmount is multiplied by the serviceCharge rate to determine the additional cost due to the service charge.
- TotalBill: The amount calculated as the service charge is then added to the subTotal (which includes the tax).

Example
- serviceCharge (10% of the billAmount): = RM10
- Total = subTotal + serviceCharge = RM120

## Formula for TakeawayBill

TotalBill = subtotal + packagingFee
- packagingFee: After obtaining the subtotal, the fixed packagingFee is added.

Example
- packagingFee: = RM8
- Total = subTotal + packagingFee = RM118

## Formula for DeliveryBill

TotalBill = subtotal + deliveryFee
- deliveryFee: This is a fixed amount added to the bill for the delivery service provided. This fee is generally a set dollar amount, reflecting the cost of delivery regardless of the distance or order size, within a predefined service area.

Example
- deliveryFee: = RM15
- Total = subTotal + deliveryFee = RM125

## Solution

https://github.com/zhamri/Solution-Restaurant_Bill_Calculation