import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"
import './index.css'

function App() {
  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <div>
              <SalesCard />
            </div>
          </div>
        </section>
      </main>
    </>
  )
}

export default App
