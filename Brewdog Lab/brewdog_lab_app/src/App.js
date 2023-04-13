import './App.css';
import BeerBox from './containers/BeerBox';

function App() {

  const url = "https://api.punkapi.com/v2/beers"

  return (
    <div className="App">
      <h1>Let's get wasted</h1>
      <BeerBox url={url}/>
    </div>
  );
}

export default App;
