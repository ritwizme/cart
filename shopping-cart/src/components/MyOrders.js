import React, { Component } from 'react';
import { cart } from './Cart'
import { initState } from './reducers/cartReducer'
import { getOrders } from './repository/repository';

import axios from 'axios';
const BASE_URL = 'http://localhost:8080';

const orders = []

class MyOrders extends Component {



    componentDidMount() {

        getOrders().then((response) => response)
            .then(response => {
                orders.push(response)
            })
    }
    render() {
        
        let items = orders.map((link) =>
            <li key={link.orderId}>{link.orderId}</li> 
        );
        return (
          <div className="navigation">
            <ul>
             <p>hi</p>
             {items}
            </ul>
          </div>
        )}
}

export default MyOrders;