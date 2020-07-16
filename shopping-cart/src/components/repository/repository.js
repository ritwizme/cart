
import axios from 'axios';
const BASE_URL = 'http://localhost:8080';
export function getProducts() {
        return axios.get(`${BASE_URL}/getProducts`)
                .then(response => response.data);
}

export function login (data) {
    return axios.post(`${BASE_URL}/createOrder`, 
                      { name: data.idList, password: data.password })
      .then(response => {
          console.log(response)
         })
  }


export function getOrders() {
    return axios.get(`${BASE_URL}/getOrders`)
            .then(response => response.data);
}
