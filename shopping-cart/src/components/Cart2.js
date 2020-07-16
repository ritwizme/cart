import React, { Component } from 'react';
import { cart } from './Cart'
import { initState } from './reducers/cartReducer'
import axios from 'axios';
const BASE_URL = 'http://localhost:8080';

class Cart2 extends Component {



    handleCheckout = (id) => {
        let obj = {
            userId: 1,
            orders: id
        }
        console.log(id)
            axios.post(`${BASE_URL}/createOrder`, 
                          obj )
          .then(response => {
            console.log(response)
            if(response.status===200)
             alert(response.data)
             })

        initState.addedItems = [];
        console.log(initState.addedItems)
        this.forceUpdate()
    }


    handleRemove = (id) => {
        console.warn("huicbhj")

        let existedItem = initState.addedItems.find(item => (id === item))
        if (existedItem) {
            if (existedItem.available_quantity <= 1) {
                console.log("heyeuei")
                initState.addedItems.pop(existedItem)

            }
            else {
                initState.items.pop(existedItem)
                existedItem.available_quantity -= 1
                initState.items.push(existedItem)
                console.log(initState.items)

            }
        }
    }
    render() {

        let itemList = initState.addedItems.map(product => {
            return (



                <div className="card checkoutcart">
                    <div className="card-body">
                        <h5 className="card-title">{product.name}</h5>
                        <hr />
                        <p className="card-text">{product.description}</p>
                        <b>Quantity :</b><small>{product.available_quantity}</small><br />
                        <a href="#" className="btn btn-danger" onClick={() => { this.handleRemove(product) }}>Remove</a>
                    </div>
                </div>

            )
        })
        return (
            <div className="container">
                <h3 className="center">Your Cart</h3>
                <div className="box">
                    {itemList}
                </div>
                <button class="btn btn-success" onClick={() => { this.handleCheckout(initState.addedItems) }}>Checkout</button>
            </div>
        )
    }
}

export default Cart2;