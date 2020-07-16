import React, { Component } from 'react';
import { cart } from './Cart'
import { initState } from './reducers/cartReducer'
import { getOrders } from './repository/repository';

import axios from 'axios';
const BASE_URL = 'http://localhost:8080';

const orders = []

class MyOrders extends Component {


   
    componentDidMount() {
        fetch(' http://localhost:8080/getOrders')
          .then(response =>  this.setState({  response }))
        //   .then(data => this.setState({  data }));
          console.log(this.state)
      }
   render() {
// const { apiInfo } = this.state;
// apiInfo && console.log(apiInfo.map(item => item.img));
return (
  <div>
    {/* {apiInfo &&
      apiInfo.map(item =>  <div> {item.img} </div> )} */}
  </div>
);
}
}

export default MyOrders;