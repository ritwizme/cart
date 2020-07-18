import React, { useState, useEffect } from 'react';
import { cart } from './Cart'
import { initState } from './reducers/cartReducer'
import { getOrders } from './repository/repository';
import axios from 'axios';
import { importDeclaration } from '@babel/types';
const BASE_URL = 'http://localhost:8080';

let orders2

export default function MyOrders() {
    const [results, setResults] = useState([]);

    useEffect(() => {
        async function getData() {
            const data = await axios.get('http://localhost:8080/getOrders');
            setResults(data.data);
        };
        getData();
    }, []);
    
    return (
        <div>
            {/* tera product[] null h kisi result meh*/}
            {results.map((result) => (
                <>
                    {JSON.stringify(result)}
                    <li key={result.orderId}>
                        {result.products[0].name}
                    </li>
                </>
            ))};
        </div>        
    )
}