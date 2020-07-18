import React, { Component } from 'react';
import { connect } from 'react-redux'
import { initState } from './reducers/cartReducer'
import { getProducts } from './repository/repository';
import { getOrders } from './repository/repository';

import { cart } from './Cart'
class Home extends Component {

    constructor(props) {
        super(props);
        this.state = {
            products: []
        }
    }
    componentDidMount() {
        getProducts().then((products) => this.setState({ products }));
        // getProducts().then((products) => initState.items.push(products.json()));
        getProducts().then(response => response.data)
            .then(response => {
                // do something with data
                initState.items.push(response)
            });
    }


    handleClick = (id) => {
        // console.log(id)
        let existedItem = initState.addedItems.find(item => (id === item))
        if (existedItem) {
            initState.items.pop(existedItem)
            existedItem.available_quantity += 1;
            initState.items.push(existedItem)
            existedItem.price *= existedItem.available_quantity
            console.log(initState.items)
        }
        else {
            id.available_quantity = 1
            console.log(initState.items)
            initState.addedItems.push(id)
        }
    }


    render() {
        const { products } = this.state;
        let itemList = products.map(product => {
            // let itemList =  Object.entries(initState.items).map((product) => {
            return (



                <div className="card">
                    {/* <img src="..." className="card-img-top" alt="..." /> */}
                    <div className="card-body">
                        <h5 className="card-title">{product.name}</h5>
                        <hr />
                        <p className="card-text">{product.description}</p>
                        <a href="#" className="btn btn-primary" onClick={() => { this.handleClick(product) }}>Add To cart</a>
                    </div>
                </div>

            )
        }

        )
        return (

            <div className="container">
                <br />
                <h3 className="center">Our items</h3>
                <hr />
                <br />
                <div className="box">
                    {itemList}
                </div>
            </div>
        )
    }
}



const mapStateToProps = (state) => {
    return {
        items: state.items
    }
}

export default connect(mapStateToProps)(Home)