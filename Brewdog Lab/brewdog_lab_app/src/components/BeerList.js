import Beer from './Beer'

const BeerList = ({beers, onBeerSelect}) => {

    const beerList = beers.map((beer,index) => {
        return (
            <Beer 
                key={index} 
                name={beer.name}
                description={beer.description}
                image={beer.image_url}
                abv={beer.abv}
                // ingredients={beer.ingredients}
                food_pairing={beer.food_pairing}
                beer={beer}
                onBeerSelect={onBeerSelect}
            />
        )
    })

    return ( 
        <>
            <ul>
                {beerList}
            </ul>
        </>
     );
}
 
export default BeerList;