import { useEffect, useState } from 'react';
import BeerList from '../components/BeerList'
import FavBeer from '../components/FavBeerList';
import BeerDetails from '../components/BeerDetails';

const BeerBox = ({url}) => {
    const [beers, setBeers] = useState([])
    const [selectedBeer, setSelectedBeer] = useState(null)
    // const [favBeers, setFavBeers]= useState([])

    useEffect(() => {
        loadBeers(url)
        // loadFavBeers()
    }, [url])

    const loadBeers = (url) => {
        fetch(url)
        .then(result => result.json())
        .then(data => setBeers(data))
    }

    const onBeerSelect = function (beer) {
        setSelectedBeer(beer)
    }

    return ( 
        <>
            <h2>Beer Box</h2>
            <FavBeer />
            <BeerList beers={beers} onBeerSelect={onBeerSelect}/>
            <BeerDetails beer={selectedBeer}/>
        </>
     );
}

export default BeerBox;