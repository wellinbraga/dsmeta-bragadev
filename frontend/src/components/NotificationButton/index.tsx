import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icons.svg'
import { BASE_URL } from '../../utils/request';
import './styles.css'

type Props = {
  saleId: number;
}

function handleClick(salesId: number) {
  axios(`${BASE_URL}/sales/${salesId}/notification`)
    .then(response => {
      toast.info("SMS Enviao com sucesso Id Vend.: " + salesId)
    })

}

function NotificationButton({ saleId }: Props) {
  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton
