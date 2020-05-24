# pglp_9.9

Mode d'utilisation
UnCercle=Cercle((0,0),4)
UnRect=Rectangle((0,0),5,5)
UnTriangle=Triangle((0,0),5,5,5)
UnComp=Composite((0,0))
move(UnCercle,(1,1))
print(UnCercle)
add(UnComp,UnCercle)
print(UnComp)
