
import axios from 'axios';
const BASE_URL = 'http://localhost:8080';
export function getProducts() {
        return axios.get(`${BASE_URL}/getProducts`)
                .then(response => response.data);
}




export function getOrders() {
    return axios.get(`${BASE_URL}/getOrders`)
            .then(response => response.data);
}
