// main.js
document.addEventListener('DOMContentLoaded', ()=> {
  // Mobile nav toggle
  const toggle = document.querySelector('.mobile-toggle');
  const nav = document.querySelector('nav ul');
  toggle && toggle.addEventListener('click', ()=> {
    if(nav.style.display === 'flex') nav.style.display = 'none';
    else nav.style.display = 'flex';
  });

  // Gallery modal
  const modal = document.getElementById('modal');
  const modalImg = document.getElementById('modal-img');
  const galleryImgs = document.querySelectorAll('.gallery-grid img');
  const closeBtn = document.getElementById('modal-close');

  galleryImgs.forEach(img => {
    img.addEventListener('click', ()=> {
      modalImg.src = img.src;
      modal.classList.add('open');
      document.body.style.overflow = 'hidden';
    })
  });

  closeBtn.addEventListener('click', ()=> {
    modal.classList.remove('open');
    document.body.style.overflow = '';
  });

  // Example interactive: change hero image on button click (demonstrācija)
  const heroBtn = document.getElementById('hero-change');
  const heroImg = document.getElementById('hero-img');
  if(heroBtn && heroImg){
    heroBtn.addEventListener('click', ()=> {
      heroImg.src = 'assets/event2.jpg'; // nomaina attēlu
      heroBtn.innerText = 'Attēls nomainīts';
      heroBtn.classList.add('secondary');
      setTimeout(()=> { heroBtn.innerText = 'Apskatīt maketu';}, 2200);
    })
  }
});
