import React from 'react';
import BeerDetails from './BeerDetails';

const Beer = ({beer, name, description, image, abv, ingredients, food_pairing, onBeerSelect}) => {

    const handleClick = () => {
        console.log(beer.name)
        onBeerSelect(beer)
    }

    return ( 
        <li onClick={handleClick}>
            {name}
        </li>
     );
}
 
export default Beer;