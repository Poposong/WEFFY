import * as React from 'react';

import { useNavigate } from 'react-router-dom';

import styles from './loginForm.module.css';

import Button from '@mui/material/Button';
import Form from 'react-bootstrap/Form';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

function LoginForm() {

  let navigate = useNavigate();

  return (
    <div className={styles.login_form_wrapper}>
      <div className={styles.login_form} style={{ position: 'relative', zIndex: 0 }}>
        <p className={styles.logo} style={{ position: 'relative', zIndex: 1 }}>WEEFY</p>
        <Form className={styles.custom_form}  style={{ position: 'relative', zIndex: 1 }}>
          <Form.Group className="mb-3" controlId="exampleForm.ControlInput">
            <Form.Label style={{marginLeft: '4px'}}>Email</Form.Label>
            <Form.Control type="email" placeholder="Mattermost Email" />
          </Form.Group>
          <Form.Group className="mb-3" controlId="exampleForm.ControlPassword">
            <Form.Label style={{marginLeft: '4px'}}>Password</Form.Label>
            <Form.Control type="password" placeholder="Mattermost Password" />
          </Form.Group>
          <div className={styles.forgot_password}>
            <Button variant="text" href="https://meeting.ssafy.com/reset_password" style={{ textDecorationLine: 'none', color: 'black', fontFamily: 'Poppins' }}>Forgot Password?</Button>
          </div>
          <Button variant="contained" size="large" className={styles.login_btn} style={{ fontSize: '20px', fontFamily: 'Poppins', fontWeight: '500', backgroundColor: '#2672B9' }}>Sign in</Button>
          <Container className={styles.sign}>
            <Row>
              <Col><p style={{ marginBottom: '0', marginTop: '9px' }}>You don't have a account?</p></Col>
              <Col>
                <Button variant="text" onClick={()=> {navigate('/signup');}}
                style={{ textDecorationLine: 'none', color: '#2672B9', fontFamily: 'Poppins', fontSize: '17px' }}>
                  Sign up
                </Button>
              </Col>
            </Row>
          </Container>
        </Form>
      </div>
    </div>
  )
}

export default LoginForm