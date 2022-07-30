;; Exercise 1.31
;; page 80-81

(defn product
    [term a next b]
    (if (> a b)
        1
        (* (term a)
           (product term (next a) next b))))

;; n!
(defn factorial
    [n]
    (product identity 1 inc n))

(defn pi-term
    [n]
    (/ (+ 2
          (if (even? n) n
                        (dec n)))
       (+ 2
          (if (odd? n) n
                       (dec n)))))

;; estimate pi using n term
(defn pi
    [n]
    (* 4
       (product pi-term 1 inc n)))

;; b. Make product as iterative process
(defn iter
    [result term a next b]
    (if (> a b) 
        result
        (recur (* result (term a)) term (next a) next b)))

(defn product
    [term a next b]
    (iter 1 term a next b))