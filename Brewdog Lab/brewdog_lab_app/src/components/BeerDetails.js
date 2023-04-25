const BeerDetails = ({selectedBeer, onBeerToggleFavourite}) => {

    if (selectedBeer == null) {
        return <p>Click any beer for more details!</p>
    }

    const handleChangeFav = function () {
        onBeerToggleFavourite(selectedBeer)
    };

    return ( 
        <>
            <p>You are seeing the details about {selectedBeer.name}</p>
            <label htmlFor="favourite">This is my poison!</label>
            <input type="checkbox" id="favourite" name={selectedBeer.name}  onChange={handleChangeFav} />
            {/* <button onCxlick={handleChangeFav} >This is my poison!</button> */}
        </>
     );
}
 
export default BeerDetails;