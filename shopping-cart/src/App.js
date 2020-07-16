import React from 'react';
import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import { getProducts } from './components/repository/repository';
import Home from './components/Home';
import Footer from './components/Footer';
import ProductList from './components/ProductList';
import Cart2 from './components/Cart2'
import {BrowserRouter, Route, Switch} from 'react-router-dom'

function App() {
  
  return (
    <BrowserRouter>
    <div className="App">
      <Navbar/>
      <Switch>
                    <Route exact path="/" component={Home}/>
                    <Route path="/cart" component={Cart2}/>
      </Switch>
      <Footer />
    </div>
    </BrowserRouter>
  );
}

export default App;
